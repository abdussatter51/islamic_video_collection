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

public class QuranTelawatBanglaActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

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
        hashMap.put("vdo_id", "zE_WFiHnSlY");
        hashMap.put("vdo_title", "Surah Al-Fatihah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-02 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uRxyu_IoXJk");
        hashMap.put("vdo_title", "Surah Al Baqarah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-03 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "HUt0yOQ1G7I");
        hashMap.put("vdo_title", "Surah Al-E-Imran with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-04 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LinJ2c2p10w");
        hashMap.put("vdo_title", "Surah An Nisa with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-05 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9Z2cbMsDnig");
        hashMap.put("vdo_title", "Surah Al Maidah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-06 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "26OuAh4F4JM");
        hashMap.put("vdo_title", "Surah Al-An'am with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-07 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kANt948lz-U");
        hashMap.put("vdo_title", "Surah Al-A'raf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-08 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "yiScdzKEE5U");
        hashMap.put("vdo_title", "Surah Al-Anfal with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-09 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lPlbDdDMFRQ");
        hashMap.put("vdo_title", "Surah At-Tawbah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-10 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "DwpNZqwyFYY");
        hashMap.put("vdo_title", "Surah Yunus with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-11 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jhokAKQBo00");
        hashMap.put("vdo_title", "Surah Hud with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-12 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lG8ugu2fRJE");
        hashMap.put("vdo_title", "Surah Yusuf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-13 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fW4zWnKhxRo");
        hashMap.put("vdo_title", "Surah Ar-Ra'd with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-14 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "qG6xcFp8syM");
        hashMap.put("vdo_title", "Surah Ibrahim with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-15 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PeASD3ZvPPo");
        hashMap.put("vdo_title", "Surah Al-Hijr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-16 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "TSYT0dwn7ps");
        hashMap.put("vdo_title", "Surah An-Nahl with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-17 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xpFz6JUFIY4");
        hashMap.put("vdo_title", "Surah Bani Israil with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-18 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Io0WdUNVZPc");
        hashMap.put("vdo_title", "Surah Al-Kahf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-19 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FBeoVl1B3EI");
        hashMap.put("vdo_title", "Surah Maryam with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-20 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9t41Kbz0BNk");
        hashMap.put("vdo_title", "Surah Ta-Ha with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-21 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lWf9U5Aibao");
        hashMap.put("vdo_title", "Surah Al Anbya with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-22 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "kYgorM75UQc");
        hashMap.put("vdo_title", "Surah Hajj with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-23 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QAz8eEVQtvs");
        hashMap.put("vdo_title", "Surah Mu'minun with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-24 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vEL9MlABLw4");
        hashMap.put("vdo_title", "Surah An-noor with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-25 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mYYjW2VDCNU");
        hashMap.put("vdo_title", "Surah Al-Furqan with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-26 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ovc9Ho4kwpk");
        hashMap.put("vdo_title", "Surah Ash-Shu'ara with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-27 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ovc9Ho4kwpk");
        hashMap.put("vdo_title", "Surah An-Naml with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-28 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tEtA41qV3gY");
        hashMap.put("vdo_title", "Surah Al Qasas with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-29 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vUz3k6GHaOw");
        hashMap.put("vdo_title", "Surah Al Ankabut with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-30 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Z5pr6S_dl30");
        hashMap.put("vdo_title", "Surah Ar-Rum with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-31 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "b0S-7pHxzy0");
        hashMap.put("vdo_title", "Surah Luqman with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-32 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "t7OYOcKOZMU");
        hashMap.put("vdo_title", "Surah As-Sajdah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-33 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dNMlWIHE6VE");
        hashMap.put("vdo_title", "Surah Al-Ahzab with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-34 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "R3vQwpmJTYA");
        hashMap.put("vdo_title", "Surah Saba with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-35 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6Us3Fyjvj88");
        hashMap.put("vdo_title", "Surah Fatir with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-36 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8j3xHEiAsZE");
        hashMap.put("vdo_title", "Surah Ya-Sin with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-37 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "FZ8F_dmEN6E");
        hashMap.put("vdo_title", "Surah As-Saffat with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-38 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "9eufPvum8k8");
        hashMap.put("vdo_title", "Surah Sad with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-39 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8UmdUUdoqYU");
        hashMap.put("vdo_title", "Surah Az-Zumar with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-40 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8JChVV2bq6Q");
        hashMap.put("vdo_title", "Surah Ghafir/Mu'min with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-41 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "d7aeC5kNzLA");
        hashMap.put("vdo_title", "Surah fussilat/Ha Mim As Sajdah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-42 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "W-6k79HAPa0");
        hashMap.put("vdo_title", "Surah Ash-shuraa As Sajdah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-43 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WRRAAonklRk");
        hashMap.put("vdo_title", "Surah Az-Zukhruf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-44 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CydFdttjlkQ");
        hashMap.put("vdo_title", "Surah Ad-Dukhan with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-45 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lS1dhsoSS_Y");
        hashMap.put("vdo_title", "Surah Al-Jathiyah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-46 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xIaJ8rHSDL8");
        hashMap.put("vdo_title", "Surah Al-Ahqaf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-47 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "C8OdGS8JtLM");
        hashMap.put("vdo_title", "Surah Muhammad with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-48 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QST0Eszp6uM");
        hashMap.put("vdo_title", "Surah Al-Fath with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-49 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KteQMTDZxtI");
        hashMap.put("vdo_title", "Surah Al-Hujurat with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-50 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Qoy6dD8Iohk");
        hashMap.put("vdo_title", "Surah Qaf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-51 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1cXyWIUMZDs");
        hashMap.put("vdo_title", "Surah Adh-Dhariyat with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-52 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "16EWlSm4FNw");
        hashMap.put("vdo_title", "Surah At-Tur with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-53 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tU2UUTFyAGU");
        hashMap.put("vdo_title", "Surah An-Najm with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-54 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZYlJnZ9hYiE");
        hashMap.put("vdo_title", "Surah Al-Qamar with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-55 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OOVDppL7wQs");
        hashMap.put("vdo_title", "Surah Ar-Rahman with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-56 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YLkXsn98tLE");
        hashMap.put("vdo_title", "Surah Al-Waqi'ah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-57 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YyIZtpG6XqM");
        hashMap.put("vdo_title", "Surah Al-Hadid with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-58 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Swf7lcyeNi0");
        hashMap.put("vdo_title", "Surah Al-Mujadila with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-59 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WwHik6yvnIA");
        hashMap.put("vdo_title", "Surah Al-Hashr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-60 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KexIXbF09WU");
        hashMap.put("vdo_title", "Surah Al-Mumtahanah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-61 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "vppEUNsG150");
        hashMap.put("vdo_title", "Surah As-saf with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-62 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Oi6IzlrD9bk");
        hashMap.put("vdo_title", "Surah Al-Jumu'ah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-63 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UZKsoddxd7I");
        hashMap.put("vdo_title", "Surah Al-Munafiqun with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-64 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SPKG6zifhOs");
        hashMap.put("vdo_title", "Surah At-Taghabun with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-65 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5B1oiQ-yy6c");
        hashMap.put("vdo_title", "Surah At-Talaq with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-66 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WSIUgcs3xjo");
        hashMap.put("vdo_title", "Surah At-Tahrim with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-67 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4JxAn7d37PE");
        hashMap.put("vdo_title", "Surah Al-Mulk with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-68 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6URt9CLENyU");
        hashMap.put("vdo_title", "Surah Al-Qalam with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-69 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UfmIZSt83rs");
        hashMap.put("vdo_title", "Surah Al-Haqqah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-70 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "D8OyiS6z8e8");
        hashMap.put("vdo_title", "Surah Al-Ma'arij with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-71 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "x-Fi1AzumXg");
        hashMap.put("vdo_title", "Surah Nuh with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-72 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ruvNPsgjADQ");
        hashMap.put("vdo_title", "Surah Al-Jinn with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-73 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "IttWi-inJ_4");
        hashMap.put("vdo_title", "Surah Al-Muzzammil with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-74 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bJw-u6m5hII");
        hashMap.put("vdo_title", "Surah Al-Muddaththir with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-75 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "LRQcawa4u_I");
        hashMap.put("vdo_title", "Surah Al-Qiyamah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-76 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "tWu3G26B1WA");
        hashMap.put("vdo_title", "Surah Al-Insan / Dahr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-77 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hve0b58Ap6s");
        hashMap.put("vdo_title", "Surah Al-Mursalat with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-78 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NOQw3wqovE8");
        hashMap.put("vdo_title", "Surah An-Naba with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-79 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "awloGGBgYu0");
        hashMap.put("vdo_title", "Surah An-Nazi'at with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-80 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZwEmi43WpxE");
        hashMap.put("vdo_title", "Surah Abasa with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-81 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hiOzmuPiiHw");
        hashMap.put("vdo_title", "Surah At-Takwir with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-82 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hFK1E69gFYk");
        hashMap.put("vdo_title", "Surah Al-Infitar with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-83 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Ac1QU83oMh4");
        hashMap.put("vdo_title", "Surah Al-Mutaffifin with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-84 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ssoRzBaCm3A");
        hashMap.put("vdo_title", "Surah Al-Inshiqaq with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-85 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "-H5l3-mJ8H4");
        hashMap.put("vdo_title", "Surah Al-Buruj with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-86 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oGznT84kVmQ");
        hashMap.put("vdo_title", "Surah At-Tariq with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-87 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xnAaSKABpV4");
        hashMap.put("vdo_title", "Surah Al-Ala with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-88 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "8693yJ2bpss");
        hashMap.put("vdo_title", "Surah Al-Ghashiyah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-89 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "CgxILOWq6nI");
        hashMap.put("vdo_title", "Surah Al-Fajr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-90 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZlYJIhjAIUM");
        hashMap.put("vdo_title", "Surah Al-Balad with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-91 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "lp8QALOP5Jw");
        hashMap.put("vdo_title", "Surah Ash-Shams with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-92 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rDP0Tt7Mptg");
        hashMap.put("vdo_title", "Surah Al-Layl with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-93 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AnO-X6tgiRs");
        hashMap.put("vdo_title", "Surah Ad-Duhaa with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-94 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "H2hhGSEknkE");
        hashMap.put("vdo_title", "Surah Ash-Sharh with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-95 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "XR3yuhq8-vI");
        hashMap.put("vdo_title", "Surah At-Tin with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-96 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "jyvxnLmGG6U");
        hashMap.put("vdo_title", "Surah Al-Alaq with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-97 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "p6EtgQZfwsQ");
        hashMap.put("vdo_title", "Surah Al-Qadr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-98 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "wlsgQ3UaiHk");
        hashMap.put("vdo_title", "Surah Al-Bayyinah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-99 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Mda-1DO7XUM");
        hashMap.put("vdo_title", "Surah Az-Zalzalah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-100 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Me94_pWewsg");
        hashMap.put("vdo_title", "Surah Al-Adiyath with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-101 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "KQbN6CE62sE");
        hashMap.put("vdo_title", "Surah Al-Qari'ah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-102 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PwBsIsvZo78");
        hashMap.put("vdo_title", "Surah At-Takathur with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-103 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "_rjgqUPXIXs");
        hashMap.put("vdo_title", "Surah Al-Asr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-104 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AD2FTfde3gs");
        hashMap.put("vdo_title", "Surah Al-Humazah with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-105 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "OscMyxCioZ8");
        hashMap.put("vdo_title", "Surah Al-Fil with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-106 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EMKO5k_xiRE");
        hashMap.put("vdo_title", "Surah Quraysh with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-107 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "rB1TOVHZ4CM");
        hashMap.put("vdo_title", "Surah Al-Ma'un with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-108 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ifq6UO66g78");
        hashMap.put("vdo_title", "Surah Al-Kawthar with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-109 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ZaHspJ0gRK8");
        hashMap.put("vdo_title", "Surah Al-Kafirun with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-110 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "GnOmpk-XFww");
        hashMap.put("vdo_title", "Surah An-Nasr with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-111 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "robx49fFmbk");
        hashMap.put("vdo_title", "Surah Lahab/Al-Masad with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-112 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UcxK4qDRMxk");
        hashMap.put("vdo_title", "Surah Al-Ikhlas with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-113 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oUb2UluKw7Q");
        hashMap.put("vdo_title", "Surah Al-Falaq with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
        arrayList.add(hashMap);

        //Video-114 ---------------------------------------------------------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "EnRhAvlb9a4");
        hashMap.put("vdo_title", "Surah An-Nas with bangla translation.");
        hashMap.put("vdo_desciption", "Reciter: Mishari-Al-Afasy");
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
        setContentView(R.layout.activity_quran_telawat_bangla);


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
        youTubePlayerView.initialize("ABCD", QuranTelawatBanglaActivity.this);
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
                        else Toast.makeText(QuranTelawatBanglaActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(QuranTelawatBanglaActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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

        ListView listView = new ListView( QuranTelawatBanglaActivity.this);
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

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(QuranTelawatBanglaActivity.this, R.anim.fade_in));

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
            this.inflater = (LayoutInflater) QuranTelawatBanglaActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            layPlayer.startAnimation(AnimationUtils.loadAnimation(QuranTelawatBanglaActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(QuranTelawatBanglaActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
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
            Toast.makeText(QuranTelawatBanglaActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
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