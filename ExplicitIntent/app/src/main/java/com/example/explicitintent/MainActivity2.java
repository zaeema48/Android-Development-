package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView obj1;
    TextView obj2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        obj1 = findViewById(R.id.textView); //grabbing the view in object
        obj2 = findViewById(R.id.textView2);
//        Intent intent2 = getIntent(); //getting the intent
//        String str1 = intent2.getStringExtra(MainActivity.string);  //getting the value using it's key and storing in str1
//        String str2 = intent2.getStringExtra(MainActivity.string2);
        Bundle bundle1 = getIntent().getExtras(); //getting the intent in bundle
        String str1 = bundle1.getString("string"); //getting the value using it's key and storing in str1
        String str2 = bundle1.getString("key");
        obj1.setText(str1);
        obj2.setText(str2);

    }
}