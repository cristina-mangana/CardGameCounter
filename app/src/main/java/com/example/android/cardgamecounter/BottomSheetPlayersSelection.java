package com.example.android.cardgamecounter;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by Cristina on 30/03/2017.
 * The objective of this class is to inflate the selection layout to a bottom sheet.
 * Info and inspiration taken from:
 * http://www.androidauthority.com/bottom-sheets-707252/
 * http://www.sgoliver.net/blog/bottom-sheets-en-android/
 * http://saulmm.github.io/from-design-to-android-part1
 */
public class BottomSheetPlayersSelection extends BottomSheetDialogFragment {

    private int numberOfPlayers = 2;

    @Override
    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        final View contentView = View.inflate(getContext(), R.layout.fragment_players_selection, null);
        dialog.setContentView(contentView);
        Bundle args = getArguments();
        final String gameSelected = args.getString("gameSelected");
        TextView textViewSelectGoal = (TextView) contentView.findViewById(R.id.selectGoalText);
        LinearLayout goalLayout = (LinearLayout) contentView.findViewById(R.id.goalLine);
        TextView textViewSelectReclosures = (TextView) contentView.findViewById(R.id.selectReclosuresText);
        LinearLayout reclosuresLayout = (LinearLayout) contentView.findViewById(R.id.reclosuresLine);

        //Customize sheet depending on the selected game
        if (gameSelected == "chinchon") {
            textViewSelectGoal.setVisibility(View.GONE);
            goalLayout.setVisibility(View.GONE);
            textViewSelectReclosures.setVisibility(View.VISIBLE);
            reclosuresLayout.setVisibility(View.VISIBLE);
        } else if (gameSelected == "cabron") {
            textViewSelectGoal.setVisibility(View.GONE);
            goalLayout.setVisibility(View.GONE);
        } else {
            textViewSelectGoal.setVisibility(View.VISIBLE);
            goalLayout.setVisibility(View.VISIBLE);
        }

        //Customize spinners
        final Spinner spinnerPlayer1 = (Spinner) contentView.findViewById(R.id.playerIcon1Spinner);
        final Spinner spinnerPlayer2 = (Spinner) contentView.findViewById(R.id.playerIcon2Spinner);
        final Spinner spinnerPlayer3 = (Spinner) contentView.findViewById(R.id.playerIcon3Spinner);
        final Spinner spinnerPlayer4 = (Spinner) contentView.findViewById(R.id.playerIcon4Spinner);
        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(getContext(),
                new Integer[]{R.drawable.woman_1, R.drawable.woman_2, R.drawable.woman_3, R.drawable.woman_4,
                        R.drawable.woman_5, R.drawable.woman_6, R.drawable.woman_7, R.drawable.woman_8,
                        R.drawable.woman_9, R.drawable.woman_10,R.drawable.man_1, R.drawable.man_2,
                        R.drawable.man_3, R.drawable.man_4, R.drawable.man_5, R.drawable.man_6,
                        R.drawable.man_7, R.drawable.man_8, R.drawable.man_9, R.drawable.man_10});
        spinnerPlayer1.setAdapter(adapter);
        spinnerPlayer2.setAdapter(adapter);
        spinnerPlayer2.setSelection(10);
        spinnerPlayer3.setAdapter(adapter);
        spinnerPlayer3.setSelection(1);
        spinnerPlayer4.setAdapter(adapter);
        spinnerPlayer4.setSelection(11);

        // Set the font's path
        String fontPathRobotoMedium = "fonts/Roboto-Medium.ttf";
        // Get the id TextView
        TextView textViewSelectPlayers = (TextView) contentView.findViewById(R.id.selectPlayersText);
        // Load the font as a TypeFace object
        Typeface typeFaceRobotoMedium = Typeface.createFromAsset(getActivity().getAssets(), fontPathRobotoMedium);
        // Set the extra fancy font in the customFont TextView
        textViewSelectPlayers.setTypeface(typeFaceRobotoMedium);
        textViewSelectGoal.setTypeface(typeFaceRobotoMedium);
        textViewSelectReclosures.setTypeface(typeFaceRobotoMedium);

