package com.coderminion.typeface;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SpannableString s = new SpannableString("COC Land");
        s.setSpan(new TypefaceSpan(this, "supercellmagic.ttf"), 0, s.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance
        getSupportActionBar().setTitle(s);


        //Another method for setting Typeface to TextView
        Typeface font = Typeface.createFromAsset(getAssets(), "supercellmagic.ttf");
        TextView cocland = (TextView)findViewById(R.id.cocland);
        cocland.setTypeface(font);


    }
}
