package com.example.materialdesign.part04.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesign.R;
import com.example.materialdesign.part04.adapter.NewWallyAdapter;
import com.example.materialdesign.part04.model.Wally;

import java.util.ArrayList;
import java.util.List;

public class NewWallpaperFragment extends Fragment {

    public NewWallpaperFragment() {
        // Required empty public constructor
    }

    private View view;

    private RecyclerView recyclerView_new;
    private NewWallyAdapter newWallyAdapter;
    private List<Wally> listNew = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_new_wallpaper, container, false);

        recyclerView_new = view.findViewById(R.id.recyclerView_new);
        recyclerView_new.setHasFixedSize(true);
        recyclerView_new.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        listNew.add(new Wally("https://images.unsplash.com/photo-1541918602878-4e1ebfc7b739?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHw%3D&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1541837558-b336b96df4ef?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHw%3D&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1541848952518-f6c52dbc7c94?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8M3x8fGVufDB8fHw%3D&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1474540412665-1cdae210ae6b?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8N3x8fGVufDB8fHw%3D&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542303009139-53cd2f555dc7?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTF8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542291771-64f962701184?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTN8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542317148-8b4bdccb33ea?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTd8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542293787938-c9e299b880cc?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MTl8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542328689-df6c076c1604?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjJ8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542291026-7eec264c27ff?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjN8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1531826267553-c4979aefab12?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjR8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542227844-5e56c7c2687d?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mjh8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        listNew.add(new Wally("https://images.unsplash.com/photo-1542047415514-7d8dde4459f3?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MzR8fHxlbnwwfHx8&auto=format&fit=crop&w=500&q=60"));
        newWallyAdapter = new NewWallyAdapter(listNew, getContext());
        recyclerView_new.setAdapter(newWallyAdapter);

        return view;
    }
}