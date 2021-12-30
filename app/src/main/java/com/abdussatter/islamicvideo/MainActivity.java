package com.abdussatter.islamicvideo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Animation fadeIn, zoomIn;
    FloatingActionButton fabButton;
    LinearLayout layoutAbdullahJahangir, layoutAhmadUllah, layoutKashem, layoutDubbing, layoutBanglaSong, layoutSaifullah, layoutIslamicMovie, layoutIslamicCarton, layoutQuranTelawat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabButton = findViewById(R.id.fabButton);
        fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        layoutAbdullahJahangir = findViewById(R.id.layoutAbdullahJahangir);
        layoutAhmadUllah = findViewById(R.id.layoutAhmadUllah);
        layoutKashem = findViewById(R.id.layoutKashem);
        layoutDubbing = findViewById(R.id.layoutDubbing);
        layoutBanglaSong = findViewById(R.id.layoutBanglaSong);
        layoutSaifullah = findViewById(R.id.layoutSaifullah);
        layoutIslamicMovie = findViewById(R.id.layoutIslamicMovie);
        layoutIslamicCarton = findViewById(R.id.layoutIslamicCarton);
        layoutQuranTelawat = findViewById(R.id.layoutQuranTelawat);

        //Fab Button onClick
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check "+getString(R.string.app_name)+" app ♥ It's awesome! \n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });


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
        layoutIslamicMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, IslamiMovieActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
        layoutIslamicCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, IslamiCartonActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
        layoutQuranTelawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoPlaylistIntent = new Intent(MainActivity.this, QuranTelawatActivity.class);
                startActivity(videoPlaylistIntent);
            }
        });
    }
}