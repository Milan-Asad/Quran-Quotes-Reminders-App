package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class JannahQuotesPage extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;
    // https://www.learnreligions.com/heaven-in-the-quran-2004343 - Jannah quotes
    // https://myislam.org/jannah-quotes/
    // https://islamcan.com/blog/2019/12/10-beautiful-quranic-verses-about-paradise/

    private String JannahQuotes[] = {
            "Jannah is as wide as the heavens and the earth (3:133)",
            "The people of Jannah will have abundant food and drink (38:51)",
            "They will drink from rivers of pure water, milk, wine and honey (47:15)",
            "The wine of paradise will be crystal-white, delicious to those who drink, free from intoxication...” (37:46-47)",
            "Surely the ones who have believed and done deeds of righteousness, the gardens of paradise will (duly) be their hospitality (18:107)",
            // 5 ABOVE
            "They will not hear therein ill speech or commission of sin. But only the saying of: 'Peace! Peace!' (56:25–26)",
            "But give glad tidings to those who believe and work righteousness, that their portion is gardens, beneath which rivers flow (2:25).",
            "Be quick in the race for forgiveness from your lord, and for a garden whose width is that (of the whole) of the heavens and of the earth, prepared for the righteous (3:133)",
            "Allah has promised the believers, both men and women, gardens under which rivers flow, to stay there forever, and splendid homes in the gardens of eternity, and above all, the pleasure of Allah. That is truly the ultimate triumph (9:72)",
            "They will recline (with ease) on thrones (of dignity) arranged in ranks... (52:20)",
            // 10 ABOVE
            "They and their associates will be in groves of (cool) shade, reclining on Thrones (of dignity). Every fruit (enjoyment) will be there for them; they shall have whatever they call for (36:56–57)",
            "In a lofty Paradise, where they shall neither hear harmful speech nor falsehood. Therein will be a running spring. Therein will be thrones raised high, and cups set at hand. And cushions set in rows, and rich carpets (all) spread out (88:10–16)",
            "Every time they are fed with fruits therefrom, they say: 'Why, this is what we were fed before,' for they are given things in similitude... (2:25)",
            "Therein you shall have (all) that your inner‑selves desire, and therein you shall have all for which you ask. An entertainment from Allah, the oft‑forgiving, most Merciful (41:31–32)",
            "Eat and drink at ease for that which you have sent forth (good deeds) in days past!” (69:24)",
            // 15 ABOVE
            "Rivers of water incorruptible; rivers of milk of which the taste never changes...” (47:15)",
            "But those who have faith and work righteousness, they are companions of the garden. Therein shall they abide forever (2:82)",
            "For such the reward is forgiveness from their lord, and gardens with rivers flowing underneath an eternal dwelling. How excellent a recompense for those who work (and strive)! (3:136)",
            "Indeed, those who have believed and done righteous deeds, their lord will guide them because of their faith. Beneath them rivers will flow in the gardens of pleasure (10:9)",
            "And no soul knows what has been hidden for them of comfort for eyes as reward for what they used to do (32:17)",
            // 20 ABOVE


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jannah_quotes_page);

        TextView1 = (TextView) findViewById(R.id.JannahQuotesTxt);
        generateBtn = (Button) findViewById(R.id.JannahGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(JannahQuotes.length);
                TextView1.setText(JannahQuotes[num]);
            }
        });
    }
}