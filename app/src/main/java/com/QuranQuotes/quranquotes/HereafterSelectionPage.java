package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HereafterSelectionPage extends AppCompatActivity {

    Button JannahBtn;
    Button JahannamBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hereafter_selection_page);





        // BUTTON ON CLICKS
        JannahBtn = (Button) findViewById(R.id.jannahBtn);
        JannahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJannahQuotesPage();
            }
        });

        JahannamBtn = (Button) findViewById(R.id.jahannamBtn);
        JahannamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJahannamQuotePage();
            }
        });
    }

    private void openJannahQuotesPage() {
        Intent intent = new Intent(this, JannahQuotesPage.class);
        startActivity(intent);
    }

    private void openJahannamQuotePage() {
        Intent intent = new Intent(this, JahannamQuotes.class);
        startActivity(intent);
    }
}