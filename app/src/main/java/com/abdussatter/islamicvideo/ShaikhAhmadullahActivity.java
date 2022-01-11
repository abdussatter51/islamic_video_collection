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

        // Video-37  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tB-iKGDWyiI");
        hashMap.put("vdo_title", "কুরআনের অন্যতম শ্রেষ্ঠ সূরা: ৫টি বিশেষ ফযীলত");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-36  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5A98WivFyS8");
        hashMap.put("vdo_title", "প্রত্যেক মুসলিমের ন্যূনতম কতটুকু ইসলামী জ্ঞান থাকা আবশ্যক?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-35  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LRC6KVxLNhI");
        hashMap.put("vdo_title", "আলেমদের হুজুর বলা যাবে কি না? হুজুর শব্দের অর্থ কি?অনেকে বলেন- হুজুর তো একজন!");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-34  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e67m3SXzLF8");
        hashMap.put("vdo_title", "মোবাইলে কথা বলার সময় কল রেকর্ড করা কি গুনাহ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-33  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dcgqgtZOVkA");
        hashMap.put("vdo_title", "কুরআন অবমাননা ও আমাদের কুরআন বিমুখতা: মাসজিদুল হারাম থেকে কিছু কথা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-32  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XMKOVPmYeFE");
        hashMap.put("vdo_title", "আমার ছেলেকে আপনার মতো আলেম বানাবো কীভাবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-31  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ctHwgkEpN1w");
        hashMap.put("vdo_title", "প্রাণীর ছবি টাঙানো থাকলে সেখানে নামায হবে কি না?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-30  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tY5yvnL_ZjE");
        hashMap.put("vdo_title", "শিক্ষক কি শুধু পড়াবেন নাকি প্রয়োজনে শাসনও করবেন?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-29  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4gcsMIe4YGQ");
        hashMap.put("vdo_title", "সুন্নাহ সম্মত হেয়ার স্টাইল ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-28  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1EtRVsAn0xY");
        hashMap.put("vdo_title", "কবরের লাশ অক্ষত পাওয়া যাওয়া কিসের আলামত? ");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-27  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wRuH9K22G8A");
        hashMap.put("vdo_title", "প্রিয় রাসুলের ব্যঙ্গচিত্র অঙ্কনকারীর করুণ মৃত্যু: ইসলাম বিদ্ধেষীদের জন্য শিক্ষা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-26  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ywXoYH6LL5s");
        hashMap.put("vdo_title", "যে কারণে দো‘আ কবুল না হয়ে আসমান ও জমিনের মধ্যে ঝুলন্ত থাকে");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-25  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9Gx2VNIEenQ");
        hashMap.put("vdo_title", "প্রবীণ ও উলামাদের প্রতি সম্মান ঈমানের দাবি");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-24  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Tu3tzVB_Wfk");
        hashMap.put("vdo_title", "কুড়িয়ে পাওয়া জিনিস কী করবেন? দুটি ভুল ধারণা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-23  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OLPlxBJDniw");
        hashMap.put("vdo_title", "শয়তানের চক্রান্ত ও দুষ্টু জ্বিনের উপদ্রব থেকে রক্ষার পনেরটি উপায়");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-22  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KVqTCdb8BRg");
        hashMap.put("vdo_title", "শপথ যখন ভঙ্গ করতে হয়, শপথ ভঙ্গের কাফফারা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-21  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6hFWNKHlS0o");
        hashMap.put("vdo_title", "মরণোত্তর অঙ্গদান করা কি জায়েয?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-20  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NGrulMMC6s0");
        hashMap.put("vdo_title", "অসুস্থতা থেকে মুক্তি লাভের বিস্ময়কর ও পরীক্ষিত সূরা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-19  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4KYnUWocLoI");
        hashMap.put("vdo_title", "কৃত্রিম যৌনতার জন্য যেসব খেলনা পাওয়া যায় সেগুলোর মাধ্যমে যৌন চাহিদা মেটালে কি গুনাহ হবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-18  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EALVHSCMvV8");
        hashMap.put("vdo_title", "আকীদা প্রতিযোগিতা ও ড. আবদুল্লাহ জাহাঙ্গির (রহ:) এর বই নিয়ে প্রশ্ন ও উত্তর");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-17  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nnKXC6GeEt8");
        hashMap.put("vdo_title", "উলঙ্গ হয়ে গোসল করা যাবে কি না?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-16  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "zZlSNSU--gs");
        hashMap.put("vdo_title", "ব্যবসার নামে অন্যের সম্পদ আত্মসাৎ বনাম গ্রাহকের লোভ : ভয়াবহ পরিণাম");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-15  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "v00zAbfy4Ik");
        hashMap.put("vdo_title", "পাকা চুল তুলে ফেলা যাবে কি না?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-14  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qr-QY5m42Tc");
        hashMap.put("vdo_title", "নেক সন্তান জীবনের শ্রেষ্ঠ সম্পদ ও সময়ের সবচেয়ে দুষ্প্রাপ্য বিষয়");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-13  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "431StSjEP3U");
        hashMap.put("vdo_title", "অমুক যেন আমার জানাযা না পড়ে, এভাবে বলা কি নিষেধ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-12  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2LfX6_Dfd5k");
        hashMap.put("vdo_title", "যারা কথায় কথায় হাসাহাসি করেন, তাদের জন্য গুরুত্বপূর্ণ বার্তা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-11  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kLG49PbpdmA");
        hashMap.put("vdo_title", "দুশ্চিন্তা, ডিপ্রেশন ও কঠিন বিপদাপদ থেকে মুক্তির ৭ উপায়");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-10  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UIVLXxcoLZE");
        hashMap.put("vdo_title", "মৃত ব্যাক্তির ব্যবহৃত জিনিস পত্র ব্যাবহারের বিধান");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-09  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e5dNcKTHsYc");
        hashMap.put("vdo_title", "বিয়েতে গায়ে হলুদ মাখা হয় কেন? ইসলামের দৃষ্টিতে গায়ে হলুদের অনুষ্ঠান করা কি জায়েয?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-08  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jhZzuVz4i10");
        hashMap.put("vdo_title", "ছোট বেলায় কারো গাছের ফল চুরি করে খেয়ে ফেলেছি, এখন কী করবো?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-07  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2-VnnV9kEMc");
        hashMap.put("vdo_title", "খাওয়া বা পান করার সময় গোঁপে লেগে গেলে কি মাকরূহ হয়?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-06  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "a3K2AS6thmg");
        hashMap.put("vdo_title", "টয়লেটের মশা, মাছি শরীরে বসলে কি শারীর নাপাক হয়ে যাবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-05  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4M_FI3i7peQ");
        hashMap.put("vdo_title", "ক্ষোভ নয়, ক্ষমা করুন এটাই ইসলামের শিক্ষা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-04  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e9csBz3JOEk");
        hashMap.put("vdo_title", "প্রাপ্ত বয়স্ক ভাই বোন একই কক্ষে পৃথক বিছানায় ঘুমাতে পারবে কি?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-01  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ea7koDnR31U");
        hashMap.put("vdo_title", "মেয়েপক্ষ বিবাহের প্রস্তাব দেওয়া কি সুন্নাহ পরিপন্থী?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-00  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "e2daq2dEs_k");
        hashMap.put("vdo_title", "কারো নাম পরিবর্তন করলে কি পুনরায় আকীকা দিতে হবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-01  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "G1cP8aiICbk");
        hashMap.put("vdo_title", "রানরে উপর রেখে বা শুয়ে কিংবা হেলান দিয়ে কুরআন পড়া যাবে কি না?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-02  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LaJ-5kEIOV4");
        hashMap.put("vdo_title", "শিশুদের রাগ কমানোর আমল");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-03  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "18oCC8_-GWA");
        hashMap.put("vdo_title", "লজ্জার কারণে ফরজ গোসল না করে নামাজ পড়া");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-04  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1zmya1AoCzM");
        hashMap.put("vdo_title", "বিবাহের ক্ষেত্রে রক্তের গ্রুপ জানা");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-05  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "btCWj8us0PE");
        hashMap.put("vdo_title", "ঠোঁটের নিচের ছোট দাড়ি কাটা যাবে কি না");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-06  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Jvo7S1IpV5k");
        hashMap.put("vdo_title", "জুনায়েদ বাবুনগরী রহ সম্পর্কে অন্যরকম মূল্যায়ন");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-07  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "iFsXG6GJwZ8");
        hashMap.put("vdo_title", "সূর্যগ্রহণ চন্দ্রগ্রহণের সময় ৪ করণীয়, গর্ভবতী নারীর কোন কিছু কাটাকাটি করা কি নিষেধ?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-08  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "I4-fa6pnH9E");
        hashMap.put("vdo_title", "বাবা মা বিবাহে বিলম্ব করলে বা অপাত্রে বিয়ে করতে বাধ্য করলে করণীয়");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-09  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "REFsSbkwRiU");
        hashMap.put("vdo_title", "আশুরার রোযা কবে রাখবেন? শুনুন বিস্তারিত নিয়ম");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-10  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dxWdnXPXLo8");
        hashMap.put("vdo_title", "আস-সুন্নাহ ফাউন্ডেশনের সঙ্গী হতে পারেন আপনিও");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-11  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cK1ZoDfAyWU");
        hashMap.put("vdo_title", "হিজরী সন ও হিজরত: গুরুত্বপূর্ণ কিছু তথ্য");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-12  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "389dYDbtA3E");
        hashMap.put("vdo_title", "আপনার শিশুকে মোবাইল কিংবা ল্যাপটপ নয়, সময় দিন");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-13  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "gKwY31vCHlE");
        hashMap.put("vdo_title", "একাকী নামাজ আদায় করলে কি ইকামত দিতে হবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-14  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HURnpAfs7J0");
        hashMap.put("vdo_title", "আস সুন্নাহ ফাউন্ডেশনের অর্থের যোগান কিভাবে হয়?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-15  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cjoJ2peZz6E");
        hashMap.put("vdo_title", "পর্ণ আসক্তি ও হস্তমৈথুনের বদভ্যাস থেকে বাঁচার ৫উপায়");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-16  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "81aPDmkVcfw");
        hashMap.put("vdo_title", "দাজ্জালের চেয়েও ক্ষতিকর এবং বড় যে ফেতনা সম্পর্কে সতর্ক করা হয়েছে হাদীসে");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-17  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "J3F5SU2SGEM");
        hashMap.put("vdo_title", "ফজরের জামাত মিস না হওয়ার কার্যকর টিপস!");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-18  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GTJGYHo7Mb4");
        hashMap.put("vdo_title", "এরা যদি মডেল হয় তাহলে পরিত্যাজ্য কারা?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-19  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "MHUUbZ5B5k0");
        hashMap.put("vdo_title", "আলেম না হয়েও ইসলাম প্রচার করতে পারেন যে ৫ শর্তে");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-20  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GFQNoVCxhds");
        hashMap.put("vdo_title", "আসুন, মৃত্যুর পূর্বে কিছু সাওয়াবের গাছ লাগিয়ে যাই");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-21  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wpIKL4x3WEo");
        hashMap.put("vdo_title", "সখের বসে বনসাই বানানো কি জায়েয?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-22  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hhkK1sN5sek");
        hashMap.put("vdo_title", "বাবা মায়ের পাপের কারণেই কি সন্তান প্রতিবন্ধী হয়?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-23  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FzNokE57Ubs");
        hashMap.put("vdo_title", "টিকটক এ্যাপে রেফার করে উপার্জন করা যাবে কি না?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-24  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b1_tC24_cuM");
        hashMap.put("vdo_title", "রাসূল (সা:) কি গরুর গোশ্ত খেয়েছেন, মুসলমান গরুর গোশ্ত না খেলে কি কোন সমস্যা আছে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-25  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b23YX73qhdA");
        hashMap.put("vdo_title", "মেডিকেল স্টুডেন্টদের জন্য মানব কঙ্কাল কেনাবেচার বিধান");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-26  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7vRDmjsd6xg");
        hashMap.put("vdo_title", "সবার জন্য কুরবানী প্রতিবেদন ২০২১");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-27  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "x34QstFoS58");
        hashMap.put("vdo_title", "সার্টিফিকেটে মিথ্যা জন্ম তারিখ লেখা একটি সমাজ স্বীকৃত অপরাধ। এর বিরুদ্ধে সামাজিক সচেতনতা গড়ে তুলুন।");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-28  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XN_Z3YbWsyE");
        hashMap.put("vdo_title", "ভয় পাওয়ার পর বুকে থুথু দিলে কি লাভ হয়?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-29  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6yCw-W9GsIw");
        hashMap.put("vdo_title", "টানা ৩ জুমা না পড়লে কি মুসলমান থাকে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-30  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "BIDPhBoXwz4");
        hashMap.put("vdo_title", "যেভাবে সহজে নিজের কুরবানী নিজে করবেন , কুরবানীর নিয়ম ও দোয়া");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-31  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SYbzLlJ9je4");
        hashMap.put("vdo_title", "বেনামাজীর সাথে ভাগে কুরবানী দিলে কুরবানী হবে?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-32  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rtCZOwQ_1Eg");
        hashMap.put("vdo_title", "কা'বার গিলাফ তৈরি ও পরিবর্তনের বিরল দৃশ্য");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-33  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AJs_hVNyN9o");
        hashMap.put("vdo_title", "কুরবানীর সময় ভাগিদারদের নামের তালিকা পাঠ করতে হবে কি না?");
        hashMap.put("vdo_desciption", "বক্তা: শায়খ আহমাদুল্লাহ");
        arrayList.add(hashMap);

        // Video-34  ------------------------------------------------------------>>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d-2mq6HvAHw");
        hashMap.put("vdo_title", "কুরবানীর পশুর ছবি ফেসবুকে প্রচারের লাভ ক্ষতি");
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