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

public class LearningQuranWithJamalActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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
        hashMap.put("vdo_id", "8jGalaSh3oI");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-01");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-02 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "B18InEOVnfw");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-02");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-03 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "guNUt-04GDw");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-03");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-04 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CpuhGbWz23M");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-04");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-05 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vmyZrNB7YKw");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-05");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-06 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "awOFRe_MCyc");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-06");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-07 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UPh2wjcvcPw");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-07");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-08 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AbaSw_GYqLg");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-08");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-09 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7Cpgiu443Uc");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-09");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-10 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "suh_4ANJvSQ");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-10");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-11 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vw8qTNeiwlg");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-11");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-12 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YEXjb1Np1Dc");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-12");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-13 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XbHlJdjR87Y");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-13");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-14 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-bojmRpmXIU");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-14");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-15 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BBG53rPc23o");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-15");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-16 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "94lnypZfrT8");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-16");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-17 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YX9DNk5jEGE");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-17");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-18 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SXpjtq_s6ac");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-18");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-19 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zJ5ygFveodI");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-19");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-20 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DNb0FSXwd-s");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-20");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-21 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rplEOCiSTp4");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-21");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-22 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TYDajP8Tw6E");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-22");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-23 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-rZ_Lthj-Kk");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-23");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-24 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CK3kuI5QL5o");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-24");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-25 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3j4RBfgSziY");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-25");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-26 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xDfuDcq4JzU");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-26");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-27 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LaWvUOUMY2k");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-27");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-28 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WjsiOxb-rzY");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-28");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-29 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-qjskjJl4Jw");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-29");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-30 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9CoWcyqgJuQ");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-30");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-31 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8eUj3DzKekY");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-31");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-32 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kP_elsVeY_Y");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-32");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-33 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "y3L2zJ7Z6co");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-33");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-34 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "E1btubCl4l8");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-34");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-35 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gh9BioIgsX4");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-35");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-36 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tRKKwDSPOVM");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-36");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-37 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gn65cOKl4pQ");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-37");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-38 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FpLIAPrJB1o");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-38");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-39 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2YZ3NqC1Bxo");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-39");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
        arrayList.add(hashMap);

        //Video-40 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XPcjTgXU0kc");
        hashMap.put("vdo_title", "কুরআন শেখার সহজ উপায়। Part-40");
        hashMap.put("vdo_desciption", "Lecturer:Muhammad Jamal Uddin");
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
        setContentView(R.layout.activity_learning_quran_with_jamal);


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
        youTubePlayerView.initialize("ABCD", LearningQuranWithJamalActivity.this);
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
                        else Toast.makeText(LearningQuranWithJamalActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(LearningQuranWithJamalActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( LearningQuranWithJamalActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(LearningQuranWithJamalActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) LearningQuranWithJamalActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(LearningQuranWithJamalActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(LearningQuranWithJamalActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
            Toast.makeText(LearningQuranWithJamalActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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