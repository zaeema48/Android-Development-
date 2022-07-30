package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public EditText name;
public static final String addName = "com.example.multiscreen.addName";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Function(View b){
        Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show();
        name = findViewById(R.id.editText); //grabbing the editText view by its id
        String nameText = name.getText().toString();      //fetching the text of name as a string
        Intent intent = new Intent (this, MainActivity2.class); //explicit intent
        intent.putExtra(addName, nameText);  //passing the message as key and value
        startActivity(intent);  //starting the intent activity
    }
}