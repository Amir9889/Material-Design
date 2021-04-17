package com.example.materialdesign.part04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.materialdesign.R;
import com.example.materialdesign.part04.adapter.IntroWallpaperAdapter;
import com.example.materialdesign.part04.model.Intro;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroWallpaperActivity extends AppCompatActivity {

    private List<Intro> listIntro = new ArrayList<>();
    private ViewPager viewPager;
    private TabLayout tabs;
    private IntroWallpaperAdapter adapter;
    private TextView txt_after, txt_before;
    private Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_intro_wallpaper);

        viewPager = findViewById(R.id.viewPager);
        tabs = findViewById(R.id.tabs);
        txt_after = findViewById(R.id.txt_after);
        txt_before = findViewById(R.id.txt_before);
        btn_go = findViewById(R.id.btn_go);

        listIntro.add(new Intro("کلی عکس جدید که خیلی راحت میتونی دانلودشون کنی", R.raw.photo));
        listIntro.add(new Intro("میتونی عکس هارو به اشتراک بذاری", R.raw.photo2));
        listIntro.add(new Intro("عکس دوستات رو لایک کن", R.raw.photo3));
        listIntro.add(new Intro("میتونی هروز عکس های جدید را راحت پیدا و دانلود کنی", R.raw.cover));

        adapter = new IntroWallpaperAdapter(this, listIntro);
        viewPager.setAdapter(adapter);
        viewPager.setRotationY(180);
        tabs.setupWithViewPager(viewPager, true);

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == listIntro.size()-1){
                    txt_after.setText("تمام");
                    tabs.setVisibility(View.INVISIBLE);
                    btn_go.setVisibility(View.VISIBLE);
                }else if (tab.getPosition() == listIntro.size()-2){
                    txt_after.setText("بعدی");
                    tabs.setVisibility(View.VISIBLE);
                    btn_go.setVisibility(View.INVISIBLE);
                }else if (tab.getPosition() == listIntro.size()-3){
                    txt_before.setVisibility(View.VISIBLE);
                }else if (tab.getPosition() == 0){
                    txt_before.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroWallpaperActivity.this, HomeWallpaperActivity.class));
            }
        });
    }
}