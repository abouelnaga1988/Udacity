package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private StatePagerAdapter mStatePagerAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStatePagerAdapter = new StatePagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        // Give the TabLayout the ViewPager
        setViewPager(mViewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


    }

    public void setViewPager(ViewPager viewPager) {
        StatePagerAdapter adapter = new StatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RestaurantsFragment(), "Restaurants");
        adapter.addFragment(new MarketsFragment(), "Markets");
        adapter.addFragment(new EntertainmentFragment(), "Entertainment");
        adapter.addFragment(new SportsFragment(), "Sports");

        viewPager.setAdapter(adapter);


    }

}
