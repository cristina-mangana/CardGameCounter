package com.example.android.cardgamecounter;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;

/**
 * Created by Cristina on 31/03/2017.
 * The objective of this class is to create a dialog for selecting avatar.
 */

public class DialogFragmentAvatarsSelection extends DialogFragment {

    @Override
    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.fragment_avatar_selection, null);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(contentView);
    }
}
