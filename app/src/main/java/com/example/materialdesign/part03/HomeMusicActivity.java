package com.example.materialdesign.part03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.example.materialdesign.R;
import com.example.materialdesign.part03.adapter.ViewPagerAdapter;
import com.example.materialdesign.part03.fragments.HomeFragment;
import com.example.materialdesign.part03.fragments.MusicFragment;
import com.google.android.material.tabs.TabLayout;

public class HomeMusicActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home_music);


        tabs = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewPager);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.setFragments(new HomeFragment(), "خانه");
        adapter.setFragments(new MusicFragment(), "موزیک");
        viewPager.setAdapter(adapter);
        viewPager.setRotationY(180);
        tabs.setupWithViewPager(viewPager);

    }
}