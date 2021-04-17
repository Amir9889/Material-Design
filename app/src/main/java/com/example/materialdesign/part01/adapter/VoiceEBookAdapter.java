package com.example.materialdesign.part01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;
import com.example.materialdesign.part01.model.Book;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VoiceEBookAdapter extends RecyclerView.Adapter<VoiceEBookAdapter.MyViewHolder> {

    private Context context;
    private List<Book> data;

    public VoiceEBookAdapter(Context context, List<Book> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_voice_e_book, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.get().load(data.get(position).getLink_img()).into(holder.img_voice);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView img_voice;
        //private TextView name, author; We don't need these widgets in our Voice Item

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_voice = itemView.findViewById(R.id.imgNew);
        }
    }
}
