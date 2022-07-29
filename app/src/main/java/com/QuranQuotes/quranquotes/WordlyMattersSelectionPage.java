package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WordlyMattersSelectionPage extends AppCompatActivity {


    Button SalahBtn;
    Button ZakatBtn;
    Button DunyaBtn;
    Button HardshipBtn;
    Button MarriageBtn;
    Button WealthBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordly_matters_selection_page);

        // BUTTON ON CLICKS


        SalahBtn = (Button) findViewById(R.id.salahBtn);
        SalahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSalahQuotePage();
            }
        });

        ZakatBtn = (Button) findViewById(R.id.zakatBtn);
        ZakatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openZakatQuotePage();
            }
        });

        DunyaBtn = (Button) findViewById(R.id.dunyaBtn);
        DunyaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDunyaQuotePage();
            }
        });

        HardshipBtn = (Button) findViewById(R.id.hardshipBtn);
        HardshipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHardshipQuotePage();
            }
        });

        MarriageBtn = (Button)findViewById(R.id.marriageBtn);
        MarriageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMarriageQuotePage();
            }
        });

        WealthBtn = (Button) findViewById(R.id.wealthBtn);
        WealthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWealthQuotePage();
            }
        });

    }


    private void openSalahQuotePage() {
        Intent intent = new Intent(this, SalahQuotes.class);
        startActivity(intent);
    }

    private void openZakatQuotePage() {
        Intent intent = new Intent(this, ZakatQuotes.class);
        startActivity(intent);
    }

    private void openDunyaQuotePage() {
        Intent intent = new Intent(this, DunyaQuotes.class);
        startActivity(intent);
    }

    private void openHardshipQuotePage() {
        Intent intent = new Intent(this, HardshipQuotes.class);
        startActivity(intent);
    }

    private void openMarriageQuotePage() {
        Intent intent = new Intent(this, MarriageQuotes.class);
        startActivity(intent);
    }

    private void openWealthQuotePage() {
        Intent intent = new Intent (this, WealthQuotes.class);
        startActivity(intent);
    }

}