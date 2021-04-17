package com.example.materialdesign.part02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.materialdesign.R;
import com.example.materialdesign.part02.adapter.DetailSugFoodAdapter;
import com.example.materialdesign.part02.model.Food;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailFoodActivity extends AppCompatActivity {

    private TextView name, name_f, rating, count, price;
    private ImageView img;

    private Bundle bundle;

    // Food Suggestion Part ==>
    private RecyclerView recyclerViewSug;
    private List<Food> listSug= new ArrayList<>();
    private DetailSugFoodAdapter adapter;

    private String link_img, name_food, rate, cou, pri;

    public DetailFoodActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_detail_food);

        bundle = getIntent().getExtras();

        init();

        recyclerViewSug = findViewById(R.id.recyclerView_simi_sug);
        recyclerViewSug.setHasFixedSize(true);
        recyclerViewSug.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        listSug.add(new Food("چلوکباب کوبیده", "https://i.pinimg.com/564x/52/ef/c4/52efc40e1ff55f7683360a83e987399f.jpg", "23500", "4.9", "10.9K"));
        listSug.add(new Food("استیک مخصوص", "https://i.pinimg.com/564x/0b/1b/cf/0b1bcf1c1ae3a2788975c49b6f02f8ad.jpg", "37000", "4.4", "14.9K"));
        listSug.add(new Food("Panini Sandwich", "https://i.pinimg.com/564x/26/95/13/269513aab644fe11f381db0a164d688f.jpg", "48000", "4.8", "24.5K"));
        listSug.add(new Food("پیتزا سبزیجات", "https://i.pinimg.com/564x/e4/67/56/e4675674d0ac0facd832994c1364a49a.jpg", "48500", "4.1", "5.6K"));
        listSug.add(new Food("همبرگر مخصوص سرآشپز", "https://i.pinimg.com/564x/ce/70/65/ce706553e3e6f4373f953148ed5e6826.jpg", "19000", "3.9", "15.9K"));
        listSug.add(new Food("سیب زمینی ژامبون", "https://i.pinimg.com/564x/00/cb/60/00cb609fc36e074603b078c7a9779dfa.jpg", "19000", "3.9", "15.9K"));
        listSug.add(new Food("اسپاگتی", "https://i.pinimg.com/564x/df/ce/70/dfce70f54386aba6c772a6cf88364f6b.jpg", "19000", "3.9", "15.9K"));
        adapter = new DetailSugFoodAdapter(this, listSug);
        recyclerViewSug.setAdapter(adapter);
    }

    private void init() {
        link_img = bundle.getString("link_img");
        name_food = bundle.getString("name");
        rate = bundle.getString("rating");
        cou = bundle.getString("count");
        pri = bundle.getString("price");


        name = findViewById(R.id.name);
        name_f = findViewById(R.id.name_food);
        img = findViewById(R.id.img);
        rating = findViewById(R.id.txt_rating);
        count = findViewById(R.id.count_rating);
        price = findViewById(R.id.price);

        Picasso.get().load(link_img).into(img);
        name.setText(name_food);
        name_f.setText(name_food);
        rating.setText(rate);
        count.setText("("+cou+")");
        price.setText("قیمت : "+ pri +" تومان");

    }
}