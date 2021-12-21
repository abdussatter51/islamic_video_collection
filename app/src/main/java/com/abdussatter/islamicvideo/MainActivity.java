package com.abdussatter.islamicvideo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Animation fadeIn, zoomIn;
    LinearLayout layoutAbdullahJahangir, layoutAhmadUllah, layoutKashem, layoutDubbing, layoutBanglaSong, layoutSaifullah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        layoutAbdullahJahangir = findViewById(R.id.layoutAbdullahJahangir);
        layoutAhmadUllah = findViewById(R.id.layoutAhmadUllah);
        layoutKashem = findViewById(R.id.layoutKashem);
        layoutDubbing = findViewById(R.id.layoutDubbing);
        layoutBanglaSong = findViewById(R.id.layoutBanglaSong);
        layoutSaifullah = findViewById(R.id.layoutSaifullah);


        layoutAbdullahJahangir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, AbdullahJahangirActivity.class);
                startActivity(videoPlaylistIntent);
                /*Intent myIntent = new Intent(MainActivity.this, AbdullahJahangirActivity.class);
                ActivityOptions options =
                        ActivityOptions.makeCustomAnimation(MainActivity.this, R.anim.zoom_in, R.anim.zoom_in);
                MainActivity.this.startActivity(myIntent, options.toBundle());*/
            }
        });
        layoutAhmadUllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, ShaikhAhmadullahActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
        layoutKashem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, MahmudKashemActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
        layoutDubbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, DubbingLectureActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
        layoutBanglaSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, BanglaSongActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
        layoutSaifullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, SaifullahLectureAcitvity.class);
                startActivity(videoPlaylistIntent);
            }
        });
    }
}