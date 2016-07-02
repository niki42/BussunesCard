package com.example.niki.newapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.ByteArrayOutputStream;

public class ChooseTemplate extends AppCompatActivity {
    CardView card1,card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_template);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void chooseTemplate1(View view){
        card1= (CardView) findViewById(R.id.card1);
        if (card1 != null) {
            card1.setDrawingCacheEnabled(true);

        card1.buildDrawingCache();
        Bitmap bm = card1.getDrawingCache();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.PNG, 100,stream);
        byte[] byteArray=stream.toByteArray();
        Intent putBitmap= new Intent(ChooseTemplate.this,CardPreview.class);
        putBitmap.putExtra("image",byteArray);
        startActivity(putBitmap);
        }
    }

    public void chooseTemplate2(View view){
        card2= (CardView) findViewById(R.id.card2);
        if (card2 != null) {
            card2.setDrawingCacheEnabled(true);
        card2.buildDrawingCache();
        Bitmap bm1 = card2.getDrawingCache();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bm1.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray=stream.toByteArray();
        Intent putBitmap= new Intent(ChooseTemplate.this,CardPreview.class);
        putBitmap.putExtra("image",byteArray);
        startActivity(putBitmap);
    }
    }

}
