package com.abdussatter.islamicvideo;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    Animation fadeIn, zoomIn;
    FloatingActionButton fabButton;
    LinearLayout layoutAbdullahJahangir, layoutAhmadUllah, layoutKashem, layoutDubbing, layoutBanglaSong, layoutSaifullah, layoutIslamicMovie, layoutIslamicCarton, layoutQuranTelawat, layoutMizanurRahman, layoutMujaffarBinMohsin, layoutQuranTelawatBangla, layoutIslamicCartonEnglish, layoutEnglishSong, layoutArabicSong, layoutUrduSong, layoutProfetStroy, layoutProfetStroyCarton, layoutAbuTaha, layoutMokhteAhmad, layoutLearningQuranWithJamal,layoutLearningQuranTelawatWithJamal;

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
        layoutMizanurRahman = findViewById(R.id.layoutMizanurRahman);
        layoutMujaffarBinMohsin = findViewById(R.id.layoutMujaffarBinMohsin);
        layoutQuranTelawatBangla = findViewById(R.id.layoutQuranTelawatBangla);
        layoutIslamicCartonEnglish = findViewById(R.id.layoutIslamicCartonEnglish);
        layoutEnglishSong = findViewById(R.id.layoutEnglishSong);
        layoutArabicSong = findViewById(R.id.layoutArabicSong);
        layoutUrduSong = findViewById(R.id.layoutUrduSong);
        layoutProfetStroy = findViewById(R.id.layoutProfetStroy);
        layoutProfetStroyCarton = findViewById(R.id.layoutProfetStroyCarton);
        layoutAbuTaha = findViewById(R.id.layoutAbuTaha);
        layoutMokhteAhmad = findViewById(R.id.layoutMokhteAhmad);
        layoutLearningQuranWithJamal = findViewById(R.id.layoutLearningQuranWithJamal);
        layoutLearningQuranTelawatWithJamal = findViewById(R.id.layoutLearningQuranTelawatWithJamal);

        //Fab Button onClick
 /*       fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check "+getString(R.string.app_name)+" app ♥ It's awesome! \n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });*/



        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
            }
        });



        layoutAbdullahJahangir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, AbdullahJahangirActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutAhmadUllah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, ShaikhAhmadullahActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutKashem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, MahmudKashemActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutDubbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, DubbingLectureActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutBanglaSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, BanglaSongActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutSaifullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, SaifullahLectureAcitvity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutIslamicMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, IslamiMovieActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutIslamicCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, IslamiCartonActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutQuranTelawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, QuranTelawatActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutMizanurRahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, MizanurRahmanActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutMujaffarBinMohsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, MujaffarBinMohsinActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutQuranTelawatBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, QuranTelawatBanglaActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutEnglishSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, EnglishSongActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutArabicSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, ArabicSongActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutUrduSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, UrduSongActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutIslamicCartonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, IslamiEnglishCartonActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutProfetStroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, ProphetStoryActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutProfetStroyCarton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, ProphetStoryCartonActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutAbuTaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, AbuTahaActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutMokhteAhmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, MokhterAhmadActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutLearningQuranWithJamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, LearningQuranWithJamalActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });
        layoutLearningQuranTelawatWithJamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo!=null && networkInfo.isConnected()){
                    Intent videoPlaylistIntent = new Intent(MainActivity.this, LearningQuranTelawatWithJamalActivity.class);
                    startActivity(videoPlaylistIntent);
                }else {
                    alertDialog();
                }
            }
        });




    }

    private void alertDialog() {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("No Internet!")
                .setMessage("Please turn on mobile data or wifi network.")
                .show();
                textToSpeech.speak("No Internet, Please turn on mobile data or wifi network.", TextToSpeech.QUEUE_FLUSH, null, null);
    }



    //Back Button Press=============================================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click Back Button Press button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else {

            Toast.makeText(getBaseContext(), "Press once again to exit!",
                    Toast.LENGTH_SHORT).show();
        }

        mBackPressed = System.currentTimeMillis();
    }
    //End Back Button Press=========================================================================
}