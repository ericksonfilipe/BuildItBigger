package com.apps.ericksonfilipe.displayjoke;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static final String INTENT_JOKE = "JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke = getIntent().getStringExtra(INTENT_JOKE);
        TextView textViewJoke = (TextView) findViewById(R.id.joke_text_view);
        textViewJoke.setText(joke);
    }
}
