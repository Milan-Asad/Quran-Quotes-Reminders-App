package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DunyaQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;

    // https://www.islamawakened.com/quran/7/st69.htm
    // https://www.iqrasense.com/death-and-after-life/life-of-this-world-and-the-hereafter.html
    // https://www.islamicselfhelp.com/2016/08/02/25-islamic-quotes-adversity/ - Hardships next topic

    private String DunyaQuotes [] = {
            "And the worldly life is not but amusement and diversion; but the home of the hereafter is best for those who fear Allah , so will you not reason? (6:32)",
            "And what is the life of this world other than play and amusement? (3:185)",
            "And leave those who take this faith of Islam as mere play and amusement, and are deluded by their worldly life (6:70)",
            "Wealth and children are the adornment of this worldly life, but the everlasting good deeds are far better with your lord in reward and in hope (18:46)",
            "Do you prefer the life of this world over the hereafter? The enjoyment of this worldly life is insignificant compared to that of the hereafter (9:34)",
            // 5 ABOVE
            "Who took their religion as distraction and amusement and whom the worldly life deluded. So today we will forget them just as they forgot the meeting of this day of theirs and for having rejected our verses (7:51)",
            "Do you prefer the life of this world over the hereafter? The enjoyment of this worldly life is insignificant compared to that of the hereafter (9:38)",
            "And the disbelievers become prideful of the pleasures of this worldly life. But the life of this world, compared to the Hereafter, is nothing but a fleeting enjoyment (13:26)",
            "Competition for more gains diverts you˹from Allah. Until you end up in your graves (102:1-2)",
            "Indeed, if you were to know your fate with certainty, you would have acted differently (102:5)", // 10


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunya_quotes);

        // DISABLES DARK MODE FOR APP (NO BLACK BOXES)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        TextView1 = (TextView) findViewById(R.id.DunyaQuotesTxt);
        generateBtn = (Button) findViewById(R.id.DunyaGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(DunyaQuotes.length);
                TextView1.setText(DunyaQuotes[num]);
            }
        });
    }
}

// "Allah says: For how many years did you stay on earth? They reply: We stayed for a day or part of a day. Ask of those who are able to keep count of this. Allah says: You stayed but for a short while, if only you had known (how short it was to be and acted accordingly)! Or did you think that We created you in vain, and that you should devote all your time to play and entertainment, and that you would not be brought back to us? (23:112-115).",