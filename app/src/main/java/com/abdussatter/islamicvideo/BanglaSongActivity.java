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

public class BanglaSongActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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


        //Video No-55 -------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8DnoQnyQm4U");
        hashMap.put("vdo_title", "বিশ্ব নবীর অপমানে যদি না কাঁদে তোমার মন ।");
        hashMap.put("vdo_desciption", "Song: Nobijir Dushmon\n" +
                "Tune & Singer: Sayed Ahmad\n" +
                "Lyric: Abu Bakar");



        //Video No-54 -------------->>>>>>>>>>>>>>>>>
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oA03cLkNEsg");
        hashMap.put("vdo_title", "চমৎকার নজরুল সংগীত । ত্রিভুবনের প্রিয় মুহাম্মদ ।");
        hashMap.put("vdo_desciption", "Song: Tri Voboner Prio Mohammad\n" +
                "Lyric: Kazi Nazrul Islam\n" +
                "Direction: Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-53 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "USIZ1-YCauA");
        hashMap.put("vdo_title", "সময়ের সেরা ঈমান জাগানিয়া গজল । তুমি কেমন মুসলমান ।");
        hashMap.put("vdo_desciption", "Singer: Sayed Ahmad\n" +
                "A.Voice: Abdullah, Abir Hasan...\n" +
                "Lyric: Rajib Hasan ");
        arrayList.add(hashMap);



        //Video No-52 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oc08roCNsqg");
        hashMap.put("vdo_title", "সুমধুর গজল লক্ষ তারার মাঝে তুমি একটি তারা ।");
        hashMap.put("vdo_desciption", "Singer: Tawhid Jamil, Ahnaf Khalid & Fazle Elahi Sakib\n" +
                "Lyric & Tune: Ainuddin Al Azad R.");
        arrayList.add(hashMap);



        //Video No-51 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QyRRrKQP7fo");
        hashMap.put("vdo_title", "হৃদয় মাঝে মালা গাঁথি ছন্দে আর গানে ।");
        hashMap.put("vdo_desciption", "Song: Hridoy Majhe Mala Gathi \n" +
                "Singer: Mahfuzul Alam & Tawhid Jamil \n" +
                "Lyric & Tune: Tawhid Jamil ");
        arrayList.add(hashMap);




        //Video No-50 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "srU9CCeGtwU");
        hashMap.put("vdo_title", "টাকা নিয়ে ফাটাফাটি গজল | আজব টাকা | ");
        hashMap.put("vdo_desciption", "Singer: Muhammad Badruzzaman \n" +
                "A.Voice: Tanzim Reja, Elias Amin...\n" +
                "Lyric: Kazi Maruf ");
        arrayList.add(hashMap);



        //Video No-49 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VSiIcLF_rTQ");
        hashMap.put("vdo_title", "ফেইসবুক নিয়ে সময়ের সেরা গজল । Facebook ।");
        hashMap.put("vdo_desciption", "Singer: Sayed Ahammed \n" +
                "Direction: Md. Bodruzzaman \n" +
                "Sound Design: Mahfuzul Alam");
        arrayList.add(hashMap);



        //Video No-48 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GUOSZEzCz5w");
        hashMap.put("vdo_title", "গড়েছ তুমি এই পৃথিবী জাহান । তুমি অসীম তুমি মহান ।");
        hashMap.put("vdo_desciption", "Song: Gorecho Tumi Ei Prithibi Jahan\n" +
                "Singer: Sayed Ahmad, Salman Sadi...\n" +
                "Lyric & Tune: Kawsar Ahmad Suhail");
        arrayList.add(hashMap);



        //Video No-47 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5Zvfd_ntlG0");
        hashMap.put("vdo_title", "ক্ষমা করে দাও । মাফ করে দাও ।");
        hashMap.put("vdo_desciption", "Singer:  Qari Abu Rayhan\n" +
                "Lyric & Tune: Mohiuddin Khan Noor\n" +
                "Sound Design: Abu Bakar Siddik");
        arrayList.add(hashMap);



        //Video No-46 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Y74Z6RZoVUM");
        hashMap.put("vdo_title", "চোরদের বিরুদ্ধে সময়ের সেরা গজল । চোর ।");
        hashMap.put("vdo_desciption", "Singer: Sayed Ahmad\n" +
                "Lyric: Nuruzzaman Firoj\n" +
                "Tune: Sayed Ahmad");
        arrayList.add(hashMap);



        //Video No-45 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "c1kL66lgTTY");
        hashMap.put("vdo_title", "হঠাৎ আজরাইল পাঠাইয়া তোরে নিতে পারে তুলিয়া ।");
        hashMap.put("vdo_desciption", "Singer: Muhammad Badruzzaman \n" +
                "Lyric: Abdul Kadir Hawlader \n" +
                "Tune: Muhammad Badruzzaman ");
        arrayList.add(hashMap);



        //Video No-44 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_Y_iYQS686o");
        hashMap.put("vdo_title", "বাবা মানে হাজার বিকেল | যে গান কাঁদালো সকল বাবাদের |");
        hashMap.put("vdo_desciption", "Singer: Jaima Noor \n" +
                "Lyric: Tasnim Sadia \n" +
                "Tune: Tasnim Sadia ");
        arrayList.add(hashMap);



        //Video No-43 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BHUNDWO5NhI");
        hashMap.put("vdo_title", "বাবাকে নিয়ে হৃদয়স্পর্শী গজল । প্রিয় বাবা ।");
        hashMap.put("vdo_desciption", "Singer : Mahfuzul Alam\n" +
                "Lyric : Saif Siraj\n" +
                "Tune : Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-42 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HVL4LC07f2k");
        hashMap.put("vdo_title", "হৃদয়ের পাতায় তোমারই ছবি । তুমি ছাড়া বৃথা যে সবই ।");
        hashMap.put("vdo_desciption", "Singer : Tawhid Jamil & Salman Sadi \n" +
                "Lyric & Tune : Tawhid Jamil");
        arrayList.add(hashMap);



        //Video No-41 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qp8ajDOcYlk");
        hashMap.put("vdo_title", "নবীর রূপের আলো ।");
        hashMap.put("vdo_desciption", "Singer :  Rifat Rahman, Sifat Rahman & Jahidul Islam Shaown \n" +
                "Lyric & Tune : Saeed Usman");
        arrayList.add(hashMap);



        //Video No-40 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "shziWfc49og");
        hashMap.put("vdo_title", "ও বাতাস আমায় তুমি নিয়ে যাওনা ।");
        hashMap.put("vdo_desciption", "Singer :  Jahidul Islam Shawon  \n" +
                "Lyric & Tune : Aynuddin Al Azad");
        arrayList.add(hashMap);



        //Video No-39 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CYWQii5x7lU");
        hashMap.put("vdo_title", "মিছে দুনিয়ায় তুমি থাকবা কত দিন ?");
        hashMap.put("vdo_desciption", "Singer :  SADMAN shakib;Saim al hasan  \n" +
                "Lyric & Tune : Saim Al Hasan.");
        arrayList.add(hashMap);



        //Video No-38 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nEn6jMhvU5o");
        hashMap.put("vdo_title", "আল্লাহ আল্লাহ বলো মুখে মুখে ।");
        hashMap.put("vdo_desciption", "Singer :  Sayed Ahmad, Muhammad Badruzzaman, Abu Rayhan & Others  \n" +
                "Lyric & Tune : Saif Siraj");
        arrayList.add(hashMap);



        //Video No-37 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BHUNDWO5NhI");
        hashMap.put("vdo_title", "বাবাকে নিয়ে হৃদয়স্পর্শী গজল । প্রিয় বাবা ।");
        hashMap.put("vdo_desciption", "Singer :  Mahfuzul Alam  \n" +
                "Lyric & Tune : Saif Siraj");
        arrayList.add(hashMap);



        //Video No-36 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Gx7OLd-qEaw");
        hashMap.put("vdo_title", "আল্লাহ । আল্লাহ । আল্লাহ । আল্লাহ । আল্লাহ ।");
        hashMap.put("vdo_desciption", "Singer :  Abu Rayhan & Kalarab youth group  \n" +
                "Lyric & Tune : Sayed Ahmad");
        arrayList.add(hashMap);



        //Video No-35 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "D_4mw1jBfhs");
        hashMap.put("vdo_title", "সালাম । আস-সালামু আলাইকুম ।");
        hashMap.put("vdo_desciption", "Singer :  Zahid, Zihad, Sakib, Ahnaf Khalid & Galib  \n" +
                "Lyric & Tune : Ahmod Abdullah");
        arrayList.add(hashMap);



        //Video No-34 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8NKQpqgHyeU");
        hashMap.put("vdo_title", "তোমার বুকে রাখে আল্লাহর ভয় আসবে না কোন দিন কোনো পরাজয় ।");
        hashMap.put("vdo_desciption", "সবাইকে হালাল হারাম জেনে সত্য ও সুন্দর পথে পরিচালিত হওয়া প্রয়োজন । তাহলেই দুনিয়া ও আখিরাতে শান্তি আসবে ।");
        arrayList.add(hashMap);



        //Video No-33 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_iYGC4sTShs");
        hashMap.put("vdo_title", "ওলি আল্লাহর বাংলাদেশ ।");
        hashMap.put("vdo_desciption", "Singer :  Md. Badruzzaman, Omar Abdullah, Mahfuzul Alam, Salman Sadi & Abir Hasan   \n" +
                "Lyric & Tune : Ishak Obaydi");
        arrayList.add(hashMap);



        //Video No-32 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xhEVneuUnKM");
        hashMap.put("vdo_title", "আইনুদ্দীন আল আজাদ (রহ.) এর কালজয়ী সংগীত | ম্যাশআপ |");
        hashMap.put("vdo_desciption", "Singer : Yeasin Hayder & Anas Ahmad Safowan \n" +
                "Lyric & Tune : Ainuddin Al Azad Rh.");
        arrayList.add(hashMap);



        //Video No-31 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "63KcoYRE_Sc");
        hashMap.put("vdo_title", "কি হবে বেঁচে থেকে । অযথা বিদ্যা শিখে ।");
        hashMap.put("vdo_desciption", "Singer : Aynuddin Al Azad Rah. \n" +
                "Lyric & Tune : Aynuddin Al Azad Rah.");
        arrayList.add(hashMap);



        //Video No-30 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bvyQelKksgo");
        hashMap.put("vdo_title", "সমসাময়িক সংগীত দূষন |");
        hashMap.put("vdo_desciption", "Singer : Sayed Ahmad \n" +
                "Lyric & Tune : Sayed Ahmad");
        arrayList.add(hashMap);



        //Video No-29 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WNbvPMPCxis");
        hashMap.put("vdo_title", "কি হবে বেচে থেকে? প্রতিবাদী গজল শুনুন ।");
        hashMap.put("vdo_desciption", "Singer : Mufti Sayed Ahmad \n" +
                "Lyric & Tune : Sayed Ahmad");
        arrayList.add(hashMap);



        //Video No-28 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oc08roCNsqg");
        hashMap.put("vdo_title", "লক্ষ তারার মাঝে তুমি একটি তারা ।");
        hashMap.put("vdo_desciption", "Singer : Muhammad Badruzzaman \n" +
                "Lyric & Tune : Abdul Kadir Hawlader ");
        arrayList.add(hashMap);



        //Video No-27 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Wheka0WDEkc");
        hashMap.put("vdo_title", "তার নেই তুলনা । তার সম কেহ নাই ।");
        hashMap.put("vdo_desciption", "Singer : Abu Rayhan & Husain Adnan \n" +
                "Lyric & Tune : Aminul Islam Mamun ");
        arrayList.add(hashMap);



        //Video No-26 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "E4hRF-bN5p8");
        hashMap.put("vdo_title", "প্রিয় শিল্পী মাহফুজুল আলম এর গাওয়া ৩টি বাছাইকৃত গজল |");
        hashMap.put("vdo_desciption", "Singer : Mahfuzul Alam \n" +
                "Lyric & Tune : Jafar Ahmad Rabi ");
        arrayList.add(hashMap);



        //Video No-25 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8wD-iSe25CU");
        hashMap.put("vdo_title", "বারে বারে ভাবি একা । পাখি হলে উড়ে যেতাম....");
        hashMap.put("vdo_desciption", "Singer :  Hujaifa Islam \n" +
                "Lyric & Tune : Collected ");
        arrayList.add(hashMap);



        //Video No-24 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WjxmWg_RaCY");
        hashMap.put("vdo_title", "কোন জমিনের মাটি আমার হবে গোরস্থান ???");
        hashMap.put("vdo_desciption", "Singer : Adil Arham \n" +
                "Lyric : Dulal Nazrul \n"+
                " Tune: Rokunuzzaman");
        arrayList.add(hashMap);



        //Video No-23 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SxqpA-Wx9Oo");
        hashMap.put("vdo_title", "নবীর উম্মত দাবী করো কি করে তুমি ।");
        hashMap.put("vdo_desciption", "Singer : Muhammad Badruzzaman & Others \n" +
                "Lyric : Hossain Noor\n"+
                " Tune: Ahmod Abdullah");
        arrayList.add(hashMap);



        //Video No-22 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cnU92tq4ZTk");
        hashMap.put("vdo_title", "ছেলে মেয়েদের বর্তমান অবস্থা নিয়ে গজল । আজকালের পোলাপান ।");
        hashMap.put("vdo_desciption", "Singer : Muhammad Badruzzaman & Others \n" +
                "Lyric : Hossain Noor\n"+
                " Tune: Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-21 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YWkXICrWk3Q");
        hashMap.put("vdo_title", "আমাকে দাও পাখির দুটি ডানা । মন আমার মানে না ।");
        hashMap.put("vdo_desciption", "Singer : Abdullah Al Mamun & Others \n" +
                "Lyric : Saif Siraj\n"+
                " Tune: Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-20 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tyKaTu64MI8");
        hashMap.put("vdo_title", "তোমার বুকে রাখ আল্লাহর ভয় । আসবে কোন দিন কোন পরাজয় ।");
        hashMap.put("vdo_desciption", "Singer : Jahid, Khalid, Sakib, Mamun & Nasrullah\n" +
                "Lyric : Saif Siraj\n"+
                " Tune: Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-19 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hVz0paZpRH0");
        hashMap.put("vdo_title", "কবরে হাশরে কি হবে আমার ? কষ্টের ইসলামিক গজল ।");
        hashMap.put("vdo_desciption", "আমাদের প্রত্যেকের উচিত বেশি বেশি মৃত্যুকে স্মরণ করা এবং মৃত্যুর জন্য প্রস্তুত থাকা ।");
        arrayList.add(hashMap);



        //Video No-18 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LXtM24VXBDc");
        hashMap.put("vdo_title", "আধাঁর নামে সকাল সন্ধ্যা । আধাঁর নামে রাত্রি-দিন ।");
        hashMap.put("vdo_desciption", "Singer : Abu Rayhan, Iqbal Mahmud & Others\n" +
                "Lyric : Saif Siraj\n"+
                " Tune: Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-17 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b7M2uArxJas");
        hashMap.put("vdo_title", "ও মদিনার বুলবুলি তোমার নামে ফুল তুলি । যতন করে হৃদয় মাঝে একা একা নিরিবিলি ।");
        hashMap.put("vdo_desciption", "");
        arrayList.add(hashMap);



        //Video No-16 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "k3GcOuxM0Oo");
        hashMap.put("vdo_title", "মেহেরবান । তুমি মেহেরবান । আমি পাপী গুনাগার । তুমি ছাড়া কে আছে আমার ।");
        hashMap.put("vdo_desciption", "Singer: Munaem Billah");
        arrayList.add(hashMap);



        //Video No-15 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9G8PYuAs5Fw");
        hashMap.put("vdo_title", "সুখের দিনেও মোরা খুজিগো তোমায় । দুঃখের দিনেও মোরা শরিগো তোমায় ।");
        hashMap.put("vdo_desciption", "Singer : Sayed Ahmad\n" +
                "Lyric & Tune : Ahmed Abdur Rahim");
        arrayList.add(hashMap);



        //Video No-14 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7OMLPk-6WGg");
        hashMap.put("vdo_title", "ইয়া সায়্যিদি ইরহামলানা । ইয়া সায়্যিদি ইরমানলানা । আল্লাহু আল্লাহু । আল্লাহু আকবার ।");
        hashMap.put("vdo_desciption", "Singer : Hafez Rabbi");
        arrayList.add(hashMap);



        //Video No-13 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "R7xEl40mpdE");
        hashMap.put("vdo_title", "হাসবি রাব্বি জাল্লাল্লাহ । মাফি ক্বালবি গায়রুল্লাহ । লা-ইলাহা ইল্লাল্লাহ । মুহাম্মাদুর রাসুলুল্লাহ ।");
        hashMap.put("vdo_desciption", "Singer : Iqbal Hossain Jibon\n"+
                "Album: Make me your friend");
        arrayList.add(hashMap);



        //Video No-12 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9-Qoy7lzTX4");
        hashMap.put("vdo_title", "পৃথিবী আমার আসল ঠিকানা নয় । মরণ একদিন মুছে দিবে সকল রঙিন পরিচয় ।");
        hashMap.put("vdo_desciption", "Singer : Iqbal Hossain Jibon\n"+
                "Lyrics & Tune: Motiur Rahman Mollik");
        arrayList.add(hashMap);



        //Video No-11 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6ZrAIr2rPgQ");
        hashMap.put("vdo_title", "বর্তমান সময়ের জাগরণী সংগীত | বিপ্লবী বীর |");
        hashMap.put("vdo_desciption", "Singer: Iqbal Mahmud, Omar Abdullah, Abir Hasan & Habibullah Nur\n" +
                "Lyric: Jafar Ahmad Rabi\n" +
                "Tune: Iqbal Mahmud");
        arrayList.add(hashMap);



        //Video No-10 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0OKDsTE0_Xc");
        hashMap.put("vdo_title", "কলরবের বিপ্লবী সংগীত | জেগে ওঠো মুসলিম ।");
        hashMap.put("vdo_desciption", "Singer: Muhammad Badruzzaman, Ahmod Abdullah, Omar Abdullah, Arif Arian & Others \n" +
                "Lyric: Md Shahidul Haque\n" +
                "Tune: Ahmod Abdullah");
        arrayList.add(hashMap);



        //Video No-09 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "VDnqOC49DtU");
        hashMap.put("vdo_title", "মুসলিম কখনো সন্ত্রাসী নয় বরং শান্তিকামী ।");
        hashMap.put("vdo_desciption", "Singer: Muhammad Badruzzaman, Aminul Islam Mamun, Yeasin Hayder, Ahmod Abdullah & Mahfuzul Alam\n" +
                "Lyric & Tune: Ahmod Abdullah");
        arrayList.add(hashMap);



        //Video No-08 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RbrjlqwWibE");
        hashMap.put("vdo_title", "কলরব শিল্পীদের কণ্ঠে কালজয়ী দেশের গান । এক নদী রক্ত পেরিয়ে ।");
        hashMap.put("vdo_desciption", "Singer: Abu Rayhan, Nazrul Islam, Husain Adnan,  Mahfuzul Alam & Tawhid Jamil \n" +
                "Lyric & Tune: Khan Ataur Rahman ");
        arrayList.add(hashMap);



        //Video No-07 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xNXx1a_xQ1k");
        hashMap.put("vdo_title", "সালাম সালাম হাজার সালাম । লাখো শহীদ স্বরণে ।");
        hashMap.put("vdo_desciption", "Singer: Muhammad Abdul Jabbar \n" +
                "Lyric & Tune: Fazle Khuda ");
        arrayList.add(hashMap);



        //Video No-06 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9CQEYXV9_yw");
        hashMap.put("vdo_title", "কলরবের কণ্ঠে মুক্তিযুদ্ধের কালজয়ী সংগীত । তীর হারা এই ঢেউয়ের সাগর ।");
        hashMap.put("vdo_desciption", "Singer: Abu Rayhan, Dawod Anam, Husain Adnan, Elias Amin, Mahfuzul Alam & Others\n" +
                "Lyric & Tune: Apel Mahmud ");
        arrayList.add(hashMap);



        //Video No-05 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ssIJN4u-RE4");
        hashMap.put("vdo_title", "যে ফুল যুগ যুগান্তরে খুশবু ছড়ায় ।");
        hashMap.put("vdo_desciption", "Singer: Abudllah Al Muzahid\n" +
                "Side voical: Maruf Ahmed\n" +
                "Lyrics: Tofazzel Hossain Khan ");
        arrayList.add(hashMap);



        //Video No-04 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-Dir4b9D89k");
        hashMap.put("vdo_title", "এই সুন্দর ফুল, সুন্দন ফল আর মিঠা নদীর পানি । আল্রাহ তোমার মেহেরবানী ।");
        hashMap.put("vdo_desciption", "Singer : Husain Adnan & Abir Mahmud\n" +
                "Lyric & Tune : Kazi Nazrul Islam");
        arrayList.add(hashMap);



        //Video No-03 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "f5c1UhQdmPU");
        hashMap.put("vdo_title", "দু-জাহানে আমরা সেরা, উলামা তলবা । আমরা ইলমে নববীর নুরানী সে আভা ।");
        hashMap.put("vdo_desciption", "Singer : Sayed Ahmad, Muhammad Badruzzaman, Omar Abdullah & Abir Hasan\n" +
                "Lyric : Eliyas Bin Majhar\n" +
                "Tune : Muhammad Badruzzaman");
        arrayList.add(hashMap);



        //Video No-02 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1jn5fzdI9QY");
        hashMap.put("vdo_title", "প্রশংসা কেবল তোমারই জন্য রব্বুল আলামিন । দয়াল মেহেরবান করুনা অফুরান ।");
        hashMap.put("vdo_desciption", "Singer : Mosiur Rahman\n" +
                "Lyric : Motiur Rahman\n" +
                "Tune : Motiur Rahman");
        arrayList.add(hashMap);



        //Video No-01 ------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TjrHY81CAsg");
        hashMap.put("vdo_title", "যাদের হৃদয়ে আছে আল্লাহর ভয় । তারা কভু পথ ভুলে যায় না ।");
        hashMap.put("vdo_desciption", "Song : Jader Hridoye Ache Allahr VOY\n" +
                "Lyric : Collected\n" +
                "Artist : Abdullah Us Sakib & Monowar HJ");
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
        setContentView(R.layout.activity_bangla_song);


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
        youTubePlayerView.initialize("ABCD", BanglaSongActivity.this);
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
                        else Toast.makeText(BanglaSongActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(BanglaSongActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( BanglaSongActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(BanglaSongActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) BanglaSongActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(BanglaSongActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(BanglaSongActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
                com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
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
            Toast.makeText(BanglaSongActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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