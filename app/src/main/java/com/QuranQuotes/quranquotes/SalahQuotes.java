package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SalahQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;
    // http://www.quranreading.com/blog/importance-of-salah-prayer-according-to-the-holy-quran/
    // https://myislam.org/verses-in-quran-about-salah/#:~:text=2%3A110%20And%20establish%20prayer,help%20through%20patience%20and%20prayer
    // https://myislam.org/verses-in-quran-about-salah/#:~:text=2%3A110%20And%20establish%20prayer,help%20through%20patience%20and%20prayer.

    private String SalahQuotes [] = {
            "And the establishers of prayer [especially] and the givers of zakat and the believers in Allah and the Last Day – those We will give a great reward (4:162)",
            "Those who believe in the hereafter believe in (the Qur'an), and they are constant in guarding their salah (prayers) (6:92)",
            "But there came after them successors who neglected prayer and pursued desires; so they are going to meet destruction (19:59)",
            "They (inhabitants of the fire) will say: ‘We were not of those who prayed’ (74:43)",
            // 5 IS BELOW
            "Verily, man was created impatient, irritable when evil touches him and ungenerous when good touches him. Except for those devoted to prayer – those who remain constant in their prayers (70:19-23)",
            "Verily, the prayer keeps one from the great sins and evil deeds (29:45)",
            "And to establish prayer and fear him.” And it is He to whom you will be gathered (Quran 6:72)",
            "Indeed, those who believe and do righteous deeds and establish prayer and give zakat will have their reward with their lord, and there will be no fear concerning them, nor will they grieve (2:277)",
            "Who, when Allah is mentioned, their hearts are fearful, and [to] the patient over what has afflicted them, and the establishers of prayer and those who spend from what we have provided them (22:25)",
            "O you who have believed, seek help through patience and prayer. Indeed, Allah is with the patient (2:153)", // 10
            "But if they repent, establish prayer, and give zakat, then they are your brothers in religion; and we detail the verses for a people who know (9:11)",
            "The mosques of Allah are only to be maintained by those who believe in Allah and the last day and establish prayer and give zakat and do not fear except Allah, for it is expected that those will be of the [rightly] guided (9:18)",
            "And establish prayer at the two ends of the day and at the approach of the night. Indeed, good deeds do away with misdeeds. That is a reminder for those who remember (11:114)",
            "And those who are patient, seeking the countenance of their lord, and establish prayer and spend from what we have provided for them secretly and publicly and prevent evil with good (13:22)",
            // 15 BELOW
            "Establish prayer at the decline of the sun [from its meridian] until the darkness of the night and [also] the Qur’an of dawn. Indeed, the recitation of dawn is ever witnessed [by Angels] (17:78)",
            "But there came after them successors who neglected prayer and pursued desires; so they are going to meet evil...except those who repent, believe and do righteousness; for those will enter paradise and will not be wronged at all (19:59-60)",
            "And enjoin prayer upon your family [and people] and be steadfast therein. We ask you not for provision; We provide for you, and the [best] outcome is for [those of] righteousness (20:132)",
            "And We made them leaders guiding by Our command. And We inspired to them the doing of good deeds, establishment of prayer, and giving of zakat; and they were worshippers of Us (21:73)",
            "And establish prayer and give zakat and obey the messenger so you may be shown mercy (24:56)",  // 20

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah_quotes);

        TextView1 = (TextView) findViewById(R.id.SalahQuotesTxt);
        generateBtn = (Button) findViewById(R.id.salahGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(SalahQuotes.length);
                TextView1.setText(SalahQuotes[num]);
            }
        });
    }
}