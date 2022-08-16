package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DeathQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;

    private String DeathQuotes [] = {
            "How can you deny Allah? You were lifeless and he gave you life, then He will cause you to die and again bring you to life, and then to him you will all be returned (2:28)",
            "Those who are certain that they will meet their lord and to him they will return (2:46)",
            "No soul can ever die without Allah’s will at the destined time. Those who desire worldly gain, we will let them have it, and those who desire heavenly reward, we will grant it to them. And we will reward those who are grateful (3:145)",
            "Should you be martyred or die in the cause of Allah, then his forgiveness and mercy are far better than whatever wealth those who stay behind accumulate (3:157)",
            "Whether you die or are martyred, all of you will be gathered before Allah (3:158)",
            // 5 ABOVE
            "Only the attentive will respond to your call. As for the dead, Allah will raise them up, then to him they will all be returned (6:36)",
            "He is the one who calls back your souls by night and knows what you do by day, then revives you daily to complete your appointed term. To him is your ultimate return, then he will inform you of what you used to do (6:60)",
            "He reigns supreme over all of his creation, and sends recording-angels, watching over you. When death comes to any of you, our angels take their soul, never neglecting this duty (6:61)",
            "Then are they sent back to Allah, their master, the True one; now surely his is the judgment and he is swiftest in taking account (6:62)",
            "If only you could see when the angels take the souls of the disbelievers, beating their faces and backs, saying, 'taste the torment of burning!' (8:50)",
            // 10 ABOVE
            "To Allah is your return. And he is most capable of everything (11:4)",
            "From the earth we created you, and into it we will return you, and from it we will bring you back again (20:55)",
            "We never granted everlasting life to any human being before you (O Messenger); so if you die, will they live forever? (21:34)",
            "Every soul will taste death. And we test you 'O humanity' with good and evil as a trial, then to us you will all be returned (21:35)",
            "As for those who emigrate in the cause of Allah and then are martyred or die, Allah will indeed grant them a good provision. Surely Allah is the best provider (22:58)",
            // 15 ABOVE
            "After that you will surely die, then on the day of judgment you will be resurrected (23:15-16)",
            "When death approaches any of them, they cry, 'my lord!' Let me go back so I may do good in what I left behind'. Never! It is only a useless appeal they make. And there is a barrier behind them until the day they are resurrected (23:99-100)",
            "Whoever hopes to meet Allah, the term appointed by Allah will then most surely come; and he is the hearing, the knowing (29:5)",
            "Every soul will taste death, then to us you will all be returned (29:57)",
            "It is Allah Who created you in a state of weakness, then developed your weakness into strength, then developed your strength into weakness and old age. He creates whatever he wills. For he is the all-knowing, most capable (30:54)",
            // 20 ABOVE 30:54 ABOVE
            "Still they ask mockingly, 'when we are disintegrated into the earth, will we really be raised as a new creation?' In fact, they are in denial of the meeting with their lord (32:10)",
            "Say, O Prophet, 'Your soul will be taken by the angel of death, who is in charge of you. Then to your lord you will all be returned' (32:11)",
            "And whoever we grant a long life, we reverse them in development (old age). Will they not then understand? (36:68)",
            "Surely you shall die and they (too) shall surely die. Then on the day of judgment you will all settle your dispute before your lord (39:30-31)",
            "It is Allah who calls back the souls of people upon their death as well as the souls of the living during their sleep. Then he keeps those for whom he has ordained death, and releases the others until their appointed time. Surely in this are signs for people who reflect (39:42)",
            // 25 ABOVE
            "They are truly in doubt of the meeting with their lord! But he is indeed fully aware of everything (41:54)",
            "And surely to our lord we will all return (43:14)",
            "Say, O Prophet, it is Allah who gives you life, then causes you to die, then will gather you all on the day of judgment, about which there is no doubt. But most people do not know (45:26)",
            "He will guide them to their reward, improve their condition and admit them into paradise, having made it known to them (47:5-6)",
            "Ultimately, with the throes (struggle) of death will come the truth. This is what you were trying to escape! (50:19)",
            // 30 ABOVE
            "We have ordained death for all of you, and we cannot be prevented from transforming and recreating you in forms unknown to you (56:60-61)",
            "Why then are you helpless when the soul of a dying person reaches their throat while you are looking on? (56:83-84)",
            "Now, if you are not subject to our will as you claim, bring that soul back, if what you say is true (56:86-87)",
            "So, if the deceased is one of those brought near to us, then such a person will have serenity, fragrance, and a garden of bliss (56:88-89)",
            "And if the deceased is one of the people of the right, then they will be told, 'greetings to you from the people of the right' (56:90-91)",
            // 35 ABOVE
            "But if such person is one of the misguided deniers, then their accommodation will be boiling water to drink and burning in hellfire. Indeed, this is the absolute truth (56:92-95)",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_death_quotes);

        TextView1 = (TextView) findViewById(R.id.deathQuotesTxt);
        generateBtn = (Button) findViewById(R.id.deathGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(DeathQuotes.length);
                TextView1.setText(DeathQuotes[num]);
            }
        });


    }
}