        //Next two listeners add new player when it's needed
        ImageView imageViewAddPlayer3 = (ImageView) contentView.findViewById(R.id.playerButton3);
        imageViewAddPlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfPlayers = 3;
                Animation animSlide = AnimationUtils.loadAnimation(getContext(), R.anim.in_from_left);
                ViewFlipper viewFlipper3 = (ViewFlipper) contentView.findViewById(R.id.viewFlipper3);
                viewFlipper3.showNext();
                viewFlipper3.startAnimation(animSlide);
                EditText editTextPlayer3 = (EditText) contentView.findViewById(R.id.playerName3);
                editTextPlayer3.setVisibility(View.VISIBLE);
                editTextPlayer3.startAnimation(animSlide);
                ViewFlipper viewFlipper4 = (ViewFlipper) contentView.findViewById(R.id.viewFlipper4);
                viewFlipper4.setVisibility(View.VISIBLE);
                Animation animFadeIn = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in);
                viewFlipper4.startAnimation(animFadeIn);
            }
        });
        ImageView imageViewAddPlayer4 = (ImageView) contentView.findViewById(R.id.playerButton4);
        imageViewAddPlayer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfPlayers = 4;
                Animation animSlide = AnimationUtils.loadAnimation(getContext(), R.anim.in_from_left);
                ViewFlipper viewFlipper4 = (ViewFlipper) contentView.findViewById(R.id.viewFlipper4);
                viewFlipper4.showNext();
                viewFlipper4.startAnimation(animSlide);
                EditText editTextPlayer4 = (EditText) contentView.findViewById(R.id.playerName4);
                editTextPlayer4.setVisibility(View.VISIBLE);
                editTextPlayer4.startAnimation(animSlide);
            }
        });
        //This listener save data and open new activity depending on the selected game
        Button nextButton = (Button) contentView.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int avatarPlayer1 = spinnerPlayer1.getSelectedItemPosition();
                int avatarPlayer2 = spinnerPlayer2.getSelectedItemPosition();
                int avatarPlayer3 = spinnerPlayer3.getSelectedItemPosition();
                int avatarPlayer4 = spinnerPlayer4.getSelectedItemPosition();
                EditText editTextPlayer1 = (EditText) contentView.findViewById(R.id.playerName1);
                EditText editTextPlayer2 = (EditText) contentView.findViewById(R.id.playerName2);
                EditText editTextPlayer3 = (EditText) contentView.findViewById(R.id.playerName3);
                EditText editTextPlayer4 = (EditText) contentView.findViewById(R.id.playerName4);
                String namePlayer1 = editTextPlayer1.getText().toString();
                String namePlayer2 = editTextPlayer2.getText().toString();
                String namePlayer3 = editTextPlayer3.getText().toString();
                String namePlayer4 = editTextPlayer4.getText().toString();
                RadioGroup goalRadioGroup = (RadioGroup) contentView.findViewById(R.id.goal_radio_group);
                int goalSelected = goalRadioGroup.getCheckedRadioButtonId();
                RadioGroup reclosuresRadioGroup = (RadioGroup) contentView.findViewById(R.id.reclosure_radio_group);
                int reclosures = reclosuresRadioGroup.getCheckedRadioButtonId();
                //http://stackoverflow.com/questions/2091465/how-do-i-pass-data-between-activities-in-android-application
                switch (gameSelected) {
                    case "chinchon":
                        Intent openActivityChinchon = new Intent(getContext(), ChinchonActivity.class);
                        openActivityChinchon.putExtra("numberOfPlayers",numberOfPlayers);
                        openActivityChinchon.putExtra("avatarPlayer1",avatarPlayer1);
                        openActivityChinchon.putExtra("avatarPlayer2",avatarPlayer2);
                        openActivityChinchon.putExtra("avatarPlayer3",avatarPlayer3);
                        openActivityChinchon.putExtra("avatarPlayer4",avatarPlayer4);
                        openActivityChinchon.putExtra("namePlayer1",namePlayer1);
                        openActivityChinchon.putExtra("namePlayer2",namePlayer2);
                        openActivityChinchon.putExtra("namePlayer3",namePlayer3);
                        openActivityChinchon.putExtra("namePlayer4",namePlayer4);
                        openActivityChinchon.putExtra("reclosures",reclosures);
                        startActivity(openActivityChinchon);
                        break;
                    case "cabron":
                        Intent openActivityCabron = new Intent(getContext(), CabronActivity.class);
                        openActivityCabron.putExtra("numberOfPlayers",numberOfPlayers);
                        openActivityCabron.putExtra("avatarPlayer1",avatarPlayer1);
                        openActivityCabron.putExtra("avatarPlayer2",avatarPlayer2);
                        openActivityCabron.putExtra("avatarPlayer3",avatarPlayer3);
                        openActivityCabron.putExtra("avatarPlayer4",avatarPlayer4);
                        openActivityCabron.putExtra("namePlayer1",namePlayer1);
                        openActivityCabron.putExtra("namePlayer2",namePlayer2);
                        openActivityCabron.putExtra("namePlayer3",namePlayer3);
                        openActivityCabron.putExtra("namePlayer4",namePlayer4);
                        startActivity(openActivityCabron);
                        break;
                    case "point":
                        Intent openActivityPoint = new Intent(getContext(), PointActivity.class);
                        openActivityPoint.putExtra("numberOfPlayers",numberOfPlayers);
                        openActivityPoint.putExtra("avatarPlayer1",avatarPlayer1);
                        openActivityPoint.putExtra("avatarPlayer2",avatarPlayer2);
                        openActivityPoint.putExtra("avatarPlayer3",avatarPlayer3);
                        openActivityPoint.putExtra("avatarPlayer4",avatarPlayer4);
                        openActivityPoint.putExtra("namePlayer1",namePlayer1);
                        openActivityPoint.putExtra("namePlayer2",namePlayer2);
                        openActivityPoint.putExtra("namePlayer3",namePlayer3);
                        openActivityPoint.putExtra("namePlayer4",namePlayer4);
                        openActivityPoint.putExtra("goalSelected",goalSelected);
                        startActivity(openActivityPoint);
                        break;
                    case "game":
                        Intent openActivityGame = new Intent(getContext(), GameActivity.class);
                        openActivityGame.putExtra("numberOfPlayers",numberOfPlayers);
                        openActivityGame.putExtra("avatarPlayer1",avatarPlayer1);
                        openActivityGame.putExtra("avatarPlayer2",avatarPlayer2);
                        openActivityGame.putExtra("avatarPlayer3",avatarPlayer3);
                        openActivityGame.putExtra("avatarPlayer4",avatarPlayer4);
                        openActivityGame.putExtra("namePlayer1",namePlayer1);
                        openActivityGame.putExtra("namePlayer2",namePlayer2);
                        openActivityGame.putExtra("namePlayer3",namePlayer3);
                        openActivityGame.putExtra("namePlayer4",namePlayer4);
                        openActivityGame.putExtra("goalSelected",goalSelected);
                        startActivity(openActivityGame);
                        break;
                }
            }
        });
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Restore state from saved instance
        if (savedInstanceState != null) {
            String playerName1String = savedInstanceState.getString("playerName1String");
            String playerName2String = savedInstanceState.getString("playerName2String");
            String playerName3String = savedInstanceState.getString("playerName3String");
            String playerName4String = savedInstanceState.getString("playerName4String");
            int playerAvatar1Position = savedInstanceState.getInt("playerAvatar1Position");
            int playerAvatar2Position = savedInstanceState.getInt("playerAvatar1Position");
            int playerAvatar3Position = savedInstanceState.getInt("playerAvatar1Position");
            int playerAvatar4Position = savedInstanceState.getInt("playerAvatar1Position");
            int numberOfPlayersSaved = savedInstanceState.getInt("numberOfPlayers");
            int goalSelected = savedInstanceState.getInt("goalSelected");
            int reclosuresSelected = savedInstanceState.getInt("reclosuresSelected");

            // Apply stored items
            View contentView = View.inflate(getContext(), R.layout.fragment_players_selection, null);
            ViewFlipper viewFlipper3 = (ViewFlipper) contentView.findViewById(R.id.viewFlipper3);
            ViewFlipper viewFlipper4 = (ViewFlipper) contentView.findViewById(R.id.viewFlipper4);
            EditText editTextPlayer1 = (EditText) contentView.findViewById(R.id.playerName1);
            EditText editTextPlayer2 = (EditText) contentView.findViewById(R.id.playerName2);
            EditText editTextPlayer3 = (EditText) contentView.findViewById(R.id.playerName3);
            EditText editTextPlayer4 = (EditText) contentView.findViewById(R.id.playerName4);
            switch (numberOfPlayersSaved) {
                case 2:
                    break;
                case 3:
                    viewFlipper3.showNext();
                    editTextPlayer3.setVisibility(View.VISIBLE);
                    viewFlipper4.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    viewFlipper3.showNext();
                    editTextPlayer3.setVisibility(View.VISIBLE);
                    viewFlipper4.setVisibility(View.VISIBLE);
                    viewFlipper4.showNext();
                    editTextPlayer4.setVisibility(View.VISIBLE);
                    break;
            }
            editTextPlayer1.setText(playerName1String);
            editTextPlayer2.setText(playerName2String);
            editTextPlayer3.setText(playerName3String);
            editTextPlayer4.setText(playerName4String);
            Spinner spinnerPlayer1 = (Spinner) contentView.findViewById(R.id.playerIcon1Spinner);
            Spinner spinnerPlayer2 = (Spinner) contentView.findViewById(R.id.playerIcon2Spinner);
            Spinner spinnerPlayer3 = (Spinner) contentView.findViewById(R.id.playerIcon3Spinner);
            Spinner spinnerPlayer4 = (Spinner) contentView.findViewById(R.id.playerIcon4Spinner);
            spinnerPlayer1.setSelection(playerAvatar1Position);
            spinnerPlayer2.setSelection(playerAvatar2Position);
            spinnerPlayer3.setSelection(playerAvatar3Position);
            spinnerPlayer4.setSelection(playerAvatar4Position);
            RadioGroup goalRadioGroup = (RadioGroup) contentView.findViewById(R.id.goal_radio_group);
            goalRadioGroup.check(goalSelected);
            RadioGroup reclosuresRadioGroup = (RadioGroup) contentView.findViewById(R.id.reclosure_radio_group);
            reclosuresRadioGroup.check(reclosuresSelected);
        }
    }

    // Fires when a configuration change occurs and fragment needs to save state
    public void onSaveInstanceState(Bundle savedInstanceState) {
        View contentView = View.inflate(getContext(), R.layout.fragment_players_selection, null);
        Spinner spinnerPlayer1 = (Spinner) contentView.findViewById(R.id.playerIcon1Spinner);
        Spinner spinnerPlayer2 = (Spinner) contentView.findViewById(R.id.playerIcon2Spinner);
        Spinner spinnerPlayer3 = (Spinner) contentView.findViewById(R.id.playerIcon3Spinner);
        Spinner spinnerPlayer4 = (Spinner) contentView.findViewById(R.id.playerIcon4Spinner);
        int playerAvatar1Position = spinnerPlayer1.getSelectedItemPosition();
        int playerAvatar2Position = spinnerPlayer2.getSelectedItemPosition();
        int playerAvatar3Position = spinnerPlayer3.getSelectedItemPosition();
        int playerAvatar4Position = spinnerPlayer4.getSelectedItemPosition();
        EditText editTextPlayer1 = (EditText) contentView.findViewById(R.id.playerName1);
        EditText editTextPlayer2 = (EditText) contentView.findViewById(R.id.playerName2);
        EditText editTextPlayer3 = (EditText) contentView.findViewById(R.id.playerName3);
        EditText editTextPlayer4 = (EditText) contentView.findViewById(R.id.playerName4);
        String playerName1String = editTextPlayer1.getText().toString();
        String playerName2String = editTextPlayer2.getText().toString();
        String playerName3String = editTextPlayer3.getText().toString();
        String playerName4String = editTextPlayer4.getText().toString();
        RadioGroup goalRadioGroup = (RadioGroup) contentView.findViewById(R.id.goal_radio_group);
        int goalSelected = goalRadioGroup.getCheckedRadioButtonId();
        RadioGroup reclosuresRadioGroup = (RadioGroup) contentView.findViewById(R.id.reclosure_radio_group);
        int reclosuresSelected = reclosuresRadioGroup.getCheckedRadioButtonId();
        savedInstanceState.putString("playerName1String", playerName1String);
        savedInstanceState.putString("playerName2String", playerName2String);
        savedInstanceState.putString("playerName3String", playerName3String);
        savedInstanceState.putString("playerName4String", playerName4String);
        savedInstanceState.putInt("playerAvatar1Position", playerAvatar1Position);
        savedInstanceState.putInt("playerAvatar2Position", playerAvatar2Position);
        savedInstanceState.putInt("playerAvatar3Position", playerAvatar3Position);
        savedInstanceState.putInt("playerAvatar4Position", playerAvatar4Position);
        savedInstanceState.putInt("numberOfPlayers",numberOfPlayers);
        savedInstanceState.putInt("goalSelected", goalSelected);
        savedInstanceState.putInt("reclosuresSelected", reclosuresSelected);
        super.onSaveInstanceState(savedInstanceState);
    }

}
