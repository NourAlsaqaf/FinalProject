package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    ArrayList<Items> itemsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Items ikeaBag = new Items(" Ikea Bag", "30 Minutes Ago", R.drawable.ikeabag,"Found place: Avenues","Phone Number: +956-876609");
        Items airpods = new Items(" Airpods", "3 Hours Ago",R.drawable.lairpods,"Found place: starbucks-Mahbuola","Phone Number: +956-6555478");
        Items shoppingBag = new Items(" Shopping Bag", "9 Hours Ago",R.drawable.lshopbag,"Found place:Fintas park","Phone Number: +956-766843");
        Items backPack = new Items(" Back Pack", "1 Hour Ago",R.drawable.lbackpack,"Found place: Mubarkiya Bus","Phone Number: +956-988876");
        Items watch = new Items(" Watch", "13 Minutes Ago",R.drawable.lwatch, "Found place: Almasged Alkabeer restroom","Phone Number: +956-988768");

        itemsList.add(ikeaBag);
        itemsList.add(airpods);
        itemsList.add(shoppingBag);
        itemsList.add(backPack);
        itemsList.add(watch);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this , 0 , itemsList);
        ListView listView = findViewById(R.id.listView3);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Items currentItem = itemsList.get(i);
                Intent intent = new Intent(MainActivity5.this, detailActivity.class);
                intent.putExtra("Items", currentItem);
                startActivity(intent);

            }
        });

        ImageView k = findViewById(R.id.imageView2);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity5.this,MainActivity7.class));
                startActivity(intent);
            }
        });
        ImageView j = findViewById(R.id.imageView6);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity5.this,MainActivity6.class));
                startActivity(intent);
            }
        });



    }
}