package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by will on 27/07/2017.
 */

public class EqInfoAdapter extends ArrayAdapter<EqInfo> {
    public EqInfoAdapter(Activity context, ArrayList<EqInfo> EqInfos) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, EqInfos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        EqInfo currentEqInfo = getItem(position);

        TextView magTextView = (TextView) listItemView.findViewById(R.id.magnitude_num);
        magTextView.setText(currentEqInfo.getEqMagnitude());

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_str);
        placeTextView.setText(currentEqInfo.getEqPlace());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_str);
        dateTextView.setText(currentEqInfo.getEqDate());

        return listItemView;
    }
}