package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class WealthQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;
    // https://understandquran.com/wealth-10-quranic-teachings/
    // https://al-quran.info/#home

    private String WealthQuotes [] = {
            "And we will surely test you with something of fear and hunger and a loss of wealth and lives and fruits, but give good tidings to the patient...(2:155)",
            "And when a surah was revealed [enjoining them] to believe in Allah and to fight with his Messenger, those of wealth among them asked your permission [to stay back] and said, ‘Leave us to be with them who sit [at home]' (9:86)",
            "And do not consume one another’s wealth unjustly or send it [in bribery] to the rulers in order that [they might aid] you [to] consume a portion of the wealth of the people in sin, while you know [it is unlawful] (2:188)",
            "But give them [a gift of] compensation. The wealthy according to his capability and the poor according to his capability – a provision according to what is acceptable, a duty upon the doers of good (2:236)",
            "The example of those who spend their wealth in the way of Allah is like a seed [of grain] which grows seven spikes; in each spike is a hundred grains. And Allah multiplies [his reward] for whom he wills. And Allah is all-encompassing and knowing (2:261)",
            // 5 ABOVE
            "O you who have believed, do not invalidate your charities with reminders or injury as does one who spends his wealth [only] to be seen by the people and does not believe in Allah and the Last Day. His example is like that of a [large] smooth stone upon which is dust and is hit by a downpour that leaves it bare. They are unable [to keep] anything of what they have earned. And Allah does not guide the disbelieving people (2:264)",
            "So let not their wealth or their children impress you. Allah only intends to punish them through them in worldly life and that their souls should depart [at death] while they are disbelievers (9:55)",
            "O you who have believed, let not your wealth and your children divert you from remembrance of Allah. And whoever does that, then those are the losers (63:9)",
            "Wealth and children are adornment [accessory] of the worldly life. But the enduring good deeds are better to your Lord for reward and better for [one’s] hope (18:46)",
            "The Day when there will not benefit [from] wealth or children (26:88)",
            // 10 ABOVE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wealth_quotes);

        TextView1 = (TextView) findViewById(R.id.WealthQuotesTxt);
        generateBtn = (Button) findViewById(R.id.WealthGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(WealthQuotes.length);
                TextView1.setText(WealthQuotes[num]);
            }
        });

    }
}