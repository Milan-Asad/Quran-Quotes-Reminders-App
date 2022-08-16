package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

// https://www.al-islam.org/alphabetical-index-holy-quran/disbelievers


public class DisbelieverQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;

    private String DisbelieversQuotes [] = {
            "Surely those who disbelieve, it being alike to them whether you warn them, or do not warn them, will not believe. Allah has set a seal upon their hearts and upon their hearing and there is a covering over their eyes, and there is a great punishment for them (2:6-7)",
            "And there are some who say, 'we believe in Allah and the last Day,' yet they are not true believers. They seek to deceive Allah and the believers, yet they only deceive themselves, but they fail to perceive it. There is a disease in their hearts, so Allah added to their disease and they shall have a painful punishment because they lied (2:8-10)",
            "But those who disbelieve and deny our signs will be the residents of the fire. They will be there forever (2:39)",
            "Evil is that for which they have sold their souls, that they should deny what Allah has revealed, out of envy that Allah should send down of his grace on whomsoever of his servants he pleases; so they have made themselves deserving of wrath upon wrath, and there is a disgraceful punishment for the unbelievers (2:90)",
            "And when it is said to them, believe in what Allah has revealed, they say: we believe in that which was revealed to us; and they deny what is besides that, while it is the truth verifying that which they have. Say: 'why then did you kill Allah's prophets before if you were indeed believers?' (2:91)",
            // 5 ABOVE
            "The disbelievers from the people of the book and the polytheists (shirk) would not want you to receive any blessing from your lord, but Allah selects whoever he wills for his mercy. And Allah is the lord of infinite bounty (2:105)",
            "Rather you wish to put questions to your messenger, as Musa was questioned before; and whoever adopts unbelief instead of faith, he indeed has lost the right direction of the way (2:108)",
            "Surely those who disbelieve and die while they are disbelievers, these it is on whom is the curse of Allah and the angels and men all. They will be in hell forever. Their punishment will not be lightened, nor will they be delayed from it (2:161-162)",
            "The example of the disbelievers not responding to the messenger’s warning is like a flock not comprehending the calls and cries of the shepherd. They are wilfully deaf, dumb and blind so they have no understanding (2:171)",
            "Allah is the guardian of the believers. He brings them out of darkness and into light. As for the disbelievers, their guardians are false gods who lead them out of light and into darkness. It is they who will be the residents of the fire. They will be there forever (2:257)",
            // 10 ABOVE
            "(As for) those who disbelieve, surely neither their wealth nor their children shall avail (help) them in the least against Allah, and these it is who are the fuel of the fire (3:10)",
            "Say to those who disbelieve: You shall be vanquished, and driven together to hell; and evil is the resting-place. (3:12)",
            "Indeed, those who deny Allah’s signs, kill the prophets unjustly, and kill people who stand up for justice, give them good news of a painful punishment (3:21)",
            "As for those who disbelieve, I will subject them to a severe punishment in this life and the Hereafter, and they will have no helpers (3:56)",
            "How will Allah guide a people who chose to disbelieve after they had believed, acknowledged the messenger to be true, and received clear proofs? For Allah does not guide the wrongdoing people. Their reward is that they will be condemned by Allah, the angels, and all of humanity (3:86-87)",
            // 15 ABOVE
            "They will be in hell forever. Their punishment will not be lightened, nor will they be delayed from it (3:88)",
            "Surely, those who disbelieve after their believing, then increase in unbelief, their repentance shall not be accepted, and these are they that go astray (3:90)",
            "Indeed, if each of those who disbelieve then die as disbelievers were to offer a ransom of enough gold to fill the whole world, it would never be accepted from them. It is they who will suffer a painful punishment, and they will have no helpers (3:91)",
            "Those who trade belief for disbelief will never harm Allah in the least, and they will suffer a painful punishment (3:177)",
            "Those who disbelieve should not think that living longer is good for them. They are only given more time to increase in sin, and they will suffer a humiliating punishment (3:178)",
            // 20 ABOVE
            "Do not be deceived by the prosperity of the disbelievers throughout the land. It is only a brief enjoyment. Then hell will be their home, what an evil place to rest! (3:196-197)",
            "Those who are stingy, promote stinginess among people, and withhold Allah’s bounties. We have prepared for the disbelievers a humiliating punishment (4:37)",
            "Give good news of a painful punishment to hypocrites, who choose disbelievers as allies instead of the believers. Do they seek honour and power through that company? Surely all honour and power belongs to Allah (4:138-139)",
            "Surely those who deny Allah and his messengers and wish to make a distinction between Allah and his messengers, saying, 'we believe in some and disbelieve in others', desiring to forge a compromise, they are indeed the true disbelievers. And We have prepared for the disbelievers a humiliating punishment (4:150-151)",
            "Those who disbelieve and wrong themselves, surely Allah will neither forgive them nor guide them to any path. Except the path of hell, to stay there for ever and ever. And that is easy for Allah (4:168-169)",
            // 25 ABOVE
            "As for those who disbelieve and deny our signs, they are the residents of the hellfire (5:10)",
            "As for the disbelievers, even if they were to possess everything in the world twice over and offer it all to ransom themselves from the punishment of the day of judgment, it would never be accepted from them. And they will suffer a painful punishment (5:36)",
            "They will be desperate to get out of the fire but they will never be able to. And they will suffer an everlasting punishment (5:37)",
            "Whenever a sign comes to them from their lord, they turn away from it. They have indeed rejected the truth when it came to them, so they will soon face the consequences of their ridicule (6:4-5)",
            "Have they not seen how many disbelieving peoples we destroyed before them? We had made them more established in the land than you. We sent down abundant rain for them and made rivers flow at their feet. Then we destroyed them for their sins and replaced them with other peoples (6:6)",
            // 30 ABOVE (6:6 IS ABOVE)
            "Those who deny our signs are wilfully deaf and dumb, lost in darkness. Allah leaves whoever He wills to stray and guides whoever he wills to the straight way (6:39)",
            "When they became oblivious to warnings, we showered them with everything they desired. But just as they became prideful of what they were given, we seized them by surprise, then they instantly fell into despair! (6:44)",
            "But those who deny our signs will be afflicted with punishment for their rebelliousness (6:49)",
            "Even if We had sent them the angels, made the dead speak to them, and assembled before their own eyes every sign they demanded, they still would not have believed, unless Allah so willed. But most of them are ignorant of this (6:111)",
            "Indeed, what you have been promised will certainly come to pass. And you will have no escape (6:134)",
            // 35 ABOVE
            "As for those who deny our signs, we will gradually draw them to destruction in ways they cannot comprehend (7:182)",
            "Have they ever reflected on the wonders of the heavens and the earth, and everything Allah has created, and that perhaps their end is near? So what message after this Quran would they believe in? (7:185)",
            "And if you invite them to guidance, they will not follow you; it is the same to you whether you invite them or you are silent (7:193)",
            "And if you invite them to guidance, they do not hear; and you see them looking towards you, yet they do not see (7:198)",
            "And be not like those (disbelievers) who said, we hear, and they did not obey (8:21)",
            // 40 ABOVE

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disbeliever_quotes);

        TextView1 = (TextView) findViewById(R.id.disbelieverQuotesTxt);
        generateBtn = (Button) findViewById(R.id.disbelieverGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(DisbelieversQuotes.length);
                TextView1.setText(DisbelieversQuotes[num]);
            }
        });
    }


}