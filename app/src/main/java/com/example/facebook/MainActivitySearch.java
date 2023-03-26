package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivitySearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);
        final ImageView imageView;

        imageView = findViewById(R.id.imv2);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitySearch.this, MainActivityDetail.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right, R.anim.left);
    }
}