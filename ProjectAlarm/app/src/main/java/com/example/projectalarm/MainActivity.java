package com.example.projectalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.provider.AlarmClock;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText hour;
    EditText min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hour = findViewById(R.id.num1);
        min = findViewById(R.id.num2);

        String h = hour.getText().toString();
        int hr = Integer. parseInt(h);
        String m = min.getText().toString();
        int mi = Integer.parseInt(m);

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_HOUR, hr)
                .putExtra(AlarmClock.EXTRA_MINUTES, mi);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}