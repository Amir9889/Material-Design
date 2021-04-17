package com.example.materialdesign.part03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.materialdesign.R;


public class LoginMusicActivity extends AppCompatActivity {

    private ImageButton img_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_login_music);

        img_go = findViewById(R.id.img_go);
        img_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginMusicActivity.this, HomeMusicActivity.class));
            }
        });
    }
}