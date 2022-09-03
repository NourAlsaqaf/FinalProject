package com.example.ilost;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter {
    List<Items> itemsList;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

         View view = LayoutInflater.from(getContext()).inflate(R.layout.item_custom,parent,false);

         Items currentItem = itemsList.get(position);

        TextView itemName = view.findViewById(R.id.iName);
        TextView itemTime = view.findViewById(R.id.iTime);
        ImageView itemImage = view.findViewById(R.id.itemImage);


        itemTime.setText(currentItem.getItemTime());
        itemName.setText(currentItem.getItemName());
        itemImage.setImageResource(currentItem.getItemImage());

        return  view ;
    }
}
