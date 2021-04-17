package com.example.materialdesign.part01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.materialdesign.R;
import com.example.materialdesign.part01.adapter.ForYouEBookAdapter;
import com.example.materialdesign.part01.model.Book;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailsEBookActivity extends AppCompatActivity {

    Bundle bundle;
    TextView title, name_book, name_author, txt_price;
    ImageView link_img;
    Button btn_buy;
    ForYouEBookAdapter adapter;
    List<Book> listBookForYou = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_details_e_book);

        bundle = getIntent().getExtras();

        title = findViewById(R.id.title);
        name_book = findViewById(R.id.name_book);
        name_author = findViewById(R.id.name_author);
        link_img = findViewById(R.id.imgNew);
        btn_buy = findViewById(R.id.btn_buy);
        txt_price = findViewById(R.id.price);

        String price = "35000";
        SpannableString spannableString = new SpannableString(price);
        spannableString.setSpan(new StrikethroughSpan(), 0, txt_price.getText().length(), SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt_price.setText(spannableString);

        title.setText(bundle.getString("NAME"));
        name_book.setText(bundle.getString("NAME"));
        name_author.setText(bundle.getString("AUTHOR"));
        Picasso.get().load(bundle.getString("IMG")).into(link_img);

        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(DetailsEBookActivity.this, R.style.BottomSheet_EBook_Original);
                View layout_bottom_sheet = LayoutInflater.from(getApplicationContext()).inflate(R.layout.layout_bottom_sheet_ebook,
                        findViewById(R.id.parent_bottom_sheet));
                TextView txt_name = layout_bottom_sheet.findViewById(R.id.txt_name_book);
                TextView txt_author = layout_bottom_sheet.findViewById(R.id.txt_name_author);
                ImageView img_bottom = layout_bottom_sheet.findViewById(R.id.img_bottom_sheet);

                txt_name.setText(bundle.getString("NAME"));
                txt_author.setText(bundle.getString("AUTHOR"));
                Picasso.get().load(bundle.getString("IMG")).into(img_bottom);

                RecyclerView recyclerView_foYou = layout_bottom_sheet.findViewById(R.id.recyclerView_bottom_sheet);
                recyclerView_foYou.setHasFixedSize(true);
                recyclerView_foYou.setLayoutManager(new LinearLayoutManager(DetailsEBookActivity.this,
                        LinearLayoutManager.HORIZONTAL, false));

                listBookForYou.add(new Book("روش شناسی دانش اجتماعی مسلمین","یحیی بوذری نژاد","https://cdn.fidibo.com/images/books/107133_88243_normal.jpg"));
                listBookForYou.add(new Book("تاريخ سری جنايت های استالين", "الكساندر آرلوف", "https://cdn.fidibo.com/images/books/4013_97814_normal.jpg"));
                listBookForYou.add(new Book("غرب چگونه غرب شد؟", "صادق زیباکلام", "https://cdn.fidibo.com/images/books/62897_35660_normal.jpg"));
                listBookForYou.add(new Book("غروب بت ها", "فردریش نیچه","https://cdn.fidibo.com/images/books/4626_71456_normal.jpg"));

                adapter = new ForYouEBookAdapter(getApplicationContext(), listBookForYou);

                recyclerView_foYou.setAdapter(adapter);

                bottomSheetDialog.setContentView(layout_bottom_sheet);
                bottomSheetDialog.show();
            }
        });
    }
}