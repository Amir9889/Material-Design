package com.example.materialdesign.part02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;

import com.example.materialdesign.R;
import com.example.materialdesign.part02.adapter.CategoryFoodAdapter;
import com.example.materialdesign.part02.adapter.ForYouFoodAdapter;
import com.example.materialdesign.part02.adapter.NewFoodAdapter;
import com.example.materialdesign.part02.adapter.SliderAdapter;
import com.example.materialdesign.part02.adapter.TypeFoodAdapter;
import com.example.materialdesign.part02.model.Food;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivityFood extends AppCompatActivity {

    Context context;

    // Category Part ==>
    private RecyclerView recyclerViewCategory;
    private List<Food> listCategory = new ArrayList<>();
    private CategoryFoodAdapter categoryFoodAdapter;

    // Type Part ==>
    private RecyclerView recyclerViewType;
    private List<Food> listType = new ArrayList<>();
    private TypeFoodAdapter typeFoodAdapter;

    // For you Part ==>
    private RecyclerView recyclerViewForYou;
    private List<Food> listForYou = new ArrayList<>();
    private ForYouFoodAdapter forYouFoodAdapter;


    // New Part ==>
    private RecyclerView recyclerViewNew;
    private List<Food> listNew = new ArrayList<>();
    private NewFoodAdapter newFoodAdapter;

    //Slider
    private ViewPager viewPager;
    private List<Food> listSlider = new ArrayList<>();
    private SliderAdapter sliderAdapter;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home_food);
        context = this;

        categoryPart();

        typePart();

        forYouPart();

        newPart();

        sliderPart();
    }

    private void sliderPart() {
        viewPager = findViewById(R.id.viewPager);
        tabs = findViewById(R.id.tabLayout);
        listSlider.add(new Food("پیتزا مرغ پستو", "https://i.pinimg.com/564x/38/79/2b/38792b35a5f9774520dce2611838fa08.jpg", "2000", "4.5", "14.8K", getString(R.string.bishori_txt)));
        listSlider.add(new Food("پاستا ایتالیایی", "https://i.pinimg.com/564x/b7/ca/20/b7ca2094c3c0ef0cce6782db6b601260.jpg", "2000", "4.5", "14.8K", getString(R.string.bishori_txt)));
        listSlider.add(new Food("برگر", "https://i.pinimg.com/564x/72/9d/1a/729d1a99d682ab35d8ff450967e721da.jpg", "2000", "4.5", "14.8K", getString(R.string.bishori_txt)));
        listSlider.add(new Food("موهیتو کلاسیک", "https://i.pinimg.com/564x/ea/8e/d3/ea8ed345afbaabbcb802fd48e5ba8959.jpg", "2000", "4.5", "14.8K", getString(R.string.bishori_txt)));
        sliderAdapter = new SliderAdapter(context, listSlider);
        viewPager.setRotationY(180);
        viewPager.setAdapter(sliderAdapter);
        tabs.setupWithViewPager(viewPager);

        /*
        Below code is for when onCreate() restarted , ViewPager don't add the similar data to TabsLayout!!!
         */
        sliderAdapter.notifyDataSetChanged();
    }

    private void newPart() {
        recyclerViewNew = findViewById(R.id.recyclerView_food_new);
        recyclerViewNew.setHasFixedSize(true);
        recyclerViewNew.setLayoutManager(new GridLayoutManager(context, 2));
        listNew.add(new Food("چلوکباب کوبیده", "https://i.pinimg.com/564x/52/ef/c4/52efc40e1ff55f7683360a83e987399f.jpg", "23,500", "4.9", "10.9K"));
        listNew.add(new Food("استیک مخصوص", "https://i.pinimg.com/564x/0b/1b/cf/0b1bcf1c1ae3a2788975c49b6f02f8ad.jpg", "37,000", "4.4", "14.9K"));
        listNew.add(new Food("Panini Sandwich", "https://i.pinimg.com/564x/26/95/13/269513aab644fe11f381db0a164d688f.jpg", "48,000", "4.8", "24.5K"));
        listNew.add(new Food("پیتزا سبزیجات", "https://i.pinimg.com/564x/e4/67/56/e4675674d0ac0facd832994c1364a49a.jpg", "48,500", "4.1", "5.6K"));
        listNew.add(new Food("همبرگر مخصوص سرآشپز", "https://i.pinimg.com/564x/ce/70/65/ce706553e3e6f4373f953148ed5e6826.jpg", "19,000", "3.9", "15.9K"));
        listNew.add(new Food("سیب زمینی ژامبون", "https://i.pinimg.com/564x/00/cb/60/00cb609fc36e074603b078c7a9779dfa.jpg", "19,000", "3.9", "15.9K"));
        listNew.add(new Food("اسپاگتی", "https://i.pinimg.com/564x/df/ce/70/dfce70f54386aba6c772a6cf88364f6b.jpg", "19,000", "3.9", "15.9K"));
        newFoodAdapter = new NewFoodAdapter(context, listNew);
        recyclerViewNew.setAdapter(newFoodAdapter);
    }

    private void forYouPart() {
        recyclerViewForYou = findViewById(R.id.recyclerView_food_for_you);
        recyclerViewForYou.setHasFixedSize(true);
        recyclerViewForYou.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        listForYou.add(new Food("ساندویچ گوشت", "https://i.pinimg.com/564x/ef/83/3a/ef833ac3eb0415351bdd091b9218ebf6.jpg", "23,500", "4.9", "10.9K"));
        listForYou.add(new Food("پیتزا مخلوط", "https://i.pinimg.com/236x/18/e7/13/18e71382dacf59a9ceee72837972d504.jpg", "37,000", "4.4", "14.9K"));
        listForYou.add(new Food("پیتزا پپرونی", "https://i.pinimg.com/564x/6a/88/32/6a8832d29a911b320f9c68af86f8e134.jpg", "48,000", "4.8", "24.5K"));
        listForYou.add(new Food("پاستا آلفردو", "https://i.pinimg.com/564x/3e/6b/fb/3e6bfb5a4df8a9bb83db4a7d9e30f505.jpg", "48,500", "4.1", "5.6K"));
        listForYou.add(new Food("بندری با قارچ", "https://i.pinimg.com/564x/20/8e/ad/208ead96e5f618daf3c8b85706831f0d.jpg", "19,000", "3.9", "15.9K"));
        forYouFoodAdapter = new ForYouFoodAdapter(context, listForYou);
        recyclerViewForYou.setAdapter(forYouFoodAdapter);
    }

    private void categoryPart() {
        recyclerViewCategory = findViewById(R.id.recyclerView_Categori);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        recyclerViewCategory.setHasFixedSize(true);
        listCategory.add(new Food("پیتزا"));
        listCategory.add(new Food("برگر"));
        listCategory.add(new Food("سالاد"));
        listCategory.add(new Food("نوشیدنی"));
        listCategory.add(new Food("ویژه"));
        listCategory.add(new Food("کیک"));
        listCategory.add(new Food("دسر"));
        listCategory.add(new Food("ایرانی"));
        categoryFoodAdapter = new CategoryFoodAdapter(context, listCategory);
        recyclerViewCategory.setAdapter(categoryFoodAdapter);
    }

    private void typePart() {
        recyclerViewType = findViewById(R.id.recyclerView_type);
        recyclerViewType.setHasFixedSize(true);
        recyclerViewType.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        listType.add(new Food("ایرانی", "https://i.pinimg.com/564x/16/18/0f/16180f9bbf046745135b88ceb103d1fa.jpg"));
        listType.add(new Food("ایتالیایی", "https://i.pinimg.com/564x/45/e8/3d/45e83d2707a9458d5f0c6aee46d130d5.jpg"));
        listType.add(new Food("اسپانیایی", "https://i.pinimg.com/564x/8c/e9/11/8ce9116f8b2d15332bac91296b6ce0df.jpg"));
        listType.add(new Food("آمریکایی", "https://i.pinimg.com/564x/d8/21/92/d82192297c1d52d574035ab09589e807.jpg"));
        listType.add(new Food("تایلندی", "https://i.pinimg.com/564x/40/2e/a3/402ea3d39c978b3c92a838dfbfab1fc4.jpg"));
        listType.add(new Food("مکزیکی", "https://i.pinimg.com/564x/60/bb/c0/60bbc00b94f975167dced7d5dbd3fa7d.jpg"));
        listType.add(new Food("فرانسوی", "https://i.pinimg.com/564x/a3/e7/60/a3e760f99e8387619de6fc6b9a305eb1.jpg"));
        listType.add(new Food("مصری", "https://i.pinimg.com/564x/be/42/10/be4210a990dbfb75744bad420e83f27f.jpg"));
        typeFoodAdapter = new TypeFoodAdapter(context, listType);
        recyclerViewType.setAdapter(typeFoodAdapter);
    }
}