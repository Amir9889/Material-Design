package com.example.materialdesign.part03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;
import com.example.materialdesign.part03.model.Music;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HeaderMusicAdapter extends RecyclerView.Adapter<HeaderMusicAdapter.MyViewHolder> {

    private Context context;
    private List<Music> data;

    public HeaderMusicAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_header_music, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(data.get(position).getSong());
        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView name;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name_song);
        }
    }
}
