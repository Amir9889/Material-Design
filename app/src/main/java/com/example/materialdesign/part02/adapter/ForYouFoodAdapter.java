package com.example.materialdesign.part02.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;
import com.example.materialdesign.part02.model.Food;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ForYouFoodAdapter extends RecyclerView.Adapter<ForYouFoodAdapter.MyViewHolder> {

    Context context;
    List<Food> data;

    public ForYouFoodAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_for_food, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getName());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);
        holder.price.setText("قیمت : "+data.get(position).getPrice()+" تومان");
        holder.rating.setText(data.get(position).getRating());
        holder.count_rating.setText("("+data.get(position).getCount_rating()+")");

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name, rating, count_rating, price;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameNew);
            img = itemView.findViewById(R.id.imgNew);
            rating = itemView.findViewById(R.id.txt_rating);
            count_rating = itemView.findViewById(R.id.count_rating);
            price = itemView.findViewById(R.id.price);
        }
    }
}
