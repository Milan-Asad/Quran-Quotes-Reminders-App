package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class JahannamQuotes extends AppCompatActivity {

    TextView TextView1;
    Button generateBtn;
    // https://www.learnreligions.com/hell-in-the-quran-2004344
    // https://quranverses.net/hell/
    // https://www.whyislam.org/islam/hell/
    // https://myislam.org/islamic-quotes-on-death/- death next topic

    // QUOTES
    private String JahannamQuotes [] = { // String + give it a name
            "Those who reject Faith, and die rejecting, on them is Allah's curse, and the curse of angels, and of all mankind. They will abide therein: Their penalty will not be lightened, nor will they receive respite (2:161-162)",
            "They are (men) who Allah have cursed: And those whom Allah have cursed, you will find no one to help (4:52)",
            "These are two opposing groups that disagree about their lord: as for the disbelievers, garments of fire will be cut out for them and boiling water will be poured over their heads. Melting whatever is in their bellies, along with their skin (22:19-20)",
            "In front of such a one is hell, and he is given, for drink, boiling fetid (unpleasant) water (14:16)",
            "In its midst and in the midst of boiling hot water will they wander round! (55:44)",  //5
            "Verily, the tree of deadly fruit will be the food of the sinful. Like molten lead will it boil in the belly, like the boiling of burning despair (44:43-46)",
            "And those who followed would say: 'If only We had one more chance...' Thus will Allah show them (the fruits of) their deeds as (nothing but) regrets. Nor will there be a way for them out of the fire (2:167)",
            "As to those who reject Faith: if they had everything on earth, and twice repeated, to give as ransom for the penalty of the Day of Judgment, it would never be accepted of them. Theirs would be a grievous penalty. Their wish will be to get out of the fire, but never will they get out. Their penalty will be one that endures (5:36-37)",
            "And they will never leave of the Fire (2:167)",
            //10 below
            "Surely, those who disbelieve and did wrong; Allah will not forgive them, nor will he guide them to any way except the way of hell, to dwell therein forever (4:168-169)",
            "And awaiting them are maces of iron (22:21)",
            "Whenever they try to escape from hell out of anguish, they will be forced back into it and will be told: 'Taste the torment of burning' (22:22)",
            "They will long to leave the fire, but never will they leave there from; and theirs will be a lasting torment (5:37)",
            "Surely Allah condemns the disbelievers, and has prepared for them a blazing fire (33:64)",
            "And whoever disobeys Allah and his messenger will certainly be in the fire of hell, to stay there for ever and ever (72:23)", // 15
            "The unbelievers will be led to hell in crowds until, when they arrive there, its gates will be opened (39:71)",
            "And verily, hell is the promised abode for them all. It has seven gates: to each of those gates is a specific class of sinners assigned (15:43-44)",
            "It will be said to them, 'Enter the gates of Hell, to stay there forever.' What an evil home for the arrogant! (39:72)",
            "They will have no food except a foul, thorny shrub, neither nourishing nor satisfying hunger (88:6-7)",
            "Burning in a scorching fire, left to drink from a scalding spring (88:4-5)", // 20

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahannam_quotes);

        TextView1 = (TextView) findViewById(R.id.jahannamQuotesTxt);
        generateBtn = (Button) findViewById(R.id.JahannamGenerateBtn);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(JahannamQuotes.length);
                TextView1.setText(JahannamQuotes[num]);
            }
        });

    }
}

//
// "Those who deny (their Lord), for them will be cut out a garment of Fire. Over their heads will be poured out boiling water. With it will be scalded what is within their bodies, as well as their skins. In addition there will be maces of iron (to punish) them. Every time they wish to get away therefrom, from anguish, they will be forced back, and (it will be said), Taste the Penalty of Burning! (22:19-22)",