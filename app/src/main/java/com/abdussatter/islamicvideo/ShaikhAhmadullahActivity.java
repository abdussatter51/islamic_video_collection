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

public class ShaikhAhmadullahActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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

        //Video Details Here Here S

        // Video-63   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Z93LmzBBo6o");
        hashMap.put("vdo_title", "মসজিদে কি দুনিয়াবী কথা বলা হারাম ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-62   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "htovrm0ulus");
        hashMap.put("vdo_title", "গর্ভস্থ সন্তান বিকলাঙ্গ বা প্রতিবন্ধী হলে ভ্রুন নষ্ট করা যাবে কি না ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-61   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "URUFtQ4lL6M");
        hashMap.put("vdo_title", "ভাঙ্গা আয়নায় মুখ দেখলে ও ভাঙ্গা প্লেটে খাবার খেলে কি হয় ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-60   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "yA9TDD_JCCc");
        hashMap.put("vdo_title", "কেউ উপকার করলে! কী বলা সুন্নাহ ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-59   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tLzTy5xN3dg");
        hashMap.put("vdo_title", "শিশুদেরকে গল্পের ছলে বা ভয় দেখানোর জন্য মিথ্যা বলা যাবে কী না ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-58   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jwe_cvwlG1g");
        hashMap.put("vdo_title", "শ্রেষ্ঠ দুরূদ কোনটি? দুরূদে লাখী ও হাজারী ইত্যাদির ফজীলত কী ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-57   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "S47Q6LNLSUw");
        hashMap.put("vdo_title", "যুবকদের যে প্রশ্নগুলো সবচে বেশি পছন্দ করেন শায়খ আহমাদুল্লাহ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-56  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PMlUwWzxgf8");
        hashMap.put("vdo_title", "কা’বার সাবেক ইমাম আদিল আল-কালবানীর বিচ্যুতি ও আমাদের ঈমানের পরীক্ষা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-55  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DyqtrN_3etI");
        hashMap.put("vdo_title", "কাবার প্রধান ক্যালিগ্রাফার-বাংলাদেশের কৃতি সন্তান শায়খ মুখতার শিকদারের সাক্ষাৎকার");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-54  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "by8gQc6ocQA");
        hashMap.put("vdo_title", "ইবাদতে তৃপ্তি না পাওয়ার ৩ কারণ, সমাধানের জন্য ২০ দিনের বিশেষ ফর্মূলা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-53  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XLRe0U6D5cQ");
        hashMap.put("vdo_title", "কুরআনের যের যবর পেশের প্রচলন কে কিভাবে করেছেন ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-52  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SyE3Y0Hp3KY");
        hashMap.put("vdo_title", "মসজিদ-মাদরাসা ও ওয়াজ মাহফিলের জন্য গাড়ি থামিয়ে চাঁদা তোলা কি জায়েয ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-51  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "O4ciRFkIAPE");
        hashMap.put("vdo_title", "পরীক্ষার্থীদের পরীক্ষা সম্পর্কিত কমন ১০টি প্রশ্নের উত্তর");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-50  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9id7fjErn_A");
        hashMap.put("vdo_title", "পরীক্ষা ভালো হওয়ার আমল ও দোয়া");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-49  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nzii4EsUhjQ");
        hashMap.put("vdo_title", "যাদের কবরে কোন সাওয়াল জওয়াব হবে না");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-48  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CBdlsrOuo0c");
        hashMap.put("vdo_title", "বিয়ের প্রয়োজনীয়তা অস্বীকারকারী মালালা নিজেই বিয়ে করেছেন যা বলেছেন শায়খ আহমাদুল্লাহ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-47  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kFIm6_UqjAQ");
        hashMap.put("vdo_title", "পাগলা মসজিদের দানবাক্সে কোটি কোটি টাকা কেন দান করা হয়? এ মসজিদের বৈশিষ্ট্যশরঈ দৃষ্টিকোণ কি?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-46  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1WTrqtzeyzA");
        hashMap.put("vdo_title", "বন্ধু নির্বাচনে রাসুলের (সা.) নির্দেশনা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-45  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-2GywPcR2bk");
        hashMap.put("vdo_title", "মেয়ে শিশুদের কেমন কাপড়ে অভ্যস্ত করা উচিত?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-44  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4FDhs-DKdzs");
        hashMap.put("vdo_title", "মবাবা মা কীভাবে সন্তানের হক নষ্ট করেন?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-43  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DMe9gSthwNo");
        hashMap.put("vdo_title", "মুসলিম তরুণদের জন্য শয়তানের সবচে বড় ফাঁদ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-42  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9dvN2BBgf2c");
        hashMap.put("vdo_title", "এক নারীর আলোচিত ১০ লক্ষ টাকা মোহর দাবি: সোশ্যাল মিডিয়ায় বিতর্ক ও শরঈ দৃষ্টিকোণ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-41  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "umaCHhkU1Fo");
        hashMap.put("vdo_title", "নাপাক ব্যক্তির হাতের রান্না খাওয়া কি জায়েজ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-40  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "H_JLyEn83jk");
        hashMap.put("vdo_title", "স্বামী প্রায়ই বলেন তোমাকে তালাক দেবো, এতে কি তালাক হবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-39  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DSerw3NdEB4");
        hashMap.put("vdo_title", "কবরে মাটিদেওয়ার দু‘আ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-38  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TwcTnZGx6Bg");
        hashMap.put("vdo_title", "ইসলামিক ভিডিওতে ব্যাকগ্রাউন্ড মিউজিকের বিধান");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
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
        setContentView(R.layout.activity_shaikh_ahmadullah);


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
        youTubePlayerView.initialize("ABCD", ShaikhAhmadullahActivity.this);
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
                        else Toast.makeText(ShaikhAhmadullahActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(ShaikhAhmadullahActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( ShaikhAhmadullahActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(ShaikhAhmadullahActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) ShaikhAhmadullahActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(ShaikhAhmadullahActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(ShaikhAhmadullahActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
            Toast.makeText(ShaikhAhmadullahActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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