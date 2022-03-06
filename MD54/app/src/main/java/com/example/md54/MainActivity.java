package com.example.md54;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startMsc = findViewById(R.id.start_music);
        final Button stopMsc = findViewById(R.id.stop_misic);

        // запуск службы
        startMsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(
                        new Intent(MainActivity.this, MyService.class));
            }
        });

        // остановка службы
        stopMsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(
                        new Intent(MainActivity.this, MyService.class));
            }
        });
    }
}