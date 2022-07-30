package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);

        String arr[] ={ "Zaeema", "Saziya", "Danish", "Zeeshan", "Shaiza", "Saad", "Ali", "Seema", "Sumayya"};
        //Using Pre-built layout
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView.setAdapter(ad);

        //Custom Layout
        myAdapter ad = new myAdapter(this, R.layout.mylayout, arr);
        listView.setAdapter(ad);


    }
}