package com.example.materialdesign.part04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.example.materialdesign.R;
import com.example.materialdesign.part04.fragments.CategoryWallpaperFragment;
import com.example.materialdesign.part04.fragments.HomeWallpaperFragment;
import com.example.materialdesign.part04.fragments.NewWallpaperFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class HomeWallpaperActivity extends AppCompatActivity {

    private ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home_wallpaper);

        chipNavigationBar = findViewById(R.id.chipNav);
        chipNavigationBar.setItemSelected(R.id.nav_home, true);

        HomeWallpaperFragment homeWallpaperFragment = new HomeWallpaperFragment();
        FragmentTransaction fragmentTransaction_home = getSupportFragmentManager().beginTransaction();
        fragmentTransaction_home.replace(R.id.frameLayout, homeWallpaperFragment);
        fragmentTransaction_home.commit();

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int position) {
                switch (position){
                    case R.id.nav_home:
                        HomeWallpaperFragment homeWallpaperFragment = new HomeWallpaperFragment();
                        FragmentTransaction fragmentTransaction_home = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_home.replace(R.id.frameLayout, homeWallpaperFragment);
                        fragmentTransaction_home.commit();
                        break;

                    case R.id.nav_category:
                        CategoryWallpaperFragment categoryWallpaperFragment = new CategoryWallpaperFragment();
                        FragmentTransaction fragmentTransaction_category = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_category.replace(R.id.frameLayout, categoryWallpaperFragment);
                        fragmentTransaction_category.commit();
                        break;

                    case R.id.nav_new :
                        NewWallpaperFragment newWallpaperFragment = new NewWallpaperFragment();
                        FragmentTransaction fragmentTransaction_new = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction_new.replace(R.id.frameLayout, newWallpaperFragment);
                        fragmentTransaction_new.commit();
                        break;
                }
            }
        });
    }
}