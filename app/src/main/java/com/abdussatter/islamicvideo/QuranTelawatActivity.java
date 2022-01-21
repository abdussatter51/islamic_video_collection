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
import android.view.WindowManager;
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

public class QuranTelawatActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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


        //Video-114 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3GBKg8K_n1c");
        hashMap.put("vdo_title", "সূরা আল ফাতিহা (الْفَاتِحَة\u200E) - আবেগময় কোরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-105-114 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UPSVFTd6J6Q");
        hashMap.put("vdo_title", "সূরা ফাতিহা ও সূরা ফিল থেকে সূরা নাস পর্যন্ত - সুরেলা তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Mashary Rashed Al Afasy");
        arrayList.add(hashMap);

        //Video-99-104 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zSzVGpyzbz0");
        hashMap.put("vdo_title", "সূরা যিলযাল থেকে সূরা হুমাযাহ পর্যন্ত এক অসাধারণ তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Mashary Rashed Al Afasy");
        arrayList.add(hashMap);

        //Video-103 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lhJz3fvnB7o");
        hashMap.put("vdo_title", "সূরা আল আসর (العصر\u200E) তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Mashary Rashed Al Afasy");
        arrayList.add(hashMap);

        //Video-102 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TEHfTbARZZY");
        hashMap.put("vdo_title", "সূরা আত তাকাসুর (سورة التكاثر ) তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Muhammad Al Muqit");
        arrayList.add(hashMap);

        //Video-101 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8BKyhbOxmVY");
        hashMap.put("vdo_title", "আবেগময় কণ্ঠে সূরা কারিয়াহ তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-100 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tpy9heWAZ3s");
        hashMap.put("vdo_title", "সূরা আল আদিয়াতের অত্যন্ত আবেগময় কুরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-99 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "eHtna4zgUas");
        hashMap.put("vdo_title", "সূরা যিলযাল (الزلزلة) - মনজুড়ানো কোরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-98 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8PorxeKhcic");
        hashMap.put("vdo_title", "সূরা বাইয়্যিনাহ ( سورة البينة\u200E\u200E\u200E ) - আবেগময় কোরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-97 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "m1EkX8469vI");
        hashMap.put("vdo_title", "সূরা আল কদর (القدر ) - আবেগময় কোরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-96 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "J85RU64HtkA");
        hashMap.put("vdo_title", "সূরা আল আলাক (العلق) - আবেগময় কোরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-95 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZlXvGZM9-Pg");
        hashMap.put("vdo_title", "হৃদয় বিগলিত কণ্ঠে সূরা আত ত্বীন - তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-94 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "suQNqX1CSg8");
        hashMap.put("vdo_title", "সূরা আল ইনশিরাহ (আলাম নাসরাহ) - তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Abu Zain Kautsar ");
        arrayList.add(hashMap);

        //Video-93 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jNPhGaAcpSk");
        hashMap.put("vdo_title", "সূরা দুহা এক অসম্ভব সুন্দর - তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Shamsul Haque");
        arrayList.add(hashMap);

        //Video-92 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kORwIXgA1EU");
        hashMap.put("vdo_title", "আত্মা প্রশান্তকারী কণ্ঠে সূরা আল লাইল এর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Salim Al Ruwaili");
        arrayList.add(hashMap);

        //Video-91 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pGPB44-2k0w");
        hashMap.put("vdo_title", "সূরা আশ শামস (الشمس) - আপনার অন্তর শীতল হতে বাধ্য।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi ");
        arrayList.add(hashMap);

        //Video-90 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sj-yCENayOQ");
        hashMap.put("vdo_title", "সূরা আল-বালাদ এর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Mishary Rashid Alafasy");
        arrayList.add(hashMap);

        //Video-89 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IKoTBQWX0Lk");
        hashMap.put("vdo_title", "সূরা আল ফজর / ফাজর এর সুরেলা এর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Muhammad Kamal Hashim");
        arrayList.add(hashMap);

        //Video-88 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1QfW3WOhwxA");
        hashMap.put("vdo_title", "সূরা আল গাশিয়াহ(الغاشية\u200E) - অন্তর প্রশান্তময় তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Shamsul Haque");
        arrayList.add(hashMap);

        //Video-87 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2y-_3co_Fr0");
        hashMap.put("vdo_title", "সূরা আল আলা - অন্তর প্রশান্তময় তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Abdullah Altun");
        arrayList.add(hashMap);

        //Video-86 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bvs5iZ-cxjs");
        hashMap.put("vdo_title", "সূরা আত তারিক ( الطّارق\u200E) | আবেগময় তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Raad Mohammad Al Kurdi");
        arrayList.add(hashMap);

        //Video-85 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ciGkpKtkOow");
        hashMap.put("vdo_title", "সূরা বুরুজের অন্তর জুড়ানো তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Salim Al Ruwaili");
        arrayList.add(hashMap);

        //Video-84 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3zq0wZ3vaNQ");
        hashMap.put("vdo_title", "সূরা আল ইন\u200Cশিকাক (الانشقاق\u200E) অন্তর জুড়ানো তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Sekh Masud");
        arrayList.add(hashMap);

        //Video-83 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hmOsBN3QZPE");
        hashMap.put("vdo_title", "সূরা আত-তাতফিফ এর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Ahmad Al Shalabi");
        arrayList.add(hashMap);

        //Video-82 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BlAlYgEo3GI");
        hashMap.put("vdo_title", "অত্যন্ত সুরেলা কণ্ঠে সূরা ইনফিতার এর তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Salah Mussaly");
        arrayList.add(hashMap);

        //Video-81 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gzz0OmmlxOo");
        hashMap.put("vdo_title", "সূরা আত তাকভীর ( التكوير ) এর তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi ");
        arrayList.add(hashMap);

        //Video-80 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XOQx-ioyOk4");
        hashMap.put("vdo_title", "সুমধুর কণ্ঠে সূরা আবাসা এর তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Muhammad Al Muqit");
        arrayList.add(hashMap);

        //Video-79 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "l6f-G_6z314");
        hashMap.put("vdo_title", "সুমধুর কণ্ঠে সূরা আন-নাযিয়াত এর তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Sheikh Noreen Muhamad Siddiq");
        arrayList.add(hashMap);

        //Video-78 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DFKrzQDpwc8");
        hashMap.put("vdo_title", "সূরা আন-নাবা (سورة النبإ) - আবেগময় কুরআন তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Salah Mussaly");
        arrayList.add(hashMap);

        //Video-77 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "V5GoCCVpt0c");
        hashMap.put("vdo_title", "সূরা মুরসালাত এর অন্তর শীতল করা কণ্ঠে তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-76 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gYpMQmaDWQM");
        hashMap.put("vdo_title", "হৃদয়গ্রাহী কণ্ঠে সূরা ইনসান / সূরা আদ দাহর এর অসাধারণ তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Salim Al Ruwaili");
        arrayList.add(hashMap);

        //Video-75 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SoDSL35yXZ0");
        hashMap.put("vdo_title", "সূরা আল কিয়ামাহ - অশ্রু ধরে রাখতে পারবেন না (বিচার দিবসের বর্ণনা!)।");
        hashMap.put("vdo_desciption", "Reciter: Idris Abkar");
        arrayList.add(hashMap);

        //Video-74 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_RbffbB6Fzg");
        hashMap.put("vdo_title", "সুরা আল মুদ্দাসসির এর অসাধারণ তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Salim Al Ruwaili");
        arrayList.add(hashMap);

        //Video-73 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uPRwl-wuO7A");
        hashMap.put("vdo_title", "সূরা মুজাম্মিল(المزمل\u200E) এর অসাধারণ তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Abdul Rahman Mosad");
        arrayList.add(hashMap);

        //Video-72 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "E289m4vCLBQ");
        hashMap.put("vdo_title", "সূরা জিন এর অন্তর তৃপ্তকারী তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Mahmud Huzaifa");
        arrayList.add(hashMap);

        //Video-71 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ePt3HxKlw20");
        hashMap.put("vdo_title", "সূরা নূহের (سورة نوح\u200E ) মন জুড়ানো তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Muhammad Saleh Nafea");
        arrayList.add(hashMap);

        //Video-70 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9BEg_p7nzfg");
        hashMap.put("vdo_title", "হৃদয়বিগলিত কণ্ঠে সূরা মাআরিজ । আয়াত ৫-৩৫ তিলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Hamza Boudib");
        arrayList.add(hashMap);













        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KGUUWufvu6E");
        hashMap.put("vdo_title", "সূরা মুলকের স্বর্গীয় কোরআন তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JnX7Oc8LqD8");
        hashMap.put("vdo_title", "সূরা আর রহমান (الرحمن) - মন জুড়ানো তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Zain Abu Kautsar");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VLyktW15HXI");
        hashMap.put("vdo_title", "অন্তর শীতল করা কণ্ঠে সূরা ইয়াসীন ( سورة يس)।");
        hashMap.put("vdo_desciption", "Reciter: Omar Hisham Al Arabi");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hEjXkTP4XKg");
        hashMap.put("vdo_title", "হৃদয় বিগলিত কণ্ঠে সূরা আত ত্বহা (طه\u200E) তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Sherif Mostafa");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jNPhGaAcpSk");
        hashMap.put("vdo_title", "সূরা দুহা এক অসম্ভব সুন্দর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Shamsul Haque");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iTtAw7Fbv8o");
        hashMap.put("vdo_title", "সূরা মাউন এক অসম্ভব সুন্দর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Shamsul Haque");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3zq0wZ3vaNQ");
        hashMap.put("vdo_title", "সূরা আল ইন\u200Cশিকাক (الانشقاق\u200E) সুন্দর তেলাওয়াত।");
        hashMap.put("vdo_desciption", "Reciter: Shamsul Haque");
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
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quran_telawat);


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
        youTubePlayerView.initialize("ABCD", QuranTelawatActivity.this);
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
                        else Toast.makeText(QuranTelawatActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(QuranTelawatActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( QuranTelawatActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(QuranTelawatActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) QuranTelawatActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(QuranTelawatActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(QuranTelawatActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
            Toast.makeText(QuranTelawatActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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