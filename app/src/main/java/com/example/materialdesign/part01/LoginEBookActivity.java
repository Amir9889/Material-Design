package com.example.materialdesign.part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.materialdesign.R;

public class LoginEBookActivity extends AppCompatActivity {

    private CardView cardRegister, cardLogin;
    private ImageView backToLogin;
    private Button btn_register, btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_login_e_book);

        cardLogin = findViewById(R.id.card_login);
        cardRegister = findViewById(R.id.card_register);
        backToLogin = findViewById(R.id.back_to_login);
        btn_register = findViewById(R.id.btn_register);
        btn_login = findViewById(R.id.btn_login);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardLogin.setVisibility(View.GONE);
                cardRegister.setVisibility(View.VISIBLE);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Home_EBook_Activity.class));
                finish();
            }
        });

        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardRegister.setVisibility(View.GONE);
                cardLogin.setVisibility(View.VISIBLE);
            }
        });


    }
}