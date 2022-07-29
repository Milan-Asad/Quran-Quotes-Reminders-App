package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MarriageQuotes extends AppCompatActivity {

    // android:fillViewport="true">

    TextView TextView1;
    Button generateBtn;

    // https://www.tazawaj.com/en/blog/10-beautiful-verses-in-quran-about-marriage/
    // https://www.getquranic.com/marriage-in-islam-8-quranic-verses-about-marriage/

    private String MarriageQuotes[] = {
            "Our Lord, grant us from among our spouses and offspring comfort to our eyes and make us an example for the righteous (25:74)",
            "And we created you in pairs (78:8)",
            "And of his signs is that he created for you from yourselves mates that you may find tranquility in them; And he placed between you affection and mercy. Indeed in that are signs for a people who give thought (30:21)",
            "He is the one who created you from a single soul, then from it made its spouse so he may find comfort in her. After he had been united with her, she carried a light burden that developed gradually. When it grew heavy, they prayed to Allah, their Lord, 'If you grant us good offspring, we will certainly be grateful' (7:189)",
            "Wicked women are for wicked men, and wicked men are for wicked women. And righteous women are for righteous men, and righteous men are for righteous women. The righteous are innocent of what the wicked say. They will have forgiveness and an honourable provision (24:26)",
            // 5 ABOVE
            "And it is Allah who created you from dust, then developed you from a sperm-drop, then made you into pairs. No female ever conceives or delivers without his knowledge. And no one’s life is made long or cut short, but is written in a Record. That is certainly easy for Allah (35:11)",
            "And Allah has made for you spouses of your own kind, and given you through your spouses children and grandchildren. And He has granted you good, lawful provisions. Are they then faithful to falsehood and ungrateful for Allah’s favours? (16:72)",
            "Glorified is the one who created every kind of vegetables and animals [including the disbelievers] in male and female as well as other creatures that they do not even know about their existence (36:36)",
            "O mankind, fear your Lord, who created you from one soul and created from it its mate and dispersed from both of them many men and women... (4:1)",
            "They are clothing for you and you are clothing for them... (2:187)",
            // 10 ABOVE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage_quotes);

        TextView1 = (TextView) findViewById(R.id.MarriageQuotesTxt);
        generateBtn = (Button) findViewById(R.id.MarriageGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(MarriageQuotes.length);
                TextView1.setText(MarriageQuotes[num]);
            }
        });


    }
}