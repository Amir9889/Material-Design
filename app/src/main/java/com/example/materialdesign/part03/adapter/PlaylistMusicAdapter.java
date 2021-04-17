    package com.example.materialdesign.part03.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;
import com.example.materialdesign.part03.PlayMusicActivity;
import com.example.materialdesign.part03.model.Music;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistMusicAdapter extends RecyclerView.Adapter<PlaylistMusicAdapter.MyViewHolder> {

    private Context context;
    private List<Music> data;

    public PlaylistMusicAdapter(Context context, List<Music> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_playlist_music, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);
        holder.name_song.setText(data.get(position).getSong());
        holder.name_artist.setText(data.get(position).getName());
        holder.time.setText(data.get(position).getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PlayMusicActivity.class);
                intent.putExtra("name", data.get(position).getName());
                intent.putExtra("name_song", data.get(position).getSong());
                intent.putExtra("time", data.get(position).getTime());
                intent.putExtra("link_img", data.get(position).getLink_img());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

         ImageView img;
         TextView name_song, name_artist, time;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            name_song = itemView.findViewById(R.id.song_name);
            name_artist = itemView.findViewById(R.id.singer);
            time = itemView.findViewById(R.id.time);
        }
    }
}
