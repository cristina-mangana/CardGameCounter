package com.example.android.cardgamecounter;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the font's path
        String fontPathPermanentMarker = "fonts/PermanentMarker.ttf";
        // Get the id TextView
        TextView textViewCoverTitle = (TextView) findViewById(R.id.coverTitle);
        // Load the font as a TypeFace object
        Typeface typeFacePermanentMarker = Typeface.createFromAsset(getAssets(), fontPathPermanentMarker);
        // Set the extra fancy font in the customFont TextView
        textViewCoverTitle.setTypeface(typeFacePermanentMarker);
    }

    //Open menu activity
    public void startButton (View view) {
        Intent openActivityMenu = new Intent(this,MenuActivity.class);
        startActivity(openActivityMenu);
    }
}
