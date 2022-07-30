package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
//    public static String string;
//    public static String string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view){
        editText1 = findViewById(R.id.editText1);   //grabbing the view by it's ID in object
        editText2 = findViewById(R.id.editText2);
        String str1 = editText1.getText().toString();   //(fetching the obj)editText1 ka text chahiye as a string
        String  str2 = editText2.getText().toString();
        Bundle bundle = new Bundle();  //used to pass multiple keys and values from one activity to other
        bundle.putString("string", str1);
        bundle.putString("key", str2);
        Intent intent = new Intent (MainActivity.this, MainActivity2.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}