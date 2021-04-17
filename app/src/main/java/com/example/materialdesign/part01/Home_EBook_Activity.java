package com.example.materialdesign.part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.materialdesign.R;
import com.example.materialdesign.part01.adapter.NewEBookAdapter;
import com.example.materialdesign.part01.adapter.PopularEBookAdapter;
import com.example.materialdesign.part01.adapter.VoiceEBookAdapter;
import com.example.materialdesign.part01.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Home_EBook_Activity extends AppCompatActivity {

    List<Book> listBooks_voice = new ArrayList<>();
    List<Book> listBooks_popular = new ArrayList<>();
    List<Book> listBooks_new = new ArrayList<>();

    // Part "new"
    private RecyclerView recyclerView_new;
    NewEBookAdapter newEBookAdapter;

    // Part "popular"
    private RecyclerView recyclerView_popular;
    PopularEBookAdapter popularEBookAdapter;

    // Part "voice"
    private RecyclerView recyclerView_voice;
    VoiceEBookAdapter voiceEBookAdapter;

    DrawerLayout drawerLayout;
    ImageView img_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home__e_book_);

        img_menu = findViewById(R.id.img_menu);

        recyclerView_voice = findViewById(R.id.recyclerView_voice);
        recyclerView_voice.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView_voice.setHasFixedSize(true);
        listBooks_voice.add(new Book("https://cdn.fidibo.com/images/custom/9995.jpg"));
        listBooks_voice.add(new Book("https://cdn.fidibo.com/images/custom/9996.jpg"));
        listBooks_voice.add(new Book("https://cdn.fidibo.com/images/custom/joz9.jpg"));
        voiceEBookAdapter = new VoiceEBookAdapter(getApplicationContext(), listBooks_voice);
        recyclerView_voice.setAdapter(voiceEBookAdapter);



        recyclerView_popular = findViewById(R.id.recyclerView_popular);
        recyclerView_popular.setHasFixedSize(true);
        recyclerView_popular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        listBooks_popular.add(new Book("روش شناسی دانش اجتماعی مسلمین","یحیی بوذری نژاد","https://cdn.fidibo.com/images/books/107133_88243_normal.jpg"));
        listBooks_popular.add(new Book("تاريخ سری جنايت های استالين", "الكساندر آرلوف", "https://cdn.fidibo.com/images/books/4013_97814_normal.jpg"));
        listBooks_popular.add(new Book("غرب چگونه غرب شد؟", "صادق زیباکلام", "https://cdn.fidibo.com/images/books/62897_35660_normal.jpg"));
        listBooks_popular.add(new Book("غروب بت ها", "فردریش نیچه","https://cdn.fidibo.com/images/books/4626_71456_normal.jpg"));
        popularEBookAdapter = new PopularEBookAdapter(this, listBooks_popular);
        recyclerView_popular.setAdapter(popularEBookAdapter);



        recyclerView_new = findViewById(R.id.recyclerView_new);
        recyclerView_new.setHasFixedSize(true);
        recyclerView_new.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        listBooks_new.add(new Book("مردی به نام اوه", "فردریک بهمن", "https://cdn.fidibo.com/images/books/64664_53966_normal.jpg"));
        listBooks_new.add(new Book("هنر شفاف اندیشیدن", "رولف دوبلی", "https://cdn.fidibo.com/images/books/100126_77640_normal.jpg"));
        listBooks_new.add(new Book("جنایات و مکافات", "فئودور داستایفسکی", "https://cdn.fidibo.com/images/books/971_10742_normal.jpg"));
        listBooks_new.add(new Book("نیمه تاریک وجود و توان", "دبی فورد", "https://cdn.fidibo.com/images/books/92858_65925_normal.jpg"));
        listBooks_new.add(new Book("تاملات", "مارکوس اورلیوس", "https://cdn.fidibo.com/images/books/65615_27568_normal.jpg"));
        listBooks_new.add(new Book("چرا عاشق می شویم؟", "هلن فیشر", "https://cdn.fidibo.com/images/books/66853_20700_normal.jpg"));
        listBooks_new.add(new Book("مرگ و باکره", "آریل دوفرمان", "https://cdn.fidibo.com/images/books/3954_77667_normal.jpg"));
        listBooks_new.add(new Book("اتاق ورونیکا", "آریا لوین", "https://cdn.fidibo.com/images/books/3785_39198_normal.jpg"));
        newEBookAdapter = new NewEBookAdapter(this, listBooks_new);
        recyclerView_new.setAdapter(newEBookAdapter);


        drawerLayout = findViewById(R.id.drawerLayout);

        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }
}