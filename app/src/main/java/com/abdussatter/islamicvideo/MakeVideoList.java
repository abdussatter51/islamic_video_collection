
package com.abdussatter.islamicvideo;

//import com.company.funnyvideos.R;


import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

        public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList = new ArrayList();
        public static ArrayList< HashMap<String, String> > catArrayList = new ArrayList<>();
        public static ArrayList< HashMap<String, String> > videoArrayList = new ArrayList<>();
        public static HashMap<String, String> hashMap;


        //--------------------------------------------------------------------------------------------
        //===============================Some automation by Juba
        public static void addVideoItem(String video_id, String title, String desciption){
                hashMap = new HashMap<>();
                hashMap.put("vdo_id", video_id);
                hashMap.put("vdo_title", title);
                hashMap.put("vdo_desciption", desciption);
                videoArrayList.add(hashMap);
        }
        //========================================================================
        //===============================Some automation by Juba
        public static void createPlayList(String category_name, Integer drawable){
                rootArrayList.add(videoArrayList);
                hashMap = new HashMap<>();
                hashMap.put("category_name", category_name);
                hashMap.put("img", String.valueOf(drawable));
                catArrayList.add(hashMap);
                videoArrayList = new ArrayList<>();
        }
        //========================================================================





        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //----------------------------------------------------
        public static void createMyAlbums(){

                //==========================================================================
                addVideoItem("8jGalaSh3oI", "কুরআন শেখার সহজ উপায়। Part-01", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("B18InEOVnfw", "কুরআন শেখার সহজ উপায়। Part-02", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("guNUt-04GDw", "কুরআন শেখার সহজ উপায়। Part-03", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("CpuhGbWz23M", "কুরআন শেখার সহজ উপায়। Part-04", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("vmyZrNB7YKw", "কুরআন শেখার সহজ উপায়। Part-05", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("awOFRe_MCyc", "কুরআন শেখার সহজ উপায়। Part-06", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("UPh2wjcvcPw", "কুরআন শেখার সহজ উপায়। Part-07", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("AbaSw_GYqLg", "কুরআন শেখার সহজ উপায়। Part-08", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("7Cpgiu443Uc", "কুরআন শেখার সহজ উপায়। Part-09", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("suh_4ANJvSQ", "কুরআন শেখার সহজ উপায়। Part-10", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("vw8qTNeiwlg", "কুরআন শেখার সহজ উপায়। Part-11", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("YEXjb1Np1Dc", "কুরআন শেখার সহজ উপায়। Part-12", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("XbHlJdjR87Y", "কুরআন শেখার সহজ উপায়। Part-13", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("-bojmRpmXIU", "কুরআন শেখার সহজ উপায়। Part-14", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("BBG53rPc23o", "কুরআন শেখার সহজ উপায়। Part-15", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("94lnypZfrT8", "কুরআন শেখার সহজ উপায়। Part-16", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("YX9DNk5jEGE", "কুরআন শেখার সহজ উপায়। Part-17", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("SXpjtq_s6ac", "কুরআন শেখার সহজ উপায়। Part-18", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("zJ5ygFveodI", "কুরআন শেখার সহজ উপায়। Part-19", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("DNb0FSXwd-s", "কুরআন শেখার সহজ উপায়। Part-20", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("rplEOCiSTp4", "কুরআন শেখার সহজ উপায়। Part-21", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("TYDajP8Tw6E", "কুরআন শেখার সহজ উপায়। Part-22", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("-rZ_Lthj-Kk", "কুরআন শেখার সহজ উপায়। Part-23", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("CK3kuI5QL5o", "কুরআন শেখার সহজ উপায়। Part-24", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("3j4RBfgSziY", "কুরআন শেখার সহজ উপায়। Part-25", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("xDfuDcq4JzU", "কুরআন শেখার সহজ উপায়। Part-26", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("LaWvUOUMY2k", "কুরআন শেখার সহজ উপায়। Part-27", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("WjsiOxb-rzY", "কুরআন শেখার সহজ উপায়। Part-28", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("-qjskjJl4Jw", "কুরআন শেখার সহজ উপায়। Part-29", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("9CoWcyqgJuQ", "কুরআন শেখার সহজ উপায়। Part-30", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("8eUj3DzKekY", "কুরআন শেখার সহজ উপায়। Part-31", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("kP_elsVeY_Y", "কুরআন শেখার সহজ উপায়। Part-32", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("y3L2zJ7Z6co", "কুরআন শেখার সহজ উপায়। Part-33", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("E1btubCl4l8", "কুরআন শেখার সহজ উপায়। Part-34", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("gh9BioIgsX4", "কুরআন শেখার সহজ উপায়। Part-35", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("tRKKwDSPOVM", "কুরআন শেখার সহজ উপায়। Part-36", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("gn65cOKl4pQ", "কুরআন শেখার সহজ উপায়। Part-37", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("FpLIAPrJB1o", "কুরআন শেখার সহজ উপায়। Part-38", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("2YZ3NqC1Bxo", "কুরআন শেখার সহজ উপায়। Part-39", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("XPcjTgXU0kc", "কুরআন শেখার সহজ উপায়। Part-40", "Lecturer:Muhammad Jamal Uddin");
                createPlayList("কুরআন শিক্ষা", R.drawable.quran_learning);
                //==========================================================================





                // ==========================================================================
                addVideoItem("YVIWyuWfBu0", "তিলাওয়াত শেখার সহজ উপায়। Part-01", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("xU2hLtKhC94", "তিলাওয়াত শেখার সহজ উপায়। Part-02", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("_M5gidSrDOQ", "তিলাওয়াত শেখার সহজ উপায়। Part-03", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("1ipbrhNmiYM", "তিলাওয়াত শেখার সহজ উপায়। Part-04", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("EScdm25c3wU", "তিলাওয়াত শেখার সহজ উপায়। Part-05", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("kXCGVBWopbc", "তিলাওয়াত শেখার সহজ উপায়। Part-06", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("Se_NXjplSo8", "তিলাওয়াত শেখার সহজ উপায়। Part-07", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("gGi6aPbTNJw", "তিলাওয়াত শেখার সহজ উপায়। Part-08", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("U1YezENi-vk", "তিলাওয়াত শেখার সহজ উপায়। Part-09", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("sg3qP3TD1n0", "তিলাওয়াত শেখার সহজ উপায়। Part-10", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("amlDYNfgbDE", "তিলাওয়াত শেখার সহজ উপায়। Part-11", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("a_un0ITPy_k", "তিলাওয়াত শেখার সহজ উপায়। Part-12", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("Yw_ciiGa9Ho", "তিলাওয়াত শেখার সহজ উপায়। Part-13", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("ab7l9Vji1Bc", "তিলাওয়াত শেখার সহজ উপায়। Part-14", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("K8xiuDzh7us", "তিলাওয়াত শেখার সহজ উপায়। Part-15", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("5AAnFQh2vyI", "তিলাওয়াত শেখার সহজ উপায়। Part-16", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("SuMCwhMkZ6U", "তিলাওয়াত শেখার সহজ উপায়। Part-17", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("bwKkEOSLAW0", "তিলাওয়াত শেখার সহজ উপায়। Part-18", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("tgqhq_TdV3I", "তিলাওয়াত শেখার সহজ উপায়। Part-19", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("gQmWx80uGo8", "তিলাওয়াত শেখার সহজ উপায়। Part-20", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("TRykVv_gWMs", "তিলাওয়াত শেখার সহজ উপায়। Part-21", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("vh8KZ5AvXwk", "তিলাওয়াত শেখার সহজ উপায়। Part-22", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("GBznMr_uJLs", "তিলাওয়াত শেখার সহজ উপায়। Part-23", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("avJXcGuY4BE", "তিলাওয়াত শেখার সহজ উপায়। Part-24", "Lecturer:Muhammad Jamal Uddin");
                addVideoItem("0UupecrdB-8", "তিলাওয়াত শেখার সহজ উপায়। Part-25", "Lecturer:Muhammad Jamal Uddin");
                createPlayList("তিলাওয়াত শিক্ষা", R.drawable.learning_telawah);
                //==========================================================================





                //==========================================================================
                addVideoItem("3GBKg8K_n1c", "সূরা আল ফাতিহা (الْفَاتِحَة\u200E) - আবেগময় কোরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("UPSVFTd6J6Q", "সূরা ফাতিহা ও সূরা ফিল থেকে সূরা নাস পর্যন্ত - সুরেলা তেলাওয়াত।", "Reciter: Mashary Rashed Al Afasy");
                addVideoItem("zSzVGpyzbz0", "সূরা যিলযাল থেকে সূরা হুমাযাহ পর্যন্ত এক অসাধারণ তেলাওয়াত।", "Reciter: Mashary Rashed Al Afasy");
                addVideoItem("lhJz3fvnB7o", "সূরা আল আসর (العصر\u200E) তেলাওয়াত।", "Reciter: Mashary Rashed Al Afasy");
                addVideoItem("TEHfTbARZZY", "সূরা আত তাকাসুর (سورة التكاثر ) তেলাওয়াত।", "Reciter: Muhammad Al Muqit");
                addVideoItem("8BKyhbOxmVY", "আবেগময় কণ্ঠে সূরা কারিয়াহ তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("tpy9heWAZ3s", "সূরা আল আদিয়াতের অত্যন্ত আবেগময় কুরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("eHtna4zgUas", "সূরা যিলযাল (الزلزلة) - মনজুড়ানো কোরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("8PorxeKhcic", "সূরা বাইয়্যিনাহ ( سورة البينة\u200E\u200E\u200E ) - আবেগময় কোরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("m1EkX8469vI", "সূরা আল কদর (القدر ) - আবেগময় কোরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("J85RU64HtkA", "সূরা আল আলাক (العلق) - আবেগময় কোরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("ZlXvGZM9-Pg", "হৃদয় বিগলিত কণ্ঠে সূরা আত ত্বীন - তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("suQNqX1CSg8", "সূরা আল ইনশিরাহ (আলাম নাসরাহ) - তেলাওয়াত।", "Reciter: Abu Zain Kautsar");
                addVideoItem("jNPhGaAcpSk", "সূরা দুহা এক অসম্ভব সুন্দর - তেলাওয়াত।", "Reciter: Shamsul Haque");
                addVideoItem("kORwIXgA1EU", "আত্মা প্রশান্তকারী কণ্ঠে সূরা আল লাইল এর তেলাওয়াত।", "Reciter: Salim Al Ruwaili");
                addVideoItem("pGPB44-2k0w", "সূরা আশ শামস (الشمس) - আপনার অন্তর শীতল হতে বাধ্য।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("sj-yCENayOQ", "সূরা আল-বালাদ এর তেলাওয়াত।", "Reciter: Mishary Rashid Alafasy");
                addVideoItem("IKoTBQWX0Lk", "সূরা আল ফজর / ফাজর এর সুরেলা এর তেলাওয়াত।", "Reciter: Muhammad Kamal Hashim");
                addVideoItem("1QfW3WOhwxA", "সূরা আল গাশিয়াহ(الغاشية\u200E) - অন্তর প্রশান্তময় তেলাওয়াত।", "Reciter: Shamsul Haque");
                addVideoItem("2y-_3co_Fr0", "সূরা আল আলা - অন্তর প্রশান্তময় তেলাওয়াত।", "Reciter: Abdullah Altun");
                addVideoItem("bvs5iZ-cxjs", "সূরা আত তারিক ( الطّارق\u200E) | আবেগময় তেলাওয়াত।", "Reciter: Raad Mohammad Al Kurdi");
                addVideoItem("ciGkpKtkOow", "সূরা বুরুজের অন্তর জুড়ানো তেলাওয়াত।", "Reciter: Salim Al Ruwaili");
                addVideoItem("3zq0wZ3vaNQ", "সূরা আল ইন\u200Cশিকাক (الانشقاق\u200E) অন্তর জুড়ানো তেলাওয়াত।", "Reciter: Sekh Masud");
                addVideoItem("hmOsBN3QZPE", "সূরা আত-তাতফিফ এর তেলাওয়াত।", "Reciter: Ahmad Al Shalabi");
                addVideoItem("BlAlYgEo3GI", "অত্যন্ত সুরেলা কণ্ঠে সূরা ইনফিতার এর তিলাওয়াত।", "Reciter: Salah Mussaly");
                addVideoItem("gzz0OmmlxOo", "সূরা আত তাকভীর ( التكوير ) এর তিলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("XOQx-ioyOk4", "সুমধুর কণ্ঠে সূরা আবাসা এর তিলাওয়াত।", "Reciter: Muhammad Al Muqit");
                addVideoItem("l6f-G_6z314", "সুমধুর কণ্ঠে সূরা আন-নাযিয়াত এর তিলাওয়াত।", "Reciter: Sheikh Noreen Muhamad Siddiq");
                addVideoItem("DFKrzQDpwc8", "সূরা আন-নাবা (سورة النبإ) - আবেগময় কুরআন তিলাওয়াত।", "Reciter: Salah Mussaly");
                addVideoItem("V5GoCCVpt0c", "সূরা মুরসালাত এর অন্তর শীতল করা কণ্ঠে তিলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("gYpMQmaDWQM", "হৃদয়গ্রাহী কণ্ঠে সূরা ইনসান / সূরা আদ দাহর এর অসাধারণ তিলাওয়াত।", "Reciter: Salim Al Ruwaili");
                addVideoItem("SoDSL35yXZ0", "সূরা আল কিয়ামাহ - অশ্রু ধরে রাখতে পারবেন না (বিচার দিবসের বর্ণনা!)।", "Reciter: Idris Abkar");
                addVideoItem("_RbffbB6Fzg", "সুরা আল মুদ্দাসসির এর অসাধারণ তিলাওয়াত।", "Reciter: Salim Al Ruwaili");
                addVideoItem("uPRwl-wuO7A", "সূরা মুজাম্মিল(المزمل\u200E) এর অসাধারণ তিলাওয়াত।", "Reciter: Abdul Rahman Mosad");
                addVideoItem("E289m4vCLBQ", "সূরা জিন এর অন্তর তৃপ্তকারী তিলাওয়াত।", "Reciter: Mahmud Huzaifa");
                addVideoItem("ePt3HxKlw20", "সূরা নূহের (سورة نوح\u200E ) মন জুড়ানো তিলাওয়াত।", "Reciter: Muhammad Saleh Nafea");




                addVideoItem("KGUUWufvu6E", "সূরা মুলকের স্বর্গীয় কোরআন তেলাওয়াত।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("JnX7Oc8LqD8", "সূরা আর রহমান (الرحمن) - মন জুড়ানো তেলাওয়াত।", "Reciter: Zain Abu Kautsar");
                addVideoItem("VLyktW15HXI", "অন্তর শীতল করা কণ্ঠে সূরা ইয়াসীন ( سورة يس)।", "Reciter: Omar Hisham Al Arabi");
                addVideoItem("hEjXkTP4XKg", "হৃদয় বিগলিত কণ্ঠে সূরা আত ত্বহা (طه\u200E) তেলাওয়াত।", "Reciter: Sherif Mostafa");
                addVideoItem("jNPhGaAcpSk", "সূরা দুহা এক অসম্ভব সুন্দর তেলাওয়াত।", "Reciter: Shamsul Haque");
                addVideoItem("iTtAw7Fbv8o", "সূরা মাউন এক অসম্ভব সুন্দর তেলাওয়াত।", "Reciter: Shamsul Haque");
                addVideoItem("3zq0wZ3vaNQ", "সূরা আল ইন\u200Cশিকাক (الانشقاق\u200E) সুন্দর তেলাওয়াত।", "Reciter: Shamsul Haque");
                createPlayList("কুরআন তিলাওয়াত", R.drawable.quran_telawah);
                //==========================================================================





                // ==========================================================================
                addVideoItem("zE_WFiHnSlY", "Surah Al-Fatihah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("uRxyu_IoXJk", "Surah Al-Baqarah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("HUt0yOQ1G7I", "Surah Al-E-Imran with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("LinJ2c2p10w", "Surah Al-Nisa with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("9Z2cbMsDnig", "Surah Al-Maidah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("26OuAh4F4JM", "Surah Al-An'am with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("kANt948lz-U", "Surah Al-A'raf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("yiScdzKEE5U", "Surah Al-Anfal with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("lPlbDdDMFRQ", "Surah Al-Tawbah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("DwpNZqwyFYY", "Surah Al-Yunus with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("jhokAKQBo00", "Surah Al-Hud with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("lG8ugu2fRJE", "Surah Al-Yusuf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("fW4zWnKhxRo", "Surah Al-Ra'd with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("qG6xcFp8syM", "Surah Al-Ibrahim with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("PeASD3ZvPPo", "Surah Al-Hijr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("TSYT0dwn7ps", "Surah Al-Nahl with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("xpFz6JUFIY4", "Surah Al-Bani Israil with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Io0WdUNVZPc", "Surah Al-Kahf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("FBeoVl1B3EI", "Surah Al-Maryam with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("9t41Kbz0BNk", "Surah Al-Ta-Ha with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("lWf9U5Aibao", "Surah Al-Anbya with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("kYgorM75UQc", "Surah Al-Hajj with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("QAz8eEVQtvs", "Surah Al-Mu'minun with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("vEL9MlABLw4", "Surah An-noor with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("mYYjW2VDCNU", "Surah Al-Furqan with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Ovc9Ho4kwpk", "Surah Ash-Shu'ara with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Ovc9Ho4kwpk", "Surah An-Naml with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("tEtA41qV3gY", "Surah Al-Qasas with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("vUz3k6GHaOw", "Surah Al-Ankabut with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Z5pr6S_dl30", "Surah Ar-Rum with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("b0S-7pHxzy0", "Surah Luqman with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("t7OYOcKOZMU", "Surah As-Sajdah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("dNMlWIHE6VE", "Surah Al-Ahzab with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("R3vQwpmJTYA", "Surah Saba with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("6Us3Fyjvj88", "Surah Fatir with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("8j3xHEiAsZE", "Surah Ya-Sin with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("FZ8F_dmEN6E", "Surah As-Saffat with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("9eufPvum8k8", "Surah Sad with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("8UmdUUdoqYU", "Surah Az-Zumar with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("8JChVV2bq6Q", "Surah Ghafir/Mu'min with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("d7aeC5kNzLA", "Surah fussilat/Ha Mim with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("W-6k79HAPa0", "Surah Ash-shuraa As Sajdah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("WRRAAonklRk", "Surah Az-Zukhruf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("CydFdttjlkQ", "Surah Ad-Dukhan with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("lS1dhsoSS_Y", "Surah Al-Jathiyah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("xIaJ8rHSDL8", "Surah Al-Ahqaf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("C8OdGS8JtLM", "Surah Muhammad with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("QST0Eszp6uM", "Surah Al-Fath with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("KteQMTDZxtI", "Surah Al-Hujurat with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Qoy6dD8Iohk", "Surah Qaf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("1cXyWIUMZDs", "Surah Adh-Dhariyat with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("16EWlSm4FNw", "Surah Al-Tur with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("tU2UUTFyAGU", "Surah An-Najm with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ZYlJnZ9hYiE", "Surah Al-Qamar with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("OOVDppL7wQs", "Surah Ar-Rahman with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("YLkXsn98tLE", "Surah Al-Waqi'ah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("YyIZtpG6XqM", "Surah Al-Hadid with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Swf7lcyeNi0", "Surah Al-Mujadila with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("WwHik6yvnIA", "Surah Al-Hashr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("KexIXbF09WU", "Surah Al-Mumtahanah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("vppEUNsG150", "Surah As-saf with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Oi6IzlrD9bk", "Surah Al-Jumu'ah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("UZKsoddxd7I", "Surah Al-Munafiqun with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("SPKG6zifhOs", "Surah Al-Taghabun with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("5B1oiQ-yy6c", "Surah Al-Talaq with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("WSIUgcs3xjo", "Surah At-Tahrim with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("4JxAn7d37PE", "Surah Al-Mulk with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("6URt9CLENyU", "Surah Al-Qalam with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("UfmIZSt83rs", "Surah Al-Haqqah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("D8OyiS6z8e8", "Surah Al-Ma'arij with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("x-Fi1AzumXg", "Surah Nuh with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ruvNPsgjADQ", "Surah Al-Jinn with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("IttWi-inJ_4", "Surah Al-Muzzammil with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("bJw-u6m5hII", "Surah Al-Muddaththir with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("LRQcawa4u_I", "Surah Al-Qiyamah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("tWu3G26B1WA", "Surah Al-Insan / Dahr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("hve0b58Ap6s", "Surah Al-Mursalat with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("NOQw3wqovE8", "Surah An-Naba with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("awloGGBgYu0", "Surah An-Nazi'at with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ZwEmi43WpxE", "Surah Abasa with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("hiOzmuPiiHw", "Surah At-Takwir with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("hFK1E69gFYk", "Surah Al-Infitar with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Ac1QU83oMh4", "Surah Al-Mutaffifin with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ssoRzBaCm3A", "Surah Al-Inshiqaq with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("-H5l3-mJ8H4", "Surah Al-Buruj with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("oGznT84kVmQ", "Surah Al-Tariq with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("xnAaSKABpV4", "Surah Al-Ala with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("8693yJ2bpss", "Surah Al-Ghashiyah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("CgxILOWq6nI", "Surah Al-Fajr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ZlYJIhjAIUM", "Surah Al-Balad with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("lp8QALOP5Jw", "Surah Ash-Shams with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("rDP0Tt7Mptg", "Surah Al-Layl with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("AnO-X6tgiRs", "Surah Ad-Duhaa with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("H2hhGSEknkE", "Surah Ash-Sharh with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("XR3yuhq8-vI", "Surah At-Tin with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("jyvxnLmGG6U", "Surah Al-Alaq with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("p6EtgQZfwsQ", "Surah Al-Qadr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("wlsgQ3UaiHk", "Surah Al-Bayyinah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Mda-1DO7XUM", "Surah Az-Zalzalah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("Me94_pWewsg", "Surah Al-Adiyath with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("KQbN6CE62sE", "Surah Al-Qari'ah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("PwBsIsvZo78", "Surah Al-Takathur with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("_rjgqUPXIXs", "Surah Al-Asr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("AD2FTfde3gs", "Surah Al-Humazah with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("OscMyxCioZ8", "Surah Al-Fil with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("EMKO5k_xiRE", "Surah Quraysh with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("rB1TOVHZ4CM", "Surah Al-Ma'un with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ifq6UO66g78", "Surah Al-Kawthar with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("ZaHspJ0gRK8", "Surah Al-Kafirun with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("GnOmpk-XFww", "Surah An-Nasr with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("robx49fFmbk", "Surah Lahab/Al-Masad with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("UcxK4qDRMxk", "Surah Al-Ikhlas with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("oUb2UluKw7Q", "Surah Al-Falaq with bangla translation.", "Reciter: Mishari-Al-Afasy");
                addVideoItem("EnRhAvlb9a4", "Surah An-Nas with bangla translation.", "Reciter: Mishari-Al-Afasy");
                createPlayList("অর্থসহ তিলাওয়াত", R.drawable.quran_bangla);
                //==========================================================================





                // ==========================================================================
                addVideoItem("A3xSCsZo4Zo", "ইসলামে নারীর শ্রেষ্ঠত্ব; মুসকানের পিতা যেখানে অনন্য", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Udgbxy8tyvc", "কেউ যাদু করেছে কিনা কিভাবে বুঝবেন?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("EVFvKSE0sws", "কালেমা শাহাদাত পাঠ করে আত্মহত্যা করলে পরিণতি কী হবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("HzBW_1Rnc3M", "মা বাবার ভালোর জন্য কি তাদের সাথে রাগ করে কথা বলা যাবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("5uD2u9l5CTo", "গর্ভভাড়া নিয়ে সন্তান জন্মদান, শরিয়াহ বিশ্লেষণ।", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("m3Tl8QCd_zs", "আমরণ অনশন: শরয়ী দৃষ্টিকোণ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("4ZnjR1qMjks", "ফসলের যাকাত ‘উশর’, একটি হারিয়ে যাওয়া ফরজ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("de9GbuRPxOQ", "মা বাবা নিয়ে যে আলোচনায় আপনার চোখ অশ্রুসিক্ত হবে", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("1CgvXAWwwuw", "অনেক পর্দানশীন মা বোনরাও যে আমলটি বর্তমানে করতে পারছেন না", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("SY6kdy94vjw", "তাওবা করার পরও বারবার গুনাহ হয়ে যায়, আমার করণীয় কী?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("UDvDKDq76_Q", "এই গুনাবলীর মুসলমান পাওয়া এখন দুষ্প্রাপ্য হয়ে গেছে", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("W0N5kflTvSw", "যে ১০ শ্রেণীর মানুষের হক আল্লাহ কখনো মাফ করবেন না", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("vS9EeayqEdw", "জান্নাতুল ফিরদাউসের উত্তরাধিকারী হবেন কারা?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("UDvDKDq76_Q", "একজন মুসলিমের কেমন হওয়া উচিত?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("5FkIpGycLeQ", "যৌতুক নিয়ে যে কথাগুলো সকলের শোনা প্রয়োজন", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("fqN8pIYlyEc", "নির্বাচিত জনপ্রতিনিধি ও ক্ষমতাসীনদের প্রতি বিনীত আহ্বান", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("AJyr_HicTZg", "পুরানকে বিদায় ও নতুনকে বরণ করুন এভাবে", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("1gKmOAPdeMM", "আলেমগন কেন এক হতে পারছেন না? শয়তান এক্ষেত্রে কিভাবে কাজ করে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("jvZ_UtN5b04", "করোনাকালীন সময়ে আস-সুন্নাহ ফাউন্ডেশনের সেবামূলক উদ্যোগ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("w39ECSaXEpo", "নতুন বছরের করণীয়- শায়খ আহমাদুল্লাহ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Ha69qpV6G1I", "সালাতকে নতুন করে জানতে এ আলোচনাটি শেষ পর্যন্ত শুনুন", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("BXaOBXb5A9s", "হিজামা বা কাপিং থেরাপি কি সুন্নাহসম্মত চিকিৎসা?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Aull4buuZ80", "কীভাবে কাটাবেন বছরের শেষ দীর্ঘ ছুটি?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Ewwx3dLzC14", "ঈসা আঃ -এর মর্যাদা ও তাঁর প্রতি আমাদের বিশ্বাস", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("BBvd88eqcOY", "যে অন্যায়কে বেশিরভাগ মানুষ অধিকার মনে করে!", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("kqXvAz6VIxQ", "বিবাহ, চাকুরি ও পরীক্ষা নিয়ে কমন প্রশ্নের ব্যতিক্রমী উত্তর", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("G8I2D3ZVrv0", "ফেসবুকের ভবিষ্যৎ বলা ফিচার কি কেবলই বিনোদন?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("b4ZuS4_hGZg", "যন্ত্রনাহীন আত্মহত্যার মেশিন আবিস্কার; মৃত্যুযন্ত্রণা সম্পর্কে ইসলাম কী বলে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Z93LmzBBo6o", "মসজিদে কি দুনিয়াবী কথা বলা হারাম?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("htovrm0ulus", "গর্ভস্থ সন্তান বিকলাঙ্গ বা প্রতিবন্ধী হলে ভ্রুন নষ্ট করা যাবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("URUFtQ4lL6M", "ভাঙ্গা আয়নায় মুখ দেখলে ও ভাঙ্গা প্লেটে খাবার খেলে কি হয়?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("yA9TDD_JCCc", "কেউ উপকার করলে! কী বলা সুন্নাহ?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("tLzTy5xN3dg", "শিশুদেরকে গল্পের ছলে বা ভয় দেখানোর জন্য মিথ্যা বলা যাবে কী না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("jwe_cvwlG1g", "শ্রেষ্ঠ দুরূদ কোনটি? দুরূদে লাখী ও হাজারী ইত্যাদির ফজীলত কী?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("S47Q6LNLSUw", "যুবকদের যে প্রশ্নগুলো সবচে বেশি পছন্দ করেন শায়খ আহমাদুল্লাহ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("PMlUwWzxgf8", "কা’বার সাবেক ইমাম আদিল আল-কালবানীর বিচ্যুতি ও আমাদের ঈমানের পরীক্ষা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("DyqtrN_3etI", "কাবার প্রধান ক্যালিগ্রাফার-বাংলাদেশের কৃতি সন্তান শায়খ মুখতার শিকদারের সাক্ষাৎকার?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("by8gQc6ocQA", "ইবাদতে তৃপ্তি না পাওয়ার ৩ কারণ, সমাধানের জন্য ২০ দিনের বিশেষ ফর্মূলা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("XLRe0U6D5cQ", "কুরআনের যের যবর পেশের প্রচলন কে কিভাবে করেছেন?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("SyE3Y0Hp3KY", "মসজিদ-মাদরাসা ও ওয়াজ মাহফিলের জন্য গাড়ি থামিয়ে চাঁদা তোলা কি জায়েয?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("O4ciRFkIAPE", "পরীক্ষার্থীদের পরীক্ষা সম্পর্কিত কমন ১০টি প্রশ্নের উত্তর", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("9id7fjErn_A", "পরীক্ষা ভালো হওয়ার আমল ও দোয়া", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("nzii4EsUhjQ", "যাদের কবরে কোন সাওয়াল জওয়াব হবে না", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("CBdlsrOuo0c", "বিয়ের প্রয়োজনীয়তা অস্বীকারকারী মালালা নিজেই বিয়ে করেছেন যা বলেছেন শায়খ আহমাদুল্লাহ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("kFIm6_UqjAQ", "পাগলা মসজিদের দানবাক্সে কোটি কোটি টাকা কেন দান করা হয়? এ মসজিদের বৈশিষ্ট্যশরঈ দৃষ্টিকোণ কি?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("1WTrqtzeyzA", "বন্ধু নির্বাচনে রাসুলের (সা.) নির্দেশনা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("-2GywPcR2bk", "মেয়ে শিশুদের কেমন কাপড়ে অভ্যস্ত করা উচিত?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("4FDhs-DKdzs", "বাবা মা কীভাবে সন্তানের হক নষ্ট করেন?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("DMe9gSthwNo", "মুসলিম তরুণদের জন্য শয়তানের সবচে বড় ফাঁদ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("9dvN2BBgf2c", "এক নারীর আলোচিত ১০ লক্ষ টাকা মোহর দাবি: সোশ্যাল মিডিয়ায় বিতর্ক ও শরঈ দৃষ্টিকোণ?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("umaCHhkU1Fo", "নাপাক ব্যক্তির হাতের রান্না খাওয়া কি জায়েজ?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("H_JLyEn83jk", "স্বামী প্রায়ই বলেন তোমাকে তালাক দেবো, এতে কি তালাক হবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("DSerw3NdEB4", "কবরে মাটিদেওয়ার দু‘আ", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("TwcTnZGx6Bg", "ইসলামিক ভিডিওতে ব্যাকগ্রাউন্ড মিউজিকের বিধান", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("tB-iKGDWyiI", "কুরআনের অন্যতম শ্রেষ্ঠ সূরা: ৫টি বিশেষ ফযীলত", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("5A98WivFyS8", "প্রত্যেক মুসলিমের ন্যূনতম কতটুকু ইসলামী জ্ঞান থাকা আবশ্যক", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("LRC6KVxLNhI", "আলেমদের হুজুর বলা যাবে কি না? হুজুর শব্দের অর্থ কি?অনেকে বলেন- হুজুর তো একজন!", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("e67m3SXzLF8", "মোবাইলে কথা বলার সময় কল রেকর্ড করা কি গুনাহ?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("dcgqgtZOVkA", "কুরআন অবমাননা ও আমাদের কুরআন বিমুখতা: মাসজিদুল হারাম থেকে কিছু কথা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("XMKOVPmYeFE", "আমার ছেলেকে আপনার মতো আলেম বানাবো কীভাবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("ctHwgkEpN1w", "প্রাণীর ছবি টাঙানো থাকলে সেখানে নামায হবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("tY5yvnL_ZjE", "শিক্ষক কি শুধু পড়াবেন নাকি প্রয়োজনে শাসনও করবেন?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("4gcsMIe4YGQ", "সুন্নাহ সম্মত হেয়ার স্টাইল", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("1EtRVsAn0xY", "কবরের লাশ অক্ষত পাওয়া যাওয়া কিসের আলামত?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("wRuH9K22G8A", "প্রিয় রাসুলের ব্যঙ্গচিত্র অঙ্কনকারীর করুণ মৃত্যু: ইসলাম বিদ্ধেষীদের জন্য শিক্ষা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("ywXoYH6LL5s", "যে কারণে দো‘আ কবুল না হয়ে আসমান ও জমিনের মধ্যে ঝুলন্ত থাকে", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("9Gx2VNIEenQ", "প্রবীণ ও উলামাদের প্রতি সম্মান ঈমানের দাবি", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Tu3tzVB_Wfk", "কুড়িয়ে পাওয়া জিনিস কী করবেন? দুটি ভুল ধারণা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("OLPlxBJDniw", "শয়তানের চক্রান্ত ও দুষ্টু জ্বিনের উপদ্রব থেকে রক্ষার পনেরটি উপায়", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("KVqTCdb8BRg", "শপথ যখন ভঙ্গ করতে হয়, শপথ ভঙ্গের কাফফারা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("6hFWNKHlS0o", "মরণোত্তর অঙ্গদান করা কি জায়েয?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("NGrulMMC6s0", "অসুস্থতা থেকে মুক্তি লাভের বিস্ময়কর ও পরীক্ষিত সূরা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("4KYnUWocLoI", "কৃত্রিম যৌনতার জন্য যেসব খেলনা পাওয়া যায় সেগুলোর মাধ্যমে যৌন চাহিদা মেটালে কি গুনাহ হবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("EALVHSCMvV8", "আকীদা প্রতিযোগিতা ও ড. আবদুল্লাহ জাহাঙ্গির (রহ:) এর বই নিয়ে প্রশ্ন ও উত্তর", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("nnKXC6GeEt8", "উলঙ্গ হয়ে গোসল করা যাবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("zZlSNSU--gs", "ব্যবসার নামে অন্যের সম্পদ আত্মসাৎ বনাম গ্রাহকের লোভ : ভয়াবহ পরিণাম", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("v00zAbfy4Ik", "পাকা চুল তুলে ফেলা যাবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("qr-QY5m42Tc", "নেক সন্তান জীবনের শ্রেষ্ঠ সম্পদ ও সময়ের সবচেয়ে দুষ্প্রাপ্য বিষয়", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("431StSjEP3U", "অমুক যেন আমার জানাযা না পড়ে, এভাবে বলা কি নিষেধ?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("2LfX6_Dfd5k", "যারা কথায় কথায় হাসাহাসি করেন, তাদের জন্য গুরুত্বপূর্ণ বার্তা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("kLG49PbpdmA", "দুশ্চিন্তা, ডিপ্রেশন ও কঠিন বিপদাপদ থেকে মুক্তির ৭ উপায়", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("UIVLXxcoLZE", "মৃত ব্যাক্তির ব্যবহৃত জিনিস পত্র ব্যাবহারের বিধান", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("e5dNcKTHsYc", "বিয়েতে গায়ে হলুদ মাখা হয় কেন? ইসলামের দৃষ্টিতে গায়ে হলুদের অনুষ্ঠান করা কি জায়েয?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("jhZzuVz4i10", "ছোট বেলায় কারো গাছের ফল চুরি করে খেয়ে ফেলেছি, এখন কী করবো?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("2-VnnV9kEMc", "খাওয়া বা পান করার সময় গোঁপে লেগে গেলে কি মাকরূহ হয়?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("a3K2AS6thmg", "টয়লেটের মশা, মাছি শরীরে বসলে কি শারীর নাপাক হয়ে যাবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("4M_FI3i7peQ", "ক্ষোভ নয়, ক্ষমা করুন এটাই ইসলামের শিক্ষা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("e9csBz3JOEk", "প্রাপ্ত বয়স্ক ভাই বোন একই কক্ষে পৃথক বিছানায় ঘুমাতে পারবে কি?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("ea7koDnR31U", "মেয়েপক্ষ বিবাহের প্রস্তাব দেওয়া কি সুন্নাহ পরিপন্থী?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("e2daq2dEs_k", "কারো নাম পরিবর্তন করলে কি পুনরায় আকীকা দিতে হবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("G1cP8aiICbk", "রানরে উপর রেখে বা শুয়ে কিংবা হেলান দিয়ে কুরআন পড়া যাবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("LaJ-5kEIOV4", "শিশুদের রাগ কমানোর আমল", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("18oCC8_-GWA", "লজ্জার কারণে ফরজ গোসল না করে নামাজ পড়া", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("1zmya1AoCzM", "বিবাহের ক্ষেত্রে রক্তের গ্রুপ জানা", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("btCWj8us0PE", "ঠোঁটের নিচের ছোট দাড়ি কাটা যাবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("Jvo7S1IpV5k", "জুনায়েদ বাবুনগরী রহ সম্পর্কে অন্যরকম মূল্যায়ন", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("iFsXG6GJwZ8", "সূর্যগ্রহণ চন্দ্রগ্রহণের সময় ৪ করণীয়, গর্ভবতী নারীর কোন কিছু কাটাকাটি করা কি নিষেধ?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("I4-fa6pnH9E", "বাবা মা বিবাহে বিলম্ব করলে বা অপাত্রে বিয়ে করতে বাধ্য করলে করণীয়?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("REFsSbkwRiU", "আশুরার রোযা কবে রাখবেন? শুনুন বিস্তারিত নিয়ম", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("dxWdnXPXLo8", "আস-সুন্নাহ ফাউন্ডেশনের সঙ্গী হতে পারেন আপনিও", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("cK1ZoDfAyWU", "হিজরী সন ও হিজরত: গুরুত্বপূর্ণ কিছু তথ্য", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("389dYDbtA3E", "আপনার শিশুকে মোবাইল কিংবা ল্যাপটপ নয়, সময় দিন", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("gKwY31vCHlE", "একাকী নামাজ আদায় করলে কি ইকামত দিতে হবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("HURnpAfs7J0", "আস সুন্নাহ ফাউন্ডেশনের অর্থের যোগান কিভাবে হয়?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("cjoJ2peZz6E", "পর্ণ আসক্তি ও হস্তমৈথুনের বদভ্যাস থেকে বাঁচার ৫উপায়", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("81aPDmkVcfw", "দাজ্জালের চেয়েও ক্ষতিকর এবং বড় যে ফেতনা সম্পর্কে সতর্ক করা হয়েছে হাদীসে", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("J3F5SU2SGEM", "ফজরের জামাত মিস না হওয়ার কার্যকর টিপস!", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("GTJGYHo7Mb4", "এরা যদি মডেল হয় তাহলে পরিত্যাজ্য কারা?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("MHUUbZ5B5k0", "আলেম না হয়েও ইসলাম প্রচার করতে পারেন যে ৫ শর্তে", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("GFQNoVCxhds", "আসুন, মৃত্যুর পূর্বে কিছু সাওয়াবের গাছ লাগিয়ে যাই", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("wpIKL4x3WEo", "সখের বসে বনসাই বানানো কি জায়েয?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("hhkK1sN5sek", "বাবা মায়ের পাপের কারণেই কি সন্তান প্রতিবন্ধী হয়?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("FzNokE57Ubs", "টিকটক এ্যাপে রেফার করে উপার্জন করা যাবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("b1_tC24_cuM", "রাসূল (সা:) কি গরুর গোশ্ত খেয়েছেন, মুসলমান গরুর গোশ্ত না খেলে কি কোন সমস্যা আছে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("b23YX73qhdA", "মেডিকেল স্টুডেন্টদের জন্য মানব কঙ্কাল কেনাবেচার বিধান?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("7vRDmjsd6xg", "সবার জন্য কুরবানী প্রতিবেদন ২০২১", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("x34QstFoS58", "সার্টিফিকেটে মিথ্যা জন্ম তারিখ লেখা একটি সমাজ স্বীকৃত অপরাধ। এর বিরুদ্ধে সামাজিক সচেতনতা গড়ে তুলুন।", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("XN_Z3YbWsyE", "ভয় পাওয়ার পর বুকে থুথু দিলে কি লাভ হয়?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("6yCw-W9GsIw", "টানা ৩ জুমা না পড়লে কি মুসলমান থাকে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("BIDPhBoXwz4", "যেভাবে সহজে নিজের কুরবানী নিজে করবেন , কুরবানীর নিয়ম ও দোয়া", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("SYbzLlJ9je4", "বেনামাজীর সাথে ভাগে কুরবানী দিলে কুরবানী হবে?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("rtCZOwQ_1Eg", "কা'বার গিলাফ তৈরি ও পরিবর্তনের বিরল দৃশ্য?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("AJs_hVNyN9o", "কুরবানীর সময় ভাগিদারদের নামের তালিকা পাঠ করতে হবে কি না?", "বক্তা: শায়খ আহমাদুল্লাহ");
                addVideoItem("d-2mq6HvAHw", "কুরবানীর পশুর ছবি ফেসবুকে প্রচারের লাভ ক্ষতি?", "বক্তা: শায়খ আহমাদুল্লাহ");
                createPlayList("শায়খ আহমাদুল্লাহ", R.drawable.ahmadullah);
                //==========================================================================





                // ==========================================================================
                addVideoItem("Z5q9y9LbJfY", "আপনার কাছে জীবন মানে কী শুধুই হতাশা? ভিডিওটি দেখুন, হতাশা দূর হবেই", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("ztXpghruQ8c", "যাদের কৃতজ্ঞ অন্তর আল্লাহ তায়ালা তাদের হেদায়েত বাড়িয়ে দেন", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("W-8343WgeYk", "যে ছয় ধরণের নারীদের কখনো বিয়ে করবেন না", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("4vAS7KatwQo", "বিয়ের পূর্ব প্রস্তুতি কেমন হওয়া উচিত? যুবক যুবতীদের উদ্দেশ্যে যা বললেন", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("l8_-wLHHMPk", "যুবকদের বিয়ের জন্য দোয়া, আমীন বলে চিৎকার করে উঠল সবাই", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("kaR6oNwLSQo", "কর্নাটক এর সাহসী বোন মুসকানরা যেভাবে তৈরি হয়", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("CQ1o1fimETY", "আল্লাহু আকবার ধ্বনিতে গর্জে উঠুক সমগ্র বিশ্ব", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("ADIkXY_yL1k", "সহবাস ছাড়াই সারোগেসি পদ্ধতিতে সন্তান জন্মদান, এ ব্যাপারে ইসলাম কি বলে?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("2bgysd-xdlc", "ব্যবহৃত স্বর্ণের যাকাত দিতে হবে কিনা?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("b9lwy9MlKLU", "ঈমান জাগানো শ্রেষ্ঠ খুৎবা", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("CFOl16e3KhA", "একটি সুন্নাহ ভিত্তিক বিয়ে", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("WZmTqEHCa9k", "গায়ে হলুদের অনুষ্ঠান করা যাবে কি?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("zp53UNhGgOQ", "তাওহীদ ও শিরক এর মধ্যে পার্থক্য কি?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("SV0nenovx1U", "সাহাবায়ে কেরামদের দানগুলো কেমন ছিলো?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("m7BYj4lBXuI", "বিভিন্ন বইয়ের পিডিএফ ইন্টারনেট থেকে ডাউনলোড করে পড়া যায় কি?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("4LyRQpob6EU", "জেনা করার পর আল্লাহর পথে কিভাবে আসা যায়?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("F8kjxXII1XY", "শরিয়াহ প্রেসক্রিপশন্স\" সাপ্তাহিক সরাসরি প্রশ্নোত্তর (পর্ব ১৮)", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("xmZCnC48uE0", "সর্বোত্তম সাদাকাহ হলো মসজিদ নিৰ্মান", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("jskHDCMGaW0", "মৃত ব্যক্তির নামে খাবার খাওয়ানো যাবে কি?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("dwvQdcH38_M", "প্রচলিত মিলাদ কিয়াম কতটুকু যায়েজ আছে?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("WEDOqbfId8A", "একজন মহিলা হিন্দু থেকে মুসলিম হয়েছে তারঅতীতের গুনাহ মাফ হবে কি?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("tZFv-7kPdao", "যুবকদের জন্য গুরুত্বপূর্ণ প্রশ্ন উত্তর", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("C5sj6Ob6kWU", "কিস্তিতে পণ্য ক্রয় করা যাবে কি", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("eG4AwrXzcGI", "দুনিয়ার জীবনে আমাদেরকে কিভাবে চলা উচিত", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("Kgk6xMVz6wE", "নামাজের ইকামত ২বার করে না ১বার করে দিতে হবে", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("UIJsEQq0sgA", "খুবই গুরুত্বপূর্ণ ইসলামী প্রশ্ন উত্তর", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("GbqiZ_kKiBU", "স্টাডি করার জন্য USA কানাডা যাওয়া যাবে কি ?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("tRp-q-yk97U", "সাহাবায়ে কেরামদের গোপন আমল কেমন ছিল?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("UIJsEQq0sgA", "জুমুআর খুতবায় খুবই গুরুত্বপূর্ণ ইসলামী প্রশ্ন উত্তর", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("uNmWCOZHciY", "নিজেকে পরিবর্তনকরতে এই বক্তব্য টুকুই যথেষ্ট ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("NEuZZOmd3TA", "তোমার কি হলো যুবক | তুমি তো সালাউদ্দিন আইয়ুবীর উত্তরসূরী ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("VRlo35nu5rI", "আল্লাহ তাআলার কাছে কিভাবে জবাব দিবেন নিজের সম্পর্কে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("uNmWCOZHciY", "নিজেকে পরিবর্তনকরতে এই বক্তব্য টুকুই যথেষ্ট ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("F51nclvGL0Y", "কিভাবে তওবা করলে আল্লাহ সকল গুনাহ মাফ করে দেবেন ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("vBbBYG6K6Yw", "সমাজে প্রচলিত বিবাহ পদ্ধতি কতটুকু শরীয়াহ সম্মত ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("WaPUGE0mlSI", "কোন মুসলিম কী ধর্ম নিরপক্ষতা ও জাতীয়তাবাদ সমর্থণ করতে পারে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("xRk9o3qBO6k", "ইসলামে কী রাজতন্ত্র হারাম ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("qIAdtkhf1yg", "আমাদেরকে কুরআনের কাছেই ফিরে যেতে হবে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("hQ1YziCuG4o", "খুৎবা কী বাংলায় না আরবিতে হবে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("skHTtkfASbk", "কোরআনের মুজিজা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("vmGf1oVWGnc", "যুবক, তোমার কি লজ্জা হয় না ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("J67xKhJNPuA", "জুমুআর খুতবাহ | শয়তানকে পরাজিত করুন ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("m71f9i7cqL8", "যুব সমাজের অবক্ষয় ও উত্তরণের উপায় ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("KHXUJUABD3M", "শাসকদের প্রতি নসিহত ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("76go8D_B96I", "পরিবার গঠনে রাসূল (সাঃ) এর ভুমিকা ও আমদের শিক্ষা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("nkFNbdKV_dc", "আপনি কি সত্যিকারের পুরুষ? জুমুআর খুতবাহ ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("UxQ48M8ICn8", "আপনার জীবনের লক্ষ্য উদ্দেশ্য কি হবে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("w06EZ00An64", "আপনার দ্বীনদারিত্ব যেন আপনাকে অহংকারী না বানায় ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("Cd4f9OMZpOA", "কেমন ছিলেন রাসূল (সাঃ) | সীরাহ কনফারেন্স ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("Pc4psi8bQkU", "আল্লাহর ভয় | Jumar Khudbah ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("cwDZHTC0VtI", "কুমিল্লায় আলোচনা করলেন ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("gEaYVdbskDQ", "জুমুআর খুৎবাহ | বারাকাহ ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("iEWtMJGZ0zI", "মুসলিম উম্মাহর সমস্যা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("omq9qHdmpKI", "আল্লাহর প্রতি কৃতজ্ঞতা ও তার অনুভূতি ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("lqFRQqfd1Zo", "আকিদার পাশাপাশি আখলাকেও সুন্দর করতে হবে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("NJ1igmHJd4Y", "উদ্বোধনী অনুষ্ঠান কোরআনের ভাষা ভাষাতাত্ত্বিক মোজেজা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("WhgSfeTyETM", "কৃষিতে উদ্ভাবন; ইসলাম কি বলে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("wD2YZyH9GuM", "প্রত্যেক নারীর এই বক্তব্যটি শুনা উচিৎ ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("i5W2L-ZclFM", "সূরা ফাতিহার বিস্ময়কর সাদৃশ্য ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("xznwa-CMDBc", "আপনার দ্বীনিদারি পরিমাপের যন্ত্রের নাম কি জানেন? একটু মেপে নিন তো ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("mOHCUm83ckw", "রাসূলুল্লাহ সা এর রাষ্ট্রনীতি ও দাওয়াহ কৌশল ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("jRJDaowr4-A", "সাম্প্রদায়িক সম্প্রীতির ব্যাপারে রাসূল (সাঃ) এর মনোভাব ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("ouIeYJFAxj0", "আপনার সন্তানকে দ্বীনের শিক্ষা দিন ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("lo4jhX-Ka9w", "জান্নাত নিয়ে সেরা বক্তব্য প্রফেসর মোখতার আহমাদ ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("KOdlq3nRhCU", "সম্পূর্ণ জুমু’য়ার খুৎবাহ আল্লাহ ভীতি ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("eysf8fQB5mk", "কিভাবে আপনার সন্তানদের আলেম/আলেমা বানাবেন?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("iSJOFRhqe1I", "আল্লাহর ভালোবাসা পেতে চান?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("cSIt4wPXs_8", "গুরুত্বপূর্ণ প্রশ্নোত্তর | না শুনলে উত্তরগুলো অজানাই থেকে যাবে ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("vdyEzXkG_C4", "সূরা ইউসুফ থেকে যুবকদের জন্য শিক্ষা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("A4iz-edPm30", "সুন্নতে মোড়া জীবন ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("v4YxDVOrVzQ", "কুরআন নিয়ে অসাধারণ কিছু কথা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("a9w5VPabwvU", "সমসাময়িক বিশ্বে একজন প্রকৃত মুসলিমের প্রতিবিম্ব কেমন হওয়া উচিৎ ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("jf9viKiCjII", "সুন্নাত পদ্ধতিতে বিয়ে পড়াচ্ছেন শায়খ প্রফেসর মোখতার আহমাদ ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("_6F9QTTW6tc", "কিভাবে সন্তানদের মাঝে আত্মসম্মানবোধ তৈরি করবেন?", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                addVideoItem("LoDu_wps9TU", "সূরা কাহফ: গুহাবাসী, আধুনিক গর্তময় জীবন ও দাজ্জাল ভাবনা ।", "বক্তা: অধ্যাপক মোখতার আহমাদ");
                createPlayList("প্রফেসর মুখতার আহমদ", R.drawable.mokhter_ahmad);
                //==========================================================================





                // ==========================================================================
                addVideoItem("IzSk3biR_qg", "বছরের প্রথম নতুন আলোচনায় মুগ্ধ লক্ষ লক্ষ জনতা-2022।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("45D_dOVErXc", "আধুনিক বিশ্বে ইসলাম ও আগামীর প্রস্তুতি ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("U0o_H74S22Q", "সাফল্যের সোপান ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("SUndygAIUrI", "বর্তমান মুসলিমদের অবস্থা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("YFGZvKrTfuU", "কুরআন পড়া কিভাবে শুরু করবেন ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("UGHvxWI8MK4", "বাংলার যুবকদের আইডল চকরিয়াতে ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("NIEuGjV2xlo", "আলোকিত জ্ঞানী ২০১৮ পর্ব ১৩ ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("Y1pWs5PFAtM", "দুনিয়ার মোহ থেকে বাচার উপায় ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("Okomli8lAlI", "হালাল গার্লফেন্ড হাসি থামাতে থামবে না ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("58M8bHCtsDw", "সুরাতুল আসর তাফসীর | চমৎকার ব্যাখ্যা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("qh2yDqOo2AE", "হাদিসে জীব্রিল আলাইহিস সালাম ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("ag9OIih87sk", "দ্বীন তালাশ!এবং অনুধাবন। এক অতুলনীয় বয়ান ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("w3bgk1s21rc", "চাঁদ দুই ভাগ হওয়ার বর্ণনা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("JTw6LR0XwIM", "আধুনিক বিশ্বে ভয়াবহ প্রযুক্তি ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("2hYd-buHO7o", "তারুণ্যের জয়গান ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("HnwSEzG2mKU", "পরিবার নিয়ে কিছু গুরুত্বপূর্ণ কথা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("8rv_JwgfAEs", "কেয়ামতের শহর ঢাকা কেন ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("zT60ppmMifc", "শেষ জামানার কিছু নির্মম বাস্তবতা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("O7DIHye_Xho", "কেমন হবে তৃতীয় বিশ্বযুদ্ধ ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("wn0GVfXH6ZE", "নারীদের নিয়ে আবু ত্বহা মুহাম্মদ আদনানের নতুন ওয়াজ ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("CmdTUdljh1Q", "জীবন-যেখানে-যেমন ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("s-RySz2x2Qo", "তোমাদের বড় ফিতনা হলো প্রেম ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("ZZMRmLR4o5M", "লাভজনক জীবনধারা! সময় ব্যবস্থাপনার সংক্ষিপ্ত সংস্করণ ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("qUeQ5-RmObc", "গণতন্ত্র, জাতীয়তাবাদ ও সুদ নিয়ে প্রশ্নোত্তর ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("dWXsqYzFhsk", "আশ্চর্য ফযিলত এই সুরা ফালাক্ব ও নাস ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("8e0GPsaHuSs", "শিরক ও আধুনিক সভ্যতার আল্লাহদ্রোহী ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("PcZzGM8yYSU", "কাগজের টাকা কেনো হারাম ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("HERDnaJ-QTc", "যে সময়ে দোয়া করলে কবুল হবে ১০০% গ্যারান্টি ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("9sCmhBSJGo8", "RAW এর সম্পর্কে ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("w3bgk1s21rc", "চাঁদ দুই ভাগ হওয়ার বর্ণনা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("Qg7Rstzee3o", "বর্তমান সময় এবং আসহাবুল কাহাফের ৯ যুবকের ঘটনাা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("2uYNlX-CJUI", "মুমিন ও মুসলমান কারা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("u-L7l3YyRUk", "দাজ্জাল সম্পর্কে কোন ধর্মের কি বিশ্বাস ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("U-vNHBb3TkU", "মিডিয়ার উদ্যেশে আবু ত্বহা আদনানের বক্তব্য ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("jXZap_ctE8k", "শেকড় থেকে তারুণ্যের প্রেরণা ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("-8nuP1fymY4", "আল্লাহ আমাদের কেনো সৃষ্টি করলেন ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("oPambOZPuSE", "ইহুদীদের ভয়ংকর কালো জাদু ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                addVideoItem("ExDDyVdtqb0", "পৃথিবীর রহস্যময় পরিবর্তন কি ।", "বক্তা: আবু ত্বহা মোহাম্মদ আদনান");
                createPlayList("আবু ত্বহা আদনান", R.drawable.abu_taha);
                //==========================================================================





                // ==========================================================================
                addVideoItem("5mWX6Weycls", "আল্লাহকে ভয় করুন ভয় করার মত", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("NobwgKWqx5Y", "কোনো মানুষের কোনো ক্ষমতা কাজে আসবে না", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("xZs0XglOqEU", "যুবকদের জন্য বিশেষ নসিহা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("AABEmxzxVHQ", "শরীরের লোম দাড়িয়ে যাবে- জামশেদ মজুমদার", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("i3JNnpHZfPM", "হাজার যুবক ভাই-বোনদের আইডল জামশেদ মজুমদার । যুবক দের জন্য উপদেশ", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("qa6M6IrhSaM", "অন্তর পরিবর্তন করার মত কিছু কথা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("4nBY_sQz3tM", "আকাশ হবে গলিত ধাতুর মত, কিয়ামত দিবসের ভয়াবহতা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("xjoDgla4K_Y", "কথাগুলো শুনে দর্শকদের চোখে জল এসে গেলো", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("yfxOmylz9g0", "বর্তমান সময়ে যুবকদের বিভিন্ন সমস্যা নিয়ে গুরুত্বপূর্ণ আলোচনা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("FUUwd35c9mY", "যুবক তুমি ফিরে আসো | দ্বীনকে নিয়ে তামাশা করিও না", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("dQR9K51t3n0", "আপনি কি পরিপূর্ণ মুসলিম? না মুশরেক?", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("ZjnThsuCHSk", "গুনাহ থেকে বাঁচার জন্য পালিয়ে বিয়ে করা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("fq1A18NR73U", "ফেসবুকের দ্বীনী বোন", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("ZiYmnrq1Atg", "যে বক্তব্য শুনে আপনার হৃদয় ভরে যাবে", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("pUGkBFgPyKA", "নামাজ ছাড়া মানুষ মুসলমান থাকে না!", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("2DAgpm7kkXo", "নামাজ সম্পর্কে অসাধারণ আলোচনা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("3FUl47hyG0o", "কোনো অন্তরঙ্গ বন্ধু খবর নিবে না", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("QLZlg1ql5b8", "এই প্রথম সালাফি কনফারেন্স এ জামশেদ মজুমদার", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("frXmzhoC-ig", "আপনার সকল সমস্যার সমাধান আল্লাহ দিয়েছেন", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("7tPQKQtGdn4", "এবার নিজের কোটি খুলে প্রাকটিকাল দেখিয়ে দিলেন বিদআত কি", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("HNmGzSmfMVE", "যারা বিদ'আত করে ,আর যারা সিগারেট খায়", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("OFv9VGaOpnk", "আল্লাহকে যে কারণে ভয় করা উচিত", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("StllIXdCrYs", "একবার শুনুন কথা গুলো | অন্তর ছিড়ে যাবে", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("qa6M6IrhSaM", "অন্তর পরিবর্তন করার মত কিছু কথা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("GSrMDCG275Q", "লক্ষ লক্ষ জনতার আইডল । যুবক যুবতীদের বলছি", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("tJiYA8cHgOk", "জুম'আর খুৎবা | সালাতের গুরুত্ব", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("H1dqqWj4KKA", "এমন কোন পাপ নেই, আল্লাহ চাইলে ক্ষমা করতে পারেনা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("jqckxhM1qh8", "হৃদয় কাঁপানো বাংলা ওয়াজ, জামশেদ মজুমদার", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("xSsJv2XRxk8", "তাবিজ সম্পর্কে এভাবে কেউ আগে বলে নি", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("2FUQOv2SPD0", "মৃত্যু নিয়ে হৃদয়স্পর্শী কিছু কথা!যা শুনলে বারবার মৃত্যুর কথা মনে পড়বে", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("h9wQejqf9RQ", "সর্বশেষ জান্নাতি ব্যক্তির ঘটনা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("_HntjUFNiFs", "দান সদাকার গুরুত্ব ও ফজিলত। দান সদকার গুরুত্বপূর্ণ আলোচনা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("k67eQpXR4Hs", "হঠাৎ হুম\u200Cকির মু\u200Cখে ইউটিউবার! লাই\u200Cভে এসে একি বললেন জামসেদ মজুমদার নেট দুনিয়ায় ঝড় তুললেন", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("k8-Z3qSNXJU", "নারী-পুরুষ উভয়ের জন্য পর্দার বিধান সম্পর্কে গুরুত্বপূর্ণ নসীহত!!", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("sAiCO5A_SyE", " তুমি মিথ্যুক মা!", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("jSDRWuxIdvo", "নামাজ নিয়ে গুরুত্বপূর্ণ কিছু কথা। জুমু'আর খুৎবার কিছু অংশ", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("KK4eqMbqkB0", "গান-বাজনা বাজিয়ে আমাদের উপর বিপদ আনিয়েন না ?", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("3vxUOLQcnSM", "আল্লাহর দয়া থেকে নিরাশ হবেন না ?", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("2FUQOv2SPD0", "মৃত্যু নিয়ে হৃদয়স্পর্শী কিছু কথা!যা শুনলে বারবার মৃত্যুর কথা মনে পড়বে", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("4uCnm7wU1W4", "গুরুত্ব পূর্ণ কিছু বিষয়ে আলোচনা, জামসেদ মজুমদার।", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("Ag7XW2_bDxw", "সব ক্ষেত্রে আমরা লাভ-লস বুঝি |কেবলমাত্র সলাতের বেলায় আমাদের যতো গাফিলতি! কিন্তু কেন", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("4ZafT3Ox37U", "যারা ফজরের নামাযে উঠতে পারেন না তারা শুনুন দয়া করে", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("FUUwd35c9mY", "যুবক তুমি ফিরে আসো | দ্বীনকে নিয়ে তামাশা করিও না", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("ZjnThsuCHSk", "গুনাহ থেকে বাঁচার জন্য পালিয়ে বিয়ে করা", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("UVfjA3ZkiJQ", "অশ্লীল দের বিরুদ্ধে এভাবে রুখে দাড়াও মুসলিমা বোনটি আমার", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("hRMR4dVeXqA", "ইয়া রাসুল আল্লাহ্ | বেটা গোস্তাখে রাসুল", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("I7CyNVwFKTE", "আমাদের জীবনের পূর্ণাঙ্গ উদ্দেশ্য", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("3pTZgZBu2lo", "জুম'আর খুৎবা | প্রত্যেক যুবকের শোনা উচিত", "বক্তা: জামশেদ মজুমদার");
                addVideoItem("97NFJPL5mU4", "যুবক তুমি ভুল বুঝনা | আলেমদের কথা তুমি ভুল ভাবে নিওনা", "বক্তা: জামশেদ মজুমদার");
                createPlayList("জামশেদ মজুমদার", R.drawable.jamsed_mojumdar);
                //==========================================================================





                //==========================================================================
                addVideoItem("d_zEPKQs_KU", "ডাঃ আব্দুল্লাহ জাহাঙ্গীরের জীবন কাহিনী ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("5K1FrkJ40kY", "মুসলিম জাতির ঐক্যের প্রয়োজনীয়তা এবং ঐক্য কিভাবে সম্ভব?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("v7a18CUb6Dc", "আপনার প্রতি রাসুলﷺ এর তিন উপদেশ -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রহ. ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("jqHT5Hyq1_o", "সুন্নাত পালনের গুরুত্ব/ মাসিক মাহফিল প্রশ্নোত্তর-20১৪ সাল ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("opM7_rtlEyg", "কিয়ামতের আলামতসমূহ কি কি? ইমাম মাহদী কখন আসবেন? দাজ্জাল কেন আসবে?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("lHwCw6mqXpQ", "ঈদে মিলাদুন্নবী উৎপত্তি ও ক্রমবিকাশ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("q2shOMSZ0kc", "দুবাই সফরের কিছু চমৎকার অনুভূতি ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রাহিমাহুল্লাহ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("sANa-PCSjrI", "আল্লাহুয়াকবার! বিস্ময়কর একটি ওয়াজ নসিহত ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("8anNglpMV8I", "এমন অপ্রিয় সত্য ওয়াজ শুনেছেন কি কখনো !", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("_NFe5hxcBWY", "বিপদে পড়লে দুআ চাওয়ার একটি শিক্ষণীয় গল্প ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("5ck37J_OISo", "আলহামদুলিল্লাহ। অসাধারণ একটি আলোচনা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("JSuiT3n8M4U", "তাবলীগ জামাত সম্পর্কে ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("uv9wM5PtrpY", "নামাজ সম্পর্কে শ্রেষ্ঠ আলোচনা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("IFaPOtdBtfA", "১০০টি জীবন ঘনিষ্ঠ গুরুত্বপূর্ণ প্রশ্নোত্তর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("a83oooBcFl8", "আলহামদুলিল্লাহ। হৃদয় নিংড়ানো অসাধারন একটি আলোচনা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("hUsdJRobdRA", "আলহামদুলিল্লাহ! সুস্পষ্ট ভাষায় বিস্ময়কর একটি আলোচনা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("ag0_qscrJ2g", "আল্লাহুর অলিদের পরিচয়। অসাধারণ একটি আলোচনা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("ey9VlcCCapE", "ঈমানের মজা কিভাবে পাওয়া যাবে ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("sLlaU1yCHFc", "অতীব গুরুত্বপূর্ণ কিছু ইসলামিক প্রশ্নোত্তর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("9K_wuVawflg", "আখিরাতের চিন্তা এবং আব্দুল কাদের জিলানী রহমতুল্লাহি আলাইহির জীবনী ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("p-YPQzWx6qY", "কিভাবে দোয়া করলে আল্লাহ দোয়া কবুল করেন ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("rJeGND4ZZFc", "পীর মুরিদী উসিলা সম্পর্কে সব থেকে বেস্ট আলোচনা এটি ব্যাখ্যা সহ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("RaRLRTcT2m4", "আমাদের ঐক্য কি ভাবে সম্ভাব ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("ZAcUU7nejKw", "হতাশা ও দুশ্চিন্তা থেকে মুক্তির উপায় ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("3-PMrMly_9I", "হানাফিদের নামাজ কি সহিহ? ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("ww5YsrVm-Rg", "ঈদ-ই-মিলাদুন্নবী’উৎপত্তি ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Lbuypp7phT4", "শ্রেষ্ঠ ও বুদ্ধিমান মুসলমান কে ?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("pu_igmJ3I4I", "পীরের মুরিদ হওয়া কি ফরয ?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("5-DWXaH6jvk", "সড়ক দুর্ঘটনায় যদি কেউ মারা যায়, তবে তাকে শহীদ বলা যায় কিনা?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("NOp294qsw5I", "নামায না পড়লে ঈমান ঠিক থাকে কিনা?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Kcro3Zo6QcU", "প্রত্যেক মেয়ে এই লেকচারটি শুনবেন ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("efb9K7LnHHE", "সুন্নাহের আলোকে বিবাহের আনুষ্ঠানিকতা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("k2CJybao17M", "আমাদের সমাজে বহুল প্রচলিত কিছু শিরক ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("0GEalwTyb_Q", "ওহাবী কার ?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("XahVWabvqUM", "তওবা ও ইস্তিগফার এর গুরুত্ব ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Oh4vAxuHuNQ", "দাঁড়িয়ে ইয়া নবী বলে মিলাদ পড়াওঃবিদাত?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("L7FLOCb3cA0", "কিশোর সাহাবীর শিক্ষা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("tjgA3iXoN3Q", "দেড় হাজার বছরে তিনহাজার ইমাম মেহেদী ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("vwdtmlqpeWI", "আশুরা ও কারবালার প্রকৃত ইতিহাস ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("DRLjwZw2pOc", "স্বামী স্ত্রীর দাম্পত্য জীবন সুখময় করতে করনীয় কি?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("DaQStNB9VN0", "সিয়াম রোজা সফল করার কিছু গুরুত্বপূর্ণ উপায় ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Kocxx7CCW7c", "অশ্লীলতা এবং পাপ থেকে মুক্ত থাকার উপায় ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("a-6_qUh8Vd4", "কুলুপ নিয়ে ৪০ কদম হাঁটা যাবে কি ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Zo-3f4Gr5Hs", "রাসূল (সাঃ) এর ছায়া ছিল কি -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("iFwG3vQ25TE", "ছেলে-মেয়ের মাঝে সম্পত্তি বণ্টনের হুকুম ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("m3jc_VcIAmY", "তাকওয়ার দুটি কথা - ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Sbr2r5Z2do0", "মাযহাব এতো কেন?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("jqHT5Hyq1_o", "সুন্নাত পালনের গুরুত্ব/ মাসিক মাহফিল প্রশ্নোত্তর-৪-১৪ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("fOxkApDww9Y", "মাসিক মাহাফিল ও প্রশ্নোত্তর ২০১৪ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("JSuiT3n8M4U", "তাবলীগ জামাত সম্পর্কে ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("KUtvuRbC33M", "গুরুত্বপূর্ণ ৩টি প্রশ্নোত্তর ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রহ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("CkUam_ZxNnU", "টিভিতে খেলা দেখা কি জায়েজ?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("q2shOMSZ0kc", "দুবাই সফরের কিছু চমৎকার অনুভূতি ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("QZ5chRjvPpU", "তাশহুদের সময় ইশারা করা যাবে কি?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("lIQNhTmkBiY", "মাসিক মাহফিল 4-2014 -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("CURNOZByVLU", "নাস্তিক হয় কারা?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("7qSg1ESSMnw", "হানাফিরা কি সহিহ হাদিস মানে না ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("NadoGszKHbk", "বিতর নামাজ পড়ব কীভাবে?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("VEwoEFEMfKE", "খুব সহজে জান্নাতে যাবো কীভাবে?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("pEPW7cmU_Tw", "ছোট বাচ্চাদের গালায় তাবিজ ব্যবহার করা যাবে কি?", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("lODdus33yIw", "আলেমের পিতা হওয়ার জন্য করণীয় কি ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("FQ1Wqc7XvYM", "আধনিক সভ্যতার মাধ্যমে পরিবার হরিয়ে যাচ্ছে ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("8vmehG4u35M", "বিদআত কখন হয় কি ভাবে হয় ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("NeLywZ701s8", "প্রচলিত কুলখানি ও ইসলাম -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("NqtJzck-hnM", "পিতা-মাতা সম্পর্কে শ্রেষ্ঠ ওয়াজ ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("0Py6nNATUFg", "ইলমুল কালাম ও আশআরি আকিদা সম্পর্কে ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("wvv-XwLB8W8", "অনেকে বলে একেক হুজুর একেক কথা বলে আমরা কোথায় যাবো ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("8Zc9Lfyj8b0", "সুন্নাতের পরিচয় -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("hiMyLK6Ndos", "ইসলাম কি চার প্রকার -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর রহ. ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("fgK8tUxpe-E", "মৃত ব্যক্তির জন্য সাক্ষ্য দেওয়া সুন্নাত পদ্ধতি কি ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("sMMXocK9yRI", "সকল নবী রাসূল ইসলাম প্রচার করেছেন আমরা কোন ইসলাম গ্রহণ করব ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("3-w4tjAc38I", "ইসলামে শিক্ষার গুরুত্ব ও শিক্ষকের মর্যাদা ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("iMD38qOjpow", "মৃত ব্যক্তির জন্য সাওয়াব পাঠানো পদ্ধতি ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("bNmvGX9Wn6I", "সালাম ও সুভেচ্ছা -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("QC5mn8o6VMQ", "আল ইনসাফ ৮ম ক্লাস ফুল -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("il9Z_Y64QP4", "আল ইনসাফ ৯বম ক্লাস -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("Zf4GE3BhbXs", "বিজয় ও স্বাধীনতার পর সুন্নাহর আলোকে মুমিনের দায়িত্ব ও কর্তব্য ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("TpnTbNOuxM8", "হিজরী নববর্ষ -ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                addVideoItem("u40iK4Zr-G4", "স্বাধীনতা ও বিজয় ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর ।", "বক্তা: ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
                createPlayList("আবদুল্লাহ জাহাঙ্গীর", R.drawable.jahangir);
                //==========================================================================





                // ==========================================================================
                addVideoItem("ddIwxKFy1K8", "দ্বা’য়ী ইলাল্লাহর বৈশিষ্ট্য ও তাফসিরুল কুরআন মাহফিল ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("r40Dk-ABcho", "অমুসলিমদের সাথে মুসলিমদের সম্পর্ক কেমন হওয়া উচিত?", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("NJCRgo9vyE0", "স্ত্রী ও সন্তানদের সাথে বিশ্ব নবী কেমন আচরন করতেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("60q6cvaLgWA", "কিভাবে আল্লাহর উপর ভরসা করব?", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("AsltzQW66ZA", "আসুন এ রমাদানে দানের হাতকে প্রশস্ত করি ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("_FLF5xEqNnY", "প্রাণীর ছবি অঙ্কনের ব্যাপারে কি বলে ইসলাম?", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("fBSuRJwzRdk", "মাজহাব মানেই কি বিভক্তি?", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("pR74GPeZaCU", "ভালো মৃত্যু এবং খারাপ মৃত্যুর আলামত ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("famZc8-oyNc", "শীতল আরশের নিচে ছায়া পাবেন যে ৭ শ্রেণীর ব্যক্তি ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("mj_iEdd-Qpo", "শহীদ কারা?", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("8YMl24t7cQk", "ইসলামে স্বপ্নের গুরুত্ব ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("bcpX21skt6E", "বিদায় বেলা (মৃত্যুর আগে ও পরে যা ঘটবে) | কাঁদতে চাইলে শুনুন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("4p2uLjiBm3E", "কোরআন ও বিজ্ঞানের সামঞ্জস্য ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("RG5BV8DCGCg", "কবরের জীবন কতইনা ভয়ানক ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("qAx4tozJh2w", "মনে অশান্তি, কিছুই হচ্ছেনা! খুব হতাশ!। ওয়াজটি শুনুন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("P0vlFCc_IrM", "হতাশ হবেনা কঠিন বিপদে কিভাবে আল্লাহর সাহায্য চাইবে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("Ng1T7Pu_bsg", "জান্নাত কত সুন্দর হবে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("eu2Sq41wmnk", "কোন ভুলের করনে রহমতের ফেরেশতা আপনার ঘরে প্রবেশ করেনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("2sGjw482nsA", "পারিবারীক জীবনে সুন্দর সমাধান শুনুন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("tdiazHb4Mbc", "জাহান্নামের কঠিন শাস্তি ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("9fqdnUsm728", "খুব বিপদ কি করবেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("GkRMQm50FFM", "স্বামী স্ত্রীর ভালোবাসা নিয়ে ওয়াজ ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("12Kl7QrQs-Y", "সন্তান মানুষ করার পদ্ধতি ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("McamgsziSEs", "ছেলের আলোচনায় বাবার চোখে পানি ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("NGXc7VUpgNM", "সূরা ইয়াসিন তাফসীর ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("EM3y2u6s5Wg", "জান্নাতে যেতে মাত্র ৯টি গুন লাগবে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("G-GjC-PKLu4", "মৃত্যুর সময় মানুষ কি কারণে চিৎকার দিয়ে উঠে যদি জানতো ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("UdamirKBEe4", "কান্নার ওয়াজ। ইব্রাহিম নবীর সম্পূর্ণ ইতিহাস ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("544B_MG6EIw", "হাশরের মাঠ কোন দেশে হবে? জীবিত থাকতেই জেনে নিন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("x-I3j5xX0tQ", "ওমর রাঃ এর জীবনী ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("otg9tzJsLTk", "হুসাইন রাঃ যে কথাগুলো বলে রাসুল (সাঃ) কে কাঁদালে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("yLDLyZhkeIY", "মেয়েটির আল্লাহু আকবার এর সাথে এক সাহাবীর আল্লাহু আকবার এর ঘটনা মিলে গেল ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("YzJemmYcap8", "জাহান্নামের করুন একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("TupIY-L3aA8", "আদম নবীর শ্রেষ্ঠ একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("XF9hWieCF40", "আল্লাহর দয়া নিয়ে শ্রেষ্ঠ একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("77-EqbWzpro", "ইয়েদ কুতুব শহীদ এর সেই করুণ ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("mBWP3DH2njo", "সাত আসমানের অবাক করা তথ্য দিলেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("pnMI_zewNBg", "আদনান সহ সকল আলেমদের যে মেসেজটি দিলেন আজহারী ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("kHDEwxWI2OU", "বিশ্ব নবী এবং একজন সাহাবীর ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("LbQgKQKez6k", "যে বিষয়গুলি নিয়ে কখনোই আফসোস করবেন না ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("YOcOxyLihq4", "নতুন বছরের যেভাবে শুরু করবেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("_29Fi7hGhxI", "লঞ্চে উঠে হুজুর একবার বিপদের সম্মুখীন হয়েছিলেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("A3-B0D7wmJY", "আপনি হতাশ দোয়া কবুল হয় না কেন?", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("-606n5qX0Tk", "মেয়েদের পারফিউম ব্যবহার নিয়ে যা বললেন আজহারী ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("fMSuZNozcto", "হুজুরের কাছে যে গজলটি শুনতে চাই শ্রোতারা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("o6qmfU2iCS8", "16 ই ডিসেম্বর নিয়ে হুজুরের শ্রেষ্ঠ একটি গজল এবং ওয়াজ ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("NIGSbX5EF4A", "বিশ্ব নবীকে দাওয়াত দিয়ে ইহুদি মেয়ে বিষ খাওয়ালেন করুন ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("mCje6qI2BO0", "আধুনিক মুসলমান ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("bACX2WI-SSk", "হিজড়াদের শুধু চেয়ারম্যান নয় পুলিশ ও হতে হবে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("3yTKCEJ1fEc", "অহংকার এবং ধ্বংস ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("rZTx5GKDls8", "মুমিনদের পরীক্ষার করুন ইতিহাস ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("lbCuf9me_fs", "সুখী পরিবার গড়ার ফরমুলা জেনে নিন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("ym79KWzng78", "আল্লাহ এবং বান্দার সম্পর্ক কি ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("rlf4CcFmLoA", "ইব্রাহিম নবী এবং নমরুদের শ্রেষ্ঠ একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("rC3dIkiW5F0", "গাড়ির সামনে বিক্ষোভ করুন একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("u_gTc8lOosQ", "হারকিপটা ব্যক্তিদের নিয়ে একটি করুণ ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("5GgUoUD9t0k", "হুজুরের এই ওয়াজটি শুনলে র\u200C্যাগ ডে নামক অশ্লীলতা বন্ধ হয়ে যাবে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("DdrXjFwPTkQ", "সাহাবীদের সাথে কোরআনের অলৌকিক ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("J7UXdHc36nk", "শয়তান আল্লাহকে চ্যালেঞ্জ করে হাস্যকর কথা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("ZkPa2XSuduk", "গার্লফ্রেন্ড বয়ফ্রেন্ড সম্পর্ক হালাল কিভাবে করবেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("KugL-Zva2Es", "বাংলাদেশিদের বিদেশ ভ্রমণ নিয়ে যে কথা বললেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("_c9mX_y20iI", "সকল নবীদের স্পেশাল দোয়ার করুন ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("Ra1uyks2VSw", "মেয়েদের অশ্লীল পোশাক নিয়ে একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("2cvQYcx7pu8", "বিয়ে করার আগে হুজুরের এই কথাগুলি অবশ্যই শুনুন তারা কি সুখী হতে পারবে ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("NPU5yLwyUc0", "বনি ইসরাইলের এক খুনির করুন ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("uQRLNPG6wJ4", "মুসলমানের বন্ধু হিন্দু যে কথা বললেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("F0AcGMSS4Qw", "মালাকুল মউত ফেরেশতার মৃত্যু কিভাবে হবে করুন ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("4ZWIb_PDC2g", "কাজী ইব্রাহিম হুজুর গ্রেফতার আলেমদের সম্মান নিয়ে যা বললেন আজহারী ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("jM3FtgZ2N6A", "হযরত আলীর করুন একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("VTICwZCCGkc", "নামাজের কত গুরুত্ব সাঁতরিয়ে নামাজ পড়লেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("c0iKFqEoGuM", "এক সাহাবীর মসজিদে প্রস্রাব করা নিয়ে শ্রেষ্ঠ একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("C8cZIe1_d-w", "এহসান গ্রুপ এর ঘটনার সাথে হুজুরের যে কথাটি মিলে গেল ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("DF9QWIaSGa4", "জুমার দিনের শ্রেষ্ঠ কিছু ইতিহাস ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("QVURsSoGMSs", "কি বুঝে মানুষ এই গানটি শুনে। গান নিয়ে শ্রেষ্ঠ একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("wl_SV-FC7j0", "প্রধানমন্ত্রীও যে কারণে ভয় পেয়েছিলেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("iewN4Or4nsg", "বদরের যুদ্ধের বিশ্বনবীর একটি করুণ ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("QZAm-NX9wlM", "সরকার এবং মুসলিম শাসক কে নিয়ে গজল এবং ওয়াজ ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("fpWYU3-TTsU", "কোরআনের বিশেষ একটি সূরার ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("uUqnH9d4c74", "আল্লা ওয়ালা দের মৃত্যুর পর কবরের প্রথম রাত এবং প্রশ্নের উত্তর ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("975wcCkpIw8", "একজন ঘুষখোর এর ঘটনা শুনলে অবাক হবেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("k46hcrZfsFE", "হযরত আদম আঃ এর করুন একটি ঘটনা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("kW2npToU_60", "মানুষের এত টাকার চাহিদা কেন আসুন শুনি ।", "বক্তা: মিজানুর রহমান আজহারি");
                createPlayList("মিজানুর রহমান আযহারী", R.drawable.mizanur_rahman);
                //==========================================================================





                // ==========================================================================
                addVideoItem("MBaUjshaYAY", "তাওহীদ কী ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("iwh91LTd6NI", "বিদআত সম্পর্কে আলোচনা ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("F8CQD_NJxf8", "মানুষের অন্ধ অনুসরণ আপনাকে জাহান্নামে নিবে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("t9kxJGgmlks", "ওযুতে এই ভুল সকলেই করে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("pS5Hg9mT8M0", "ইসলামের নামে ভুয়া দল ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("F8CQD_NJxf8", "মানুষের অন্ধ অনুসরণ আপনাকে জাহান্নামে নিবে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("6xQKyZkhxF0", "কেন বর্জন করবেন ইলিয়াছি তাবলীগ ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("TGFleUJS-ws", "এ দেশে তাবলীগের নামে যা চলছে (২য়-খন্ড) ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("4ujHwAICB_w", "কয়েকটি ভয়াবহ জাল হাদিস ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("GZmNSGc52wM", "বিদআতি এলাকায় উপজেলা চেয়ারম্যানের অনুরোধে যে ওয়াজ করলেন শাইখ মুজাফফর বিন মহসিন ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("dG6u25FhEEw", "জাল হাদীছের কবলে রাসূলুল্লাহ (ছাঃ)-এর ছালাত ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("xfO2C7pu5RY", "আল্লাহর রহমতের ভাণ্ডার আপনার হাতে আসবে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("yAoEYrZbT4Y", "যে নেকী কখনো নষ্ট হবে না ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("sP0HoaBhYig", "যে পরিবার ধ্বংস হবেই ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("zW9g2L1bjlQ", "শিরক বিদআত মিশ্রিত আমল ও তাঁর পরিণাম ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("4Vi_V7ivd-Y", "শিলজ্জা নয় প্রত্যেক মুমীন নরনারী এই বিষয়ে স্পষ্ট জ্ঞান থাকা উচিৎ ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("BCJWIZFgA8Q", "বিশুদ্ধ আকিদার গুরুত্ব ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("dq4IWe_ibug", "মুসলিম সমাজের ভয়ানক তথ্য ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("hocI1GB2JMQ", "ক্ষমতার জোরে ধর্ম চলেনা এই ভাবেই ফিতরা দিতে হবে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("duqnL87P-XA", "মাহফিল এর সভাপতি, শ্রোতা ক্ষেপে গেলেন যে আলোচনা শুনে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("Abx3JUPKwSM", "যে সমস্ত সময়গুলোতে দোয়া কবুল হয় ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("Xc_q_dF8fIQ", "বাতিল ফেরকা মুখোশ উন্মোচন করাই ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("Cl1nVwVjmoc", "নামাজে মারাত্মক কিছু ভূল | নামাজের মাসায়ালা ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("8wqrI31Rpd8", "পীরের এবাদতে মজা কেন ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("SX6XQcMga3s", "অনুসরণ করবেন কাকে?", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("SxlaOmIB4vc", "জুম্মার খুৎবা । অন্ধ অনুসরনের পরিণাম ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("iwh91LTd6NI", "শিরক ও বিদআতের কঠিন পরিণাম ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("7U_ja3BgAI4", "শিরককারি জাহান্নামি ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("wbIjLLSYJSo", "বেনামাজি ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("UN4vAJV-qog", "বেনামাজি বদের এত বুদ্ধি ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("-9GCZvLr63I", "অনুরোধ ছলাত ছাড়বেন না ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("izY9-KWCr6o", "মশার কারনে জান্নাত-জাহান্নাম ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("buhf70OPfXc", "ফাজায়েলে হজ্জে শিরক ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("lqJkFrNAjK8", "৭০ বছরের আমল শেষ ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("-bi6wxA_lmI", "বিদআত কাকে বলে?", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("kl_hzLVO9Ag", "হুজুর বেদআত চিনে না ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("qOMfArT4Pfc", "মানুষ বেদআত করে কিসের কারনে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("LNaf0KIKLio", "কুরআন কখন পক্ষে বিপক্ষে সাক্ষী দিবে ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("1_dSFfBZZ2k", "সবার উপর যেটা ফরজ ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("mZYRdztVcj0", "যাদের মর্যাদা অনেক ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("nP30vfU2B_A", "সবাইকে কাঁদলেন যে আলোচনায় ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("O4cGIR6lQEY", "বাবা কে অপমান ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("wco3NvgFQU0", "এয়ারপোর্ট এ মুজাফফরকে অপমান ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("Qwa-v5UjltE", "সবার গোমড় ফাঁস করলেন ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("DA_xBaEWkZA", "নাটকের মধ্যে সবচেয়ে খারাপ চরিত্র ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("iSxYh1-EjiI", "সংগঠনের গোপন তথ্য ফাঁস ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("sC-SSu-8054", "আগ্নিঝড়া বক্তব্য ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("Ccfy4DNAY50", "আহলে হাদিস কথাটা কি ভুল ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("PJjriTevcr0", "আহলে হাদিস কোথা থেকে আসল ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("VIqaPNmR-4E", "আমার জীবনের বড় একটি সফলতা ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("gydUKYEoLoU", "আহলে হাদিসদের বিরুদ্দে সবাই ঐক্য ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("DM6l3xUDDS0", "যারা যাকাত দেন না তাদের জন্য জরুরী ওয়াজ ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("rQmoPgiUjxc", "নফল সাদকা | মুজাফফর বিন মহসিন ওয়াজ ।", "বক্তা: মোজাফফর বিন মহসিন");
                addVideoItem("nFYYj0xrHVg", "আপনার সাদকা কেন কবুল হয় না জেনে নিন তারপর সাদকা করুন ।", "বক্তা: মোজাফফর বিন মহসিন");
                createPlayList("মুজাফফর বিন মহসিন", R.drawable.mujaffar_bin_mohsin);
                //==========================================================================





                // ==========================================================================
                addVideoItem("u7zMnEv9r-k", "ইবাদত বিহীন তাওহীদবাদী হয় কীভাবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("2_ilMXCAeK8", "নারীদের পর্দা নিয়ে এভাবে কজন ভাবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("s_kRb5C4-UY", "যারা সালাত আদায় করে তাঁরা অহংকার মুক্ত ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("8A0pZXhTPo0", "সিজদা করো, এই সিজদার মানে কি ১ম পর্ব ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("_7wxRVu7PjM", "সিজদা করো, এই সিজদার মানে কি ২য় পর্ব ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("Rl-qqRhV6mA", "আল্লাহ অতি নিকটে এবং দোয়া কবুল করে থাকেন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("Gmk_5ycm7Io", "আদর্শ স্বামী-স্ত্রীর গুণাবলি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("5EsZ-LWuOl8", "পাপমুক্ত জীবনের জন্য কিছু উপদেশ ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("tpslDKv_T64", "ছোট্ট একটি হাদীস তাতে কত কি রয়েছে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("Vd6rH0_xK7E", "ইসলামের যুগেও জাহিলিয়াত ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("0S01sfLbhlI", "ভালো নিয়্যাতের মর্যাদা ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("3BqSkmLZFpU", "নেকীর ইচ্ছায় ভালো কাজ করার মর্যাদা় ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("KCht4OOyia8", "জাতীকে পরিবর্তন করতে হলে বক্তব্য যেমন হতে হয় ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("BaEt9VVowOc", "গ্রহণ করার মতো উপদেশ। মাহমুদ বিন ক্বাসিম ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("oCDhOUxUqao", "ইসলামিক আলোচনায় বসার মর্যাদা। মাহমুদ বিন ক্বাসিম ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("4UGDT1PxQGc", "অন্তর ও জবানকে পাপ থেকে বাচার উপায় ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("ND1_4LeOlVs", "মিলাদুন নাবী এবং এমন যে কোনো দিবস পালনের ক্ষেত্রে ইসলামের মূলনীতি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("UBp6gbfR9vo", "আমাদেরকে আমাদের কর্মগুলি নিয়ে ভেবে দেখা উচিৎ ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("_DtQwwUP4kE", "জীবনের আসল লক্ষ্য হতে হবে জান্নাত । প্রতিদিনের কাজ হতে হবে জান্নাত কামনা করা জাহান্নাম থেকে মুক্তি চাওয়া ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("FhJGpIJQ2p4", "আপনার বাসস্থান বলে দিচ্ছে যে আপনি ১জন দুনিয়াদার ব্যক্তি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("OwIKT-gOKHQ", "আমরা দুনিয়ার দিকে ঝুকে গেছি, দুনিয়ামুখি হওয়া থেকে বাচতে হলে এভাবে চিন্তা করুন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("cpKPDbAlOXQ", "আখলাক মানে কি শুধু ১টি গুণ !! আখলাক্ব মানে প্রত্যেকের স্বভাব ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("32jnZrSNkE8", "অন্তর ভালো হলে কি লাভ আর মন্দ হলে কি ক্ষতি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("KbNspFdzGao", "ব্যাপক অর্থবোধক দোয়ার ২য় পর্ব, নিরাপত্তা কামনা করা ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("vQjNTF3Mm7k", "কতক ব্যক্তির ইবাদত কবুল হয় না ১ম পর্ব ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("rgbAFCQPcXE", "আপনার অন্তরকে এই রোগগুলি থেকে বাঁচানোর চেষ্টা করুন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("HU8esRTPAzs", "কবরে প্রশ্নের উত্তর দিতে পারবেন যদি এই কাজটি করতে পারেন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("AxhLBfI6mp0", "আপনি আপনার ধর্ম ইসলাম নিয়ে চর্চা করতে বাধ্য ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("g_rYcefZv0w", "মহান আল্লাহ কত দয়াবান ও কেমন ক্ষমাশীল ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("q36XaE9bplQ", "ঈমান হলো আশা আকাঙ্ক্ষা ও ভয়ভীতি নাম ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("DckVRI8FyAg", "পাপমুক্ত জীবন গড়তে আহ্বান।জীবনকে পাপমুক্ত করতে হলে এই কথাগুলি জানা জরুরী ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("lVktDti6FUk", "আমাদের উচিৎ কর্মগুলিকে নিয়ে একটু চিন্তা করে দেখা ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("q36XaE9bplQ", "ঈমান হলো আশা আকাঙ্ক্ষা ও ভয়ভীতি নাম ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("HsBLiMseozs", "বন্দেগী বা ইবাদতের মর্ম ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("KbNspFdzGao", "ব্যাপক অর্থবোধক দোয়া, নিরাপত্তা কামনা করা ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("g_rYcefZv0w", "মহান আল্লাহ কত দয়াবান ও কেমন ক্ষমাশীল ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("AxhLBfI6mp0", "আপনি আপনার ধর্ম ইসলাম নিয়ে চর্চা করতে বাধ্য ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("HU8esRTPAzs", "কবরে প্রশ্নের উত্তর দিতে পারবেন যদি এই কাজটি করতে পারেন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("rgbAFCQPcXE", "আপনার অন্তরকে এই রোগগুলি থেকে বাঁচানোর চেষ্টা করুন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("vQjNTF3Mm7k", "কতক ব্যক্তির ইবাদত কবুল হয় না ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("32jnZrSNkE8", "অন্তর ভালো হলে কি লাভ আর মন্দ হলে কি ক্ষতি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("cpKPDbAlOXQ", "আখলাক মানে কি শুধু ১টি গুণ ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("Jo0btlkLC-c", "মাহফিলে দোকানের মেলা দেখে যা বলা হলো ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("OwIKT-gOKHQ", "আমরা দুনিয়ার দিকে ঝুকে গেছি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("FhJGpIJQ2p4", "আপনার বাসস্থান বলে দিচ্ছে যে আপনি ১জন দুনিয়াদার ব্যক্তি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("2-7l6cvdBIQ", "ইসলামের এই বৈশিষ্ট্যটি আপনাকে মুরতাদ হওয়া থেকে বাচাবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("bNGC65Do7I4", "মা বোনদের দান সম্পর্কে যা আড়ালে থেকে যায় ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("ND1_4LeOlVs", "মিলাদুন নাবী এবং এমন যে কোনো দিবস পালনের ক্ষেত্রে ইসলামের মূলনীতি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("YZ7qAYYS6XY", "চলমান পরিস্থিতি সম্পর্কে আমার অভিমত ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("PHBKVXPKZG0", "অনেকের ইবাদত যে কবুল হয়না এর দলীল ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("_DtQwwUP4kE", "জীবনের আসল লক্ষ্য হতে হবে জান্নাত ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("85JZ9WfTkSI", "আপনি যদি মাত্র ৩ বার করে বলেন আল্লাহ্\u200C আমি জান্নাত চাই ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("lDL2GqMh7BA", "কল্যাণকর দুয়াগুলির ২টি ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("MDIOhO6rrz4", "যারা সূরা আল-ফাতিহা পারে না তারা কীভাবে সালাত আদায় করবেন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("vA3wv4Z6PUc", "দোয়া কবুল করাতে হলে এই দিকগুলি লাগবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("g1A3kDENrJc", "যারা প্রয়োজনে ও স্বাভাবিক অবস্থায় আল্লাহ্\u200Cকে ডাকে তাঁদের মর্যাদা ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("qzH4_NMA3zs", "কার আত্মা কীভাবে বেড় হয় ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("Go2AQIKSFhI", "যারা জানতে পারে কখন তাঁদের মৃত্যু হবে তাঁরা কারা?", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("mrmhP8MXRHM", "পাপীদের মৃত্যু কখনই সৎলোকের মতো হবে না ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("PU0vwMFaqdI", "আসুন জেনে নেই কার মৃত্যু কীভাবে ঘটবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("uoAYBmE1qyE", "মুহাররাম মাসের সঠিক পরিচয় ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("TivwuCuWTPY", "হুসাইন রাঃ হত্যাকারিদের সাথে আমাদের কি সম্পর্ক ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("SGfXlyHD0s8", "জীবন থেকে ১টি বছর চলে যাওয়া এবং আগামী বছরের কল্যাণ হাসিল হওয়ার হিসাব নিকাশ যেভাবে করবেন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("kkDKAKSul2g", "বেকারত্বও যে ১টি বড় নিয়ামত বহু মুসলিম তা জানেনা ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("JShHPGkwBKI", "আল্লাহ্\u200Cর এই অনুগ্রহটা আপনিও পেয়েছেন ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("K2uddX_KYfU", "আমাদেরকে কেন মৃত্যুর মুহূর্ত নিয়ে ভাবতে হবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("MrHYw0nETcg", "এই দুনিয়াতে এমন ১টি দিন আছে যেই দিন প্রত্যেকে ফেরেশতা দেখতে পাবে ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                addVideoItem("H99RlgVXmEY", "মৃত্যু ১টি সৃষ্টি, এটা যারা জানে তারা ১টি বদ আক্বিদা থেকে মুক্ত ।", "বক্তা: মাহমুদ বিন ক্বাসিম");
                createPlayList("মাহমুদ বিন কাসেম", R.drawable.kashem);
                //==========================================================================





                // ==========================================================================
                addVideoItem("N5AEckG6Zz8", "পারিবারিক জীবনে রাসূল সা.এঁর শিক্ষা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("kSnSczs9olI", "স্বাধীনতা ও বিজয়ে আমাদের দায়িত্ব কিকি?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("Pv9jxqsvhFI", "কলিজা শীতল করা তাফসীর", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("veIV43J60Wk", "কুরআন কত বড় নিয়ামত!!!", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("kggAyruPVtc", "জীবনের উদ্দেশ্য বুঝতে শেখার পাঠ", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("YjD_QemPSgA", "পবিত্র কুরআনের আলোকে মৌলিক ৫টি গুণাবলি", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("zQAbhzouA0M", "সসূরা ত্ব-হার আলোকে কুরআনের থেকে কল্যাণ লাভের উপায় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("HUqBv5w2g-A", "কুরআনের আলোকে কথা বলার নিয়মাবলীঃ সম্পূর্ন বয়ান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("zHZQGaXZfSE", "বান্দার দোষ আল্লাহর ভাষায়।।সমাধান ও করনীয় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("tj1kMsmxsfQ", "জান্নাতে যাওয়ার শর্ত কি খুব কঠিন? ভেবে বলছেন নাকি আন্দাজে? ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("3oZd9OZh6Nc", "সূরা হুজরাতের সামাজিক শিক্ষা।।মানুষের জন্য মানুষের অধিকার ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("16vQmSwE2iE", "আমানত ও ওয়াদাঃ মানব জীবনে বুঝে নেয়া দায়িত্ব ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("zYRf4Ienv1k", "নারীর মর্যাদা।। সমানাধিকার? ইসলামের দিক দর্শন কি? বিস্তারিত বর্ননা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("3cdick3-xdk", "সুরা কুরাইশের তাফসীর।। সালাতে অধিক পঠিত সূরার তাফসীর ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("urCMdko0rxI", "তাওয়াক্কুল আলাল্লাহ।। কীভাবে?।। শক্তি শালী মানবের মূল গুন কোনটি?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("M6T9KjeGpPU", "সূরা ফীলের তাফসীর।।ছোটো সূরার তাফসীর ক্লাস ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("kNUGrptTlVw", "সাইফুল্লাহ ভাই এতবড় চুল কেনো আপনার? সুন্নাতের সীমা জানেন না আপনি?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("rLYz9orcyyg", "সূরা ফাতিহার তাফসীর।। সংক্ষিপ্ত শিক্ষা সহ।। তাফসীর সিরিজ ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("7Evr0r9Nw2w", "সুরা কাহাফের নয়টি অনন্য শিক্ষা ।। নতুন আলোচনা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("RU0yMmVCAfU", "আপনার অবস্থান কোথায়? কী হওয়া উচিৎ আমাদের অবস্থান? ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("8FJhcJMGayU", "যিলহজ্ব মাসের দশ দিনের দাম ও আল্লাহর যিকিরের ফযীলত ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("C84Yml-fRF8", "জাহান্নামের ভয়াবহ আলোচনা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("hjK3zgYSLoo", "জাহান্নামের ভয়ংকর শাস্তি ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("RU0yMmVCAfU", "আপনার অবস্থান কোথায়? কী হওয়া উচিৎ আমাদের অবস্থান?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("DfCFIG3usbI", "হালাল উপার্জনঃ হারাম বর্জন। উপার্জনের হারামের ধরন।।বেখবর মুমিন ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("J_7yM7LG81c", "বিশ্বময় দ্বীনের দাওয়াত । পথ পদ্ধতি প্রতিবন্ধকতা ও করনীয় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("8756Oq5_YwA", "তাহাজ্জুদ।। শুরু থেকে শেষ।। একটি জানা বিষয়ে অজানা বয়ান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("XDj0cqP0gIU", "মানব জীবনের মহা প্রতিশ্রুতি।। সাহাবিদের অঙ্গীকার পালন ও আমাদের দায়িত্ব ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("WSDBaN8UEWc", "সূরা গশিয়ার আলোকে দুই শ্রেনীর মানুষের কিয়ামতে চেহারার বর্ননা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("bQ5m7Z3lQFI", "ইহুদীদের অতীত বর্তমান ও ভবিষ্যৎঃ আমাদের করনীয় ও শিক্ষা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("CEnM0KI994o", "নিজের ভাগ্য বদলাবার আমল! বাতাসের চেয়ে দ্রুত কবুল হয় যে আমল ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("HE9zdbfCf-k", "যা ইচ্ছা তাই বলেন? মাহফিলকে রাজনৈতিক মঞ্চ ভাবেন?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("YzFFfxy7skU", "সমুদ্রের ফেনা পরিমান গুনাহ মাফের দুয়া ও তা আমলের নিয়ম ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("7n1X6_c-mZE", "আহকামে সিয়াম ও কিয়ামঃ মাসায়েলে রমাদান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("6syIEUDWfTg", "রমাদানের শেষ আলোচনা।। বিশ্বাসের সাথে নাকি বিশ্বাসঘাতকার সাথে বিদায় রমদান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("YawUSkpd_Bg", "সিয়াম কুরআন রমাদানঃ মূলত একটি প্রেসক্রিপশন। বুঝে নিয়ে জীবন সাজান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("f4a9A2yv50w", "রমাদান প্রস্তুতি ও তার জন্য কর্মপরিকল্পনা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("BkegU7DvW48", "তিন ধরনের সমস্যায় ১২ টি সহজ শিক্ষনীয় দুয়া ও আমল ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("ctWimsnyamc", "বনী ঈসরাইলের জ্ঞানপাপীদের চারটি বদভ্যাস ও আমাদের আলেমদের সতর্কতা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("0jTF8rrsquM", "খুতবাতুল হাজাত।। যে কথাগুলি কথার শুরুতে রাসূল সা. বলা শিখিয়েছেনা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("7M7jdXpvaHc", "কিয়ামতে উত্থানের ছয় ধরন ও তিন কারন ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("HIBbyDaYQTM", "ইসলামে সাস্থ ও সুস্থতার নীতিমালা। অসুস্থের প্রতি দায়িত্ব ও সুস্থতার সুন্নাহভিত্তিক আমল ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("Y4HPV9dLXUo", "ভালোবাসাঃ ইসলামের আলোকে এর বিশ্লেষন! বিশ্ব ভালোবাসা দিবসে আমাদের দায়িত্ব ও কর্তব্য ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("m7P2z-JTNm8", "রাসূল সা. এঁর ভাষ্যে শ্রেষ্ঠ দশ মানুষ। আপনার অবস্থান কততম? পুরা বয়ান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("6AVfJuJ6Xjw", "সূরা যিলযালের তাফসীরঃ মহা ভূমিকম্পের দিনের প্রস্তুতিতে আমাদের করনীয় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("_21R0q1gvgs", "আল্লাহর পথে দাওয়াত।। সৎ কাজের আদেশ অসৎ কাজের প্রতিরোধ।। ধরন ও প্রকরন ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("uJT1WH7pwxs", "মুনাফিক হবার ধাপ সমূহঃ যে ভাবে ঈমান শেষ হয়ে যায় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("CUjOagf1AU0", "নবী রাসূলগনের জীবন থেকে ঈমানদার গনের তিন প্রেরণা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("TfZ3FeIXOJM", "অহংকারঃ নয় ভাবে আসে তিন কাজে দূর হয় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("cWlhYxPINcM", "সূরা যুমারের আলোকে দুই দলের দুই পরিনতির কারন ও বাচার উপায় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("tqxtPDwjTNI", "পরকালের হিসাব দুনিয়াতে যেভাবে সংরক্ষিত থাকে।। বিজ্ঞানময় কুরআন ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("HsxPCKPZRPU", "আল্লাহর সাথে শিরক, উদাহরনসহ প্রকারভেদ। যা জানা সবার আগে ফরয ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("4bQsYCgNBJI", "সূরা হাদীদের আলোকে জীবনের উদ্দেশ্য বুঝার পাঠ ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("v2N-18_auFw", "রাসূল সাল্লাল্লাহু আলাইহিস সালামের প্রতি ঈমানের ধরন ও প্রয়োজন ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("I3n9rvpwhRI", "রাসূল সা.এর জন্ম বৃত্তান্ত ।।আমাদের করনীয় ও বর্জনীয় ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("jdil0HO_iEs", "রাসূল সা. এঁর অসুস্থতা থেকে চীর বিদায়।। সীরাতুন্নবীর অসাধারন বয়ান ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("RbA2QQPjZrM", "জাহান্নামের ভেতর থেকে চার প্রস্তাব।কারন ও তার উত্তর ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("H7p78m15JEM", "কথা ও তা বলার নীতিমালা।।একটি অসাধারন আলোচনা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("CXWSylPB1kA", "সুরা হা-মীম সিজদার তাফসীর।।অনন্য শিক্ষায় সহজ কথামালা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("CUjOagf1AU0", "নবী রাসূলগনের জীবন থেকে ঈমানদার গনের তিন প্রেরণা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("fnt-SUj2g8U", "সুরা কাসাসের চার আয়াতের তাফসীর।।চাওয়া পাওয়ার অনুভব ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("IwrgbUEFaX4", "দুয়া কখন কীভাবে কাদের জন্য কাজ করে?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("FPKocKpTN_4", "কিয়ামতে আফসোসের দশ কারনঃ কারা কী কারনে আফসোস করবে?", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("ZnwkwF5h3iU", "মুহাররামঃ হিজরী আশুরা ও কারবালাঃ আমল ও দালিলিক পর্যালোচনা ।", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                addVideoItem("oDIbsaIJfQA", "না বুঝে আল্লাহু আকবার নিয়ে ডাঃ জাকির নায়েক আর রবিশংকরের ডিবেটের স্মৃতি !", "বক্তা: আব্দুল হাই মোহাম্মাদ সাইফুল্লাহ");
                createPlayList("মোহাম্মদ সাইফুল্লাহ", R.drawable.saifullah);
                //==========================================================================





                // ==========================================================================
                addVideoItem("VL5cInv4d1E", "বিষন্নতার সমাধান আত্মহত্যা নয় ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("oDdV1x-3gvQ", "সৃষ্টি জগতের সবকিছুই আল্লাহর একত্ববাদের সাক্ষী ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("EjCjLY39uiQ", "বিবাহ ও ইসলাম। ড. গিয়াস উদ্দীন তালুকদার ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("JDUNe1Tl2_Y", "বিতিরের নামাজের পদ্ধতি কি ?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("Kl0qB1AaPnw", "ফ্রান্সের বিরুদ্ধে তীব্র প্রতিবাদ.. ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("O5NWr9X41wA", "মানবসভ্যতায় জ্ঞানবিজ্ঞান ও বিধিবিধান, নবীদের আগমনেরই ফসল ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("5T9AjvWo2ic", "নৈরাজ্য সৃষ্টি যুদ্ধের চেয়েও ভয়াবহ ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("b29KkvzPs5Q", "পর্দা হচ্ছে নারীর পিপিই ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("f1TSY3GkctM", "কবীরা গোনাহ কি মাফ হয়? ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("pTsFFdRUVDc", "মহিলারা চাকরী করতে পারবে কি..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("3wyueW2JnYo", "আল্লাহ্ তায়ালা নবীজি (সঃ) কে কেমন সম্মান দিলেন।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("WztkH8-Z9XY", "দুনিয়ার লোভ লালসা সব পাপের মূল...", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("Ag2B0qrX3Lw", "সুদি কোম্পানিতে চাকরি করা যাবে কিনা..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("GC-tj9Ohyik", "মহান আল্লাহ্ তায়ালা কোথায়..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("Ypg5Jo3wjys", "জুম'আর দিনে করণীয় কি..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("3iv9NyAdHhM", "ফ্লাইটে কিভাবে তায়াম্মুম করবেন ?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("EL_c_goBqdg", "বিবাহ ও ইসলাম..।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("TbHWn1fGUws", "সমাজে জিকিরের নামে কি চলছে..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("obBhG6np9oQ", "কিয়ামতে কাদের জন্যে দুশ সংবাদ রয়েছে...?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("54T9XZAO7LE", "আহালে বাইতের মর্যাদা ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("lO3hp6wYmP8", "আশুরার রোজা কখন রাখবেন..? এবং ফজিলত কি..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("FN2gaOWm6SA", "কোর'আনের লক্ষ কি..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("5ePljh3ygR4", "রাসূল (সঃ) নতুন বছরকে কিভাবে স্বাগত জানাতেন ?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("Y1beHNR0CE8", "মাতৃভাষা আল্লাহ্-র নিয়ামত ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("m76vgQy79wU", "হাদিস অস্বিকার কারীর পরিনাম কি..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("-1OPXuPtuK8", "ঈদের দিনে করণীয় কি..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("cOg3vKtqnSg", "কোরবানি পশুর কি কি দোষ ত্রুটি থাকতে পারবে না..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("SkGY2AlCZak", "কোরবানী দাতা কোরবানির পষু জবাই করা উত্তম ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("pn_dZ1mVevA", "আরাফাহ'র দিবস বা ইয়াওমে আরাফাহ’র উদ্দেশ্য কি?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("2yQ0WJTwhP4", "ঈদের আনন্দের সাথে ইসলমের কি সম্পর্ক..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("b_GHXo_zx7k", "আপদকালিন সময়ে কুরবানী মাসআলা ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("inHfxTK__YY", "ওজুর ফজিলত... ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("dX8u1ao0Lag", "ইসলামী ব্যাবসার পদ্ধতি কেমন?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("LIBkgcPFOnI", "জ্ঞান চর্চা ও ইসলামঃ এবং তোমার যে বিষয়ে জ্ঞান নেই সে বিষয়ে কথা বলো না ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("yliDbYxVwQc", "ভাষা আল্লাহ্-র নিয়ামত ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("kYdzN-hKTKM", "মৃত্যু ভাবনা লাগামহীন জীবনকে নিয়ন্ত্রণ করে এবং মানুষকে পরকাল মুখী করে ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("XrP5e7AlsJ8", "সিগারেট নিজেও জ্বলে অপরকেও জ্বালায় ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("RfeL0y4AUtc", "হাদিসকে অবজ্ঞা করা কুফরী নামান্তর ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("rTunq91YiE8", "মাহার, ওয়ালিমা, (১পর্ব) ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("YgW5DKYNxWQ", "মাহার, ওয়ালিমা,(৩পর্ব) ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("0DkPaShnUWE", "মুমিনের জীবনে তৌহিদের গুরুত্ব ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("R_WKNYiGOO0", "মানব সৃষ্টির করন কি?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("ItMBF_AKgKw", "বিজয় দিবস ও ইসলাম ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("mLV-iuUbeRU", "রবিউল আউয়াল মাসের গুরুত্ব...।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("AGkR1Os2mEA", "নিরাপদ সড়ক সম্পর্কে কুরআন সুন্না কি বলে?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("QQOSxZRXV58", "ইসলামের বিধি-বিধান সহজ পালনীয় ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("pPu9DX4Gg5s", "ইবাদত কবুলের পূর্ব শর্ত ইখলাছ ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("9hYPk8_tGnU", "কেমন দাওয়াত আল্লাহর কাছে গ্রহন যোগ্য..?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("29a95QtcskQ", "দরিদ্রতার নাম ধর্ম নয় ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("GY0eHD0_t0M", "সুর দিয়ে ওয়াজ করা বিষয়ে ইসলামের দৃষ্টিভঙ্গি.. ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("UfZeE1OzBg4", "ইসলামে অর্থ-সম্পদের মূল্য ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("-RAxvkO8R9c", "কোন ব্যাক্তিকে আল্লাহ্ ভালোবাসেন ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("dT_pM6Kf7Ro", "বিজ্ঞানীরা কুর'আন সম্পর্কে যা তথ্য দিলেন ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("EgCoYXU_HXQ", "মুমিন ব্যক্তি কি অসুস্থ হন?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("471hb4I3THI", "পরিবারের সাথে বাসায় নামাজ পড়া যাবে কি?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("bSZ7XyyYyIs", "সমাজে ওয়াজের নামে কি চলছে?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("SD4D9LljS6Y", "যে ওয়াজের প্রতিটি কথা গ্রহন যোগ্য...।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("4JIhf7_MN0c", "আল্লাহর পথে আহ্বান কারীর বৈশিষ্ট্য কেমন হওয়া উচিৎ ?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("LKaV-dWsiQ0", "পৃথিবীতে এত বিপদ আসার কারন কি?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("QVvItrf63hY", "ধর্মকে গৌণ করে বিশ্ব পরিচালনা দুরূহ", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("3QDBTLs64_w", "প্রথাগত ভাবে নয় বরং জেনে বুঝে আমি মুসলিম", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("uj6xFl9SrqI", "আপনি কি বিষণ্ণ? আল-কুরআনই আপনার প্রশান্তি ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("IrxWZlkksaI", "এই পৃথিবীতে মানুষ সৃষ্টির কেন?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("rArnTpdKSzk", "বিশ্বের প্রায় সব কল্যাণকর আইন ধর্ম থেকে উৎসরিত ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("h-3ZhoQ2mMo", "তারাঁ কেন ইসলাম ধর্ম গ্রহন করলেন ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("aaeKMk16pME", "ইসলামে বাজেটের গুরুত্ব ।", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                addVideoItem("QvGG2W0IHcs", "ইসলাম ও বিজ্ঞান- এবং ভাইরাস কেন হচ্ছে?", "বক্তা: ড. গিয়াস উদ্দীন তালুকদার");
                createPlayList("ড.গিয়াস উদ্দীন", R.drawable.gias_uddin);
                //==========================================================================





                // ==========================================================================
                addVideoItem("76CayvF0flE", "নবী এবং রাসুলদের ধারাবাহিক জীবনী", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("ywHoaKVf0E4", "আদম (আ.) এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("S4JR8gWIvYg", "নূহ (আ.) এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("Qe9ylM6fNYM", "ইদ্রিস (আ.) এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("Brnu5TgB0Jc", "হূদ (আ.) এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("Pxf0L6PguOY", "সালেহ (আ:) এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("tSteK_9b5Q0", "ইব্রাহিম আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("T8e9J_FleyE", "ইসমাঈল আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("LlLNy0Icf7M", "ইসহাক আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("ntfdrLthUdg", "লুত আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("_CqhdVQztxg", "ইয়াকুব আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("_lzwHFr2hBA", "ইউসুফ আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("lN_0oRePY-g", "আইয়ুব আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("jcCEiN4xhFI", "শোয়াইব আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("TbQJ6MKtp5Q", "মুসা আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("UPybeb9JdJs", "হারুন (আ:) এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("UQokR2tslts", "যুল কিফল আঃ এর জীবনী এবং আমাদের শিক্ষা ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("bV1H56LSr7A", "মুহাম্মদ (সাঃ)-এর সারা জীবন!! (সকল পর্ব একত্রে) ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("6xJStlDA-7I", "রাসুল (সাঃ) এর জীবনী শুনে চোখে পানি এসে গেলো ।", "বক্তা: মিজানুর রহমান আজহারি");
                addVideoItem("GK5c7G2i_jA", "রাসুল সাঃ এর জীবনী আবু ত্বহা মুহাম্মদ আদনান ।", "বক্তা: আবু ত্বহা মুহাম্মদ আদনান");
                addVideoItem("mt4ct5mCWxQ", "রাসুল (সাঃ) এর জীবনী গোলাম সারোয়ার সাঈদী ।", "বক্তা: গোলাম সারোয়ার সাঈদী");
                addVideoItem("fW6IPLSb6tM", "বিশ্বনবী কেন ও কিভাবে শ্রেষ্ঠ হলেন ।", "বক্তা: গোলাম সারোয়ার সাঈদী");
                addVideoItem("NJCRgo9vyE0", "স্ত্রী ও সন্তানদের সাথে বিশ্ব নবী কেমন আচরন করতেন ।", "বক্তা: মিজানুর রহমান আজহারি");
                createPlayList("নবী কাহিনী বাংলা", R.drawable.profet_story);
                //==========================================================================





                // ==========================================================================
                addVideoItem("7-xbejr91HQ", "আল কুরআনের সংক্ষিপ্ত পরিচিতি - উস্তাদ নোমান আলী খান ।", "Lecturer: Noman Ali Khan");
                addVideoItem("gUKw2NKGw_w", "আল-কোরআনের পরিচয় ।", "Lecturer: Noman Ali Khan");
                addVideoItem("1YfSFfmCg5o", "সূরা ফাতিহার বিস্ময়কর তাফসীর - নোমান আলী খান - বাংলা ডাবিং ।", "Lecturer: Noman Ali Khan");
                addVideoItem("9C064GNVZiE", "সহজ-সরল জীবন ।", "Lecturer: Noman Ali Khan");
                addVideoItem("iAG_bEGLP70", "মানুষের জীবনের বৈচিত্র কয়েকটি ধাপ ।", "Lecturer: Noman Ali Khan");
                addVideoItem("QXYvlHC9mqc", "আল্লাহর নিকট আত্মসমর্পনের পুরস্কার ।", "Lecturer: Noman Ali Khan");
                addVideoItem("MTBpAbLf9g8", "আপনি এত সমস্যায় কেন?", "Lecturer: Noman Ali Khan");
                addVideoItem("pnEsxeTQbGE", "জীবনে যা কিছু পেলে আর কিছু লাগে না ।", "Lecturer: Noman Ali Khan");
                addVideoItem("2xKWwU7IaW8", "অন্তরের অনুভুতি গুলো কিভাবে নিয়ন্ত্রন করা যায় ।", "Lecturer: Noman Ali Khan");
                addVideoItem("IkDMvg77NIA", "ধার্মিক মানুষ পথ হারায় যেভাবে ।", "Lecturer: Noman Ali Khan");
                addVideoItem("8PSL76WbvHs", "আল্লাহ ও শয়তানের কথোপকথন ।", "Lecturer: Noman Ali Khan");
                addVideoItem("yv_vRCScI28", "মানুষের চূড়ান্ত কুৎসিত রূপ | নোমান আলী খান ।", "Lecturer: Noman Ali Khan");
                addVideoItem("2o-7SpBlfu8", "প্রজ্ঞার প্রয়োজনীয়তা - নোমান আলী খান - বাংলা ডাবিং ।", "Lecturer: Noman Ali Khan");
                createPlayList("বাংলা ডাবিং লেকচার", R.drawable.dubbing);
                //==========================================================================





                // ==========================================================================
                addVideoItem("1iLzWo6Oosc", "দি ম্যাসেজ ফুল মুভি বাংলা ডাবিং", "Movie Name: The Message");
                addVideoItem("jJm3x9ixCwc", "মুহাম্মদ দ্যা মেসেন্জার অফ গড- ইরানী ইসলামিক মুভি বাংলা ডাবিং", "Movie Name: Muhammad (PBUH) The Massenger of God");
                addVideoItem("m5ZMAZR0hmI", "হযরত সুলাইমান আঃ এর রাজত্বকাল | সম্পূর্ণ বাংলায় ডাবিং", "Movie Name: The Kingdom Of Soloman The Prophet");
                addVideoItem("d81XTGgKq70", "হযরত ইব্রাহীম (আঃ) ও কোরবানী - সম্পূর্ণ পর্ব বাংলায় ডাবিং", "Movie Name: Hazrat Ibrahim (AS) O Kurbani");
                addVideoItem("0x4QE0qfkUc", "বিবি মরিয়ম ও ঈসা আ: - সম্পূর্ণ বাংলায় ডাবিং", "Movie Name: Bibi Mariam & Esa Nobi");
                addVideoItem("jC9CKEDGIPU", "হযরত আলীর (কা.) জীবনী নিয়ে মুভি; আল-নিবরাসের বাংলা ডাবিং", "Movie Name: Hazrat Ali R.");
                addVideoItem("5GVNTiQA1ME", "হযরত মুসা আ: এর জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Hazrat Musa");
                addVideoItem("xGazhsF3ROI", "হযরত দাউদ (আ.) এর জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Dawod");
                addVideoItem("W97JRWJXYJE", "হযরত ইসহাক (আ.) ও ইয়াকুব (আ.)-দের জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Ishaq & Eakub");
                addVideoItem("lv5dYUQkag4", "হযরত নূহ আঃ এর জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Hazrat Nuh AH");


                addVideoItem("1iLzWo6Oosc", "দি ম্যাসেজ ফুল মুভি বাংলা ডাবিং", "Movie Name: The Message");
                addVideoItem("jJm3x9ixCwc", "মুহাম্মদ দ্যা মেসেন্জার অফ গড- ইরানী ইসলামিক মুভি বাংলা ডাবিং", "Movie Name: Muhammad (PBUH) The Massenger of God");
                addVideoItem("m5ZMAZR0hmI", "হযরত সুলাইমান আঃ এর রাজত্বকাল | সম্পূর্ণ বাংলায় ডাবিং", "Movie Name: The Kingdom Of Soloman The Prophet");
                addVideoItem("d81XTGgKq70", "হযরত ইব্রাহীম (আঃ) ও কোরবানী - সম্পূর্ণ পর্ব বাংলায় ডাবিং", "Movie Name: Hazrat Ibrahim (AS) O Kurbani");
                addVideoItem("0x4QE0qfkUc", "বিবি মরিয়ম ও ঈসা আ: - সম্পূর্ণ বাংলায় ডাবিং", "Movie Name: Bibi Mariam & Esa Nobi");
                addVideoItem("jC9CKEDGIPU", "হযরত আলীর (কা.) জীবনী নিয়ে মুভি; আল-নিবরাসের বাংলা ডাবিং", "Movie Name: Hazrat Ali R.");
                addVideoItem("5GVNTiQA1ME", "হযরত মুসা আ: এর জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Hazrat Musa");
                addVideoItem("xGazhsF3ROI", "হযরত দাউদ (আ.) এর জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Dawod");
                addVideoItem("W97JRWJXYJE", "হযরত ইসহাক (আ.) ও ইয়াকুব (আ.)-দের জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Ishaq & Eakub");
                addVideoItem("lv5dYUQkag4", "হযরত নূহ আঃ এর জীবনী নিয়ে মুভি সম্পুর্ণ বাংলায় ডাবিং", "Movie Name: The Life of Hazrat Nuh AH");
                createPlayList("বাংলা ডাবিং মুভি", R.drawable.movie);
                //==========================================================================





                // ==========================================================================
                addVideoItem("bV1H56LSr7A", "মুহাম্মদ (সাঃ)-এর সারা জীবন!! (সকল পর্ব একত্রে) ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("zhq8AmMrges", "আদম আঃ এর জীবনী (সম্পূর্ণ) ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("ZAUUSDRk9vA", "হযরত ঈসা আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("FVm9SlshhoU", "নবী ইব্রাহিম আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("35f1Qk21CGw", "ইসমাইল আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("P7YBV9Na5MY", "হযরত ইউসুফ আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("u4kLS8Fa93Q", "হযরত সোলায়মান আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("-uAcBYPdcdo", "হযরত মুসা আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("0YE5ptfu5Z4", "হাবিল ও কাবিল ইসলামিক কার্টুন ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("PouXwThgDIU", "নবী সালেহ আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("pwkY18kbBGc", "নবী ইউসুফ আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("rSDQuikKUqc", "নবী ইসমাইল আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("FVm9SlshhoU", "নবী  ইব্রাহিম আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("Nb-1RP_xtH0", "নবী লূত আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                addVideoItem("ERWv60sTPsA", "নবী আইয়ূব আঃ এর জীবনী ।", "Islamic Carton Bangla Dubbing");
                createPlayList("নবী কাহিনী-কার্টুন", R.drawable.prophet_story_carton);
                //==========================================================================





                // ==========================================================================
                addVideoItem("dbqR8Jh73ww", "রাইকা'র মেইকআপ করা দেখে আরীবার কী হলো ।", "Carton: Madani Channel");
                addVideoItem("ALw7uu81Ji4", "কে হবে টিচার?", "Carton: Madani Channel");
                addVideoItem("8_rpXmHDcuQ", "রাইকা থেকে গ্লাস ভেঙ্গে গেল┆রাইকা পড়ে গেল ।", "Carton: Madani Channel");
                addVideoItem("VLAgPwZdhys", "রাইকার অভিনব দুষ্টুমি┆অপচয় করা কেমন ।", "Carton: Madani Channel");
                addVideoItem("739l_CFF4_A", "কানা ভুত┆Kana Bhoot ।", "Carton: Madani Channel");
                addVideoItem("JwE0I8hdnxw", "রাইকার তাড়াহুড়ো┆কানিজ ফাতিমার কথা ।", "Carton: Madani Channel");
                addVideoItem("k9kAyf1SKMo", "রাইকার কাগজের উড়োজাহাজ তৈরী ।", "Carton: Madani Channel");
                addVideoItem("w5ggz_O_5Is", "গোলাম রাসূল┆কানিয ফাতেমা ।", "Carton: Madani Channel");
                addVideoItem("cSyA0JVStFg", "রাইকা চুপিসারে কোথায় যাচ্ছে? ।", "Carton: Madani Channel");
                addVideoItem("izjKmAJOuXA", "নামাযের প্রতি আগ্রহ ।", "Carton: Madani Channel");
                addVideoItem("E9ZNoSoCHeU", "পানি পান করার পদ্ধতি ।", "Carton: Madani Channel");
                addVideoItem("tx_fkBXTvdY", "পপকর্ন ও গোলাম রাসূলের মাদানী ফুল ।", "Carton: Madani Channel");
                addVideoItem("TC2ZfWyzVVk", "বাবলু পড়ে গেছে! - নোমানের সমবেদনা প্রকাশ ।", "Carton: Madani Channel");
                addVideoItem("Wa9bad_HlGM", "ইসলামী বোনদের নামায ।", "Carton: Madani Channel");
                addVideoItem("4pk6uL3fcV4", "গরু পালিয়ে গেল ।", "Carton: Madani Channel");
                addVideoItem("XZuz1eWsE74", "কানিজ ফাতেমা কী ছুঁড়ে মারলো...?", "Carton: Madani Channel");
                addVideoItem("Y6rUICdM9Ss", "ওযু বিহীন কুরআন স্পর্শ ।", "Carton: Madani Channel");
                addVideoItem("bu2Gnds-BSo", "রাগের পরিণাম ।", "Carton: Madani Channel");
                addVideoItem("IJJqQBOo7Ms", "বর্ষাকালে সাবধানতা┆গোলাম রাসূল┆কানিজ ফাতেমা ।", "Carton: Madani Channel");
                addVideoItem("w7U3Pl9HpZ0", "খাবার খাওয়ার পদ্ধতি ।", "Carton: Madani Channel");
                addVideoItem("Ts6dN7XrAl0", "জেদি শিশু┆Jedi Shishu ।", "Carton: Madani Channel");
                addVideoItem("JWWxpYZnpNg", "কানিজ ফাতেমা'র দা’ওয়াত ।", "Carton: Madani Channel");
                addVideoItem("C0VnPkEfbMA", "কানিজ ফাতিমার সাথে কথা | মুচকি হাসি ।", "Carton: Madani Channel");
                addVideoItem("yueQ8dIWJFg", "সাবধানতা অবলম্বন করুন!", "Carton: Madani Channel");
                addVideoItem("GsOaS2Ivjhw", "িক্ষণীয় কার্টুন।কিছূ শিখতে পারবেন ।", "Carton: Madani Channel");
                addVideoItem("5CjI0mYOI7w", "নোমানের প্রথম রোযা ।", "Carton: Madani Channel");
                addVideoItem("ZFMyvwNnqP0", "রাইকা ও রারীবার ঝগড়া ।", "Carton: Madani Channel");
                addVideoItem("WMA3vx5_uYM", "দুষ্টু রাইকা চারাগাছ ভেঙ্গে ফেললো ।", "Carton: Madani Channel");
                addVideoItem("HJJVKps8VJM", "রাইকার পরীক্ষার ফলাফল ।", "Carton: Madani Channel");
                addVideoItem("GOVhE_t6W3A", "তাসবীহে ফাতিমা ।", "Carton: Madani Channel");
                addVideoItem("3wBn312436c", "রাইকার ভয়ানক স্বপ্না ।", "Carton: Madani Channel");
                addVideoItem("64BZrjzDBsM", "উদ্ভিদের গুরুত্ব ।", "Carton: Madani Channel");
                addVideoItem("p0pJMq6kk3E", "ফয়যান ও বাবলুর শক্তি ।", "Carton: Madani Channel");
                addVideoItem("ow9zQSO6JL8", "ঘরে প্রবেশের পদ্ধতি ।", "Carton: Madani Channel");
                addVideoItem("FsK4dxVRu30", "খাওয়ার ওযু ।", "Carton: Madani Channel");
                addVideoItem("VYkVU5gcnOQ", "গাড়ীতে আরোহনের দোয়া ।", "Carton: Madani Channel");
                addVideoItem("5SKuReGsYug", "ঘুম থেকে উঠার দোয়া ।", "Carton: Madani Channel");
                addVideoItem("c5sNrfUpH-E", "টোকাই ।", "Carton: Madani Channel");
                addVideoItem("CD2hIy-V_e8", "বিড়াল। ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("dSaoF1fw7pY", "দুঃস্বপ্ন। ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("O_oG61i7HdQ", "বেপর্দা । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("rh7GYz0L5OM", "নামায । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("dX68XDAMDCE", "পাখির বাসা । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("5hooa7luaE0", "মিথ্যার শাস্তি । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("q74SzkvcZF4", "সম্পদ । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("qRQsgnLfEzI", "নামায শিক্ষা । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("At50tKN01rY", "প্রতিবেশি। ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("hRX9l4XMODY", "আইসক্রিম । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("xU__WGaHVkM", "মেসওয়াক । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("-ZyQ2ncN6WM", "সাইকেল । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("Md1HligrxOg", "ভিক্ষুক মা । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("J7AEWd4DzoI", "কাজের মেয়ে । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("rfaJNvD3fOI", "রমজান । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("uZtdO2ZOoSc", "ইফতার । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("yk8BSOKhXoM", "ঘুষখোর । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("JkYTqWFdoms", "শিরক । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("DOTN9jidGGA", "আম চোর । ইসলামিক কার্টুন ।", "Carton: Madani Channel");
                addVideoItem("EE9knGrcVMo", "আত্মীয় ।", "Carton: Madani Channel");
                addVideoItem("HJ8HdHUvLXk", "ছিনতাইকারী ।", "Carton: Madani Channel");
                addVideoItem("OPprgD-qo40", "জুমুয়ার নামাযের ফজিলত ।", "Carton: Madani Channel");
                addVideoItem("NRb15wokH7Q", "পুরষ্কার ।", "Carton: Madani Channel");
                createPlayList("বাংলা গল্প-কার্টুন", R.drawable.bangla_carton);
                //==========================================================================





                // ==========================================================================
                addVideoItem("zp8bSL4lPgE", "Cold Drinks & Sore Throat", "Carton: Kaniz Fatema");
                addVideoItem("7PdMd2aIJKI", "Jinn Without Eyes | Islamic Cartoon", "Carton: Golam Rasul");
                addVideoItem("CzeS2KMDdcM", "Babloo And Popcorn Part 1", "Carton: Golam Rasul");
                addVideoItem("k2xC6DLDFzU", "Babloo And Popcorn Part 2", "Carton: Golam Rasul");
                addVideoItem("zD_LKRuot3c", "Flowers of Islam | English Islamic Cartoon | Ali Cartoon", "Carton: Ali Cartoons");
                addVideoItem("KiDwfQdChCg", "ISLAMIC PRAYERS FOR KIDS - PART 01", "Carton: Ali Cartoons");
                addVideoItem("Z0BJOm-oSBs", "ISLAMIC PRAYERS FOR KIDS - PART 02", "Carton: Ali Cartoons");
                addVideoItem("q3Fq43YitPE", "ISLAMIC English Cartoon for KIDS", "Carton: Ali Cartoons");
                addVideoItem("f6iR5elhDdk", "How to pray 4 Rakat (units) - Step by Step Guide", "Carton: One Kids");
                addVideoItem("h0zhVfgMptY", "Islamic cartoon for kids in english - The lie - little muslim", "Carton: Osratouna entertains");
                addVideoItem("6eHYfJiv0Lw", "Islamic Stories for Kids \uD83D\uDCDA How Much Does Allah Love Me ?", "Carton: MiniMuslims");
                addVideoItem("vTvUjjimHEc", "Omar & Hana | Mufti Ismail Menk & More compilation", "Carton: Omar & Hana");
                addVideoItem("CwgJDkzrRKA", "Omar & Hana | 60 minutes compilation of series", "Carton: Carton: Omar & Hana");
                addVideoItem("xPwmqbpipS4", "Finding the Qiblah | Islamic Cartoon", "Carton: Omar & Hana");
                addVideoItem("7ZP9Igza1Mo", "I'm Fasting | No Instruments | Omar & Hana English", "Carton: Omar & Hana");
                addVideoItem("csWevAy7Oqc", "The Quran Is Our Friend | No Instruments", "Carton: Omar & Hana");
                addVideoItem("0Whvqb8sm9M", "40 min Compilation of series | Islamic cartoon", "Carton: Omar & Hana");
                addVideoItem("Y1eZ_JydvZE", "Omar & Hana | 60 minutes compilation", "Carton: Omar & Hana");
                addVideoItem("IBLuvxStPTA", "60 Minutes Omar & Hana Journey | Omar Hana English", "Carton: Omar & Hana");
                addVideoItem("d2D6WuKlymM", "Prophet Nuh (AS) | Stories Of The Prophets", "Carton: Omar & Hana");
                addVideoItem("W4v3eDC-bDA", "Story Of Prophet Adam (AS) | English Prophet Stories", "Carton: Omar & Hana");
                addVideoItem("ICd33xmbjWs", "The Story Of Khadija (RA)", "Carton: Omar & Hana");
                addVideoItem("l7s8R9ugb98", "Prophet Stories ISA / JESUS (AS)", "Carton: Omar & Hana");
                createPlayList("ইংরেজি গল্প-কার্টুন", R.drawable.english_carton);
                //==========================================================================





                // ==========================================================================
                addVideoItem("Ud-uKrFTOYg", "সেলফি নিয়ে সময়ের সেরা নতুন গজল ।", "Singer: Husain Adnan & Shafin Ahmad");
                addVideoItem("l_e82pdG53w", "যে গান শুনে মুগ্ধ হয়ে শিল্পী কে জরিয়ে ধরলেন | ইয়া নাফসি ।", "Singer: Gazi Anas Rowshan");
                addVideoItem("2XvMf_7cPb0", "নতুন ইসলামী গজল | তুমি রহমান ।", "Singer: Husain Adnan & Shafin Ahmad");
                addVideoItem("ThY5zyV1sgc", "হৃদয় তোলপাড় করা নতুন গজল । আসসালাম সাহাবা ।", "Singer: Husain Adnan & Shafin Ahmad");
                addVideoItem("pd0nogrj-38", "এত ভালোা কেন মালিক আমায় । হৃদয় ছুঁয়ে যাওয়া নতুন গজলা ।", "Singer: Husain Adnan & Shafin Ahmad");
                addVideoItem("HAbh6xSmTOI", "আমার বাংলাদেশ । সময়ের সেরা দেশের গজল ।", "Singer: Sayed Ahmad, Muhammad Badruzzaman");
                addVideoItem("8IXUIhzz4I4", "সময়ের সেরা নতুন গজল । ইশকে নাবী জিন্দাবাদ ।", "Singer: Sayed Ahmad, Muhammad Badruzzaman");
                addVideoItem("8DnoQnyQm4U", "বিশ্ব নবীর অপমানে যদি না কাঁদে তোমার মন ।", "Singer: Sayed Ahmad");
                addVideoItem("oA03cLkNEsg", "চমৎকার নজরুল সংগীত । ত্রিভুবনের প্রিয় মুহাম্মদ ।", "Singer: Abu Rayhan");
                addVideoItem("USIZ1-YCauA", "সময়ের সেরা ঈমান জাগানিয়া গজল । তুমি কেমন মুসলমান ।", "Singer: Abdullah, Abir Hasan...");
                addVideoItem("oc08roCNsqg", "সুমধুর গজল লক্ষ তারার মাঝে তুমি একটি তারা ।", "Singer: Tawhid Jamil, Ahnaf Khalid");
                addVideoItem("QyRRrKQP7fo", "হৃদয় মাঝে মালা গাঁথি ছন্দে আর গানে ।", "Singer: Mahfuzul Alam & Tawhid Jamil");
                addVideoItem("srU9CCeGtwU", "টাকা নিয়ে ফাটাফাটি গজল | আজব টাকা ।", "Singer: Muhammad Badruzzaman");
                addVideoItem("VSiIcLF_rTQ", "ফেইসবুক নিয়ে সময়ের সেরা গজল । Facebook ।", "Singer: Sayed Ahammed");
                addVideoItem("GUOSZEzCz5w", "গড়েছ তুমি এই পৃথিবী জাহান । তুমি অসীম তুমি মহান ।", "Singer: Sayed Ahmad, Salman Sadi...");
                addVideoItem("5Zvfd_ntlG0", "ক্ষমা করে দাও । মাফ করে দাও ।", "Singer: Qari Abu Rayhan");
                addVideoItem("Y74Z6RZoVUM", "চোরদের বিরুদ্ধে সময়ের সেরা গজল । চোর ।", "Singer: Sayed Ahmad");
                addVideoItem("c1kL66lgTTY", "হঠাৎ আজরাইল পাঠাইয়া তোরে নিতে পারে তুলিয়া ।", "Singer: Muhammad Badruzzaman");
                addVideoItem("_Y_iYQS686o", "বাবা মানে হাজার বিকেল | যে গান কাঁদালো সকল বাবাদের ।", "Singer: Jaima Noor");
                addVideoItem("kAQjuozS1fQ", "যে গজলে কাঁদবে সবাই । Baba Mane...। বাবা মানে... ।", "Singer: Hujaifa Islam");
                addVideoItem("BHUNDWO5NhI", "বাবাকে নিয়ে হৃদয়স্পর্শী গজল । প্রিয় বাবা ।", "Singer: Mahfuzul Alam");
                addVideoItem("HVL4LC07f2k", "হৃদয়ের পাতায় তোমারই ছবি । তুমি ছাড়া বৃথা যে সবই ।", "Singer: Tawhid Jamil & Salman Sadi");
                addVideoItem("qp8ajDOcYlk", "নবীর রূপের আলো ।", "Singer: Rifat Rahman, Sifat Rahman");
                addVideoItem("shziWfc49og", "ও বাতাস আমায় তুমি নিয়ে যাওনা ।", "Singer: Jahidul Islam Shawon");
                addVideoItem("CYWQii5x7lU", "মিছে দুনিয়ায় তুমি থাকবা কত দিন ?", "Singer: SADMAN shakib;Saim al hasan");
                addVideoItem("nEn6jMhvU5o", "আল্লাহ আল্লাহ বলো মুখে মুখে ।", "Singer: Sayed Ahmad, Muhammad Badruzzaman");
                addVideoItem("Gx7OLd-qEaw", "আল্লাহ । আল্লাহ । আল্লাহ । আল্লাহ । আল্লাহ ।", "Singer: Abu Rayhan & Kalarab youth");
                addVideoItem("D_4mw1jBfhs", "সালাম । আস-সালামু আলাইকুম ।", "Singer: Zahid, Zihad, Sakib");
                addVideoItem("8NKQpqgHyeU", "তোমার বুকে রাখে আল্লাহর ভয় আসবে না কোন দিন কোনো পরাজয় ।", "সবাইকে হালাল হারাম জেনে সত্য ও সুন্দর পথে পরিচালিত হওয়া প্রয়োজন");
                addVideoItem("_iYGC4sTShs", "ওলি আল্লাহর বাংলাদেশ ।", "Singer: Md. Badruzzaman, Omar Abdullah");
                addVideoItem("0IlvdtU-7Y0", "আইনুদ্দীন আল আজাদ (রহ.) এর কালজয়ী সংগীত | ম্যাশআপ ।", "Singer: Yeasin Hayder & Anas Ahmad Safowan ");
                addVideoItem("63KcoYRE_Sc", "কি হবে বেঁচে থেকে । অযথা বিদ্যা শিখে ।", "Singer: Aynuddin Al Azad Rah.");
                addVideoItem("bvyQelKksgo", "সমসাময়িক সংগীত দূষন ।", "Singer: Sayed Ahmad");
                addVideoItem("WNbvPMPCxis", "কি হবে বেচে থেকে? প্রতিবাদী গজল শুনুন ।", "Singer: Mufti Sayed Ahmad");
                addVideoItem("oc08roCNsqg", "লক্ষ তারার মাঝে তুমি একটি তারা ।", "Singer: Muhammad Badruzzaman");
                addVideoItem("Wheka0WDEkc", "তার নেই তুলনা । তার সম কেহ নাই ।", "Singer: Abu Rayhan & Husain Adnan");
                addVideoItem("E4hRF-bN5p8", "শিল্পী মাহফুজুল আলম এর গাওয়া ৩টি বাছাইকৃত গজল ।", "Singer: Mahfuzul Alam");
                addVideoItem("8wD-iSe25CU", "বারে বারে ভাবি একা । পাখি হলে উড়ে যেতাম.... ।", "Singer: Hujaifa Islam");
                addVideoItem("WjxmWg_RaCY", "কোন জমিনের মাটি আমার হবে গোরস্থান ???", "Singer: Adil Arham");
                addVideoItem("SxqpA-Wx9Oo", "নবীর উম্মত দাবী করো কি করে তুমি ।", "Singer: Muhammad Badruzzaman");
                addVideoItem("cnU92tq4ZTk", "ছেলে মেয়েদের বর্তমান অবস্থা নিয়ে গজল । আজকালের পোলাপান ।", "Singer:  Muhammad Badruzzaman");
                addVideoItem("YWkXICrWk3Q", "আমাকে দাও পাখির দুটি ডানা । মন আমার মানে না ।", "Singer: Abdullah Al Mamun & Others");
                addVideoItem("tyKaTu64MI8", "তোমার বুকে রাখ আল্লাহর ভয় । আসবে কোন দিন কোন পরাজয় ।", "Singer: Jahid, Khalid, Sakib, Mamun & Nasrul");
                addVideoItem("hVz0paZpRH0", "কবরে হাশরে কি হবে আমার ? কষ্টের ইসলামিক গজল ।", "Singer: আমাদের প্রত্যেকের উচিত বেশি বেশি মৃত্যুকে স্মরণ করা এবং মৃত্যুর জন্য প্রস্তুত থাকা");
                addVideoItem("LXtM24VXBDc", "আধাঁর নামে সকাল সন্ধ্যা । আধাঁর নামে রাত্রি-দিন ।", "Abu Rayhan, Iqbal Mahmud");
                addVideoItem("b7M2uArxJas", "ও মদিনার বুলবুলি তোমার নামে ফুল তুলি । যতন করে হৃদয় মাঝে একা একা নিরিবিলি ।", "Singer: ");
                addVideoItem("k3GcOuxM0Oo", "মেহেরবান । তুমি মেহেরবান । আমি পাপী গুনাগার । তুমি ছাড়া কে আছে আমার ।", "Singer: Munaem Billah");
                addVideoItem("2lBTW7ENusg", "জনপ্রিয় নাশিদ হাবিবাল্লাহ্ ।", "Singer: Munaem Billah");
                addVideoItem("FsQUcxwUPrY", "সুবহানাল্লাহ - SUBHANALLAH - سبحان الله  ।", "Singer: Munaem Billah");
                addVideoItem("odkVQwcnWg8", "সমসাময়িক নাশিদ এখনো আঁধার ।", "Singer: Munaem Billah");
                addVideoItem("pL2gV7DqOoM", "অন্যরকম ভালো লাগার নাশিদ আল্লাহু ।", "Singer: Munaem Billah");
                addVideoItem("r39RqoAAsLM", "যে গান শুনে কেঁদেছিল মঞ্চের সবাই জনপ্রিয় নাশিদ মালিক ।", "Singer: Munaem Billah");
                addVideoItem("BTZf9zh6yhg", "আলোকিত জ্ঞানীর মঞ্চে গাওয়া আলোচিত নাশিদ কালিমা ।", "Singer: Munaem Billah");
                addVideoItem("zlB87axPnoY", "অন্তর জুড়ানো নাশিদ অনুতাপ ।", "Singer: Munaem Billah");
                addVideoItem("_xasMa7dNDk", "আলোচিত নাশিদ KALIMAH ।", "Singer: Munaem Billah");
                addVideoItem("ulBlrVayUm4", "আলোকিত জ্ঞানী‘র মঞ্চে রমজান নিয়ে ভিন্নধর্মী গজল মতভেদ ।", "Singer: Munaem Billah");
                addVideoItem("JVlBoIqu5d8", "আলোকিত জ্ঞানিতে সবচেয়ে জনপ্রিয় নাশিদ সাজদা ।", "Singer: Munaem Billah");
                addVideoItem("zQuGvGx1Uj0", "লাখো মানুষের হৃদয় জয় করা নাশিদ ।", "Singer: Munaem Billah");
                addVideoItem("P3CmHXL85o8", "বিশ্ব জুড়ে সবার প্রিয় নাশিদ রাহিমাকাল্লাহ ।", "Singer: Munaem Billah");
                addVideoItem("wmt--PlisSY", "তুমুল জনপ্রিয় নাশিদ রাদ্বিতুবিল্লাহ ।", "Singer: Munaem Billah");
                addVideoItem("9G8PYuAs5Fw", "সুখের দিনেও মোরা খুজিগো তোমায় । দুঃখের দিনেও মোরা শরিগো তোমায় ।", "Singer: Sayed Ahmad");
                addVideoItem("7OMLPk-6WGg", "ইয়া সায়্যিদি ইরহামলানা । ইয়া সায়্যিদি ইরমানলানা । আল্লাহু আল্লাহু । আল্লাহু আকবার ।", "Singer: Hafez Rabbi");
                addVideoItem("R7xEl40mpdE", "হাসবি রাব্বি জাল্লাল্লাহ । মাফি ক্বালবি গায়রুল্লাহ । লা-ইলাহা ইল্লাল্লাহ । মুহাম্মাদুর রাসুলুল্লাহ ।", "Singer: Iqbal Hossain Jibon");
                addVideoItem("lPvjnpek38w", "কবরের জীবন নিয়ে নাশীদ ।", "Singer: Iqbal Hossain Jibon");
                addVideoItem("zA-AfuOt2KY", "জাহান্নাম\uD83D\uDD25 নিয়ে হৃদয়স্পর্শী নাশীদ ।", "Singer: Iqbal Hossain Jibon");
                addVideoItem("9-Qoy7lzTX4", "পৃথিবী আমার আসল ঠিকানা নয় । মরণ একদিন মুছে দিবে সকল রঙিন পরিচয় ।", "Singer: Iqbal Hossain Jibon");
                addVideoItem("MxaitgUjn1k", "ত্রিভূবনের প্রিয় মুহাম্মদ ।", "Singer: Iqbal Hossain Jibon");
                addVideoItem("cUBbP_qsK6I", "আল্লাহু আল্লাহু ।", "Singer: Iqbal Hossain Jibon");
                addVideoItem("x05kX0y1k5g", "Iqbal HJ - DOYAMOY", "Singer: Iqbal Hossain Jibon");
                addVideoItem("6vUIQXdQhhk", "Alo - আলো [Official Video]", "Singer: Iqbal Hossain Jibon");
                addVideoItem("koRoXpU99ck", "ISLAM - Rehearsal Video - Iqbal HJ with Ummah USA 2019", "Singer: Iqbal Hossain Jibon");
                addVideoItem("GtowG-NK5xo", "Amader Valobasa || Iqbal HJ || Feni Concert || Love for Allah", "Singer: Iqbal Hossain Jibon");
                addVideoItem("6ZrAIr2rPgQ", "বর্তমান সময়ের জাগরণী সংগীত | বিপ্লবী বীর ।", "Singer: Iqbal Mahmud, Omar Abdullah");
                addVideoItem("0OKDsTE0_Xc", "কলরবের বিপ্লবী সংগীত | জেগে ওঠো মুসলিম ।", "Singer: Muhammad Badruzzaman, Ahmod");
                addVideoItem("VDnqOC49DtU", "মুসলিম কখনো সন্ত্রাসী নয় বরং শান্তিকামী ।", "Singer: Muhammad Badruzzaman, Aminul");
                addVideoItem("RbrjlqwWibE", "কলরব শিল্পীদের কণ্ঠে কালজয়ী দেশের গান । এক নদী রক্ত পেরিয়ে ।", "Singer: Abu Rayhan, Nazrul Islam");
                addVideoItem("xNXx1a_xQ1k", "সালাম সালাম হাজার সালাম । লাখো শহীদ স্বরণে ।", "Singer: Muhammad Abdul Jabbar");
                addVideoItem("9CQEYXV9_yw", "কলরবের কণ্ঠে মুক্তিযুদ্ধের কালজয়ী সংগীত । তীর হারা এই ঢেউয়ের সাগর ।", "Singer: Abu Rayhan, Dawod Anam, Husain Adnan");
                addVideoItem("5GL63rgthWo", "যে ফুল যুগ যুগান্তরে খুশবু ছড়ায় ।", "Singer: Saifullah Mansur");
                addVideoItem("-Dir4b9D89k", "এই সুন্দর ফুল, সুন্দন ফল আর মিঠা নদীর পানি । আল্রাহ তোমার মেহেরবানী ।", "Singer: Husain Adnan & Abir Mahmud");
                addVideoItem("f5c1UhQdmPU", "দু-জাহানে আমরা সেরা, উলামা তলবা । আমরা ইলমে নববীর নুরানী সে আভা ।", "Singer: Sayed Ahmad, Muhammad Badruzzaman");
                addVideoItem("1jn5fzdI9QY", "প্রশংসা কেবল তোমারই জন্য রব্বুল আলামিন । দয়াল মেহেরবান করুনা অফুরান ।", "Singer: Mosiur Rahman");
                addVideoItem("TjrHY81CAsg", "যাদের হৃদয়ে আছে আল্লাহর ভয় । তারা কভু পথ ভুলে যায় না ।", "Singer: Abdullah Us Sakib & Monowar HJ");
                addVideoItem("qPDC7TDYKvg", "হৃদয় শীতল করা নাতে রাসুল | ওগো মোর পেয়ারা নাবী ।", "Singer: Sadman Sakib");
                addVideoItem("FLV-heiGkzo", "আমার যখন ফুরাবে দিন আসবে গহীন রাতি ।", "Singer: Tarek Monawar");
                addVideoItem("I4vptqxCtsA", "জনপ্রিয় নাশিদ | তুমি আছো হৃদয়ের গভীরে ।", "Singer: Tarek Monawar");
                addVideoItem("sbdDXluJgpY", "মন আমার কাঁদে রে | Jete Sonar Madina ।", "Singer: Tarek Monawar");
                addVideoItem("XZyT8c8_7wQ", "বেদনা ভুলায় | তারেক মনোয়ার | নতুন গজল ।", "Singer: Tarek Monawar");
                addVideoItem("o_XwDBL1TKk", "তারেক মনোয়ারের কণ্ঠে নতুন গজল | তোমারি জন্য মন কাঁদে ।", "Singer: Tarek Monawar");
                addVideoItem("8P4qZ_bYRbI", "আমার জীবন আমার মরন,আমার বান্দেগী ।", "Singer: Tarek Monawar");
                addVideoItem("hEi9xgXYIxQ", "আহমদ আবদুল্লাহ এর প্রভু প্রেমের নাশিদ | মিনতি ।", "Singer: Ahmad Abdullah");
                createPlayList("ইসলামী গান-বাংলা", R.drawable.bangla_song);
                //==========================================================================





                // ==========================================================================
                addVideoItem("N3oOEAiKa5k", "Iqbal HJ - Sisters Prayer", "Singer: Iqbal Hosen");
                addVideoItem("LGadR7Xgrg8", "Iqbal HJ - Show ME the Way", "Singer: Iqbal Hosen");
                addVideoItem("nRFcmlWk7XM", "HASBUNALLAH | حَسْبُنَا اللَّهُ وَنِعْمَ الْوَكِيلُ", "Singer: Iqbal Hosen");
                addVideoItem("3qOs9uDgBFg", "Make Me Your Friend", "Singer: Iqbal Hosen");
                addVideoItem("5ZtvbrhLL74", "Labbaik Official Concert Version", "Singer: Iqbal Hosen");
                addVideoItem("GtowG-NK5xo", "Amader Valobasa || Iqbal HJ || Feni Concert || Love for Allah", "Singer: Iqbal Hossain Jibon");
                addVideoItem("isYEornaAsg", "Allah Help Me (Official Nasheed Video).", "Singer: Omar Esa");
                addVideoItem("Bnzt9NM3EC4", "Tala Al Badru (Official Nasheed Video).", "Singer: Omar Esa");
                addVideoItem("fvIWPFEZi_s", "Maula Ya Salli Ft.", "Singer: Sami Yusuf");
                addVideoItem("sZmtypVN0uc", "Awakening Music, Best Islamic Song", "Singer: The Mawlid");
                addVideoItem("nDh5UdU_cZM", "Maher Zain - Insha Allah | Vocals Only.", "Singer: Maher Zain");
                addVideoItem("z2_2cFityc4", "You Came To Me", "Singer: Sami Yusuf");
                addVideoItem("K3lNasl1yKs", "La ilaha illallah- Muhammad is The Messenger Naat", "Singer: Sami Yusuf");
                addVideoItem("QYaw72I5rYg", "Taha with english lyrics video", "Singer: Sami Yusuf");
                addVideoItem("7iWwxocYAmg", "Nasheed / In the black darkness", "Singer: Abu Ali");
                addVideoItem("ffm6nHGE-Vo", "Hallaka Sirrun Indallah", "Singer: Evergreen Life");
                addVideoItem("abxxIQyJiCs", "Al-Mu'allim - Sami Yusuf - Lyrics", "Singer: Sami Yusuf");
                addVideoItem("4bFDb7xEAa4", "Who is the loved one? (lyrics)", "Singer: Sami Yusuf");
                addVideoItem("MBhgDctImSw", "سامي يوسف ", "Singer: Sami Yusuf");
                addVideoItem("riRn3lSAVGo", "Truly He is the One- English Islamic Song with lyrics", "Singer: Sami Yusuf");
                addVideoItem("qndO_Xk4ryY", "Mawlana (Live in New Delhi, INDIA)", "Singer: Sami Yusuf");
                addVideoItem("0OygeaHXy2I", "Catch Me When I Fall", "Singer: Nadeem Mohammed");
                addVideoItem("m5qx781_BIw", "Seerah Song - Full Song - Drum Version", "Singer: Zain Bhikha");
                addVideoItem("03qWfCMQNws", "Seerah Song - Full Song - Vocal Only Version", "Singer: Zain Bhikha");
                addVideoItem("6MzSHhCKHAg", "Land of Revelation", "Singer: Zain Bhikha");
                addVideoItem("nDh5UdU_cZM", "Maher Zain - Insha Allah | Vocals Only", "Singer: Maher Zain");
                addVideoItem("tySu7cLgjak", "Mash'Allah (Official Nasheed Video) Vocals Only", "Singer: Omar Esa");
                addVideoItem("caeTvZrlVTo", "Forgive Me Allah - Astagfirullah | Heart Touching Nasheed", "Singer: Omar Esa");
                addVideoItem("Bnzt9NM3EC4", "Tala Al Badru (Official Nasheed Video) | Vocals Only", "Singer: Omar Esa");
                addVideoItem("6sSM5sgR0Ms", "Allahi Allah Kiya Karo", "Singer: Maher Zain");
                createPlayList("ইসলামী গান-ইংরেজি", R.drawable.english_song);
                //==========================================================================





                // ==========================================================================
                addVideoItem("2KxOiNehNLs", "جنة الأرض .. أمي | مشاري راشد العفاسي - كاملة", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("nJHmGY7E4mg", "Mustafa Mustafa", "Singer: Sheikh Mishari & His son Muhammad");
                addVideoItem("N-uJXprbefY", "YA TAIBA || يا طيبة |", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("M3xjz4nxzGQ", "Rahman Ya Rahman", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("Jt85_X1vs1M", "Ahbabtuk | أحببتك - فيديو كليب", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("Gkflvn9v8Os", "عمر الفاروق | مشاري راشد العفاسي", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("4yWLofNagy8", "La Elah Ela Allah لا إله إلا الله | مشاري راشد العفاسي", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("f29CXSydWDM", "AL-ASMA-UL-HUSNA, NAMES of ALLAH", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("LPYMrt3wARg", "Allah Allah ★New Nasheed", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("llbLk_gFffo", "مشاري راشد العفاسي - نشيدة دعاء مصر", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("aKLDe8iJwCQ", "Nasheed! Mishary Rashed Alafasy - Red betarish!", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("JSZmCNjGqtc", "Beautiful Arabic Nasheed Awdal Hawaa", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("_WeHOz1Ln4k", "Salaah (Prayer) - NO Excuse To Miss IT!", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("pMNJFuOKrZg", "Al Asma Al Hosna - Hisham Abbass Beautyful Nasheed", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("QbqLRuEdQ3k", "مشاري_راشد_العفاسي", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("db78uZudTmo", "محمد صلى الله عليه وسلم - مشاري راشد العفاسي", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("t_9-WdMqUi0", "غردي يا روح .. مشاري راشد العفاسي تسجيل جديد", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("Xk0dEhx4ve4", "Syekh Misyari Rasyid Alafasy (Full Album)", "Singer: Mishary Rashid Al Afasy");
                addVideoItem("5azDyOkmjp8", "Amantu Billahi - Official NO MUSIC Version", "Singer: Ayisha Abdul Basith");
                addVideoItem("E5ptoktjNto", "Sholawat Merdu", "Singer: Ayisha Abdul Basith");
                addVideoItem("CZ9LkTyZOxM", "Tala al badru alayna|Vocal|with English translation", "Singer: Arabic Gajal");
                addVideoItem("5XxnLpE7ObQ", "Beautiful Arabic Islamic Marriage song", "Singer: AHT Habib");
                addVideoItem("IAf6GOnPpnE", "The Most Beautiful Islamic Arabic Nasheed (Mashup)", "Singer: Music Upscale");
                addVideoItem("DObcUOFLsGI", "Ya Taiba | Ayisha Abdul Basith", "Singer: Ayisha Abdul Basith");
                addVideoItem("e2FKXPzsT7E", "Burdah Maula ya Salli Official video", "Singer: Mesut Kurtis");
                addVideoItem("VKXhwu3OAPI", "ALLAHU EXCLUSIVE NASHEED", "Singer: Ahmadullah");
                addVideoItem("pPuvcfiwnns", "Oh My Soul ll Beautiful Arabic Nasheed 2021", "Singer: Motivation Video");
                addVideoItem("Vqfy4ScRXFQ", "Ya Nabi Salam Alayka (Arabic) | ماهر زين - يا نبي سلام عليك", "Singer: Maher Zain");
                addVideoItem("uuN0bf4rhT0", "Madad (Nasimi Arabic Version)", "Singer: Sami Yusuf");
                addVideoItem("FWwwZ8qSM3U", "99 Names of Allah (swt) nasheed by Omar Esa", "Singer: Omar Esa");
                addVideoItem("SZ-rMHOPyHk", "Mo Vocals - Muhammad Nabina (2021) | Official Nasheed Video", "Singer: Muhammad");
                addVideoItem("7P7LVWW3hkw", "Mo Vocals - Maula Ya Salli 2021 (NO MUSIC)", "Singer: Muhammad");
                addVideoItem("7P7LVWW3hkw", "Mo Vocals - Maula Ya Salli 2021 (NO MUSIC)", "Singer: Muhammad");
                addVideoItem("SZ-rMHOPyHk", "Mo Vocals - Muhammad Nabina (2021)", "Singer: Muhammad");
                createPlayList("ইসলামী গান-আরবী", R.drawable.arabic_song);
                //==========================================================================





                // ==========================================================================
                addVideoItem("MdPF25RM7QI", "Allah Hu Allah Hu Allah - Hamd.", "Singer: Qari Waheed Zafar Qasmi");
                addVideoItem("uRhj39IyZcE", "Allah Hu Allah | Beautiful Hamd Bari Tala.", "Singer: Sayed Mokarram Bari");
                addVideoItem("tczO9CbCpdM", "Aye Sabz Gumbad Wale.", "Singer: Singer:  Owais Raza Qadri");
                addVideoItem("8DS8wBH8o68", "Hasbi Rabbi Jallalhu.", "Singer: Noor ul Haq");
                addVideoItem("4RhFwIB8tl0", "Ya ilahi Har Jagah Teri Ata Ka Saath Ho.", "Singer: Owais Raza Qadri");
                addVideoItem("0lKwmpbrlJ4", "Jisne Madine Jana - Naat.", "Singer: Alhaj Khursheed Ahmad");
                addVideoItem("-uMMeu0bHis", "ALLAH HU, New Beautiful Hamd.", "Singer: Usama Khan");
                addVideoItem("L7ySoupGkP8", "Main Jo Youn Madine Jata.", "Singer: Owais Raza Qadri");
                addVideoItem("TQkC8Xb1XiE", "Maula Ya Salli Wa Sallim.", "Singer: Owais Raza Qadri");
                addVideoItem("KKtjaPTycLY", "Nikla Tery Raste Main, Heart Touching Nasheed 2020.", "Singer: Shahid Khatab");
                addVideoItem("duJT2-51l98", "Relaxing Sleep, ALLAH HU, Listen & Feel Relax.", "Singer: Islamic Releases");
                addVideoItem("yTiSzBoU9Jw", "Urdu Islamic song.", "Singer: Islamic Releases");
                addVideoItem("4UPGN6LnJTY", "Bin Dekhe MOHAMMADﷺ Par Qurban Zamana", "Singer: Hafiz Abdur Razzaq");
                addVideoItem("uHtO4LQ-yBQ", "Bin dekhe muhammad par qurban zamana hai", "Singer: Islami Hubs");
                addVideoItem("uRhj39IyZcE", "Allah Hu Allah | Beautiful Hamd Bari Tala", "Singer: Sayed Mokarram Bari");
                addVideoItem("TCZW0i-dVIc", "Meri Qismat || Urdu Nasheed || M Shahnawaz", "Singer: M Shahnawaz");
                addVideoItem("VQ7Yj_wjoRQ", "ALLAHU AKBAR, Most Beautiful Nasheed", "Singer: Hafiz Abdur Razzaq");
                createPlayList("ইসলামী গান-ঊর্দু", R.drawable.urdu_song);
                //==========================================================================





                // ==========================================================================
//                addVideoItem("2DAgpm7kkXo", "নামাজ সম্পর্কে অসাধারণ আলোচনা", "বক্তা: জামশেদ মজুমদার");
//                createPlayList("বাংলা ডাবিং মুভি", R.drawable.jamsed_mojumdar);
                //==========================================================================















        }

        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>
        //---------------------------------------------------->>>>>>




}

