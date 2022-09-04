package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    ArrayList<Items> itemsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Items ikeaBag = new Items(" Ikea Bag", "30 Minutes Ago", R.drawable.ikeabag);
        Items airpods = new Items(" Airpods", "3 Hours Ago",R.drawable.lairpods);
        Items shoppingBag = new Items(" Shopping Bag", "9 Hours Ago",R.drawable.lshopbag);
        Items backPack = new Items(" Back Pack", "1 Hour Ago",R.drawable.lbackpack);
        Items watch = new Items(" Watch", "13 Minutes Ago",R.drawable.lwatch);

        itemsList.add(ikeaBag);
        itemsList.add(airpods);
        itemsList.add(shoppingBag);
        itemsList.add(backPack);
        itemsList.add(watch);

        ItemsAdapter itemsAdapter = new ItemsAdapter(this , 0 , itemsList);
        ListView listView = findViewById(R.id.listView3);
        listView.setAdapter(itemsAdapter);

    }
}