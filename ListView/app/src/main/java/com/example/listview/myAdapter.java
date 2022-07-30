package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myAdapter extends ArrayAdapter<String> {

    //creating a local data source
    private String arr1[];
    public myAdapter(@NonNull Context context, int resource, @NonNull String[] objects) {
        super(context, resource, objects);
        arr1 = objects; //storing the data into arr1
    }

    @Nullable
    @Override
    public String getItem(int position) {   //it returns the value at that index of the data source
        return arr1[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Defining our layout with the help of layoutInflater as there are more than one layouts and storing it into convertview
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.mylayout, parent, false);
        TextView textView;
        textView = convertView.findViewById(R.id.textView); //grabbing the textview with the help of convertview
        textView.setText(getItem(position));    //setting the value return by the getItem method
        return convertView;
    }
}
