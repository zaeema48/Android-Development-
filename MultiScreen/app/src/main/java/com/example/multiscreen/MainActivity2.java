package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public TextView displayName;
    public String name;
    public String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayName = findViewById(R.id.textView);  //grabbing the textView
        Intent intent = getIntent();    //starting intent
        name = intent.getStringExtra(MainActivity.addName);  //getting the value of key(addName) as a string
        displayName.setText("The msg is " + name);  //displaying the message
    }

    public void sendMail(View view) {

        String[] addresses = {"zaeemakhanam2001@gmail.com", "zeeshankalimkhan@gmail.com"};
        Intent intent1 = new Intent(Intent.ACTION_SEND);
        intent1.setType("*/*");
        intent1.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent1.putExtra(Intent.EXTRA_SUBJECT, "Sending mail from my app ");
        intent1.putExtra(Intent.EXTRA_TEXT, name);
//        intent1.putExtra(Intent.EXTRA_STREAM, attachment);
        if (intent1.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }
}