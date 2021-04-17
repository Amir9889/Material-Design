package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private List<MainPageModel> data = new ArrayList<>();
    private MainPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        mainRecyclerView.setHasFixedSize(true);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()
                , LinearLayoutManager.VERTICAL, false));

        data.add(new MainPageModel("1", "EBook", "https://cdn.pixabay.com/photo/2015/12/19/20/32/paper-1100254__340.jpg"));
        data.add(new MainPageModel("2", "Food", "https://cdn.pixabay.com/photo/2015/03/26/09/39/fried-chicken-690039__340.jpg"));
        data.add(new MainPageModel("3", "Wallpaper", "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"));

        adapter = new MainPageAdapter(data, MainActivity.this);
        mainRecyclerView.setAdapter(adapter);

    }

}