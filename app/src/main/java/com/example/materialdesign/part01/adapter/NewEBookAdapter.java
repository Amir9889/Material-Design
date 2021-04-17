package com.example.materialdesign.part01.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
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
import com.example.materialdesign.part01.DetailsEBookActivity;
import com.example.materialdesign.part01.model.Book;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewEBookAdapter extends RecyclerView.Adapter<NewEBookAdapter.MyViewHolder> {

    private Context context;
    private List<Book> data;

    public NewEBookAdapter(Context context, List<Book> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_new_e_book, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Picasso.get().load(data.get(position).getLink_img()).into(holder.img);
        holder.name.setText(data.get(position).getName());
        holder.author.setText(data.get(position).getAuthor());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsEBookActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("NAME", data.get(position).getName());
                intent.putExtra("AUTHOR", data.get(position).getAuthor());
                intent.putExtra("IMG", data.get(position).getLink_img());

                ActivityOptions options;
                options = ActivityOptions.makeSceneTransitionAnimation((Activity) context, holder.img, "img_book");
                context.startActivity(intent, options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView name, author;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgNew);
            name = itemView.findViewById(R.id.nameNew);
            author = itemView.findViewById(R.id.author);
        }
    }
}
