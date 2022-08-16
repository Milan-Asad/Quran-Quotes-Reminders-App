package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecretLetterQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;

    private String SecretLettersQuotes [] = {
            "Alif Lam Mim (2:1)",
            "Alif Lam Mim Suad (7:1)",
            "Alif Lam Ra. These are the verses of the wise Book (10:1)",
            "Alif Lam Ra. This is a book, whose verses are made decisive, then are they made plain, from the wise, all-aware (11:1)",
            "Alif Lam Ra. These are the verses of the clear Book (12:1)",
            // 5 ABOVE
            "Alif Lam Mim Ra. These are the verses of the Book; and that which is revealed to you from your Lord is the truth, but most people do not believe (13:1)",
            "Alif Lam Ra. This is a book which we have revealed to you that you may bring forth men, by their lord's permission from utter darkness into light, to the way of the mighty, the praised one (14:1)",
            "Alif Lam Ra. These are the verses of the Book; the clear Qur'an (15:1)",
            "Kaf Ha Ya Ain Suad (19:1)",
            "Ta Ha (20:1)",
            // 10 ABOVE
            "Ta Sin Mim (26:1)",
            "Ta Sin. These are the verses of the Qur'an; the clear Book (27:1)",
            "Sad. By the Quran, full of reminders! (38:1)",
            "Ha Mim. Ain Sin Qaf (42:1-2)",
            "Qaf. By the glorious Quran! (50:1)"
            // 15 ABOVE


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_letter_quotes);

        TextView1 = (TextView) findViewById(R.id.secretlettersQuotesTxt);
        generateBtn = (Button) findViewById(R.id.secretGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(SecretLettersQuotes.length);
                TextView1.setText(SecretLettersQuotes[num]);
            }
        });
    }
}