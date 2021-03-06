package com.example.android.cardgamecounter;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private String gameSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Linkify text (underline and add link color)
        TextView textViewContact = (TextView) findViewById(R.id.contactText);
        SpannableStringBuilder spannableContact = new SpannableStringBuilder(getString(R.string.contact));
        spannableContact.setSpan(new UnderlineSpan(), 0, getString(R.string.contact).length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        int linkColor = ResourcesCompat.getColor(getResources(), R.color.colorAccent, null);
        spannableContact.setSpan(new ForegroundColorSpan(linkColor), 0, getString(R.string.contact).length(), 0);
        textViewContact.setText(spannableContact);

        //Different styles in one text
        TextView textViewPointBased = (TextView) findViewById(R.id.pointBased);
        String stringPointBased = getString(R.string.pointGame).toUpperCase();
        textViewPointBased.setText(stringPointBased + getString(R.string.pointGameExample));
        TextView textViewGameBased = (TextView) findViewById(R.id.gameBased);
        String stringGameBased = getString(R.string.gameGame).toUpperCase();
        textViewGameBased.setText(stringGameBased + getString(R.string.gameGameExample));

        // Set the font's path
        String fontPathPermanentMarker = "fonts/PermanentMarker.ttf";
        String fontPathRobotoMedium = "fonts/Roboto-Medium.ttf";
        String fontPathRobotoRegular = "fonts/Roboto-Regular.ttf";
        // Get the id TextView
        TextView textViewMainHead = (TextView) findViewById(R.id.mainHead);
        TextView textViewSelectGame= (TextView) findViewById(R.id.selectGameText);
        TextView textViewSuggestions= (TextView) findViewById(R.id.suggestionsText);
        // Load the font as a TypeFace object
        Typeface typeFacePermanentMarker = Typeface.createFromAsset(getAssets(), fontPathPermanentMarker);
        Typeface typeFaceRobotoMedium = Typeface.createFromAsset(getAssets(), fontPathRobotoMedium);
        Typeface typeFaceRobotoRegular = Typeface.createFromAsset(getAssets(), fontPathRobotoRegular);
        // Set the extra fancy font in the customFont TextView
        textViewMainHead.setTypeface(typeFacePermanentMarker);
        textViewSelectGame.setTypeface(typeFaceRobotoMedium);
        textViewSuggestions.setTypeface(typeFaceRobotoRegular);
        textViewContact.setTypeface(typeFaceRobotoRegular);
    }

    //Send email opening an email app
    public void mailTo(View view) {
        String[] address = {"cristina.mangana@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:")); // only email apps should handle this
        emailIntent.putExtra(Intent.EXTRA_EMAIL, address);
        //Intent is only executed if there's an available mail app in the device
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }

    //Open chinchon selection activity
    public void chinchon (View view) {
        gameSelected = "chinchon";
        BottomSheetDialogFragment playersSelection = new BottomSheetPlayersSelection();
        playersSelection.show(getSupportFragmentManager(), playersSelection.getTag());
        // Supply variable input as an argument.
        Bundle args = new Bundle();
        args.putString("gameSelected", gameSelected);
        playersSelection.setArguments(args);
    }

    //Open cabron selection activity
    public void cabron (View view) {
        gameSelected = "cabron";
        BottomSheetDialogFragment playersSelection = new BottomSheetPlayersSelection();
        playersSelection.show(getSupportFragmentManager(), playersSelection.getTag());
        // Supply variable input as an argument.
        Bundle args = new Bundle();
        args.putString("gameSelected", gameSelected);
        playersSelection.setArguments(args);
    }

    //Open point-based selection activity
    public void pointBased (View view) {
        gameSelected = "point";
        BottomSheetDialogFragment playersSelection = new BottomSheetPlayersSelection();
        playersSelection.show(getSupportFragmentManager(), playersSelection.getTag());
        // Supply variable input as an argument.
        Bundle args = new Bundle();
        args.putString("gameSelected", gameSelected);
        playersSelection.setArguments(args);
    }

    //Open game-based selection activity
    public void gameBased (View view) {
        gameSelected = "game";
        BottomSheetDialogFragment playersSelection = new BottomSheetPlayersSelection();
        playersSelection.show(getSupportFragmentManager(), playersSelection.getTag());
        // Supply variable input as an argument.
        Bundle args = new Bundle();
        args.putString("gameSelected", gameSelected);
        playersSelection.setArguments(args);
    }

}
