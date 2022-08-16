package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

// https://www.al-islam.org/alphabetical-index-holy-quran/disbelievers
//
// https://www.youtube.com/watch?v=4JGvDUlfk7Y

public class QuranQuotesSelectionPage extends AppCompatActivity {

    Button HereafterBtn;
    Button WordlyMattersBtn;
    ImageView SettingsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_quotes_selection_page);

//        // DISABLES DARK MODE FOR APP (NO BLACK BOXES)
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        // SELECTION PAGES
        HereafterBtn = (Button)findViewById(R.id.hereafterBtn);
        HereafterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHereafterSelectionPage();
            }
        });

        WordlyMattersBtn = (Button) findViewById(R.id.wordlymattersBtn);
        WordlyMattersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWordlyMattersSelectionPage();
            }
        });

//        SettingsBtn = (ImageView) findViewById(R.id.cogwheel);
//        SettingsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openSettingsPage();
//            }
//        });
    }



    // INTENTS
    private void openHereafterSelectionPage() {
        Intent intent = new Intent(this, HereafterSelectionPage.class);
        startActivity(intent);
    }

    private void openWordlyMattersSelectionPage() {
        Intent intent = new Intent(this, WordlyMattersSelectionPage.class);
        startActivity(intent);
    }

    private void openSettingsPage() {
        Intent intent = new Intent(this, SettingsPage.class);
        startActivity(intent);
    }
}