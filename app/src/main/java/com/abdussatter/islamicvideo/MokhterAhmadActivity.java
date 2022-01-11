package com.abdussatter.islamicvideo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

public class MokhterAhmadActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

        /*
    >>Source Code provided by
    >>Jubayer Hossain [https://www.facebook.com/JubayerHossainbd]
    >>Please don't forget to put a review on my site [www.bongoacademy.com]
    >>Share my course with your friends on Facebook
    >>Your positive words help me doing even better
     */

    //====================================================================
    private void addVideos(){
        // We will add all videos here

        //Video Details Here Here


        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "F51nclvGL0Y");
        hashMap.put("vdo_title", "কিভাবে তওবা করলে আল্লাহ সকল গুনাহ মাফ করে দেবেন ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vBbBYG6K6Yw");
        hashMap.put("vdo_title", "সমাজে প্রচলিত বিবাহ পদ্ধতি কতটুকু শরীয়াহ সম্মত ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WaPUGE0mlSI");
        hashMap.put("vdo_title", "কোন মুসলিম কী ধর্ম নিরপক্ষতা ও জাতীয়তাবাদ সমর্থণ করতে পারে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xRk9o3qBO6k");
        hashMap.put("vdo_title", "ইসলামে কী রাজতন্ত্র হারাম ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qIAdtkhf1yg");
        hashMap.put("vdo_title", "আমাদেরকে কুরআনের কাছেই ফিরে যেতে হবে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hQ1YziCuG4o");
        hashMap.put("vdo_title", "খুৎবা কী বাংলায় না আরবিতে হবে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "skHTtkfASbk");
        hashMap.put("vdo_title", "কোরআনের মুজিজা ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vmGf1oVWGnc");
        hashMap.put("vdo_title", "যুবক, তোমার কি লজ্জা হয় না ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "J67xKhJNPuA");
        hashMap.put("vdo_title", "জুমুআর খুতবাহ | শয়তানকে পরাজিত করুন ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "m71f9i7cqL8");
        hashMap.put("vdo_title", "যুব সমাজের অবক্ষয় ও উত্তরণের উপায় ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KHXUJUABD3M");
        hashMap.put("vdo_title", "শাসকদের প্রতি নসিহত ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "76go8D_B96I");
        hashMap.put("vdo_title", "পরিবার গঠনে রাসূল (সাঃ) এর ভুমিকা ও আমদের শিক্ষা ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nkFNbdKV_dc");
        hashMap.put("vdo_title", "আপনি কি সত্যিকারের পুরুষ? জুমুআর খুতবাহ ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UxQ48M8ICn8");
        hashMap.put("vdo_title", "আপনার জীবনের লক্ষ্য উদ্দেশ্য কি হবে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "w06EZ00An64");
        hashMap.put("vdo_title", "আপনার দ্বীনদারিত্ব যেন আপনাকে অহংকারী না বানায় ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Cd4f9OMZpOA");
        hashMap.put("vdo_title", "কেমন ছিলেন রাসূল (সাঃ) | সীরাহ কনফারেন্স ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Pc4psi8bQkU");
        hashMap.put("vdo_title", "আল্লাহর ভয় | Jumar Khudbah ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cwDZHTC0VtI");
        hashMap.put("vdo_title", "কুমিল্লায় আলোচনা করলেন ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gEaYVdbskDQ");
        hashMap.put("vdo_title", "জুমুআর খুৎবাহ | বারাকাহ ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iEWtMJGZ0zI");
        hashMap.put("vdo_title", "মুসলিম উম্মাহর সমস্যা ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "omq9qHdmpKI");
        hashMap.put("vdo_title", "আল্লাহর প্রতি কৃতজ্ঞতা ও তার অনুভূতি ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lqFRQqfd1Zo");
        hashMap.put("vdo_title", "আকিদার পাশাপাশি আখলাকেও সুন্দর করতে হবে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NJ1igmHJd4Y");
        hashMap.put("vdo_title", "উদ্বোধনী অনুষ্ঠান কোরআনের ভাষা ভাষাতাত্ত্বিক মোজেজা ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WhgSfeTyETM");
        hashMap.put("vdo_title", "কৃষিতে উদ্ভাবন; ইসলাম কি বলে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wD2YZyH9GuM");
        hashMap.put("vdo_title", "প্রত্যেক নারীর এই বক্তব্যটি শুনা উচিৎ ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "i5W2L-ZclFM");
        hashMap.put("vdo_title", "সূরা ফাতিহার বিস্ময়কর সাদৃশ্য ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xznwa-CMDBc");
        hashMap.put("vdo_title", "আপনার দ্বীনিদারি পরিমাপের যন্ত্রের নাম কি জানেন? একটু মেপে নিন তো ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mOHCUm83ckw");
        hashMap.put("vdo_title", "রাসূলুল্লাহ সা এর রাষ্ট্রনীতি ও দাওয়াহ কৌশল ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jRJDaowr4-A");
        hashMap.put("vdo_title", "সাম্প্রদায়িক সম্প্রীতির ব্যাপারে রাসূল (সাঃ) এর মনোভাব ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ouIeYJFAxj0");
        hashMap.put("vdo_title", "আপনার সন্তানকে দ্বীনের শিক্ষা দিন ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lo4jhX-Ka9w");
        hashMap.put("vdo_title", "জান্নাত নিয়ে সেরা বক্তব্য প্রফেসর মোখতার আহমাদ ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KOdlq3nRhCU");
        hashMap.put("vdo_title", "সম্পূর্ণ জুমু’য়ার খুৎবাহ আল্লাহ ভীতি ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eysf8fQB5mk");
        hashMap.put("vdo_title", "কিভাবে আপনার সন্তানদের আলেম/আলেমা বানাবেন?");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iSJOFRhqe1I");
        hashMap.put("vdo_title", "আল্লাহর ভালোবাসা পেতে চান?");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cSIt4wPXs_8");
        hashMap.put("vdo_title", "গুরুত্বপূর্ণ প্রশ্নোত্তর | না শুনলে উত্তরগুলো অজানাই থেকে যাবে ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vdyEzXkG_C4");
        hashMap.put("vdo_title", "সূরা ইউসুফ থেকে যুবকদের জন্য শিক্ষা ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "A4iz-edPm30");
        hashMap.put("vdo_title", "সুন্নতে মোড়া জীবন ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "v4YxDVOrVzQ");
        hashMap.put("vdo_title", "কুরআন নিয়ে অসাধারণ কিছু কথা ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "a9w5VPabwvU");
        hashMap.put("vdo_title", "সমসাময়িক বিশ্বে একজন প্রকৃত মুসলিমের প্রতিবিম্ব কেমন হওয়া উচিৎ ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jf9viKiCjII");
        hashMap.put("vdo_title", "সুন্নাত পদ্ধতিতে বিয়ে পড়াচ্ছেন শায়খ প্রফেসর মোখতার আহমাদ ।");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_6F9QTTW6tc");
        hashMap.put("vdo_title", "কিভাবে সন্তানদের মাঝে আত্মসম্মানবোধ তৈরি করবেন?");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LoDu_wps9TU");
        hashMap.put("vdo_title", "সূরা কাহফ: গুহাবাসী, আধুনিক গর্তময় জীবন ও দাজ্জাল ভাবনা");
        hashMap.put("vdo_desciption", "বক্তা: অধ্যাপক মোখতার আহমাদ");
        arrayList.add(hashMap);




    }

    //=======================================================
    //====================================================================
    //====================================================================

    TextView tvDate;
    LinearLayout layoutContainer;
    FloatingActionButton fabButton;
    RelativeLayout _rootLay;
    InterstitialAd mInterstitialAd;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer myYoutubePlayer;
    MyPlaybackEventListener myPlaybackEventListener;
    LinearLayout layPlayer;
    ImageView imngClosePlayer, imgPlayPause, imgPrevious, imgNext;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    int PLAYING_NOW = 0;
    boolean playingVideo = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mokhter_ahmad);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        //tvDate = findViewById(R.id.tvDate);
        layoutContainer = findViewById(R.id.layoutContainer);
        fabButton = findViewById(R.id.fabButton);
        _rootLay = findViewById(R.id._rootLay);
        youTubePlayerView = findViewById(R.id.youTubePlayerView);
        layPlayer = findViewById(R.id.layPlayer);
        imngClosePlayer = findViewById(R.id.imngClosePlayer);
        imgPlayPause = findViewById(R.id.imgPlayPause);
        imgNext = findViewById(R.id.imgNext);
        imgPrevious = findViewById(R.id.imgPrevious);

        // Load Admob Ads
        loadFullscreenAd();


        //init Youtube Player View
        youTubePlayerView.initialize("ABCD", MokhterAhmadActivity.this);
        myPlaybackEventListener = new MyPlaybackEventListener();


        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        //tvDate.setText(s_date);


        //Calling addVideos method by which we will make a video list
        addVideos();
        makeListView();






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

        imngClosePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closePlayer();
                fabButton.setVisibility(View.GONE);
                playingVideo = false;



            }
        });

        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v!=null && v.getTag()!=null){
                    String tag = v.getTag().toString();
                    if (tag.contains("PLAYING")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.pause();
                        else Toast.makeText(MokhterAhmadActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(MokhterAhmadActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextVideo();
            }
        });

        imgPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousVideo();
            }
        });





    } // End of onCreate Bundle





    private void makeListView(){

        ListView listView = new ListView( MokhterAhmadActivity.this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 10);
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listView.setBackgroundColor(Color.WHITE);
        listView.setLayoutParams(layoutParams);

        //Adding ListView into our view
        layoutContainer.addView(listView);
        //------------
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
        //-----------


        try{
            setListViewHeightBasedOnChildren(listView);
        } catch(Exception e ){
            e.printStackTrace();
        }

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(MokhterAhmadActivity.this, R.anim.fade_in));

    }

    ///==============================================




    //==============================================
    private void showInterstitial() {
        // Show the ad if it's ready.
        if (mInterstitialAd != null ) {
            mInterstitialAd.show(this);
        }
    }
    //============================================


    // loadFullscreenAd method starts here.....
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();

                        if (playingVideo==true && myYoutubePlayer!=null && !myYoutubePlayer.isPlaying() ){

                            Handler handler = new Handler(Looper.getMainLooper());

                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    myYoutubePlayer.play();
                                    playingVideo = false;

                                }
                            }, 500);

                        }


                    }





                }); // FullScreen Callback Ends here


            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }





        });

    }

    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    ///==============================================
    ///==============================================


    ///==============================================
    ///==============================================










    ///==============================================
    ///==============================================


    class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public MyAdapter(){
            this.inflater = (LayoutInflater) MokhterAhmadActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.video_item, parent, false);

            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            TextView tvDescription = convertView.findViewById(R.id.tvDescription);
            ImageView imgThumb = convertView.findViewById(R.id.imgThumb);
            RelativeLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> hashMap = arrayList.get(position);
            String vdo_id = hashMap.get("vdo_id");
            String vdo_title = hashMap.get("vdo_title");
            String vdo_desciption = hashMap.get("vdo_desciption");

            tvTitle.setText(vdo_title);
            tvDescription.setText(vdo_desciption);

            // Youtube thumnail link is like
            //https://i.ytimg.com/vi/<VIDEO ID>/0.jpg
            String thumb_link = "https://i.ytimg.com/vi/"+vdo_id+"/0.jpg";
            Picasso.get().
                    load(""+thumb_link)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imgThumb);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fabButton.setVisibility(View.GONE);

                    //Play Video
                    PLAYING_NOW = position;
                    playVideo(vdo_id);


                    Random random  = new Random();
                    int myCount = random.nextInt(100-5)+5;
                    if (myCount%2==0){
                        //Show Fullscreen ad
                        showInterstitial();
                    }
                }
            });




            return convertView;
        }
    }



    //================================================
    private void playVideo(String video_id){

        if(myYoutubePlayer!=null){
            layPlayer.setVisibility(View.VISIBLE);
            layPlayer.startAnimation(AnimationUtils.loadAnimation(MokhterAhmadActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(MokhterAhmadActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
        }
    }
    //================================================
    private void closePlayer(){
        if(myYoutubePlayer!=null && myYoutubePlayer.isPlaying()) myYoutubePlayer.pause();
        layPlayer.setVisibility(View.GONE);
        layPlayer.clearAnimation();
    }







    //==============================================
    final class MyPlaybackEventListener implements YouTubePlayer.PlaybackEventListener {
        public void onBuffering(boolean arg0) {
            //updateLog("onBuffering(): " + String.valueOf(arg0));
            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.buffer);
                imgPlayPause.setTag("BUFFERING");
            }
        }

        public void onPaused() {
            //updateLog("onPaused()");

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
                imgPlayPause.setTag("PAUSED");
            }

            //Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        }

        public void onPlaying() {
            //updateLog("onPlaying()");
            // Toast.makeText(getApplicationContext(), "Paying", Toast.LENGTH_SHORT).show();

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_pause);
                imgPlayPause.setTag("PLAYING");
            }

        }

        public void onSeekTo(int arg0) {
            //updateLog("onSeekTo(): " + String.valueOf(arg0));
        }

        public void onStopped() {

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
            }

        }

    }

    //*******************************************************************



    //=================================================================




    private final class MyPlayerStateChangeListener implements YouTubePlayer.PlayerStateChangeListener {

        public void onAdStarted() {
            //updateLog("onAdStarted()");
        }

        public void onError(
                YouTubePlayer.ErrorReason arg0) {
            //updateLog("onError(): " + arg0.toString());
            Toast.makeText(getApplicationContext(), ""+arg0.toString(), Toast.LENGTH_SHORT).show();
            //Log.d("loveRana", ""+arg0.ordinal());

            /*
            if (arg0.toString().contains("NOT_PLAYABLE") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }
            else if (arg0.toString().contains("INTERNAL_ERROR") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }

             */



        }

        public void onLoaded(String arg0) {
            //updateLog("onLoaded(): " + arg0);
        }

        public void onLoading() {
            //updateLog("onLoading()");
        }

        public void onVideoEnded() {
            // Toast.makeText(getApplicationContext(), "ended", Toast.LENGTH_LONG).show();
            playNextVideo();


        }


        public void onVideoStarted() {
            //updateLog("onVideoStarted()");
        }

    }
    //==============================================================



    //=================================================
    private void playNextVideo(){
        if(PLAYING_NOW >= (arrayList.size()-1))
            PLAYING_NOW = 0;
        else PLAYING_NOW++;

        HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
        String vdo_id = hashMap.get("vdo_id");
        playVideo(vdo_id);
    }


    private void playPreviousVideo(){
        if(PLAYING_NOW > 0){
            PLAYING_NOW--;
            HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
            String vdo_id = hashMap.get("vdo_id");
            playVideo(vdo_id);
        }else{
            Toast.makeText(MokhterAhmadActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
        }

    }






    ///==============================================
    ///==============================================
    //===================================================

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //==========================================================================
//==========================================================================





    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        myYoutubePlayer = youTubePlayer;
        myYoutubePlayer.setPlaybackEventListener(myPlaybackEventListener);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        myYoutubePlayer = null;
    }




    ///====================================================


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    ///==============================================
}