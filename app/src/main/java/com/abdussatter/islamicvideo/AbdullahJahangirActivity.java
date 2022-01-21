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

public class AbdullahJahangirActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d_zEPKQs_KU");
        hashMap.put("vdo_title", "ডাঃ আব্দুল্লাহ জাহাঙ্গীরের জীবন কাহিনী");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5K1FrkJ40kY");
        hashMap.put("vdo_title", "মুসলিম জাতির ঐক্যের প্রয়োজনীয়তা এবং ঐক্য কিভাবে সম্ভব?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "v7a18CUb6Dc");
        hashMap.put("vdo_title", "আপনার প্রতি রাসুলﷺ এর তিন উপদেশ -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রহ. ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4Rh_ALwwdc0");
        hashMap.put("vdo_title", "দ্বীনের নামে জালিয়াতি ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jqHT5Hyq1_o");
        hashMap.put("vdo_title", "সুন্নাত পালনের গুরুত্ব/ মাসিক মাহফিল প্রশ্নোত্তর-20১৪ সাল ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tPP9wMObvpU");
        hashMap.put("vdo_title", "অভিভাবক হিসাবে আপনার দায়িত্ব কি?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TpUd6iOXV-8");
        hashMap.put("vdo_title", "আল্লাহুর অলি হবেন কি ভাবে?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "opM7_rtlEyg");
        hashMap.put("vdo_title", "কিয়ামতের আলামতসমূহ কি কি? ইমাম মাহদী কখন আসবেন? দাজ্জাল কেন আসবে? ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lHwCw6mqXpQ");
        hashMap.put("vdo_title", "ঈদে মিলাদুন্নবী উৎপত্তি ও ক্রমবিকাশ ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "q2shOMSZ0kc");
        hashMap.put("vdo_title", "দুবাই সফরের কিছু চমৎকার অনুভূতি ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রাহিমাহুল্লাহ ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4EQdP1v8L4k");
        hashMap.put("vdo_title", "আল্লাহকে আপন করে নিন ! ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর (রাহিমাহুল্লাহ) ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "o1DUyeH9CxA");
        hashMap.put("vdo_title", "আমাদের সকল কিছু সুন্নতের মধ্যে থাকা দরকার ড. আব্দুল্লাহ জাহাঙ্গীর ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sANa-PCSjrI");
        hashMap.put("vdo_title", "আল্লাহুয়াকবার! বিস্ময়কর একটি ওয়াজ নসিহত ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8anNglpMV8I");
        hashMap.put("vdo_title", "এমন অপ্রিয় সত্য ওয়াজ শুনেছেন কি কখনো !");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_NFe5hxcBWY");
        hashMap.put("vdo_title", "বিপদে পড়লে দুআ চাওয়ার একটি শিক্ষণীয় গল্প ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "h9HCdcuzVHM");
        hashMap.put("vdo_title", "আব্দুল্লাহ জাহাঙ্গীর রাহিমাহুল্লাহ এর অসাধারণ একটি আলোচনা ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MkSISDn_euQ");
        hashMap.put("vdo_title", "রাসূল (সা.) এর জীবন থেকে প্রকৃত শিক্ষা গ্রহণ করুন... ।");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oRT5aoUNx20");
        hashMap.put("vdo_title", "দাওয়াতের ক্ষেত্রে যে তিনটি ভূল আমরা করে থাকি?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5ck37J_OISo");
        hashMap.put("vdo_title", "আলহামদুলিল্লাহ। অসাধারণ একটি আলোচনা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JSuiT3n8M4U");
        hashMap.put("vdo_title", "তাবলীগ জামাত সম্পর্কে ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uv9wM5PtrpY");
        hashMap.put("vdo_title", "নামাজ সম্পর্কে শ্রেষ্ঠ আলোচনা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IFaPOtdBtfA");
        hashMap.put("vdo_title", "১০০টি জীবন ঘনিষ্ঠ গুরুত্বপূর্ণ প্রশ্নোত্তর");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "a83oooBcFl8");
        hashMap.put("vdo_title", "আলহামদুলিল্লাহ। হৃদয় নিংড়ানো অসাধারন একটি আলোচনা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hUsdJRobdRA");
        hashMap.put("vdo_title", "আলহামদুলিল্লাহ! সুস্পষ্ট ভাষায় বিস্ময়কর একটি আলোচনা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ag0_qscrJ2g");
        hashMap.put("vdo_title", "আল্লাহুর অলিদের পরিচয়। অসাধারণ একটি আলোচনা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9e53Kk-mSC0");
        hashMap.put("vdo_title", "মাযহাব মানা যাবে কি? ড. আব্দুল্লাহ জাহাঙ্গীর রহ:");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ey9VlcCCapE");
        hashMap.put("vdo_title", "ঈমানের মজা কিভাবে পাওয়া যাবে");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "sLlaU1yCHFc");
        hashMap.put("vdo_title", "অতীব গুরুত্বপূর্ণ কিছু ইসলামিক প্রশ্নোত্তর");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KeDElA1p4y0");
        hashMap.put("vdo_title", "আমাদের জন্য মহা মূল্যবান কিছু কথা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9K_wuVawflg");
        hashMap.put("vdo_title", "আখিরাতের চিন্তা এবং আব্দুল কাদের জিলানী রহমতুল্লাহি আলাইহির জীবনী");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "p-YPQzWx6qY");
        hashMap.put("vdo_title", "কিভাবে দোয়া করলে আল্লাহ দোয়া কবুল করেন");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rJeGND4ZZFc");
        hashMap.put("vdo_title", "পীর মুরিদী উসিলা সম্পর্কে সব থেকে বেস্ট আলোচনা এটি ব্যাখ্যা সহ");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RaRLRTcT2m4");
        hashMap.put("vdo_title", "আমাদের ঐক্য কি ভাবে সম্ভাব");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "O63pZ6lQr3E");
        hashMap.put("vdo_title", "হিজরী নববর্ষের উপহার প্রশ্নোত্তরসহ");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SU0BzgPP0So");
        hashMap.put("vdo_title", "রাসূলুল্লাহ (সা) এর আয়ের উৎস কী ছিল");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4Rh_ALwwdc0");
        hashMap.put("vdo_title", "দ্বীনের নামে জালিয়াতি");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-J92aRbWpj0");
        hashMap.put("vdo_title", "ঈশ্বরদী পাবনা মাহফিল ও প্রশ্নোত্তর ");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZAcUU7nejKw");
        hashMap.put("vdo_title", "হতাশা ও দুশ্চিন্তা থেকে মুক্তির উপায়");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "M77ZFl-jEeU");
        hashMap.put("vdo_title", "ভাগ্যে ভাল হওয়ার জন্য কি করবেন");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2-c1q7h9Uc4");
        hashMap.put("vdo_title", "বিতর নামায কখন কি ভাবে পড়তে হয়");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e9xGZJPLEos");
        hashMap.put("vdo_title", "সালাত নিয়ে শেষ্ঠ ওয়াজ ড. আব্দুল্লাহ জাহাঙ্গীর রহ.");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3-PMrMly_9I");
        hashMap.put("vdo_title", "হানাফিদের নামাজ কি সহিহ?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ww5YsrVm-Rg");
        hashMap.put("vdo_title", "ঈদ-ই-মিলাদুন্নবী’উৎপত্তি");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Lbuypp7phT4");
        hashMap.put("vdo_title", "শ্রেষ্ঠ ও বুদ্ধিমান মুসলমান কে?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pu_igmJ3I4I");
        hashMap.put("vdo_title", "পীরের মুরিদ হওয়া কি ফরয ?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5-DWXaH6jvk");
        hashMap.put("vdo_title", "সড়ক দুর্ঘটনায় যদি কেউ মারা যায়, তবে তাকে শহীদ বলা যায় কিনা?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NOp294qsw5I");
        hashMap.put("vdo_title", "নামায না পড়লে ঈমান ঠিক থাকে কিনা?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Kcro3Zo6QcU");
        hashMap.put("vdo_title", "প্রত্যেক মেয়ে এই লেকচারটি শুনবেন");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "efb9K7LnHHE");
        hashMap.put("vdo_title", "সুন্নাহের আলোকে বিবাহের আনুষ্ঠানিকতা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "k2CJybao17M");
        hashMap.put("vdo_title", "আমাদের সমাজে বহুল প্রচলিত কিছু শিরক");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0GEalwTyb_Q");
        hashMap.put("vdo_title", "ওহাবী কারা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XahVWabvqUM");
        hashMap.put("vdo_title", "তওবা ও ইস্তিগফার এর গুরুত্ব");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Oh4vAxuHuNQ");
        hashMap.put("vdo_title", "দাঁড়িয়ে ইয়া নবী বলে মিলাদ পড়াওঃবিদাত?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "L7FLOCb3cA0");
        hashMap.put("vdo_title", "কিশোর সাহাবীর শিক্ষা");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tjgA3iXoN3Q");
        hashMap.put("vdo_title", "দেড় হাজার বছরে তিনহাজার ইমাম মেহেদী");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vwdtmlqpeWI");
        hashMap.put("vdo_title", "আশুরা ও কারবালার প্রকৃত ইতিহাস");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DRLjwZw2pOc");
        hashMap.put("vdo_title", "স্বামী স্ত্রীর দাম্পত্য জীবন সুখময় করতে করনীয় কি?");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DaQStNB9VN0");
        hashMap.put("vdo_title", "সিয়াম রোজা সফল করার কিছু গুরুত্বপূর্ণ উপায়");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
        arrayList.add(hashMap);

        // Video-01   ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Kocxx7CCW7c");
        hashMap.put("vdo_title", "অশ্লীলতা এবং পাপ থেকে মুক্ত থাকার উপায়");
        hashMap.put("vdo_desciption", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
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
        setContentView(R.layout.activity_abdullah_jahangir);


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
        youTubePlayerView.initialize("ABCD", AbdullahJahangirActivity.this);
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
                        else Toast.makeText(AbdullahJahangirActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(AbdullahJahangirActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( AbdullahJahangirActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(AbdullahJahangirActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) AbdullahJahangirActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(AbdullahJahangirActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(AbdullahJahangirActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
            Toast.makeText(AbdullahJahangirActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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