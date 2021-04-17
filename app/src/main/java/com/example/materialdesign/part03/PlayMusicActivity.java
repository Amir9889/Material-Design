package com.example.materialdesign.part03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.materialdesign.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class PlayMusicActivity extends AppCompatActivity {

    private Bundle bundle;
    private String name, name_song, time, link_img;
    private CircleImageView img;
    private TextView txt_name_song, txt_song, txt_time;
    private ImageView img_download;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_play_music);

        bundle = getIntent().getExtras();

        dialog = new Dialog(PlayMusicActivity.this);

        name = bundle.getString("name");
        name_song = bundle.getString("name_song");
        time = bundle.getString("time");
        link_img = bundle.getString("link_img");
        txt_time = findViewById(R.id.txt_time);

        img = findViewById(R.id.img);
        img_download = findViewById(R.id.img_download);
        txt_name_song = findViewById(R.id.name_song);
        txt_song = findViewById(R.id.name);

        Picasso.get().load(link_img).into(img);
        txt_song.setText(name);
        txt_name_song.setText(name_song);

        txt_time.setText(time);

        img_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.layout_download_music);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
    }
}