package com.slidingimages;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static ViewPager mPager;
    private static final Integer[] images = {R.drawable.glasses1, R.drawable.glasses2, R.drawable.glasses3, R.drawable.glasses4};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    private void init() {

        for (int i = 0; i < images.length; i++) {
            ImagesArray.add(images[i]);
        }

        mPager = (ViewPager) findViewById(R.id.pager);

        mPager.setAdapter(new ImageAdapter(MainActivity.this, ImagesArray));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mPager);

    }
}
