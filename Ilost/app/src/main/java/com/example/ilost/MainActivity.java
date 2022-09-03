package com.example.ilost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     ViewPager mSlideViewPager;
     LinearLayout mDotLayout;
     Button nextButton,backButton, skipButton;

     TextView[] dots;
     viewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = findViewById(R.id.nextButton);
        backButton = findViewById(R.id.backButton);
        skipButton = findViewById(R.id.skipButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if (getitem(0)>0){

           mSlideViewPager.setCurrentItem(getitem(-1),true);

               }
            }
           });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (getitem(0)<3)
                mSlideViewPager.setCurrentItem(getitem(1),true);
                else{
                    Intent i = new Intent(MainActivity.this,MainActivity4.class);
               startActivity(i);
               finish();
                }

            }
        });

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i);
                finish();
            }
        });

        mSlideViewPager = (ViewPager) findViewById(R.id.slideshow);
        mDotLayout = (LinearLayout) findViewById(com.google.android.material.R.id.layout);

        viewPagerAdapter = new viewPagerAdapter(this);

        mSlideViewPager.setAdapter(viewPagerAdapter);

         setUpindicator(0);
mSlideViewPager.addOnPageChangeListener(viewListener);

    }
    public void setUpindicator(int position){
      dots = new TextView[4];
      mDotLayout.removeAllViews();

      for (int i = 0 ; i < dots.length ; i++){

          dots[i] = new TextView(this);
          dots[i] .setText(Html.fromHtml("&#8229"));
          dots[i] .setTextSize(35);
          dots[i] .setTextColor(getResources().getColor(R.color.gray,getApplicationContext().getTheme()));
          mDotLayout.addView(dots[i]);

      }

   dots[position].setTextColor(getResources().getColor(R.color.ourColor,getApplicationContext().getTheme()));
    }
     ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
         @Override
         public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

         }

         @Override
         public void onPageSelected(int position) {
             setUpindicator(position);
             if (position > 0){
                 backButton.setVisibility(View.VISIBLE);

             }else {
                 backButton.setVisibility(View.INVISIBLE);
             }
         }

         @Override
         public void onPageScrollStateChanged(int state) {

         }
     };
    private int getitem(int i){
        return mSlideViewPager.getCurrentItem() + i ;
    }




}