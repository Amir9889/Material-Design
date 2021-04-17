package com.example.materialdesign.part02.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.materialdesign.R;
import com.example.materialdesign.part02.model.Food;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderAdapter extends PagerAdapter {

    private Context context;
    private List<Food> data;

    public SliderAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_slider_food, container, false);
        TextView name = view.findViewById(R.id.name);
        TextView description = view.findViewById(R.id.description);
        TextView rating = view.findViewById(R.id.txt_rating);
        TextView count = view.findViewById(R.id.count_rating);
        ImageView img = view.findViewById(R.id.img);

        name.setText(data.get(position).getName());
        description.setText(data.get(position).getDescription());
        rating.setText(data.get(position).getRating());
        count.setText("("+data.get(position).getCount_rating()+")");
        Picasso.get().load(data.get(position).getLink_img()).into(img);

        view.setRotationY(-180);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }
}
