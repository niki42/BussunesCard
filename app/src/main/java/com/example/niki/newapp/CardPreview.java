package com.example.niki.newapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ShareActionProvider;

public class CardPreview extends AppCompatActivity {
    ImageView getImage;
    private ShareActionProvider shareActionP;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_preview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getImage= (ImageView) findViewById(R.id.getImage);
        Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("image");

        assert byteArray != null;
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        getImage.setImageBitmap(bmp);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.content_share_menu, menu);
        shareActionP= (ShareActionProvider) menu.findItem(R.id.share).getActionProvider();
        shareActionP.setShareIntent(getDefaultShareIntent());
        return super.onCreateOptionsMenu(menu);
    }

    public Intent getDefaultShareIntent() {
        Intent intent =new Intent(Intent.ACTION_SEND);
        intent.setType("image/png");
        intent.putExtra(Intent.EXTRA_SUBJECT,"SUBJECT");
        intent.putExtra(Intent.EXTRA_TEXT,"Extra Text");
        return intent;
    }
    */
}
