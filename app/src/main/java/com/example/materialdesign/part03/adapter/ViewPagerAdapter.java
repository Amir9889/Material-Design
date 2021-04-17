package com.example.materialdesign.part03.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<String> nameFragments = new ArrayList<>();
    private List<Fragment> listFragments = new ArrayList<>();

    public void setFragments(Fragment fragment, String name){
        listFragments.add(fragment);
        nameFragments.add(name);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragments.get(position);
    }

    @Override
    public int getCount() {
        return nameFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nameFragments.get(position);
    }
}
