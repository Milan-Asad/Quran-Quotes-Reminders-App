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
    Button DisbelieverBtn;
    Button DeathBtn;
    Button SecretLettersBtn;

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

        DisbelieverBtn = (Button) findViewById(R.id.disbelieverBtn);
        DisbelieverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDisvelieversQuotePage();
            }
        });

        DeathBtn = (Button) findViewById(R.id.deathBtn);
        DeathBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDeathQuotesPage();
            }
        });

        SecretLettersBtn = (Button) findViewById(R.id.secretlettersBtn);
        SecretLettersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecretLetterQuotePage();
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

    private void openDisvelieversQuotePage() {
        Intent intent = new Intent(this, DisbelieverQuotes.class);
        startActivity(intent);
    }

    private void openDeathQuotesPage() {
        Intent intent = new Intent(this, DeathQuotes.class);
        startActivity(intent);
    }

    private void openSecretLetterQuotePage() {
        Intent intent = new Intent(this, SecretLetterQuotes.class);
        startActivity(intent);
    }

}