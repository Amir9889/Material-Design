package com.example.materialdesign.part04.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesign.R;
import com.example.materialdesign.part04.adapter.CategoryWallyAdapter;
import com.example.materialdesign.part04.model.Wally;

import java.util.ArrayList;
import java.util.List;

public class CategoryWallpaperFragment extends Fragment {

    public CategoryWallpaperFragment() {

    }

    private View view;

    // Part Category
    private RecyclerView recyclerView_category;
    private List<Wally> listCategory = new ArrayList<>();
    private CategoryWallyAdapter categoryWallyAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_category_wallpaper, container, false);

        getCategory();

        return view;
    }

    private void getCategory() {
        recyclerView_category = view.findViewById(R.id.recyclerView_category);
        recyclerView_category.setHasFixedSize(true);
        recyclerView_category.setLayoutManager(new GridLayoutManager(getContext(), 2));
        listCategory.add(new Wally("انیمیشن" , "https://purepng.com/public/uploads/medium/two-anime-boys-grk.png"));
        listCategory.add(new Wally("فیلم" , "https://purepng.com/public/uploads/medium/purepng.com-avengers-captain-americacaptain-americacaptainamericafictional-charactercomic-booksmarvel-comicsupersoldierthe-warcostumesteve-rogers-1701528528398liruf.png"));
        listCategory.add(new Wally("بازیگران" , "https://purepng.com/public/uploads/medium/purepng.com-marilyn-monroemarilyn-monroemarilynmonroeactressmodeldumb-blondesex-symbols-1701528022725co1zd.png"));
        listCategory.add(new Wally("حیوانات" , "https://purepng.com/public/uploads/medium/31506531481rpaguosublhjrbptkaud4eyhjixtiecogagwjk8l76fik6olxl47eqysezyfoijmid5emldabx6aul3arymweksuq2awuqjbe01a.png"));
        listCategory.add(new Wally("ماشین" , "https://purepng.com/public/uploads/medium/mercedes-car-eqc-300kw-edition-xk3.png"));
        listCategory.add(new Wally("بازی" , "https://purepng.com/public/uploads/medium/call-of-duty-black-ops-4-cover-image-744.png"));
        categoryWallyAdapter = new CategoryWallyAdapter(listCategory, getContext());
        recyclerView_category.setAdapter(categoryWallyAdapter);

    }
}