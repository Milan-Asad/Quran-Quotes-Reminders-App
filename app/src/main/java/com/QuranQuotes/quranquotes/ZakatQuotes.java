package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ZakatQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;
    // https://myislam.org/30-islamic-quotes-on-charity/
    // https://www.learnreligions.com/what-does-the-quran-say-about-charity-2004401
    // https://www.zakat.org/what-quran-say-about-zakat
    // 7.156 (next quote to add in)

    private String ZakatQuotes [] = {
            "Charity in secret, quiets the wrath of Allah and takes away one’s sin as the water puts out the fire and keeps away seventy kinds of calamities (2:271)",
            "Give orphans their wealth when they reach maturity, and do not exchange your worthless possessions for their valuables, nor cheat them by mixing their wealth with your own. For this would indeed be a great sin (4:2)",
            "Be steadfast in prayer, practice regular charity, and bow down your heads with those who bow down (in worship) (2:43)",
            "Charity is for those in need, who, in Allah’s cause are restricted (from travel), and cannot move about in the land, seeking (for trade or work) (2:273)",
            // 5 IS BELOW
            "Allah will deprive usury of all blessing, but will give increase for deeds of charity. For he loves not creatures ungrateful and wicked (2:276)",
            "Those who believe, and do deeds of righteousness, and establish regular prayers and regular charity, will have their reward with their lord. On them shall be no fear, nor shall they grieve (2:277)",
            "You will not attain righteousness till you spend in charity of the things you love (3:92)",
            "Those who lay up treasures of gold and silver and spend them not in the way of Allah; give them the news of a painful punishment, on the day when that (wealth) will be heated in hellfire, and their foreheads and their sides and their backs branded therewith: 'This is the treasure which you laid up for yourselves! Taste, then, your hoarded treasure!' (9:34-35)",
            "Let not those who are miserly with what Allah has given them of his bounty think that this is good for them. Rather, it is bad for them. That which they withhold shall be hung around their necks on the day of Arising (3:180)",
            // 10 BELOW
            "Worship none but Allah. Treat with kindness your parents and kindred, and orphans and those in need; speak fair to the people; be steadfast in prayer; and practice regular charity (2:83)",
            "They ask thee what they should spend in charity. Say: whatever you spend that is good, is for parents and kindred and orphans and those in want and for wayfarers. And whatever you do that is good, Allah knows it well (2:215)",
            "Charity is for those in need, who, in Allah's cause are restricted (from travel), and cannot move about in the land, seeking (for trade or work) (2:273)",
            "Those who in charity spend of their goods by night and by day, in secret and in public, have their reward with their Lord: on them shall be no fear, nor shall they grieve (2:274)",
            "If the debtor is in a difficulty, grant him time until it is easy for him to repay. But if you remit it by way of charity, that is best for you if you only knew (2:280)",
            // 15 BELOW
            "Kind words and the covering of faults are better than charity followed by injury. Allah is free of all wants, and he is most-forbearing (2:263)",
            "Yet you shall duly establish the Prayer. And you shall give the zakat, and therewith lend God a most goodly loan. For whatever good you advance for your souls, you shall find its reward with God in the hereafter; yet it shall be far better and much greater in reward (73:20)",
            "Then steadfastly continue to duly establish the Prayer, and give the zakat (58:13)",
            "Those who do not pay zakat and are in denial of the hereafter (41:7)",
            "Take from their wealth a ‘charitable offering’ to cleanse them and purify them thereby (9:60)",
            // 20 BELOW
            "He has made me a blessing wherever I go, and bid me to establish prayer and give zakat as long as I live (19:31)",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_quotes);

        TextView1 = (TextView) findViewById(R.id.zakatQuotesTxt);
        generateBtn = (Button) findViewById(R.id.zakatGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(ZakatQuotes.length);
                TextView1.setText(ZakatQuotes[num]);
            }
        });
    }
}