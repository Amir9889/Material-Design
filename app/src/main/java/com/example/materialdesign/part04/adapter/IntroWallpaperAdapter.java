package com.example.materialdesign.part04.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.airbnb.lottie.LottieAnimationView;
import com.example.materialdesign.R;
import com.example.materialdesign.part04.model.Intro;

import java.util.List;

public class IntroWallpaperAdapter extends PagerAdapter {

    private Context context;
    private List<Intro> data;

    public IntroWallpaperAdapter(Context context, List<Intro> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_intro_wallpaper, container, false);

        LottieAnimationView lottieAnimationView = view.findViewById(R.id.lottieAnimation);
        TextView txt_description = view.findViewById(R.id.txt_description);

        txt_description.setText(data.get(position).getDescription());
        lottieAnimationView.setAnimation(data.get(position).getLottie());

        view.setRotationY(180);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
