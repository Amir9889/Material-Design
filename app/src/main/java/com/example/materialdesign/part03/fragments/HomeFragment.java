package com.example.materialdesign.part03.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.materialdesign.R;
import com.example.materialdesign.part03.adapter.AlbumMusicAdapter;
import com.example.materialdesign.part03.adapter.HeaderMusicAdapter;
import com.example.materialdesign.part03.adapter.PlaylistMusicAdapter;
import com.example.materialdesign.part03.model.Music;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private View view;

    // Part Header Music
    private RecyclerView recyclerViewHeader;
    private List<Music> listHeader = new ArrayList<>();
    private HeaderMusicAdapter headerAdapter;

    // Part Album Music
    private RecyclerView recyclerViewAlbum;
    private List<Music> listAlbum = new ArrayList<>();
    private AlbumMusicAdapter albumAdapter;

    // Part PlayList Music
    private RecyclerView recyclerViewPlay;
    private List<Music> listPlay = new ArrayList<>();
    private PlaylistMusicAdapter playAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_home, container, false);

        partHeader();

        partAlbum();

        partPlayList();

        view.setRotationY(180);
        return view;
    }

    private void partPlayList() {
        recyclerViewPlay = view.findViewById(R.id.recyclerViewPlay);
        recyclerViewPlay.setHasFixedSize(true);
        recyclerViewPlay.setLayoutManager(new LinearLayoutManager(getContext()));

        listPlay.add(new Music("امین رستمی", "دستمریزاد", "02:27", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("افشین آذری", "دلبر", "02:54", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("عطا رادفر", "بی تویی", "03:17", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("امیر باغانی", "جانانم", "04:29", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("محمدرضا عشریه", "صد دل", "03:30", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("محسن ابراهیم زاده", "دونه دونه 2", "04:27", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("امیر تاجیک", "قهوه قجری", "04:17", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("شهاب مظفری", "یادت نره", "05:27", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("سیاوش نامبر", "خاطره", "02:48", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listPlay.add(new Music("رضا مریدی", "صدای دهل", "03:49", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        playAdapter = new PlaylistMusicAdapter(getContext(), listPlay);
        recyclerViewPlay.setAdapter(playAdapter);
    }

    private void partHeader(){
        recyclerViewHeader = view.findViewById(R.id.recyclerView_header_music);
        recyclerViewHeader.setHasFixedSize(true);
        recyclerViewHeader.setLayoutManager(new GridLayoutManager(getContext(), 2));
        listHeader.add(new Music("بعد تو", "https://dl.pop-music.ir/images/1399/Dey/Mohammad-Eghtedar-Bade-To.jpg"));
        listHeader.add(new Music("چه نگاری", "https://dl.pop-music.ir/images/1399/Dey/Dell-Band-Che-Negari.jpg"));
        listHeader.add(new Music("این روزا", "https://dl.pop-music.ir/images/1399/Dey/Pouria-Eskandari-In-Rooza.jpg"));
        listHeader.add(new Music("بهشت", "https://dl.pop-music.ir/images/1399/Dey/Shayan-Oveisi-Behesht.jpg"));
        headerAdapter = new HeaderMusicAdapter(getContext(), listHeader);
        recyclerViewHeader.setAdapter(headerAdapter);
    }

    private void partAlbum(){
        recyclerViewAlbum = view.findViewById(R.id.recyclerView_header_album);
        recyclerViewAlbum.setHasFixedSize(true);
        recyclerViewAlbum.setLayoutManager(new LinearLayoutManager(getContext()));
        listAlbum.add(new Music("https://dl.pop-music.ir/images/1399/Dey/Ehsan-Khoshnevis-Az-To-Mikhanam.jpg"));
        listAlbum.add(new Music("https://dl.pop-music.ir/images/1399/Dey/Sardar-Saye-ha.jpg"));
        albumAdapter = new AlbumMusicAdapter(getContext(), listAlbum);
        recyclerViewAlbum.setAdapter(albumAdapter);
    }
}