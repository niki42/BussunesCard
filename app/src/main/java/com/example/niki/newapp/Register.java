package com.example.niki.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextInputEditText etName = (TextInputEditText) findViewById(R.id.etName);
        final TextInputEditText etDesignation = (TextInputEditText) findViewById(R.id.etDesignation);
        final TextInputEditText etEmail = (TextInputEditText) findViewById(R.id.etEmail);
        final TextInputEditText etPassword = (TextInputEditText) findViewById(R.id.etPassword);
        Button button= (Button) findViewById(R.id.btRegister);


        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Register.this,NewApp.class));
                }
            });
        }
    }


