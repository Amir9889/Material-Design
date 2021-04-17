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
import com.example.materialdesign.part03.adapter.IntroArtistAdapter;
import com.example.materialdesign.part03.adapter.MusicVideoAdapter;
import com.example.materialdesign.part03.adapter.NewSongAdapter;
import com.example.materialdesign.part03.model.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicFragment extends Fragment {

    public MusicFragment() {
        // Required empty public constructor
    }

    private View view;

    // Part Intro Artist
    private RecyclerView recyclerView_intro_artist;
    private List<Music> listIntroArtist = new ArrayList<>();
    private IntroArtistAdapter introArtistAdapter;

    // Part New Songs
    private RecyclerView recyclerView_new_song;
    private List<Music> listNewSong = new ArrayList<>();
    private NewSongAdapter newSongAdapter;

    // Part Music Video
    private RecyclerView recyclerView_music_video;
    private List<Music> listMusicVideo = new ArrayList<>();
    private MusicVideoAdapter musicVideoAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_music, container, false);

        getIntroArtist();
        getNewSongs();
        getMusicVideos();

        view.setRotationY(180);
        return view;
    }

    private void getMusicVideos() {
        recyclerView_music_video = view.findViewById(R.id.recyclerView_music_video);
        recyclerView_music_video.setHasFixedSize(true);
        recyclerView_music_video.setLayoutManager(new GridLayoutManager(getContext(), 2));

        /*
        We should send Video Link by name_song variable, so notice that!!!!!!!!!
         */
        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4", "https://nex1music.ir/upload/2021-01-01/arash-soroush-javouni-2021-01-01-13-24-03.jpg"));
        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4", "https://nex1music.ir/upload/2021-01-01/dara-maho-gom-kardam-2021-01-01-12-02-28.jpg"));
        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4", "https://nex1music.ir/upload/2020-12-29/alireza-pourostad-az-yade-man-2020-12-29-19-59-43.jpg"));
        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4", "https://nex1music.ir/upload/2020-12-27/alireza-mani-ashegh-koshi-2020-12-27-20-31-24.jpg"));
        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4", "https://nex1music.ir/upload/2020-12-18/shahin-shadbakhsh-bare-jodaei-2020-12-18-15-45-25.jpg"));
        listMusicVideo.add(new Music("https://hw18.cdn.asset.aparat.com/aparat-video/e23e8afda18aac897f11bb5c7d09864024438801-480p.mp4", "https://nex1music.ir/upload/2020-12-16/abolfazl-dadashi-tou-deli-2020-12-16-21-41-08.jpg"));
        musicVideoAdapter = new MusicVideoAdapter(getContext(), listMusicVideo);
        recyclerView_music_video.setAdapter(musicVideoAdapter);
    }

    private void getNewSongs() {
        recyclerView_new_song = view.findViewById(R.id.recyclerView_new_song);
        recyclerView_new_song.setHasFixedSize(true);
        recyclerView_new_song.setLayoutManager(new GridLayoutManager(getContext(), 3));
        listNewSong.add(new Music("همایون شجریان", "سووشون", "https://next1.ir/wp-content/uploads/2021/01/HomayounShajarian-Souvashoun-480x480.jpg"));
        listNewSong.add(new Music("مهدی یراحی", "عکس شد", "https://next1.ir/wp-content/uploads/2021/01/MehdiYarrahi-AksShod-480x480.jpg"));
        listNewSong.add(new Music("شاهین بنان", "چال رو گونت", "https://next1.ir/wp-content/uploads/2020/12/ShahinBanan-Oghyanoos-480x480.jpg"));
        listNewSong.add(new Music("رضا شیری", "کی مثل من", "https://next1.ir/wp-content/uploads/2021/01/RezaShiri-KiMesleMan-480x480.jpg"));
        listNewSong.add(new Music("احسان ایکای", "وقتی رفتی", "https://next1.ir/wp-content/uploads/2021/01/HoseinHardAndEhsanEky-VaghtiRafti-480x480.jpg"));
        listNewSong.add(new Music("مرتضی باب", "بعد تو", "https://next1.ir/wp-content/uploads/2021/01/MortezaBab-BadeTo-480x480.jpg"));
        listNewSong.add(new Music("آرش سروش", "جوونی", "https://next1.ir/wp-content/uploads/2021/01/ArashSoroush-Javouni-480x480.jpg"));
        listNewSong.add(new Music("مهدی جهانی", "کجایی", "https://next1.ir/wp-content/uploads/2017/08/MehdiJahani-ComingSoon.jpg"));
        newSongAdapter = new NewSongAdapter(getContext(), listNewSong);
        recyclerView_new_song.setAdapter(newSongAdapter);
    }

    private void getIntroArtist() {
        recyclerView_intro_artist = view.findViewById(R.id.recyclerview_intro_artist);
        recyclerView_intro_artist.setHasFixedSize(true);
        recyclerView_intro_artist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        listIntroArtist.add(new Music("کوشا بیگلری", "سرگیجه", "https://dl.pop-music.ir/images/1399/Azar/Koosha-Biglari-Vertigo.jpg", "5.6", "12"));
        listIntroArtist.add(new Music("آرین یاری", "هرچی شد پای من", "https://dl.pop-music.ir/images/1399/Azar/Arian-Yari-Har-Chi-Shod-Paye-Man.jpg", "4.2", "7"));
        listIntroArtist.add(new Music("حسن صحرایی", "گل سرخ", "https://dl.pop-music.ir/images/1399/Aban/Hasan-Sahraei-Gole-Sorkh.jpg", "2.3", "11"));
        listIntroArtist.add(new Music("میلاد تقوی", "پرواز", "https://dl.pop-music.ir/images/1399/Aban/Milad-Taghavi-Parvaz.jpg", "12.7", "18"));
        listIntroArtist.add(new Music("امین رفیعی", "زخم", "https://dl.pop-music.ir/images/1399/Mehr/Amin-Rafiee-Zakhm.jpg", "4.6", "5"));
        introArtistAdapter = new IntroArtistAdapter(getContext(), listIntroArtist);
        recyclerView_intro_artist.setAdapter(introArtistAdapter);
    }
}