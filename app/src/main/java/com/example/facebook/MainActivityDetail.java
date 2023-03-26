package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detail);
        final ImageView imageView10;
        final ImageView imageView12;

        imageView12 = findViewById(R.id.image3);

        imageView10 = findViewById(R.id.imv10);

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityDetail.this, MainActivityDetail1.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);

            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityDetail.this, MainActivityMess.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);

            }
        });
    }
}