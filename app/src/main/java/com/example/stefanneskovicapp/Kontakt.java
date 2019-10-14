package com.example.stefanneskovicapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class Kontakt extends AppCompatActivity {
    ImageView slika,fb,insta;
    ImageView prva,druga,treca,cetvrta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        slika=findViewById(R.id.space);
        TranslateAnimation animation = new TranslateAnimation(-40.0f, 70.0f,
                0.0f, 0.0f);
        animation.setDuration(5000);
        animation.setRepeatCount(100000);
        animation.setRepeatMode(2);
        slika.startAnimation(animation);
        prva=findViewById(R.id.imageView6);
        druga=findViewById(R.id.imageView4);
        treca=findViewById(R.id.imageView5);
        cetvrta=findViewById(R.id.imageView7);
        prva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeButtonClicked1();
            }
        });
        druga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeButtonClicked2();
            }
        });
        treca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeButtonClicked3();
            }
        });
        cetvrta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awesomeButtonClicked4();
            }
        });

    }
    private void awesomeButtonClicked1() {
        Intent i=new Intent(this,biografija.class);
        startActivity(i);
        finish();
    }

    private void awesomeButtonClicked2() {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }

    private void awesomeButtonClicked3() {
        Intent i=new Intent(this,Karijera.class);
        startActivity(i);
        finish();
    }

    private void awesomeButtonClicked4() {
        Intent i=new Intent(this,Kontakt.class);
        startActivity(i);
        finish();
    }


    public void ucitajFb(View view) {
        String url = "http://www.facebook.com/stefan.neskovic.10";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void ucitajInsta(View view) {
        String url = "https://www.instagram.com/_stefan_chsh/?hl=sr";
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
