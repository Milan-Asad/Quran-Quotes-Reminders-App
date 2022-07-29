package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class HardshipQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;

    // https://www.islamicselfhelp.com/2016/08/02/25-islamic-quotes-adversity/

    // https://themuslimvibe.com/faith-islam/5-verses-from-the-holy-quran-on-marriage - Marriage next topic
    // https://www.getquranic.com/marriage-in-islam-8-quranic-verses-about-marriage/ - Marriage
    // https://www.tazawaj.com/en/blog/10-beautiful-verses-in-quran-about-marriage/ - 10 M quotes

    private String HardshipQuotes [] = {
            "So surely with hardship comes ease (94:5)",
            "Surely with that hardship comes more ease (94:6)",
            "Verily, we shall test you with some fear, and hunger, and with some loss of wealth, lives, and offspring. So give good news to those who are patient. Those who say, when inflicted by hardship, ‘Verily to Allah we belong, and verily to him shall we return,’ Upon them is the blessings of Allah and his mercy. And they are the rightly guided (2:155-157)",
            "Verily, we created man from a drop of mingled sperm so that we may test him; and We granted him the ability to listen and observe. We have indeed shown him the way, so he (may choose to) be grateful or ungrateful (76:2-3)",
            "Verily, we have made whatever is on the earth beautiful for it, so that we may test them as to which of them are best in deeds (18:7)",
            // 5 ABOVE
            "Allah does not burden a soul beyond that it can bear (2:286)",
            "“And whoever fears Allah, he will make for him a way out. And will provide for him from where he does not expect. And whoever relies on Allah, then he is sufficient for him. Indeed, Allah will accomplish his purpose (65:2-3)",
            "Your Lord has not forsaken (abandoned) you, nor is he displeased. Definitely, what is to come is better than what has passed. Soon your lord will grant you, and you will be pleased (93:3-5)",
            "Oh soul in a state of inner peace. Return to your lord, pleased and pleasing. So enter among my worshipers, and enter my Paradise (89:27-30)",
            "And those who had Taqwa (fear of allah) of their Lord will be led to Paradise in groups. Until, when they reach it, its doors will be (already) open, and its guards will say: ‘Peace be upon you! You have done well! So enter it forever! (39:73)",
            // 10 ABOVE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardship_quotes);

        TextView1 = (TextView) findViewById(R.id.HardshipQuotesTxt);
        generateBtn = (Button) findViewById(R.id.HardshipGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(HardshipQuotes.length);
                TextView1.setText(HardshipQuotes[num]);
            }
        });

    }
}