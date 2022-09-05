package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        Items deliverItem = (Items) bundle.getSerializable("Items");

        setContentView(R.layout.activity_detail);

        ImageView im6 = findViewById(R.id.itemImage);
        TextView txt1 = findViewById(R.id.iName);
        TextView txt2 = findViewById(R.id.location);
        TextView txt3 = findViewById(R.id.iTime);
        TextView txt4 = findViewById(R.id.phoneNum);

        im6.setImageResource(deliverItem.getItemImage());
        txt1.setText(deliverItem.getItemName());
        txt2.setText(deliverItem.getItemLocation());
        txt3.setText(deliverItem.getItemTime());
        txt4.setText(deliverItem.getUserNumber());


    }
}