package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectionPage extends AppCompatActivity {

    Button QuranSelectionPageBtn;
    Button HadithBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_page);

        // BUTTON ON CLICKS
        QuranSelectionPageBtn = (Button) findViewById(R.id.QuranSelectionBtn);
        QuranSelectionPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuranQuotesPage();
            }
        });

//        HadithBtn = (Button) findViewById(R.id.HadithSelectionBtn);
//        HadithBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(SelectionPage.this, "COMING SOON IN NEXT UPDATE", Toast.LENGTH_SHORT).show();
//            }
//        });

        // DISABLES DARK MODE FOR APP (NO BLACK BOXES)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

    }

    private void openQuranQuotesPage() {
        Intent intent = new Intent(this, QuranQuotesSelectionPage.class);
        startActivity(intent);
    }

}