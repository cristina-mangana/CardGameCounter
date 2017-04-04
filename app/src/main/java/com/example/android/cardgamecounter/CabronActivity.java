package com.example.android.cardgamecounter;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.cardgamecounter.R.layout.dialog;

public class CabronActivity extends AppCompatActivity {

    String scorePlayer1 = "-";
    String scorePlayer2 = "-";
    String scorePlayer3 = "-";
    String scorePlayer4 = "-";
    int numberOfPlayers;
    boolean enabledPlayer1 = false;
    boolean enabledPlayer2 = false;
    boolean enabledPlayer3 = false;
    boolean enabledPlayer4 = false;
    String dialogType;
    boolean isOpened = false;
    String stringPlayerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabron);
        Bundle extras = getIntent().getExtras();
        numberOfPlayers = extras.getInt("numberOfPlayers");
        int avatarPlayer1 = extras.getInt("avatarPlayer1");
        int avatarPlayer2 = extras.getInt("avatarPlayer2");
        int avatarPlayer3 = extras.getInt("avatarPlayer3");
        int avatarPlayer4 = extras.getInt("avatarPlayer4");
        String namePlayer1 = extras.getString("namePlayer1");
        String namePlayer2 = extras.getString("namePlayer2");
        String namePlayer3 = extras.getString("namePlayer3");
        String namePlayer4 = extras.getString("namePlayer4");
        LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
        LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
        switch (numberOfPlayers) {
            case 2:
                enabledPlayer1 = true;
                enabledPlayer2 = true;
                break;
            case 3:
                enabledPlayer1 = true;
                enabledPlayer2 = true;
                enabledPlayer3 = true;
                linearLayoutPlayer3.setVisibility(View.VISIBLE);
                break;
            case 4:
                enabledPlayer1 = true;
                enabledPlayer2 = true;
                enabledPlayer3 = true;
                enabledPlayer4 = true;
                linearLayoutPlayer3.setVisibility(View.VISIBLE);
                linearLayoutPlayer4.setVisibility(View.VISIBLE);
                break;
        }

        ImageView imageViewAvatarPlayer1 = (ImageView) findViewById(R.id.avatarPlayer1);
        switch (avatarPlayer1) {
            case 0:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_1);
                break;
            case 1:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_2);
                break;
            case 2:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_3);
                break;
            case 3:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_4);
                break;
            case 4:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_5);
                break;
            case 5:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_6);
                break;
            case 6:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_7);
                break;
            case 7:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_8);
                break;
            case 8:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_9);
                break;
            case 9:
                imageViewAvatarPlayer1.setImageResource(R.drawable.woman_10);
                break;
            case 10:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_1);
                break;
            case 11:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_2);
                break;
            case 12:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_3);
                break;
            case 13:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_4);
                break;
            case 14:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_5);
                break;
            case 15:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_6);
                break;
            case 16:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_7);
                break;
            case 17:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_8);
                break;
            case 18:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_9);
                break;
            case 19:
                imageViewAvatarPlayer1.setImageResource(R.drawable.man_10);
                break;
        }
        ImageView imageViewAvatarPlayer2 = (ImageView) findViewById(R.id.avatarPlayer2);
        switch (avatarPlayer2) {
            case 0:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_1);
                break;
            case 1:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_2);
                break;
            case 2:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_3);
                break;
            case 3:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_4);
                break;
            case 4:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_5);
                break;
            case 5:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_6);
                break;
            case 6:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_7);
                break;
            case 7:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_8);
                break;
            case 8:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_9);
                break;
            case 9:
                imageViewAvatarPlayer2.setImageResource(R.drawable.woman_10);
                break;
            case 10:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_1);
                break;
            case 11:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_2);
                break;
            case 12:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_3);
                break;
            case 13:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_4);
                break;
            case 14:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_5);
                break;
            case 15:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_6);
                break;
            case 16:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_7);
                break;
            case 17:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_8);
                break;
            case 18:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_9);
                break;
            case 19:
                imageViewAvatarPlayer2.setImageResource(R.drawable.man_10);
                break;
        }
        ImageView imageViewAvatarPlayer3 = (ImageView) findViewById(R.id.avatarPlayer3);
        switch (avatarPlayer3) {
            case 0:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_1);
                break;
            case 1:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_2);
                break;
            case 2:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_3);
                break;
            case 3:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_4);
                break;
            case 4:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_5);
                break;
            case 5:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_6);
                break;
            case 6:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_7);
                break;
            case 7:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_8);
                break;
            case 8:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_9);
                break;
            case 9:
                imageViewAvatarPlayer3.setImageResource(R.drawable.woman_10);
                break;
            case 10:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_1);
                break;
            case 11:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_2);
                break;
            case 12:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_3);
                break;
            case 13:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_4);
                break;
            case 14:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_5);
                break;
            case 15:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_6);
                break;
            case 16:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_7);
                break;
            case 17:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_8);
                break;
            case 18:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_9);
                break;
            case 19:
                imageViewAvatarPlayer3.setImageResource(R.drawable.man_10);
                break;
        }
        ImageView imageViewAvatarPlayer4 = (ImageView) findViewById(R.id.avatarPlayer4);
        switch (avatarPlayer4) {
            case 0:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_1);
                break;
            case 1:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_2);
                break;
            case 2:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_3);
                break;
            case 3:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_4);
                break;
            case 4:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_5);
                break;
            case 5:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_6);
                break;
            case 6:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_7);
                break;
            case 7:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_8);
                break;
            case 8:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_9);
                break;
            case 9:
                imageViewAvatarPlayer4.setImageResource(R.drawable.woman_10);
                break;
            case 10:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_1);
                break;
            case 11:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_2);
                break;
            case 12:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_3);
                break;
            case 13:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_4);
                break;
            case 14:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_5);
                break;
            case 15:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_6);
                break;
            case 16:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_7);
                break;
            case 17:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_8);
                break;
            case 18:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_9);
                break;
            case 19:
                imageViewAvatarPlayer4.setImageResource(R.drawable.man_10);
                break;
        }
        TextView textViewNamePlayer1 = (TextView) findViewById(R.id.namePlayer1);
        TextView textViewNamePlayer2 = (TextView) findViewById(R.id.namePlayer2);
        TextView textViewNamePlayer3 = (TextView) findViewById(R.id.namePlayer3);
        TextView textViewNamePlayer4 = (TextView) findViewById(R.id.namePlayer4);
        if (!TextUtils.isEmpty(namePlayer1)) {
            textViewNamePlayer1.setText(namePlayer1);
        }
        if (!TextUtils.isEmpty(namePlayer2)) {
            textViewNamePlayer2.setText(namePlayer2);
        }
        if (!TextUtils.isEmpty(namePlayer3)) {
            textViewNamePlayer3.setText(namePlayer3);
        }
        if (!TextUtils.isEmpty(namePlayer4)) {
            textViewNamePlayer4.setText(namePlayer4);
        }

        TextView textViewCabronTitle = (TextView) findViewById(R.id.cabronTitle);
        // Set the font's path
        String fontPathPermanentMarker = "fonts/PermanentMarker.ttf";
        String fontPathRobotoRegular = "fonts/Roboto-Regular.ttf";
        // Load the font as a TypeFace object
        Typeface typeFacePermanentMarker = Typeface.createFromAsset(getAssets(), fontPathPermanentMarker);
        Typeface typeFaceRobotoRegular = Typeface.createFromAsset(getAssets(), fontPathRobotoRegular);
        // Set the extra fancy font in the customFont TextView
        textViewCabronTitle.setTypeface(typeFacePermanentMarker);
        textViewNamePlayer1.setTypeface(typeFaceRobotoRegular);
        textViewNamePlayer2.setTypeface(typeFaceRobotoRegular);
        textViewNamePlayer3.setTypeface(typeFaceRobotoRegular);
        textViewNamePlayer4.setTypeface(typeFaceRobotoRegular);

        // Restore state from saved instance
        if (savedInstanceState != null) {
            String scorePlayer1Saved = savedInstanceState.getString("stringScorePlayer1");
            String scorePlayer2Saved = savedInstanceState.getString("stringScorePlayer2");
            String scorePlayer3Saved = savedInstanceState.getString("stringScorePlayer3");
            String scorePlayer4Saved = savedInstanceState.getString("stringScorePlayer4");
            Boolean enabledCabronCPlayer1 = savedInstanceState.getBoolean("enabledCabronCPlayer1");
            Boolean enabledCabronCPlayer2 = savedInstanceState.getBoolean("enabledCabronCPlayer2");
            Boolean enabledCabronCPlayer3 = savedInstanceState.getBoolean("enabledCabronCPlayer3");
            Boolean enabledCabronCPlayer4 = savedInstanceState.getBoolean("enabledCabronCPlayer4");
            Boolean enabledCabronAPlayer1 = savedInstanceState.getBoolean("enabledCabronAPlayer1");
            Boolean enabledCabronAPlayer2 = savedInstanceState.getBoolean("enabledCabronAPlayer2");
            Boolean enabledCabronAPlayer3 = savedInstanceState.getBoolean("enabledCabronAPlayer3");
            Boolean enabledCabronAPlayer4 = savedInstanceState.getBoolean("enabledCabronAPlayer4");
            Boolean enabledCabronBPlayer1 = savedInstanceState.getBoolean("enabledCabronBPlayer1");
            Boolean enabledCabronBPlayer2 = savedInstanceState.getBoolean("enabledCabronBPlayer2");
            Boolean enabledCabronBPlayer3 = savedInstanceState.getBoolean("enabledCabronBPlayer3");
            Boolean enabledCabronBPlayer4 = savedInstanceState.getBoolean("enabledCabronBPlayer4");
            Boolean enabledCabronRPlayer1 = savedInstanceState.getBoolean("enabledCabronRPlayer1");
            Boolean enabledCabronRPlayer2 = savedInstanceState.getBoolean("enabledCabronRPlayer2");
            Boolean enabledCabronRPlayer3 = savedInstanceState.getBoolean("enabledCabronRPlayer3");
            Boolean enabledCabronRPlayer4 = savedInstanceState.getBoolean("enabledCabronRPlayer4");
            Boolean enabledCabronOPlayer1 = savedInstanceState.getBoolean("enabledCabronOPlayer1");
            Boolean enabledCabronOPlayer2 = savedInstanceState.getBoolean("enabledCabronOPlayer2");
            Boolean enabledCabronOPlayer3 = savedInstanceState.getBoolean("enabledCabronOPlayer3");
            Boolean enabledCabronOPlayer4 = savedInstanceState.getBoolean("enabledCabronOPlayer4");
            Boolean enabledCabronNPlayer1 = savedInstanceState.getBoolean("enabledCabronNPlayer1");
            Boolean enabledCabronNPlayer2 = savedInstanceState.getBoolean("enabledCabronNPlayer2");
            Boolean enabledCabronNPlayer3 = savedInstanceState.getBoolean("enabledCabronNPlayer3");
            Boolean enabledCabronNPlayer4 = savedInstanceState.getBoolean("enabledCabronNPlayer4");
            Boolean enabledCabronAccentPlayer1 = savedInstanceState.getBoolean("enabledCabronAccentPlayer1");
            Boolean enabledCabronAccentPlayer2 = savedInstanceState.getBoolean("enabledCabronAccentPlayer2");
            Boolean enabledCabronAccentPlayer3 = savedInstanceState.getBoolean("enabledCabronAccentPlayer3");
            Boolean enabledCabronAccentPlayer4 = savedInstanceState.getBoolean("enabledCabronAccentPlayer4");
            Boolean enabledCabronFemininePlayer1 = savedInstanceState.getBoolean("enabledCabronFemininePlayer1");
            Boolean enabledCabronFemininePlayer2 = savedInstanceState.getBoolean("enabledCabronFemininePlayer2");
            Boolean enabledCabronFemininePlayer3 = savedInstanceState.getBoolean("enabledCabronFemininePlayer3");
            Boolean enabledCabronFemininePlayer4 = savedInstanceState.getBoolean("enabledCabronFemininePlayer4");
            Boolean enabledPlayer1Saved = savedInstanceState.getBoolean("enabledPlayer1Saved");
            Boolean enabledPlayer2Saved = savedInstanceState.getBoolean("enabledPlayer2Saved");
            Boolean enabledPlayer3Saved = savedInstanceState.getBoolean("enabledPlayer3Saved");
            Boolean enabledPlayer4Saved = savedInstanceState.getBoolean("enabledPlayer4Saved");
            Boolean isOpenedSaved = savedInstanceState.getBoolean("isOpenedSaved");
            String stringPlayerNameSaved = savedInstanceState.getString("stringPlayerNameSaved");
            String stringDialogTypeSaved = savedInstanceState.getString("stringDialogTypeSaved");

            // Apply stored items
            TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
            textViewScorePlayer1.setText(scorePlayer1Saved);
            textViewScorePlayer1.setAllCaps(true);
            scorePlayer1 = scorePlayer1Saved;
            TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
            textViewScorePlayer2.setText(scorePlayer2Saved);
            textViewScorePlayer2.setAllCaps(true);
            scorePlayer2 = scorePlayer2Saved;
            TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
            textViewScorePlayer3.setText(scorePlayer3Saved);
            textViewScorePlayer3.setAllCaps(true);
            scorePlayer3 = scorePlayer3Saved;
            TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
            textViewScorePlayer4.setText(scorePlayer4Saved);
            textViewScorePlayer4.setAllCaps(true);
            scorePlayer4 = scorePlayer4Saved;
            Button buttonCabronCPlayer1 = (Button) findViewById(R.id.cabronCPlayer1);
            buttonCabronCPlayer1.setEnabled(enabledCabronCPlayer1);
            Button buttonCabronCPlayer2 = (Button) findViewById(R.id.cabronCPlayer2);
            buttonCabronCPlayer2.setEnabled(enabledCabronCPlayer2);
            Button buttonCabronCPlayer3 = (Button) findViewById(R.id.cabronCPlayer3);
            buttonCabronCPlayer3.setEnabled(enabledCabronCPlayer3);
            Button buttonCabronCPlayer4 = (Button) findViewById(R.id.cabronCPlayer4);
            buttonCabronCPlayer4.setEnabled(enabledCabronCPlayer4);
            Button buttonCabronAPlayer1 = (Button) findViewById(R.id.cabronAPlayer1);
            buttonCabronAPlayer1.setEnabled(enabledCabronAPlayer1);
            Button buttonCabronAPlayer2 = (Button) findViewById(R.id.cabronAPlayer2);
            buttonCabronAPlayer2.setEnabled(enabledCabronAPlayer2);
            Button buttonCabronAPlayer3 = (Button) findViewById(R.id.cabronAPlayer3);
            buttonCabronAPlayer3.setEnabled(enabledCabronAPlayer3);
            Button buttonCabronAPlayer4 = (Button) findViewById(R.id.cabronAPlayer4);
            buttonCabronAPlayer4.setEnabled(enabledCabronAPlayer4);
            Button buttonCabronBPlayer1 = (Button) findViewById(R.id.cabronBPlayer1);
            buttonCabronBPlayer1.setEnabled(enabledCabronBPlayer1);
            Button buttonCabronBPlayer2 = (Button) findViewById(R.id.cabronBPlayer2);
            buttonCabronBPlayer2.setEnabled(enabledCabronBPlayer2);
            Button buttonCabronBPlayer3 = (Button) findViewById(R.id.cabronBPlayer3);
            buttonCabronBPlayer3.setEnabled(enabledCabronBPlayer3);
            Button buttonCabronBPlayer4 = (Button) findViewById(R.id.cabronBPlayer4);
            buttonCabronBPlayer4.setEnabled(enabledCabronBPlayer4);
            Button buttonCabronRPlayer1 = (Button) findViewById(R.id.cabronRPlayer1);
            buttonCabronRPlayer1.setEnabled(enabledCabronRPlayer1);
            Button buttonCabronRPlayer2 = (Button) findViewById(R.id.cabronRPlayer2);
            buttonCabronRPlayer2.setEnabled(enabledCabronRPlayer2);
            Button buttonCabronRPlayer3 = (Button) findViewById(R.id.cabronRPlayer3);
            buttonCabronRPlayer3.setEnabled(enabledCabronRPlayer3);
            Button buttonCabronRPlayer4 = (Button) findViewById(R.id.cabronRPlayer4);
            buttonCabronRPlayer4.setEnabled(enabledCabronRPlayer4);
            Button buttonCabronOPlayer1 = (Button) findViewById(R.id.cabronOPlayer1);
            buttonCabronOPlayer1.setEnabled(enabledCabronOPlayer1);
            Button buttonCabronOPlayer2 = (Button) findViewById(R.id.cabronOPlayer2);
            buttonCabronOPlayer2.setEnabled(enabledCabronOPlayer2);
            Button buttonCabronOPlayer3 = (Button) findViewById(R.id.cabronOPlayer3);
            buttonCabronOPlayer3.setEnabled(enabledCabronOPlayer3);
            Button buttonCabronOPlayer4 = (Button) findViewById(R.id.cabronOPlayer4);
            buttonCabronOPlayer4.setEnabled(enabledCabronOPlayer4);
            Button buttonCabronNPlayer1 = (Button) findViewById(R.id.cabronNPlayer1);
            buttonCabronNPlayer1.setEnabled(enabledCabronNPlayer1);
            Button buttonCabronNPlayer2 = (Button) findViewById(R.id.cabronNPlayer2);
            buttonCabronNPlayer2.setEnabled(enabledCabronNPlayer2);
            Button buttonCabronNPlayer3 = (Button) findViewById(R.id.cabronNPlayer3);
            buttonCabronNPlayer3.setEnabled(enabledCabronNPlayer3);
            Button buttonCabronNPlayer4 = (Button) findViewById(R.id.cabronNPlayer4);
            buttonCabronNPlayer4.setEnabled(enabledCabronNPlayer4);
            Button buttonCabronAccentPlayer1 = (Button) findViewById(R.id.cabronAccentPlayer1);
            buttonCabronAccentPlayer1.setEnabled(enabledCabronAccentPlayer1);
            Button buttonCabronAccentPlayer2 = (Button) findViewById(R.id.cabronAccentPlayer2);
            buttonCabronAccentPlayer2.setEnabled(enabledCabronAccentPlayer2);
            Button buttonCabronAccentPlayer3 = (Button) findViewById(R.id.cabronAccentPlayer3);
            buttonCabronAccentPlayer3.setEnabled(enabledCabronAccentPlayer3);
            Button buttonCabronAccentPlayer4 = (Button) findViewById(R.id.cabronAccentPlayer4);
            buttonCabronAccentPlayer4.setEnabled(enabledCabronAccentPlayer4);
            Button buttonCabronFemininePlayer1 = (Button) findViewById(R.id.cabronFemininePlayer1);
            buttonCabronFemininePlayer1.setEnabled(enabledCabronFemininePlayer1);
            Button buttonCabronFemininePlayer2 = (Button) findViewById(R.id.cabronFemininePlayer2);
            buttonCabronFemininePlayer2.setEnabled(enabledCabronFemininePlayer2);
            Button buttonCabronFemininePlayer3 = (Button) findViewById(R.id.cabronFemininePlayer3);
            buttonCabronFemininePlayer3.setEnabled(enabledCabronFemininePlayer3);
            Button buttonCabronFemininePlayer4 = (Button) findViewById(R.id.cabronFemininePlayer4);
            buttonCabronFemininePlayer4.setEnabled(enabledCabronFemininePlayer4);
            enabledPlayer1 = enabledPlayer1Saved;
            enabledPlayer2 = enabledPlayer2Saved;
            enabledPlayer3 = enabledPlayer3Saved;
            enabledPlayer4 = enabledPlayer4Saved;
            if (!enabledCabronAccentPlayer1 && !enabledCabronFemininePlayer1) {
                LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
                linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background_disabled);
            }
            if (!enabledCabronAccentPlayer2 && !enabledCabronFemininePlayer2) {
                LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
                linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background_disabled);
            }
            if (!enabledCabronAccentPlayer3 && !enabledCabronFemininePlayer3) {
                linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background_disabled);
            }
            if (!enabledCabronAccentPlayer4 && !enabledCabronFemininePlayer4) {
                linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background_disabled);
            }
            if (isOpenedSaved) {
                dialogType = stringDialogTypeSaved;
                createDialog(stringPlayerNameSaved);
            }
        }
    }

    // Fires when a configuration change occurs and fragment needs to save state
    public void onSaveInstanceState(Bundle savedInstanceState) {
        TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
        String stringScorePlayer1 = textViewScorePlayer1.getText().toString();
        TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
        String stringScorePlayer2 = textViewScorePlayer2.getText().toString();
        TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
        String stringScorePlayer3 = textViewScorePlayer3.getText().toString();
        TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
        String stringScorePlayer4 = textViewScorePlayer4.getText().toString();
        Button buttonCabronCPlayer1 = (Button) findViewById(R.id.cabronCPlayer1);
        boolean enabledCabronCPlayer1 = buttonCabronCPlayer1.isEnabled();
        Button buttonCabronCPlayer2 = (Button) findViewById(R.id.cabronCPlayer2);
        boolean enabledCabronCPlayer2 = buttonCabronCPlayer2.isEnabled();
        Button buttonCabronCPlayer3 = (Button) findViewById(R.id.cabronCPlayer3);
        boolean enabledCabronCPlayer3 = buttonCabronCPlayer3.isEnabled();
        Button buttonCabronCPlayer4 = (Button) findViewById(R.id.cabronCPlayer4);
        boolean enabledCabronCPlayer4 = buttonCabronCPlayer4.isEnabled();
        Button buttonCabronAPlayer1 = (Button) findViewById(R.id.cabronAPlayer1);
        boolean enabledCabronAPlayer1 = buttonCabronAPlayer1.isEnabled();
        Button buttonCabronAPlayer2 = (Button) findViewById(R.id.cabronAPlayer2);
        boolean enabledCabronAPlayer2 = buttonCabronAPlayer2.isEnabled();
        Button buttonCabronAPlayer3 = (Button) findViewById(R.id.cabronAPlayer3);
        boolean enabledCabronAPlayer3 = buttonCabronAPlayer3.isEnabled();
        Button buttonCabronAPlayer4 = (Button) findViewById(R.id.cabronAPlayer4);
        boolean enabledCabronAPlayer4 = buttonCabronAPlayer4.isEnabled();
        Button buttonCabronBPlayer1 = (Button) findViewById(R.id.cabronBPlayer1);
        boolean enabledCabronBPlayer1 = buttonCabronBPlayer1.isEnabled();
        Button buttonCabronBPlayer2 = (Button) findViewById(R.id.cabronBPlayer2);
        boolean enabledCabronBPlayer2= buttonCabronBPlayer2.isEnabled();
        Button buttonCabronBPlayer3 = (Button) findViewById(R.id.cabronBPlayer3);
        boolean enabledCabronBPlayer3 = buttonCabronBPlayer3.isEnabled();
        Button buttonCabronBPlayer4 = (Button) findViewById(R.id.cabronBPlayer4);
        boolean enabledCabronBPlayer4 = buttonCabronBPlayer4.isEnabled();
        Button buttonCabronRPlayer1 = (Button) findViewById(R.id.cabronRPlayer1);
        boolean enabledCabronRPlayer1= buttonCabronRPlayer1.isEnabled();
        Button buttonCabronRPlayer2 = (Button) findViewById(R.id.cabronRPlayer2);
        boolean enabledCabronRPlayer2 = buttonCabronRPlayer2.isEnabled();
        Button buttonCabronRPlayer3 = (Button) findViewById(R.id.cabronRPlayer3);
        boolean enabledCabronRPlayer3 = buttonCabronRPlayer3.isEnabled();
        Button buttonCabronRPlayer4 = (Button) findViewById(R.id.cabronRPlayer4);
        boolean enabledCabronRPlayer4 = buttonCabronRPlayer4.isEnabled();
        Button buttonCabronOPlayer1 = (Button) findViewById(R.id.cabronOPlayer1);
        boolean enabledCabronOPlayer1 = buttonCabronOPlayer1.isEnabled();
        Button buttonCabronOPlayer2 = (Button) findViewById(R.id.cabronOPlayer2);
        boolean enabledCabronOPlayer2 = buttonCabronOPlayer2.isEnabled();
        Button buttonCabronOPlayer3 = (Button) findViewById(R.id.cabronOPlayer3);
        boolean enabledCabronOPlayer3 = buttonCabronOPlayer3.isEnabled();
        Button buttonCabronOPlayer4 = (Button) findViewById(R.id.cabronOPlayer4);
        boolean enabledCabronOPlayer4 = buttonCabronOPlayer4.isEnabled();
        Button buttonCabronNPlayer1 = (Button) findViewById(R.id.cabronNPlayer1);
        boolean enabledCabronNPlayer1 = buttonCabronNPlayer1.isEnabled();
        Button buttonCabronNPlayer2 = (Button) findViewById(R.id.cabronNPlayer2);
        boolean enabledCabronNPlayer2 = buttonCabronNPlayer2.isEnabled();
        Button buttonCabronNPlayer3 = (Button) findViewById(R.id.cabronNPlayer3);
        boolean enabledCabronNPlayer3 = buttonCabronNPlayer3.isEnabled();
        Button buttonCabronNPlayer4 = (Button) findViewById(R.id.cabronNPlayer4);
        boolean enabledCabronNPlayer4 = buttonCabronNPlayer4.isEnabled();
        Button buttonCabronAccentPlayer1 = (Button) findViewById(R.id.cabronAccentPlayer1);
        boolean enabledCabronAccentPlayer1 = buttonCabronAccentPlayer1.isEnabled();
        Button buttonCabronAccentPlayer2 = (Button) findViewById(R.id.cabronAccentPlayer2);
        boolean enabledCabronAccentPlayer2 = buttonCabronAccentPlayer2.isEnabled();
        Button buttonCabronAccentPlayer3 = (Button) findViewById(R.id.cabronAccentPlayer3);
        boolean enabledCabronAccentPlayer3 = buttonCabronAccentPlayer3.isEnabled();
        Button buttonCabronAccentPlayer4 = (Button) findViewById(R.id.cabronAccentPlayer4);
        boolean enabledCabronAccentPlayer4 = buttonCabronAccentPlayer4.isEnabled();
        Button buttonCabronFemininePlayer1 = (Button) findViewById(R.id.cabronFemininePlayer1);
        boolean enabledCabronFemininePlayer1 = buttonCabronFemininePlayer1.isEnabled();
        Button buttonCabronFemininePlayer2 = (Button) findViewById(R.id.cabronFemininePlayer2);
        boolean enabledCabronFemininePlayer2 = buttonCabronFemininePlayer2.isEnabled();
        Button buttonCabronFemininePlayer3 = (Button) findViewById(R.id.cabronFemininePlayer3);
        boolean enabledCabronFemininePlayer3 = buttonCabronFemininePlayer3.isEnabled();
        Button buttonCabronFemininePlayer4 = (Button) findViewById(R.id.cabronFemininePlayer4);
        boolean enabledCabronFemininePlayer4 = buttonCabronFemininePlayer4.isEnabled();

        savedInstanceState.putString("stringScorePlayer1", stringScorePlayer1);
        savedInstanceState.putString("stringScorePlayer2", stringScorePlayer2);
        savedInstanceState.putString("stringScorePlayer3", stringScorePlayer3);
        savedInstanceState.putString("stringScorePlayer4", stringScorePlayer4);
        savedInstanceState.putBoolean("enabledCabronCPlayer1",enabledCabronCPlayer1);
        savedInstanceState.putBoolean("enabledCabronCPlayer2",enabledCabronCPlayer2);
        savedInstanceState.putBoolean("enabledCabronCPlayer3",enabledCabronCPlayer3);
        savedInstanceState.putBoolean("enabledCabronCPlayer4",enabledCabronCPlayer4);
        savedInstanceState.putBoolean("enabledCabronAPlayer1",enabledCabronAPlayer1);
        savedInstanceState.putBoolean("enabledCabronAPlayer2",enabledCabronAPlayer2);
        savedInstanceState.putBoolean("enabledCabronAPlayer3",enabledCabronAPlayer3);
        savedInstanceState.putBoolean("enabledCabronAPlayer4",enabledCabronAPlayer4);
        savedInstanceState.putBoolean("enabledCabronBPlayer1",enabledCabronBPlayer1);
        savedInstanceState.putBoolean("enabledCabronBPlayer2",enabledCabronBPlayer2);
        savedInstanceState.putBoolean("enabledCabronBPlayer3",enabledCabronBPlayer3);
        savedInstanceState.putBoolean("enabledCabronBPlayer4",enabledCabronBPlayer4);
        savedInstanceState.putBoolean("enabledCabronRPlayer1",enabledCabronRPlayer1);
        savedInstanceState.putBoolean("enabledCabronRPlayer2",enabledCabronRPlayer2);
        savedInstanceState.putBoolean("enabledCabronRPlayer3",enabledCabronRPlayer3);
        savedInstanceState.putBoolean("enabledCabronRPlayer4",enabledCabronRPlayer4);
        savedInstanceState.putBoolean("enabledCabronOPlayer1",enabledCabronOPlayer1);
        savedInstanceState.putBoolean("enabledCabronOPlayer2",enabledCabronOPlayer2);
        savedInstanceState.putBoolean("enabledCabronOPlayer3",enabledCabronOPlayer3);
        savedInstanceState.putBoolean("enabledCabronOPlayer4",enabledCabronOPlayer4);
        savedInstanceState.putBoolean("enabledCabronNPlayer1",enabledCabronNPlayer1);
        savedInstanceState.putBoolean("enabledCabronNPlayer2",enabledCabronNPlayer2);
        savedInstanceState.putBoolean("enabledCabronNPlayer3",enabledCabronNPlayer3);
        savedInstanceState.putBoolean("enabledCabronNPlayer4",enabledCabronNPlayer4);
        savedInstanceState.putBoolean("enabledCabronAccentPlayer1",enabledCabronAccentPlayer1);
        savedInstanceState.putBoolean("enabledCabronAccentPlayer2",enabledCabronAccentPlayer2);
        savedInstanceState.putBoolean("enabledCabronAccentPlayer3",enabledCabronAccentPlayer3);
        savedInstanceState.putBoolean("enabledCabronAccentPlayer4",enabledCabronAccentPlayer4);
        savedInstanceState.putBoolean("enabledCabronFemininePlayer1",enabledCabronFemininePlayer1);
        savedInstanceState.putBoolean("enabledCabronFemininePlayer2",enabledCabronFemininePlayer2);
        savedInstanceState.putBoolean("enabledCabronFemininePlayer3",enabledCabronFemininePlayer3);
        savedInstanceState.putBoolean("enabledCabronFemininePlayer4",enabledCabronFemininePlayer4);
        savedInstanceState.putBoolean("enabledPlayer1Saved",enabledPlayer1);
        savedInstanceState.putBoolean("enabledPlayer2Saved",enabledPlayer2);
        savedInstanceState.putBoolean("enabledPlayer3Saved",enabledPlayer3);
        savedInstanceState.putBoolean("enabledPlayer4Saved",enabledPlayer4);
        savedInstanceState.putBoolean("isOpenedSaved",isOpened);
        savedInstanceState.putString("stringPlayerNameSaved",stringPlayerName);
        savedInstanceState.putString("stringDialogTypeSaved",dialogType);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void cabronC (View view) {
        int player = view.getId();
        switch (player) {
            case R.id.cabronCPlayer1:
                scorePlayer1 = "C ";
                TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                textViewScorePlayer1.setText(scorePlayer1);
                break;
            case R.id.cabronCPlayer2:
                scorePlayer2 = "C ";
                TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                textViewScorePlayer2.setText(scorePlayer2);
                break;
            case R.id.cabronCPlayer3:
                scorePlayer3 = "C ";
                TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                textViewScorePlayer3.setText(scorePlayer3);
                break;
            case R.id.cabronCPlayer4:
                scorePlayer4 = "C ";
                TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                textViewScorePlayer4.setText(scorePlayer4);
                break;
        }
        Button buttonCabronC = (Button) findViewById(player);
        buttonCabronC.setEnabled(false);
    }

    public void cabronA (View view) {
        int player = view.getId();
        Button buttonCabronA = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronAPlayer1:
                Button buttonCabronCPlayer1 = (Button) findViewById(R.id.cabronCPlayer1);
                boolean enabledButtonCabronCPlayer1 = buttonCabronCPlayer1.isEnabled();
                if (!enabledButtonCabronCPlayer1) {
                    scorePlayer1 = scorePlayer1 + "A ";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    buttonCabronA.setEnabled(false);
                }
                break;
            case R.id.cabronAPlayer2:
                Button buttonCabronCPlayer2 = (Button) findViewById(R.id.cabronCPlayer2);
                boolean enabledButtonCabronCPlayer2 = buttonCabronCPlayer2.isEnabled();
                if (!enabledButtonCabronCPlayer2) {
                    scorePlayer2 = scorePlayer2 + "A ";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    buttonCabronA.setEnabled(false);
                }
                break;
            case R.id.cabronAPlayer3:
                Button buttonCabronCPlayer3 = (Button) findViewById(R.id.cabronCPlayer3);
                boolean enabledButtonCabronCPlayer3 = buttonCabronCPlayer3.isEnabled();
                if (!enabledButtonCabronCPlayer3) {
                    scorePlayer3 = scorePlayer3 + "A ";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    buttonCabronA.setEnabled(false);
                }
                break;
            case R.id.cabronAPlayer4:
                Button buttonCabronCPlayer4 = (Button) findViewById(R.id.cabronCPlayer4);
                boolean enabledButtonCabronCPlayer4 = buttonCabronCPlayer4.isEnabled();
                if (!enabledButtonCabronCPlayer4) {
                    scorePlayer4 = scorePlayer4 + "A ";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    buttonCabronA.setEnabled(false);
                }
                break;
        }
    }

    public void cabronB (View view) {
        int player = view.getId();
        Button buttonCabronB = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronBPlayer1:
                Button buttonCabronAPlayer1 = (Button) findViewById(R.id.cabronAPlayer1);
                boolean enabledButtonCabronAPlayer1 = buttonCabronAPlayer1.isEnabled();
                if (!enabledButtonCabronAPlayer1) {
                    scorePlayer1 = scorePlayer1 + "B ";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    buttonCabronB.setEnabled(false);
                }
                break;
            case R.id.cabronBPlayer2:
                Button buttonCabronAPlayer2 = (Button) findViewById(R.id.cabronAPlayer2);
                boolean enabledButtonCabronAPlayer2 = buttonCabronAPlayer2.isEnabled();
                if (!enabledButtonCabronAPlayer2) {
                    scorePlayer2 = scorePlayer2 + "B ";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    buttonCabronB.setEnabled(false);
                }
                break;
            case R.id.cabronBPlayer3:
                Button buttonCabronAPlayer3 = (Button) findViewById(R.id.cabronAPlayer3);
                boolean enabledButtonCabronAPlayer3 = buttonCabronAPlayer3.isEnabled();
                if (!enabledButtonCabronAPlayer3) {
                    scorePlayer3 = scorePlayer3 + "B ";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    buttonCabronB.setEnabled(false);
                }
                break;
            case R.id.cabronBPlayer4:
                Button buttonCabronAPlayer4 = (Button) findViewById(R.id.cabronAPlayer4);
                boolean enabledButtonCabronAPlayer4 = buttonCabronAPlayer4.isEnabled();
                if (!enabledButtonCabronAPlayer4) {
                    scorePlayer4 = scorePlayer4 + "B ";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    buttonCabronB.setEnabled(false);
                }
                break;
        }
    }

    public void cabronR (View view) {
        int player = view.getId();
        Button buttonCabronR = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronRPlayer1:
                Button buttonCabronBPlayer1 = (Button) findViewById(R.id.cabronBPlayer1);
                boolean enabledButtonCabronBPlayer1 = buttonCabronBPlayer1.isEnabled();
                if (!enabledButtonCabronBPlayer1) {
                    scorePlayer1 = scorePlayer1 + "R ";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    buttonCabronR.setEnabled(false);
                }
                break;
            case R.id.cabronRPlayer2:
                Button buttonCabronBPlayer2 = (Button) findViewById(R.id.cabronBPlayer2);
                boolean enabledButtonCabronBPlayer2 = buttonCabronBPlayer2.isEnabled();
                if (!enabledButtonCabronBPlayer2) {
                    scorePlayer2 = scorePlayer2 + "R ";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    buttonCabronR.setEnabled(false);
                }
                break;
            case R.id.cabronRPlayer3:
                Button buttonCabronBPlayer3 = (Button) findViewById(R.id.cabronBPlayer3);
                boolean enabledButtonCabronBPlayer3 = buttonCabronBPlayer3.isEnabled();
                if (!enabledButtonCabronBPlayer3) {
                    scorePlayer3 = scorePlayer3 + "R ";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    buttonCabronR.setEnabled(false);
                }
                break;
            case R.id.cabronRPlayer4:
                Button buttonCabronBPlayer4 = (Button) findViewById(R.id.cabronBPlayer4);
                boolean enabledButtonCabronBPlayer4 = buttonCabronBPlayer4.isEnabled();
                if (!enabledButtonCabronBPlayer4) {
                    scorePlayer4 = scorePlayer4 + "R ";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    buttonCabronR.setEnabled(false);
                }
                break;
        }
    }

    public void cabronO (View view) {
        int player = view.getId();
        Button buttonCabronO = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronOPlayer1:
                Button buttonCabronRPlayer1 = (Button) findViewById(R.id.cabronRPlayer1);
                boolean enabledButtonCabronRPlayer1 = buttonCabronRPlayer1.isEnabled();
                if (!enabledButtonCabronRPlayer1) {
                    scorePlayer1 = scorePlayer1 + "O ";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    buttonCabronO.setEnabled(false);
                }
                break;
            case R.id.cabronOPlayer2:
                Button buttonCabronRPlayer2 = (Button) findViewById(R.id.cabronRPlayer2);
                boolean enabledButtonCabronRPlayer2 = buttonCabronRPlayer2.isEnabled();
                if (!enabledButtonCabronRPlayer2) {
                    scorePlayer2 = scorePlayer2 + "O ";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    buttonCabronO.setEnabled(false);
                }
                break;
            case R.id.cabronOPlayer3:
                Button buttonCabronRPlayer3 = (Button) findViewById(R.id.cabronRPlayer3);
                boolean enabledButtonCabronRPlayer3 = buttonCabronRPlayer3.isEnabled();
                if (!enabledButtonCabronRPlayer3) {
                    scorePlayer3 = scorePlayer3 + "O ";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    buttonCabronO.setEnabled(false);
                }
                break;
            case R.id.cabronOPlayer4:
                Button buttonCabronRPlayer4 = (Button) findViewById(R.id.cabronRPlayer4);
                boolean enabledButtonCabronRPlayer4 = buttonCabronRPlayer4.isEnabled();
                if (!enabledButtonCabronRPlayer4) {
                    scorePlayer4 = scorePlayer4 + "O ";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    buttonCabronO.setEnabled(false);
                }
                break;
        }
    }

    public void cabronN (View view) {
        int player = view.getId();
        Button buttonCabronN = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronNPlayer1:
                Button buttonCabronOPlayer1 = (Button) findViewById(R.id.cabronOPlayer1);
                boolean enabledButtonCabronOPlayer1 = buttonCabronOPlayer1.isEnabled();
                if (!enabledButtonCabronOPlayer1) {
                    scorePlayer1 = scorePlayer1 + "N ";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    buttonCabronN.setEnabled(false);
                }
                break;
            case R.id.cabronNPlayer2:
                Button buttonCabronOPlayer2 = (Button) findViewById(R.id.cabronOPlayer2);
                boolean enabledButtonCabronOPlayer2 = buttonCabronOPlayer2.isEnabled();
                if (!enabledButtonCabronOPlayer2) {
                    scorePlayer2 = scorePlayer2 + "N ";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    buttonCabronN.setEnabled(false);
                }
                break;
            case R.id.cabronNPlayer3:
                Button buttonCabronOPlayer3 = (Button) findViewById(R.id.cabronOPlayer3);
                boolean enabledButtonCabronOPlayer3 = buttonCabronOPlayer3.isEnabled();
                if (!enabledButtonCabronOPlayer3) {
                    scorePlayer3 = scorePlayer3 + "N ";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    buttonCabronN.setEnabled(false);
                }
                break;
            case R.id.cabronNPlayer4:
                Button buttonCabronOPlayer4 = (Button) findViewById(R.id.cabronOPlayer4);
                boolean enabledButtonCabronOPlayer4 = buttonCabronOPlayer4.isEnabled();
                if (!enabledButtonCabronOPlayer4) {
                    scorePlayer4 = scorePlayer4 + "N ";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    buttonCabronN.setEnabled(false);
                }
                break;
        }
    }

    public void cabronAccent (View view) {
        int player = view.getId();
        Button buttonCabronAccent = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronAccentPlayer1:
                Button buttonCabronNPlayer1 = (Button) findViewById(R.id.cabronNPlayer1);
                boolean enabledButtonCabronNPlayer1 = buttonCabronNPlayer1.isEnabled();
                if (!enabledButtonCabronNPlayer1) {
                    scorePlayer1 = "C A B R Ó N ";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    Button buttonCabronFemininePlayer1 = (Button) findViewById(R.id.cabronFemininePlayer1);
                    buttonCabronFemininePlayer1.setEnabled(false);
                    if (!enabledPlayer2 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    } else if (!enabledPlayer2 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    } else if (!enabledPlayer3 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer1 = false;
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    }
                    buttonCabronAccent.setEnabled(false);
                }
                break;
            case R.id.cabronAccentPlayer2:
                Button buttonCabronNPlayer2 = (Button) findViewById(R.id.cabronNPlayer2);
                boolean enabledButtonCabronNPlayer2 = buttonCabronNPlayer2.isEnabled();
                if (!enabledButtonCabronNPlayer2) {
                    scorePlayer2 = "C A B R Ó N";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    Button buttonCabronFemininePlayer2 = (Button) findViewById(R.id.cabronFemininePlayer2);
                    buttonCabronFemininePlayer2.setEnabled(false);
                    if (!enabledPlayer1 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    } else if (!enabledPlayer1 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    } else if (!enabledPlayer3 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer2 = false;
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    }
                    buttonCabronAccent.setEnabled(false);
                }
                break;
            case R.id.cabronAccentPlayer3:
                Button buttonCabronNPlayer3 = (Button) findViewById(R.id.cabronNPlayer3);
                boolean enabledButtonCabronNPlayer3 = buttonCabronNPlayer3.isEnabled();
                if (!enabledButtonCabronNPlayer3) {
                    scorePlayer3 = "C A B R Ó N";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    Button buttonCabronFemininePlayer3 = (Button) findViewById(R.id.cabronFemininePlayer3);
                    buttonCabronFemininePlayer3.setEnabled(false);
                    if (!enabledPlayer1 && !enabledPlayer2) {
                        dialogType = "win";
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    } else if (!enabledPlayer2 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    } else if (!enabledPlayer1 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer3 = false;
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    }
                    buttonCabronAccent.setEnabled(false);
                }
                break;
            case R.id.cabronAccentPlayer4:
                Button buttonCabronNPlayer4 = (Button) findViewById(R.id.cabronNPlayer4);
                boolean enabledButtonCabronNPlayer4 = buttonCabronNPlayer4.isEnabled();
                if (!enabledButtonCabronNPlayer4) {
                    scorePlayer4 = "C A B R Ó N";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    Button buttonCabronFemininePlayer4 = (Button) findViewById(R.id.cabronFemininePlayer4);
                    buttonCabronFemininePlayer4.setEnabled(false);
                    if (!enabledPlayer2 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    } else if (!enabledPlayer1 && !enabledPlayer2) {
                        dialogType = "win";
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    } else if (!enabledPlayer1 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer4 = false;
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    }
                    buttonCabronAccent.setEnabled(false);
                }
                break;
        }
    }

    public void cabronFeminine (View view) {
        int player = view.getId();
        Button buttonCabronFeminine = (Button) findViewById(player);
        switch (player) {
            case R.id.cabronFemininePlayer1:
                Button buttonCabronNPlayer1 = (Button) findViewById(R.id.cabronNPlayer1);
                boolean enabledButtonCabronNPlayer1 = buttonCabronNPlayer1.isEnabled();
                if (!enabledButtonCabronNPlayer1) {
                    scorePlayer1 = scorePlayer1 + "A";
                    TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                    textViewScorePlayer1.setText(scorePlayer1);
                    Button buttonCabronAccentPlayer1 = (Button) findViewById(R.id.cabronAccentPlayer1);
                    buttonCabronAccentPlayer1.setEnabled(false);
                    if (!enabledPlayer2 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    } else if (!enabledPlayer2 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    } else if (!enabledPlayer3 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer1 = false;
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    }
                    buttonCabronFeminine.setEnabled(false);
                }
                break;
            case R.id.cabronFemininePlayer2:
                Button buttonCabronNPlayer2 = (Button) findViewById(R.id.cabronNPlayer2);
                boolean enabledButtonCabronNPlayer2 = buttonCabronNPlayer2.isEnabled();
                if (!enabledButtonCabronNPlayer2) {
                    scorePlayer2 = scorePlayer2 + "A";
                    TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                    textViewScorePlayer2.setText(scorePlayer2);
                    Button buttonCabronAccentPlayer2 = (Button) findViewById(R.id.cabronAccentPlayer2);
                    buttonCabronAccentPlayer2.setEnabled(false);
                    if (!enabledPlayer1 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    } else if (!enabledPlayer1 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    } else if (!enabledPlayer3 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer2 = false;
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    }
                    buttonCabronFeminine.setEnabled(false);
                }
                break;
            case R.id.cabronFemininePlayer3:
                Button buttonCabronNPlayer3 = (Button) findViewById(R.id.cabronNPlayer3);
                boolean enabledButtonCabronNPlayer3 = buttonCabronNPlayer3.isEnabled();
                if (!enabledButtonCabronNPlayer3) {
                    scorePlayer3 = scorePlayer3 + "A";
                    TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                    textViewScorePlayer3.setText(scorePlayer3);
                    Button buttonCabronAccentPlayer3 = (Button) findViewById(R.id.cabronAccentPlayer3);
                    buttonCabronAccentPlayer3.setEnabled(false);
                    if (!enabledPlayer1 && !enabledPlayer2) {
                        dialogType = "win";
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    } else if (!enabledPlayer2 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    } else if (!enabledPlayer1 && !enabledPlayer4) {
                        dialogType = "win";
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer3 = false;
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    }
                    buttonCabronFeminine.setEnabled(false);
                }
                break;
            case R.id.cabronFemininePlayer4:
                Button buttonCabronNPlayer4 = (Button) findViewById(R.id.cabronNPlayer4);
                boolean enabledButtonCabronNPlayer4 = buttonCabronNPlayer4.isEnabled();
                if (!enabledButtonCabronNPlayer4) {
                    scorePlayer4 = scorePlayer4 + "A";
                    TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                    textViewScorePlayer4.setText(scorePlayer4);
                    Button buttonCabronAccentPlayer4 = (Button) findViewById(R.id.cabronAccentPlayer4);
                    buttonCabronAccentPlayer4.setEnabled(false);
                    if (!enabledPlayer2 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                        String stringPlayerName1 = textViewPlayerName1.getText().toString();
                        createDialog(stringPlayerName1);
                    } else if (!enabledPlayer1 && !enabledPlayer2) {
                        dialogType = "win";
                        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                        String stringPlayerName3 = textViewPlayerName3.getText().toString();
                        createDialog(stringPlayerName3);
                    } else if (!enabledPlayer1 && !enabledPlayer3) {
                        dialogType = "win";
                        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                        String stringPlayerName2 = textViewPlayerName2.getText().toString();
                        createDialog(stringPlayerName2);
                    } else {
                        dialogType = "defeated";
                        enabledPlayer4 = false;
                        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                        String stringPlayerName4 = textViewPlayerName4.getText().toString();
                        createDialog(stringPlayerName4);
                    }
                    buttonCabronFeminine.setEnabled(false);
                }
                break;
        }
    }

    public void reset (View view) {
        scorePlayer1 = "-";
        scorePlayer2 = "-";
        scorePlayer3 = "-";
        scorePlayer4 = "-";
        TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
        textViewScorePlayer1.setText(scorePlayer1);
        TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
        textViewScorePlayer2.setText(scorePlayer2);
        TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
        textViewScorePlayer3.setText(scorePlayer3);
        TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
        textViewScorePlayer4.setText(scorePlayer4);
        LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
        linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background);
        LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
        linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background);
        LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
        linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background);
        LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
        linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background);
        Button buttonCabronCPlayer1 = (Button) findViewById(R.id.cabronCPlayer1);
        buttonCabronCPlayer1.setEnabled(true);
        Button buttonCabronCPlayer2 = (Button) findViewById(R.id.cabronCPlayer2);
        buttonCabronCPlayer2.setEnabled(true);
        Button buttonCabronCPlayer3 = (Button) findViewById(R.id.cabronCPlayer3);
        buttonCabronCPlayer3.setEnabled(true);
        Button buttonCabronCPlayer4 = (Button) findViewById(R.id.cabronCPlayer4);
        buttonCabronCPlayer4.setEnabled(true);
        Button buttonCabronAPlayer1 = (Button) findViewById(R.id.cabronAPlayer1);
        buttonCabronAPlayer1.setEnabled(true);
        Button buttonCabronAPlayer2 = (Button) findViewById(R.id.cabronAPlayer2);
        buttonCabronAPlayer2.setEnabled(true);
        Button buttonCabronAPlayer3 = (Button) findViewById(R.id.cabronAPlayer3);
        buttonCabronAPlayer3.setEnabled(true);
        Button buttonCabronAPlayer4 = (Button) findViewById(R.id.cabronAPlayer4);
        buttonCabronAPlayer4.setEnabled(true);
        Button buttonCabronBPlayer1 = (Button) findViewById(R.id.cabronBPlayer1);
        buttonCabronBPlayer1.setEnabled(true);
        Button buttonCabronBPlayer2 = (Button) findViewById(R.id.cabronBPlayer2);
        buttonCabronBPlayer2.setEnabled(true);
        Button buttonCabronBPlayer3 = (Button) findViewById(R.id.cabronBPlayer3);
        buttonCabronBPlayer3.setEnabled(true);
        Button buttonCabronBPlayer4 = (Button) findViewById(R.id.cabronBPlayer4);
        buttonCabronBPlayer4.setEnabled(true);
        Button buttonCabronRPlayer1 = (Button) findViewById(R.id.cabronRPlayer1);
        buttonCabronRPlayer1.setEnabled(true);
        Button buttonCabronRPlayer2 = (Button) findViewById(R.id.cabronRPlayer2);
        buttonCabronRPlayer2.setEnabled(true);
        Button buttonCabronRPlayer3 = (Button) findViewById(R.id.cabronRPlayer3);
        buttonCabronRPlayer3.setEnabled(true);
        Button buttonCabronRPlayer4 = (Button) findViewById(R.id.cabronRPlayer4);
        buttonCabronRPlayer4.setEnabled(true);
        Button buttonCabronOPlayer1 = (Button) findViewById(R.id.cabronOPlayer1);
        buttonCabronOPlayer1.setEnabled(true);
        Button buttonCabronOPlayer2 = (Button) findViewById(R.id.cabronOPlayer2);
        buttonCabronOPlayer2.setEnabled(true);
        Button buttonCabronOPlayer3 = (Button) findViewById(R.id.cabronOPlayer3);
        buttonCabronOPlayer3.setEnabled(true);
        Button buttonCabronOPlayer4 = (Button) findViewById(R.id.cabronOPlayer4);
        buttonCabronOPlayer4.setEnabled(true);
        Button buttonCabronNPlayer1 = (Button) findViewById(R.id.cabronNPlayer1);
        buttonCabronNPlayer1.setEnabled(true);
        Button buttonCabronNPlayer2 = (Button) findViewById(R.id.cabronNPlayer2);
        buttonCabronNPlayer2.setEnabled(true);
        Button buttonCabronNPlayer3 = (Button) findViewById(R.id.cabronNPlayer3);
        buttonCabronNPlayer3.setEnabled(true);
        Button buttonCabronNPlayer4 = (Button) findViewById(R.id.cabronNPlayer4);
        buttonCabronNPlayer4.setEnabled(true);
        Button buttonCabronAccentPlayer1 = (Button) findViewById(R.id.cabronAccentPlayer1);
        buttonCabronAccentPlayer1.setEnabled(true);
        Button buttonCabronAccentPlayer2 = (Button) findViewById(R.id.cabronAccentPlayer2);
        buttonCabronAccentPlayer2.setEnabled(true);
        Button buttonCabronAccentPlayer3 = (Button) findViewById(R.id.cabronAccentPlayer3);
        buttonCabronAccentPlayer3.setEnabled(true);
        Button buttonCabronAccentPlayer4 = (Button) findViewById(R.id.cabronAccentPlayer4);
        buttonCabronAccentPlayer4.setEnabled(true);
        Button buttonCabronFemininePlayer1 = (Button) findViewById(R.id.cabronFemininePlayer1);
        buttonCabronFemininePlayer1.setEnabled(true);
        Button buttonCabronFemininePlayer2 = (Button) findViewById(R.id.cabronFemininePlayer2);
        buttonCabronFemininePlayer2.setEnabled(true);
        Button buttonCabronFemininePlayer3 = (Button) findViewById(R.id.cabronFemininePlayer3);
        buttonCabronFemininePlayer3.setEnabled(true);
        Button buttonCabronFemininePlayer4 = (Button) findViewById(R.id.cabronFemininePlayer4);
        buttonCabronFemininePlayer4.setEnabled(true);
        switch (numberOfPlayers) {
            case 2:
                enabledPlayer1 = true;
                enabledPlayer2 = true;
                break;
            case 3:
                enabledPlayer1 = true;
                enabledPlayer2 = true;
                enabledPlayer3 = true;
                break;
            case 4:
                enabledPlayer1 = true;
                enabledPlayer2 = true;
                enabledPlayer3 = true;
                enabledPlayer4 = true;
                break;
        }
    }

    public void createDialog (final String string) {
        stringPlayerName = string;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View contentView = inflater.inflate(dialog, null);
        TextView textViewMessage = (TextView) contentView.findViewById(R.id.textDialog);
        String fontPathRobotoRegular = "fonts/Roboto-Regular.ttf";
        Typeface typeFaceRobotoRegular = Typeface.createFromAsset(getAssets(), fontPathRobotoRegular);
        textViewMessage.setTypeface(typeFaceRobotoRegular);
        ImageView imageViewMessage = (ImageView) contentView.findViewById(R.id.imageDialog);
        TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
        final String stringPlayerName1 = textViewPlayerName1.getText().toString();
        TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
        final String stringPlayerName2 = textViewPlayerName2.getText().toString();
        TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
        final String stringPlayerName3 = textViewPlayerName3.getText().toString();
        TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
        final String stringPlayerName4 = textViewPlayerName4.getText().toString();
        switch (dialogType) {
            case "win":
                imageViewMessage.setImageResource(R.drawable.ic_congratulation);
                textViewMessage.setText(getResources().getString(R.string.woohoo) + " " + string + " " + getResources().getString(R.string.congratulations));
                builder.setView(contentView);
                builder.setPositiveButton(R.string.keepButton, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        isOpened = false;
                        int playerNumber = 0;
                        if (string == stringPlayerName1) {
                            playerNumber = 1;
                        } else if (string == stringPlayerName2) {
                            playerNumber = 2;
                        } else if (string == stringPlayerName3) {
                            playerNumber = 3;
                        } else if (string == stringPlayerName4) {
                            playerNumber = 4;
                        }
                        disableLayout(playerNumber);
                    }
                });
                builder.setNegativeButton(R.string.resetButton, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        isOpened = false;
                        scorePlayer1 = "-";
                        scorePlayer2 = "-";
                        scorePlayer3 = "-";
                        scorePlayer4 = "-";
                        TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                        textViewScorePlayer1.setText(scorePlayer1);
                        TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                        textViewScorePlayer2.setText(scorePlayer2);
                        TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                        textViewScorePlayer3.setText(scorePlayer3);
                        TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                        textViewScorePlayer4.setText(scorePlayer4);
                        LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
                        linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background);
                        LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
                        linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background);
                        LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
                        linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background);
                        LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
                        linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background);
                        Button buttonCabronCPlayer1 = (Button) findViewById(R.id.cabronCPlayer1);
                        buttonCabronCPlayer1.setEnabled(true);
                        Button buttonCabronCPlayer2 = (Button) findViewById(R.id.cabronCPlayer2);
                        buttonCabronCPlayer2.setEnabled(true);
                        Button buttonCabronCPlayer3 = (Button) findViewById(R.id.cabronCPlayer3);
                        buttonCabronCPlayer3.setEnabled(true);
                        Button buttonCabronCPlayer4 = (Button) findViewById(R.id.cabronCPlayer4);
                        buttonCabronCPlayer4.setEnabled(true);
                        Button buttonCabronAPlayer1 = (Button) findViewById(R.id.cabronAPlayer1);
                        buttonCabronAPlayer1.setEnabled(true);
                        Button buttonCabronAPlayer2 = (Button) findViewById(R.id.cabronAPlayer2);
                        buttonCabronAPlayer2.setEnabled(true);
                        Button buttonCabronAPlayer3 = (Button) findViewById(R.id.cabronAPlayer3);
                        buttonCabronAPlayer3.setEnabled(true);
                        Button buttonCabronAPlayer4 = (Button) findViewById(R.id.cabronAPlayer4);
                        buttonCabronAPlayer4.setEnabled(true);
                        Button buttonCabronBPlayer1 = (Button) findViewById(R.id.cabronBPlayer1);
                        buttonCabronBPlayer1.setEnabled(true);
                        Button buttonCabronBPlayer2 = (Button) findViewById(R.id.cabronBPlayer2);
                        buttonCabronBPlayer2.setEnabled(true);
                        Button buttonCabronBPlayer3 = (Button) findViewById(R.id.cabronBPlayer3);
                        buttonCabronBPlayer3.setEnabled(true);
                        Button buttonCabronBPlayer4 = (Button) findViewById(R.id.cabronBPlayer4);
                        buttonCabronBPlayer4.setEnabled(true);
                        Button buttonCabronRPlayer1 = (Button) findViewById(R.id.cabronRPlayer1);
                        buttonCabronRPlayer1.setEnabled(true);
                        Button buttonCabronRPlayer2 = (Button) findViewById(R.id.cabronRPlayer2);
                        buttonCabronRPlayer2.setEnabled(true);
                        Button buttonCabronRPlayer3 = (Button) findViewById(R.id.cabronRPlayer3);
                        buttonCabronRPlayer3.setEnabled(true);
                        Button buttonCabronRPlayer4 = (Button) findViewById(R.id.cabronRPlayer4);
                        buttonCabronRPlayer4.setEnabled(true);
                        Button buttonCabronOPlayer1 = (Button) findViewById(R.id.cabronOPlayer1);
                        buttonCabronOPlayer1.setEnabled(true);
                        Button buttonCabronOPlayer2 = (Button) findViewById(R.id.cabronOPlayer2);
                        buttonCabronOPlayer2.setEnabled(true);
                        Button buttonCabronOPlayer3 = (Button) findViewById(R.id.cabronOPlayer3);
                        buttonCabronOPlayer3.setEnabled(true);
                        Button buttonCabronOPlayer4 = (Button) findViewById(R.id.cabronOPlayer4);
                        buttonCabronOPlayer4.setEnabled(true);
                        Button buttonCabronNPlayer1 = (Button) findViewById(R.id.cabronNPlayer1);
                        buttonCabronNPlayer1.setEnabled(true);
                        Button buttonCabronNPlayer2 = (Button) findViewById(R.id.cabronNPlayer2);
                        buttonCabronNPlayer2.setEnabled(true);
                        Button buttonCabronNPlayer3 = (Button) findViewById(R.id.cabronNPlayer3);
                        buttonCabronNPlayer3.setEnabled(true);
                        Button buttonCabronNPlayer4 = (Button) findViewById(R.id.cabronNPlayer4);
                        buttonCabronNPlayer4.setEnabled(true);
                        Button buttonCabronAccentPlayer1 = (Button) findViewById(R.id.cabronAccentPlayer1);
                        buttonCabronAccentPlayer1.setEnabled(true);
                        Button buttonCabronAccentPlayer2 = (Button) findViewById(R.id.cabronAccentPlayer2);
                        buttonCabronAccentPlayer2.setEnabled(true);
                        Button buttonCabronAccentPlayer3 = (Button) findViewById(R.id.cabronAccentPlayer3);
                        buttonCabronAccentPlayer3.setEnabled(true);
                        Button buttonCabronAccentPlayer4 = (Button) findViewById(R.id.cabronAccentPlayer4);
                        buttonCabronAccentPlayer4.setEnabled(true);
                        Button buttonCabronFemininePlayer1 = (Button) findViewById(R.id.cabronFemininePlayer1);
                        buttonCabronFemininePlayer1.setEnabled(true);
                        Button buttonCabronFemininePlayer2 = (Button) findViewById(R.id.cabronFemininePlayer2);
                        buttonCabronFemininePlayer2.setEnabled(true);
                        Button buttonCabronFemininePlayer3 = (Button) findViewById(R.id.cabronFemininePlayer3);
                        buttonCabronFemininePlayer3.setEnabled(true);
                        Button buttonCabronFemininePlayer4 = (Button) findViewById(R.id.cabronFemininePlayer4);
                        buttonCabronFemininePlayer4.setEnabled(true);
                        switch (numberOfPlayers) {
                            case 2:
                                enabledPlayer1 = true;
                                enabledPlayer2 = true;
                                break;
                            case 3:
                                enabledPlayer1 = true;
                                enabledPlayer2 = true;
                                enabledPlayer3 = true;
                                break;
                            case 4:
                                enabledPlayer1 = true;
                                enabledPlayer2 = true;
                                enabledPlayer3 = true;
                                enabledPlayer4 = true;
                                break;
                        }
                    }
                });
                break;
            case "defeated":
                imageViewMessage.setImageResource(R.drawable.ic_defeated);
                textViewMessage.setText(getResources().getString(R.string.ohno) + " " + string + " " + getResources().getString(R.string.defeated));
                builder.setView(contentView);
                builder.setNeutralButton(R.string.okButton, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        isOpened = false;
                        int playerNumber = 0;
                        if (string == stringPlayerName1) {
                            playerNumber = 1;
                        } else if (string == stringPlayerName2) {
                            playerNumber = 2;
                        } else if (string == stringPlayerName3) {
                            playerNumber = 3;
                        } else if (string == stringPlayerName4) {
                            playerNumber = 4;
                        }
                        disableLayout(playerNumber);
                    }
                });
                break;
        }
        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
        isOpened = true;
    }

    public void disableLayout (int integer) {
        switch (integer) {
            case 1:
                LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
                linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background_disabled);
                break;
            case 2:
                LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
                linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background_disabled);
                break;
            case 3:
                LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
                linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background_disabled);
                break;
            case 4:
                LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
                linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background_disabled);
                break;
        }
    }
}
