package com.example.ilost;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class viewPagerAdapter extends PagerAdapter {

    Context context;

    int[] images ={
            R.drawable.get11,
            R.drawable.set22,
            R.drawable.vet33,

    };
    int[] headings ={
            R.string.heading_one,
            R.string.heading_two,
            R.string.heading_three,
    };
    int[] decs ={
            R.string.desc_one,
            R.string.desc_two,
            R.string.desc_three,
    };

    public viewPagerAdapter(Context context){
        this.context = context;
    }


    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view = layoutInflater.inflate(R.layout.slider_layout, container,false);

        ImageView slidetitileimage12 = (ImageView) view.findViewById(R.id.helping);
        TextView slideHeading = (TextView) view.findViewById(R.id.textView26);
        TextView slideDesc = (TextView) view.findViewById(R.id.textView27);

        slidetitileimage12.setImageResource(images[position]);
        slideHeading.setText(headings[position]);
        slideDesc.setText(decs[position]);

        container.addView(view);

        return view;



    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
