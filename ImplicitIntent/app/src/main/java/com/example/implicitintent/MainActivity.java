package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
EditText recepients ;
EditText subject ;
EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recepients = findViewById(R.id.editText);
        subject = findViewById(R.id.editText2);
        message = findViewById(R.id.editText3);
    }
    public void sendTo(View view){
        String str1 = recepients.getText().toString();
        String str2 = subject.getText().toString();
        String str3 = message.getText().toString();
        String addresses[] = new String[1];
        addresses[0] = str1;

//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("*/*");    //it will show all the apps for action to be done
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // it will show only email app to done the action
        intent.putExtra(Intent.EXTRA_EMAIL, addresses); //EXTRA_EMAIL method expects an array in its parameter
        intent.putExtra(Intent.EXTRA_SUBJECT, str2);
        intent.putExtra(Intent.EXTRA_TEXT, str3);

        if (intent.resolveActivity(getPackageManager()) != null) {  //Starting the implicit intent
            startActivity(intent);
        }
    }
}