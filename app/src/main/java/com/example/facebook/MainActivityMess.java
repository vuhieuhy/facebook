package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivityMess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mess);

        final ScrollView scrollView;
        scrollView = findViewById(R.id.scvmess);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
        final ImageView imageView;
        imageView = findViewById(R.id.down);
        /**scrollView.setOnTouchListener(new Translate(this,imageView ));**/

    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right, R.anim.left);
    }
}