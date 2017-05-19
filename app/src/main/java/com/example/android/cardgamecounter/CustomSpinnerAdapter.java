package com.example.android.cardgamecounter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

/**
 * Created by Cristina on 01/04/2017.
 * This class is useful to create an image only spinner
 * Info taken from http://stackoverflow.com/questions/3609231/how-is-it-possible-to-create-a-spinner-with-images-instead-of-text
 */

public class CustomSpinnerAdapter extends ArrayAdapter<Integer> {
    private Integer[] images;

    public CustomSpinnerAdapter(Context context, Integer[] images) {
        super(context, android.R.layout.simple_spinner_item, images);
        this.images = images;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View contentView = View.inflate(getContext(), R.layout.single_avatar_layout, null);
        ImageView avatar = (ImageView) contentView.findViewById(R.id.avatar);
        avatar.setImageResource(images[position]);
        return contentView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getImageForPosition(position);
    }

    private View getImageForPosition(int position) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(images[position]);
        imageView.setBackgroundResource(R.drawable.round_background);
        imageView.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return imageView;
    }
}

