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

public class GameActivity extends AppCompatActivity {

    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private int scorePlayer3 = 0;
    private int scorePlayer4 = 0;
    private int goal = 5;
    private boolean isOpen = false;
    private String stringPlayerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Bundle extras = getIntent().getExtras();
        int numberOfPlayers = extras.getInt("numberOfPlayers");
        int avatarPlayer1 = extras.getInt("avatarPlayer1");
        int avatarPlayer2 = extras.getInt("avatarPlayer2");
        int avatarPlayer3 = extras.getInt("avatarPlayer3");
        int avatarPlayer4 = extras.getInt("avatarPlayer4");
        String namePlayer1 = extras.getString("namePlayer1");
        String namePlayer2 = extras.getString("namePlayer2");
        String namePlayer3 = extras.getString("namePlayer3");
        String namePlayer4 = extras.getString("namePlayer4");
        int goalSelected = extras.getInt("goalSelected");

        LinearLayout linearLayoutPlayersLine2 = (LinearLayout) findViewById(R.id.playersLine2);
        LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
        LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
        switch (numberOfPlayers) {
            case 2:
                break;
            case 3:
                linearLayoutPlayersLine2.setVisibility(View.VISIBLE);
                linearLayoutPlayer3.setVisibility(View.VISIBLE);
                break;
            case 4:
                linearLayoutPlayersLine2.setVisibility(View.VISIBLE);
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
        switch (goalSelected) {
            case R.id.goal5_radio_button:
                goal = 5;
                break;
            case R.id.goal10_radio_button:
                goal = 10;
                break;
            case R.id.goal20_radio_button:
                goal = 20;
                break;
            case R.id.goal30_radio_button:
                goal = 30;
                break;
            case R.id.goal40_radio_button:
                goal = 40;
                break;
        }

        TextView textViewGameTitle = (TextView) findViewById(R.id.gameTitle);
        // Set the font's path
        String fontPathPermanentMarker = "fonts/PermanentMarker.ttf";
        String fontPathRobotoRegular = "fonts/Roboto-Regular.ttf";
        // Load the font as a TypeFace object
        Typeface typeFacePermanentMarker = Typeface.createFromAsset(getAssets(), fontPathPermanentMarker);
        Typeface typeFaceRobotoRegular = Typeface.createFromAsset(getAssets(), fontPathRobotoRegular);
        // Set the extra fancy font in the customFont TextView
        textViewGameTitle.setTypeface(typeFacePermanentMarker);
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
            Boolean enabledPlayer1 = savedInstanceState.getBoolean("enabledPlayer1");
            Boolean enabledPlayer2 = savedInstanceState.getBoolean("enabledPlayer2");
            Boolean enabledPlayer3 = savedInstanceState.getBoolean("enabledPlayer3");
            Boolean enabledPlayer4 = savedInstanceState.getBoolean("enabledPlayer4");
            Boolean enabledUndoPlayer1 = savedInstanceState.getBoolean("enabledUndoPlayer1");
            Boolean enabledUndoPlayer2 = savedInstanceState.getBoolean("enabledUndoPlayer2");
            Boolean enabledUndoPlayer3 = savedInstanceState.getBoolean("enabledUndoPlayer3");
            Boolean enabledUndoPlayer4 = savedInstanceState.getBoolean("enabledUndoPlayer4");
            Boolean isOpenSaved = savedInstanceState.getBoolean("isOpenSaved");
            String stringPlayerNameSaved = savedInstanceState.getString("stringPlayerNameSaved");

            // Apply stored items
            TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
            textViewScorePlayer1.setText(scorePlayer1Saved);
            TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
            textViewScorePlayer2.setText(scorePlayer2Saved);
            TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
            textViewScorePlayer3.setText(scorePlayer3Saved);
            TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
            textViewScorePlayer4.setText(scorePlayer4Saved);
            Button buttonUndoPlayer1 = (Button) findViewById(R.id.undoPlayer1);
            buttonUndoPlayer1.setEnabled(enabledUndoPlayer1);
            Button buttonUndoPlayer2 = (Button) findViewById(R.id.undoPlayer2);
            buttonUndoPlayer2.setEnabled(enabledUndoPlayer2);
            Button buttonUndoPlayer3 = (Button) findViewById(R.id.undoPlayer3);
            buttonUndoPlayer3.setEnabled(enabledUndoPlayer3);
            Button buttonUndoPlayer4 = (Button) findViewById(R.id.undoPlayer4);
            buttonUndoPlayer4.setEnabled(enabledUndoPlayer4);
            if (!enabledPlayer1) {
                LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
                linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer1 = (Button) findViewById(R.id.plusGamePlayer1);
                buttonPlayer1.setEnabled(false);
            }
            if (!enabledPlayer2) {
                LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
                linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer2 = (Button) findViewById(R.id.plusGamePlayer2);
                buttonPlayer2.setEnabled(false);
            }
            if (!enabledPlayer3) {
                linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer3 = (Button) findViewById(R.id.plusGamePlayer3);
                buttonPlayer3.setEnabled(false);
            }
            if (!enabledPlayer4) {
                linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer4 = (Button) findViewById(R.id.plusGamePlayer4);
                buttonPlayer4.setEnabled(false);
            }
            if (isOpenSaved) {
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
        Button buttonPlayer1 = (Button) findViewById(R.id.plusGamePlayer1);
        boolean enabledPlayer1 = buttonPlayer1.isEnabled();
        Button buttonUndoPlayer1 = (Button) findViewById(R.id.undoPlayer1);
        boolean enabledUndoPlayer1 = buttonUndoPlayer1.isEnabled();
        Button buttonPlayer2 = (Button) findViewById(R.id.plusGamePlayer2);
        boolean enabledPlayer2 = buttonPlayer2.isEnabled();
        Button buttonUndoPlayer2 = (Button) findViewById(R.id.undoPlayer2);
        boolean enabledUndoPlayer2 = buttonUndoPlayer2.isEnabled();
        Button buttonPlayer3 = (Button) findViewById(R.id.plusGamePlayer3);
        boolean enabledPlayer3 = buttonPlayer3.isEnabled();
        Button buttonUndoPlayer3 = (Button) findViewById(R.id.undoPlayer3);
        boolean enabledUndoPlayer3 = buttonUndoPlayer3.isEnabled();
        Button buttonPlayer4 = (Button) findViewById(R.id.plusGamePlayer4);
        boolean enabledPlayer4 = buttonPlayer4.isEnabled();
        Button buttonUndoPlayer4 = (Button) findViewById(R.id.undoPlayer4);
        boolean enabledUndoPlayer4 = buttonUndoPlayer4.isEnabled();
        savedInstanceState.putString("stringScorePlayer1", stringScorePlayer1);
        savedInstanceState.putString("stringScorePlayer2", stringScorePlayer2);
        savedInstanceState.putString("stringScorePlayer3", stringScorePlayer3);
        savedInstanceState.putString("stringScorePlayer4", stringScorePlayer4);
        savedInstanceState.putBoolean("enabledPlayer1",enabledPlayer1);
        savedInstanceState.putBoolean("enabledPlayer2",enabledPlayer2);
        savedInstanceState.putBoolean("enabledPlayer3",enabledPlayer3);
        savedInstanceState.putBoolean("enabledPlayer4",enabledPlayer4);
        savedInstanceState.putBoolean("enabledUndoPlayer1",enabledUndoPlayer1);
        savedInstanceState.putBoolean("enabledUndoPlayer2",enabledUndoPlayer2);
        savedInstanceState.putBoolean("enabledUndoPlayer3",enabledUndoPlayer3);
        savedInstanceState.putBoolean("enabledUndoPlayer4",enabledUndoPlayer4);
        savedInstanceState.putBoolean("isOpenSaved",isOpen);
        savedInstanceState.putString("stringPlayerNameSaved",stringPlayerName);
        super.onSaveInstanceState(savedInstanceState);
    }

    //This method adds a game to the player's total score and looks if goal is reached
    public void plusGame (View view) {
        int player = view.getId();
        switch (player) {
            case R.id.plusGamePlayer1:
                scorePlayer1 = scorePlayer1 + 1;
                TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                textViewScorePlayer1.setText(String.valueOf(scorePlayer1));
                Button undoPlayer1Button = (Button) findViewById(R.id.undoPlayer1);
                undoPlayer1Button.setEnabled(true);
                if (scorePlayer1 >= goal) {
                    TextView textViewPlayerName1 = (TextView) findViewById(R.id.namePlayer1);
                    String stringPlayerName1 = textViewPlayerName1.getText().toString();
                    createDialog(stringPlayerName1);
                }
                break;
            case R.id.plusGamePlayer2:
                scorePlayer2 = scorePlayer2 + 1;
                TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                textViewScorePlayer2.setText(String.valueOf(scorePlayer2));
                Button undoPlayer2Button = (Button) findViewById(R.id.undoPlayer2);
                undoPlayer2Button.setEnabled(true);
                if (scorePlayer2 >= goal) {
                    TextView textViewPlayerName2 = (TextView) findViewById(R.id.namePlayer2);
                    String stringPlayerName2 = textViewPlayerName2.getText().toString();
                    createDialog(stringPlayerName2);
                }
                break;
            case R.id.plusGamePlayer3:
                scorePlayer3 = scorePlayer3 + 1;
                TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                textViewScorePlayer3.setText(String.valueOf(scorePlayer3));
                Button undoPlayer3Button = (Button) findViewById(R.id.undoPlayer3);
                undoPlayer3Button.setEnabled(true);
                if (scorePlayer3 >= goal) {
                    TextView textViewPlayerName3 = (TextView) findViewById(R.id.namePlayer3);
                    String stringPlayerName3 = textViewPlayerName3.getText().toString();
                    createDialog(stringPlayerName3);
                }
                break;
            case R.id.plusGamePlayer4:
                scorePlayer4 = scorePlayer4 + 1;
                TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                textViewScorePlayer4.setText(String.valueOf(scorePlayer4));
                Button undoPlayer4Button = (Button) findViewById(R.id.undoPlayer4);
                undoPlayer4Button.setEnabled(true);
                if (scorePlayer4 >= goal) {
                    TextView textViewPlayerName4 = (TextView) findViewById(R.id.namePlayer4);
                    String stringPlayerName4 = textViewPlayerName4.getText().toString();
                    createDialog(stringPlayerName4);
                }
                break;
        }
    }

    //This method undo last change (only one undo click it's allowed)
    public void undo (View view) {
        int player = view.getId();
        switch (player) {
            case R.id.undoPlayer1:
                scorePlayer1 = scorePlayer1 - 1;
                TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                textViewScorePlayer1.setText(String.valueOf(scorePlayer1));
                break;
            case R.id.undoPlayer2:
                scorePlayer2 = scorePlayer2 - 1;
                TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                textViewScorePlayer2.setText(String.valueOf(scorePlayer2));
                break;
            case R.id.undoPlayer3:
                scorePlayer3 = scorePlayer3 - 1;
                TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                textViewScorePlayer3.setText(String.valueOf(scorePlayer3));
                break;
            case R.id.undoPlayer4:
                scorePlayer4 = scorePlayer4 - 1;
                TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                textViewScorePlayer4.setText(String.valueOf(scorePlayer4));
                break;
        }
        Button undoButton = (Button) findViewById(player);
        undoButton.setEnabled(false);
    }

    //This method resets all scores
    public void reset (View view) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        scorePlayer3 = 0;
        scorePlayer4 = 0;
        TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
        textViewScorePlayer1.setText(String.valueOf(scorePlayer1));
        TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
        textViewScorePlayer2.setText(String.valueOf(scorePlayer2));
        TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
        textViewScorePlayer3.setText(String.valueOf(scorePlayer3));
        TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
        textViewScorePlayer4.setText(String.valueOf(scorePlayer4));
        LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
        linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background);
        Button buttonPlayer1 = (Button) findViewById(R.id.plusGamePlayer1);
        buttonPlayer1.setEnabled(true);
        Button undoPlayer1Button = (Button) findViewById(R.id.undoPlayer1);
        undoPlayer1Button.setEnabled(false);
        LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
        linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background);
        Button buttonPlayer2 = (Button) findViewById(R.id.plusGamePlayer2);
        buttonPlayer2.setEnabled(true);
        Button undoPlayer2Button = (Button) findViewById(R.id.undoPlayer2);
        undoPlayer2Button.setEnabled(false);
        LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
        linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background);
        Button buttonPlayer3 = (Button) findViewById(R.id.plusGamePlayer3);
        buttonPlayer3.setEnabled(true);
        Button undoPlayer3Button = (Button) findViewById(R.id.undoPlayer3);
        undoPlayer3Button.setEnabled(false);
        LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
        linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background);
        Button buttonPlayer4 = (Button) findViewById(R.id.plusGamePlayer4);
        buttonPlayer4.setEnabled(true);
        Button undoPlayer4Button = (Button) findViewById(R.id.undoPlayer4);
        undoPlayer4Button.setEnabled(false);
    }

    /**
     * This method creates a dialog showed when a player wins or loses
     * Info taken from https://developer.android.com/guide/topics/ui/dialogs.html
     * @param string is the name of the player
     */
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
        imageViewMessage.setImageResource(R.drawable.ic_congratulation);
        textViewMessage.setText(getResources().getString(R.string.woohoo) + " " + string + " " + getResources().getString(R.string.congratulations));
        builder.setView(contentView);
        builder.setPositiveButton(R.string.keepButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                isOpen = false;
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
                isOpen = false;
                scorePlayer1 = 0;
                scorePlayer2 = 0;
                scorePlayer3 = 0;
                scorePlayer4 = 0;
                TextView textViewScorePlayer1 = (TextView) findViewById(R.id.pointsPlayer1);
                textViewScorePlayer1.setText(String.valueOf(scorePlayer1));
                TextView textViewScorePlayer2 = (TextView) findViewById(R.id.pointsPlayer2);
                textViewScorePlayer2.setText(String.valueOf(scorePlayer2));
                TextView textViewScorePlayer3 = (TextView) findViewById(R.id.pointsPlayer3);
                textViewScorePlayer3.setText(String.valueOf(scorePlayer3));
                TextView textViewScorePlayer4 = (TextView) findViewById(R.id.pointsPlayer4);
                textViewScorePlayer4.setText(String.valueOf(scorePlayer4));
                LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
                linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background);
                Button buttonPlayer1 = (Button) findViewById(R.id.plusGamePlayer1);
                buttonPlayer1.setEnabled(true);
                Button undoPlayer1Button = (Button) findViewById(R.id.undoPlayer1);
                undoPlayer1Button.setEnabled(false);
                LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
                linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background);
                Button buttonPlayer2 = (Button) findViewById(R.id.plusGamePlayer2);
                buttonPlayer2.setEnabled(true);
                Button undoPlayer2Button = (Button) findViewById(R.id.undoPlayer2);
                undoPlayer2Button.setEnabled(false);
                LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
                linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background);
                Button buttonPlayer3 = (Button) findViewById(R.id.plusGamePlayer3);
                buttonPlayer3.setEnabled(true);
                Button undoPlayer3Button = (Button) findViewById(R.id.undoPlayer3);
                undoPlayer3Button.setEnabled(false);
                LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
                linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background);
                Button buttonPlayer4 = (Button) findViewById(R.id.plusGamePlayer4);
                buttonPlayer4.setEnabled(true);
                Button undoPlayer4Button = (Button) findViewById(R.id.undoPlayer4);
                undoPlayer4Button.setEnabled(false);
            }
        });
        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
        isOpen = true;
    }

    /**
     * This method disables player features once a player has won or been defeated
     * @param integer is the player number
     */
    public void disableLayout (int integer) {
        switch (integer) {
            case 1:
                LinearLayout linearLayoutPlayer1 = (LinearLayout) findViewById(R.id.player1);
                linearLayoutPlayer1.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer1 = (Button) findViewById(R.id.plusGamePlayer1);
                buttonPlayer1.setEnabled(false);
                Button buttonUndoPlayer1 = (Button) findViewById(R.id.undoPlayer1);
                buttonUndoPlayer1.setEnabled(false);
                break;
            case 2:
                LinearLayout linearLayoutPlayer2 = (LinearLayout) findViewById(R.id.player2);
                linearLayoutPlayer2.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer2 = (Button) findViewById(R.id.plusGamePlayer2);
                buttonPlayer2.setEnabled(false);
                Button buttonUndoPlayer2 = (Button) findViewById(R.id.undoPlayer2);
                buttonUndoPlayer2.setEnabled(false);
                break;
            case 3:
                LinearLayout linearLayoutPlayer3 = (LinearLayout) findViewById(R.id.player3);
                linearLayoutPlayer3.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer3 = (Button) findViewById(R.id.plusGamePlayer3);
                buttonPlayer3.setEnabled(false);
                Button buttonUndoPlayer3 = (Button) findViewById(R.id.undoPlayer3);
                buttonUndoPlayer3.setEnabled(false);
                break;
            case 4:
                LinearLayout linearLayoutPlayer4 = (LinearLayout) findViewById(R.id.player4);
                linearLayoutPlayer4.setBackgroundResource(R.drawable.player_background_disabled);
                Button buttonPlayer4 = (Button) findViewById(R.id.plusGamePlayer4);
                buttonPlayer4.setEnabled(false);
                Button buttonUndoPlayer4 = (Button) findViewById(R.id.undoPlayer4);
                buttonUndoPlayer4.setEnabled(false);
                break;
        }
    }
}
