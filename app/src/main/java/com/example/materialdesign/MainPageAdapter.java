package com.example.materialdesign;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.part01.LoginEBookActivity;
import com.example.materialdesign.part02.HomeActivityFood;
import com.example.materialdesign.part03.HomeMusicActivity;
import com.example.materialdesign.part03.LoginMusicActivity;
import com.example.materialdesign.part04.IntroWallpaperActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.MainPageViewHolder> {

    private List<MainPageModel> data;
    private Context context;

    public MainPageAdapter(List<MainPageModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MainPageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_main_page, parent, false);
        return new MainPageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainPageViewHolder holder, int position) {
        holder.txtName.setText(data.get(position).getTxtName());
        holder.txtPartNum.setText(data.get(position).getTxtPartNum());
        Picasso.get().load(data.get(position).getLink_img()).placeholder(R.drawable.placeholder_image).into(holder.img);
        Intent intent = new Intent();
        holder.mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0:
                        // EBook
                        intent.setClass(context, LoginEBookActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        // Food
                        intent.setClass(context, HomeActivityFood.class);
                        context.startActivity(intent);
                        break;
                    case 2:
                        // Wallpaper
                        intent.setClass(context, IntroWallpaperActivity.class);
                        context.startActivity(intent);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MainPageViewHolder extends RecyclerView.ViewHolder {

        private TextView txtPartNum, txtName;
        private ImageView img;
        private ImageButton btnNext;
        private CardView mainCard;

        public MainPageViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtPartNum = itemView.findViewById(R.id.txtPartNum);
            img = itemView.findViewById(R.id.img);
            btnNext = itemView.findViewById(R.id.btnNext);
            mainCard = itemView.findViewById(R.id.mainCard);
        }
    }
}
