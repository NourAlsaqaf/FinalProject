package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button b = findViewById(R.id.button11);

        b.setOnClickListener(new View.OnClickListener(
        ) {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity1.this,MainActivity2.class));
                startActivity(intent);
            }
        });


    }
}