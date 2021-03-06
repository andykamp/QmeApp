package com.app.queueme.FeedAdapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.queueme.R;
import com.app.queueme.Subject;

import java.util.List;

/**
 * Created by magnusknaedal on 09.03.2017.
 */

public class FeedAdapter_ChooseSubject_Ass extends ArrayAdapter {
    private static final String TAG = "FeedAdapter_ChooseSubject_Ass";
    private final int layoutResource;
    private final LayoutInflater layoutInflater;
    private List<Subject> subjects;


    public FeedAdapter_ChooseSubject_Ass(Context context, int resource, List<Subject> subjects) {
        super(context, resource);
        this.layoutResource = resource;
        this.layoutInflater = LayoutInflater.from(context);
        this.subjects = subjects;
    }

    @Override
    public int getCount() {
        return subjects.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflates
        View view = layoutInflater.inflate(layoutResource, parent, false);
        //finds views
        TextView tvEmnekode = (TextView) view.findViewById(R.id.tvEmneKode_Ass);
        TextView tvEmnenavn = (TextView) view.findViewById(R.id.tvEmneNavn_Ass);
        //sets text
        Subject currentApp = subjects.get(position);
        tvEmnenavn.setText(currentApp.getEmnenavn());
        tvEmnekode.setText(currentApp.getEmnekode());



        return view;

    }

}


