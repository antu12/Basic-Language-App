package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by arshad on 4/19/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
              R.layout.list_item, parent,false);
        }
        Word currentWord = getItem(position);

        TextView number = (TextView) listItemView.findViewById(R.id.word);
        number.setText(currentWord.getEnglish());

        TextView numberTranslate = (TextView) listItemView.findViewById(R.id.translate);
        numberTranslate.setText(currentWord.getTranslate());

        return listItemView;
    }
}
