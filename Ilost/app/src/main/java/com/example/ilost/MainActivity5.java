package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    ArrayList<Items> itemsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Items ikeaBag = new Items(" Ikea Bag", "30 Minutes Ago", R.drawable.ikeabag,"ggg","kkk");
        Items airpods = new Items(" Airpods", "3 Hours Ago",R.drawable.lairpods,"kkk","ooo");
        Items shoppingBag = new Items(" Shopping Bag", "9 Hours Ago",R.drawable.lshopbag,"lll","kkk");
        Items backPack = new Items(" Back Pack", "1 Hour Ago",R.drawable.lbackpack,"ooo","jj");
        Items watch = new Items(" Watch", "13 Minutes Ago",R.drawable.lwatch, "999","ooo");

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

    }
}