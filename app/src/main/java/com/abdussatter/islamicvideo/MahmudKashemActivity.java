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

public class MahmudKashemActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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


        //Video-25 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8A0pZXhTPo0");
        hashMap.put("vdo_title", "সিজদা করো, এই সিজদার মানে কি ১ম ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-25 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5EsZ-LWuOl8");
        hashMap.put("vdo_title", "পাপমুক্ত জীবনের জন্য কিছু উপদেশ ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-24 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tpslDKv_T64");
        hashMap.put("vdo_title", "ছোট্ট একটি হাদীস তাতে কত কি রয়েছে।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-23 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Vd6rH0_xK7E");
        hashMap.put("vdo_title", "ইসলামের যুগেও জাহিলিয়াত।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-22 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0S01sfLbhlI");
        hashMap.put("vdo_title", "ভালো নিয়্যাতের মর্যাদা।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-21 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3BqSkmLZFpU");
        hashMap.put("vdo_title", "নেকীর ইচ্ছায় ভালো কাজ করার মর্যাদা়।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-20 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KCht4OOyia8");
        hashMap.put("vdo_title", "জাতীকে পরিবর্তন করতে হলে বক্তব্য যেমন হতে হয়।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-19 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BaEt9VVowOc");
        hashMap.put("vdo_title", "গ্রহণ করার মতো উপদেশ। মাহমুদ বিন ক্বাসিম।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-18 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oCDhOUxUqao");
        hashMap.put("vdo_title", "ইসলামিক আলোচনায় বসার মর্যাদা। মাহমুদ বিন ক্বাসিম।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-17 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4UGDT1PxQGc");
        hashMap.put("vdo_title", "অন্তর ও জবানকে পাপ থেকে বাচার উপায় ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-16 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ND1_4LeOlVs");
        hashMap.put("vdo_title", "মিলাদুন নাবী এবং এমন যে কোনো দিবস পালনের ক্ষেত্রে ইসলামের মূলনীতি ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-15 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UBp6gbfR9vo");
        hashMap.put("vdo_title", "আমাদেরকে আমাদের কর্মগুলি নিয়ে ভেবে দেখা উচিৎ ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-14 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_DtQwwUP4kE");
        hashMap.put("vdo_title", "জীবনের আসল লক্ষ্য হতে হবে জান্নাত । প্রতিদিনের কাজ হতে হবে জান্নাত কামনা করা জাহান্নাম থেকে মুক্তি চাওয়া ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-13 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FhJGpIJQ2p4");
        hashMap.put("vdo_title", "আপনার বাসস্থান বলে দিচ্ছে যে আপনি ১জন দুনিয়াদার ব্যক্তি ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-12 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OwIKT-gOKHQ");
        hashMap.put("vdo_title", "আমরা দুনিয়ার দিকে ঝুকে গেছি, দুনিয়ামুখি হওয়া থেকে বাচতে হলে এভাবে চিন্তা করুন ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-11 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cpKPDbAlOXQ");
        hashMap.put("vdo_title", "আখলাক মানে কি শুধু ১টি গুণ !! আখলাক্ব মানে প্রত্যেকের স্বভাব ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-10 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "32jnZrSNkE8");
        hashMap.put("vdo_title", "অন্তর ভালো হলে কি লাভ আর মন্দ হলে কি ক্ষতি ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-09 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KbNspFdzGao");
        hashMap.put("vdo_title", "ব্যাপক অর্থবোধক দোয়ার ২য় পর্ব, নিরাপত্তা কামনা করা ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-08 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vQjNTF3Mm7k");
        hashMap.put("vdo_title", "কতক ব্যক্তির ইবাদত কবুল হয় না ১ম পর্ব ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-07 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rgbAFCQPcXE");
        hashMap.put("vdo_title", "আপনার অন্তরকে এই রোগগুলি থেকে বাঁচানোর চেষ্টা করুন ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-06 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HU8esRTPAzs");
        hashMap.put("vdo_title", "কবরে প্রশ্নের উত্তর দিতে পারবেন যদি এই কাজটি করতে পারেন ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-05 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AxhLBfI6mp0");
        hashMap.put("vdo_title", "আপনি আপনার ধর্ম ইসলাম নিয়ে চর্চা করতে বাধ্য ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-04 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g_rYcefZv0w");
        hashMap.put("vdo_title", "মহান আল্লাহ কত দয়াবান ও কেমন ক্ষমাশীল ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-03 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "q36XaE9bplQ");
        hashMap.put("vdo_title", "ঈমান হলো আশা আকাঙ্ক্ষা ও ভয়ভীতি নাম ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-02 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DckVRI8FyAg");
        hashMap.put("vdo_title", "পাপমুক্ত জীবন গড়তে আহ্বান।জীবনকে পাপমুক্ত করতে হলে এই কথাগুলি জানা জরুরী ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lVktDti6FUk");
        hashMap.put("vdo_title", "আমাদের উচিৎ কর্মগুলিকে নিয়ে একটু চিন্তা করে দেখা।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-00 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "q36XaE9bplQ");
        hashMap.put("vdo_title", "ঈমান হলো আশা আকাঙ্ক্ষা ও ভয়ভীতি নাম।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-01 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HsBLiMseozs");
        hashMap.put("vdo_title", "বন্দেগী বা ইবাদতের মর্ম।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-02 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KbNspFdzGao");
        hashMap.put("vdo_title", "ব্যাপক অর্থবোধক দোয়া, নিরাপত্তা কামনা করা।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-03 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g_rYcefZv0w");
        hashMap.put("vdo_title", "মহান আল্লাহ কত দয়াবান ও কেমন ক্ষমাশীল।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-04 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AxhLBfI6mp0");
        hashMap.put("vdo_title", "আপনি আপনার ধর্ম ইসলাম নিয়ে চর্চা করতে বাধ্য।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-05 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HU8esRTPAzs");
        hashMap.put("vdo_title", "কবরে প্রশ্নের উত্তর দিতে পারবেন যদি এই কাজটি করতে পারেন।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-06 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rgbAFCQPcXE");
        hashMap.put("vdo_title", "আপনার অন্তরকে এই রোগগুলি থেকে বাঁচানোর চেষ্টা করুন।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-07 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vQjNTF3Mm7k");
        hashMap.put("vdo_title", "কতক ব্যক্তির ইবাদত কবুল হয় না।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-08 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "32jnZrSNkE8");
        hashMap.put("vdo_title", "অন্তর ভালো হলে কি লাভ আর মন্দ হলে কি ক্ষতি।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-09 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cpKPDbAlOXQ");
        hashMap.put("vdo_title", "আখলাক মানে কি শুধু ১টি গুণ।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-10 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Jo0btlkLC-c");
        hashMap.put("vdo_title", "মাহফিলে দোকানের মেলা দেখে যা বলা হলো।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-10 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OwIKT-gOKHQ");
        hashMap.put("vdo_title", "আমরা দুনিয়ার দিকে ঝুকে গেছি।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-11 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FhJGpIJQ2p4");
        hashMap.put("vdo_title", "আপনার বাসস্থান বলে দিচ্ছে যে আপনি ১জন দুনিয়াদার ব্যক্তি");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-11 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2-7l6cvdBIQ");
        hashMap.put("vdo_title", "ইসলামের এই বৈশিষ্ট্যটি আপনাকে মুরতাদ হওয়া থেকে বাচাবে");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-12 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bNGC65Do7I4");
        hashMap.put("vdo_title", "মা বোনদের দান সম্পর্কে যা আড়ালে থেকে যায়");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-13 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ND1_4LeOlVs");
        hashMap.put("vdo_title", "মিলাদুন নাবী এবং এমন যে কোনো দিবস পালনের ক্ষেত্রে ইসলামের মূলনীতি");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-14 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YZ7qAYYS6XY");
        hashMap.put("vdo_title", "চলমান পরিস্থিতি সম্পর্কে আমার অভিমত।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-15 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PHBKVXPKZG0");
        hashMap.put("vdo_title", "অনেকের ইবাদত যে কবুল হয়না এর দলীল।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-16 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_DtQwwUP4kE");
        hashMap.put("vdo_title", "জীবনের আসল লক্ষ্য হতে হবে জান্নাত।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-17 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "85JZ9WfTkSI");
        hashMap.put("vdo_title", "আপনি যদি মাত্র ৩ বার করে বলেন আল্লাহ্\u200C আমি জান্নাত চাই");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-18 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lDL2GqMh7BA");
        hashMap.put("vdo_title", "কল্যাণকর দুয়াগুলির ২টি।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-19 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MDIOhO6rrz4");
        hashMap.put("vdo_title", "যারা সূরা আল-ফাতিহা পারে না তারা কীভাবে সালাত আদায় করবেন।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-20 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vA3wv4Z6PUc");
        hashMap.put("vdo_title", "দোয়া কবুল করাতে হলে এই দিকগুলি লাগবে।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-21 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "g1A3kDENrJc");
        hashMap.put("vdo_title", "যারা প্রয়োজনে ও স্বাভাবিক অবস্থায় আল্লাহ্\u200Cকে ডাকে তাঁদের মর্যাদা।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-22 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qzH4_NMA3zs");
        hashMap.put("vdo_title", "কার আত্মা কীভাবে বেড় হয়া।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-23 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Go2AQIKSFhI");
        hashMap.put("vdo_title", "যারা জানতে পারে কখন তাঁদের মৃত্যু হবে তাঁরা কারা?");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-24 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mrmhP8MXRHM");
        hashMap.put("vdo_title", "পাপীদের মৃত্যু কখনই সৎলোকের মতো হবে না।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-25 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PU0vwMFaqdI");
        hashMap.put("vdo_title", "আসুন জেনে নেই কার মৃত্যু কীভাবে ঘটবে।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-26 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uoAYBmE1qyE");
        hashMap.put("vdo_title", "মুহাররাম মাসের সঠিক পরিচয়।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-27 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TivwuCuWTPY");
        hashMap.put("vdo_title", "হুসাইন রাঃ হত্যাকারিদের সাথে আমাদের কি সম্পর্ক।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-28 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SGfXlyHD0s8");
        hashMap.put("vdo_title", "জীবন থেকে ১টি বছর চলে যাওয়া এবং আগামী বছরের কল্যাণ হাসিল হওয়ার হিসাব নিকাশ যেভাবে করবেন।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-29 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kkDKAKSul2g");
        hashMap.put("vdo_title", "বেকারত্বও যে ১টি বড় নিয়ামত বহু মুসলিম তা জানেনা।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-30 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JShHPGkwBKI");
        hashMap.put("vdo_title", "আল্লাহ্\u200Cর এই অনুগ্রহটা আপনিও পেয়েছেন।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-31 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "K2uddX_KYfU");
        hashMap.put("vdo_title", "আমাদেরকে কেন মৃত্যুর মুহূর্ত নিয়ে ভাবতে হবে।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-32 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MrHYw0nETcg");
        hashMap.put("vdo_title", "এই দুনিয়াতে এমন ১টি দিন আছে যেই দিন প্রত্যেকে ফেরেশতা দেখতে পাবে।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
        arrayList.add(hashMap);

        //Video-33 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "H99RlgVXmEY");
        hashMap.put("vdo_title", "মৃত্যু ১টি সৃষ্টি, এটা যারা জানে তারা ১টি বদ আক্বিদা থেকে মুক্ত।");
        hashMap.put("vdo_desciption", "বক্তা: মাহমুদ বিন ক্বাসিম");
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
        setContentView(R.layout.activity_mahmud_kashem);


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
        youTubePlayerView.initialize("ABCD", MahmudKashemActivity.this);
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
                        else Toast.makeText(MahmudKashemActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(MahmudKashemActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( MahmudKashemActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(MahmudKashemActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) MahmudKashemActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(MahmudKashemActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(MahmudKashemActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
            Toast.makeText(MahmudKashemActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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