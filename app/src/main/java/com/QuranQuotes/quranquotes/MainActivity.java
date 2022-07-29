package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    // Making a int for splash screen (2000 miliseconds)
    private static int SPLASH_SCREEN = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SelectionPage.class); // Making intent
                startActivity(intent);  // Starting it
                finish();               // Finishing it (since it's a splash screen)
            }
        }, SPLASH_SCREEN);
    }
}