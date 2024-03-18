package com.coderfaysal.kalema;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "কালেমা তাইয়্যিবাহ");
        hashMap.put("message", "لَا اِلَهَ اِلاَّ اللهُ مُحَمَّدُ رَّسُوْ لُ الله" +
                "\nবাংলা উচ্চারণ: লা–ইলা-হা-ইল্লাল্লাহু মুহাম্মাদুর রাসূলুল্লা-হ।\n" +
                "অনুবাদ: আল্লাহ ছাড়া আর কোন ইলাহ (ইবাদতের যােগ্য) নেই। হযরত মুহাম্মদ (সঃ) আল্লাহর প্রেরিত রাসূল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কালেমা শাহদাত");
        hashMap.put("message", "اَشْهَدُ اَنْ لَّا اِلَهَ اِلَّا اللهُ وَحْدَهُ لَاشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُوْلُه" +
                "\nবাংলা উচ্চারণ: আশহাদু আল্লা–ইলা-হা ইল্লাল্লাহু ওয়াহদাহু লা-শারীকা লাহু ওয়াআশহাদু আন্না মুহাম্মাদান আব্দু-হু ওয়া রাসূলুহ্।\n" +
                "অনুবাদ : আমি সাক্ষ্য দিচ্ছি যে, আল্লাহ তাআলা ব্যতীত আর কোন ইলাহ (ইবাদতের যােগ্য) নেই। তিনি এক এবং তাঁর কোন শরীক নেই। আমি আরও সাক্ষ্য দিচ্ছি যে, হযরত মুহাম্মদ (সঃ ) তাঁর বান্দা ও রাসূল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কালেমা তাওহীদ");
        hashMap.put("message", "لا الهَ اِلَّا اللّهُ وَحْدَهُ لا شَرِيْكَ لَهْ، لَهُ الْمُلْكُ وَ لَهُ الْحَمْدُ يُحْى وَ يُمِيْتُ وَ هُوَحَىُّ لَّا يَمُوْتُ اَبَدًا اَبَدًا ط ذُو الْجَلَالِ وَ الْاِكْرَامِ ط بِيَدِهِ الْخَيْرُ ط وَهُوَ عَلى كُلِّ شَئ ٍ قَدِيْرٌ ط" +
                "\nবাংলা উচ্চারণ: লা-ইলা-হা-ইল্লা-আন্তা ওয়াহিদাল্লা-ছানিয়ালাকা, মুহাম্মাদুর রাসূলুল্লা-হি ইমামুল মুত্তাক্বীনা রাসূলু রব্বিল আ’লামীন।\n" +
                "অর্থঃ (হে আল্লাহ!) তুমি ছাড়া আর কোন ইলাহ (ইবাদতের যােগ্য) নেই, তুমি এক এবং অদ্বিতীয়। হযরত মুহাম্মদ (সঃ ) মুত্তাকীনদের ইমাম এবং বিশ্বজাহানের প্রতিপালকের রাসূল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কালিমা তামজীদ");
        hashMap.put("message", "لَا اِلَهَ اِلَّا اَنْتَ نُوْرَ يَّهْدِىَ اللهُ لِنُوْرِهِ مَنْ يَّشَاءُ مُحَمَّدُ رَّسَوْ لُ اللهِ اِمَامُ الْمُرْسَلِيْنَ خَا تَمُ النَّبِيِّنَ" +
                "\nবাংলা উচ্চারণ : লা-ইলা-হা ইল্লা আন্তা নূরাইইয়াহ দিয়াল্লা-হু লিনুরিহী মাইয়্যাশা–য়ু, মুহাম্মাদুর রাসূলুল্লা-হি ইমা-মুল মুরসালীনা খাতামুন-নাবিয়্যীন।\n" +
                "অনুবাদ : (হে আল্লাহ!) তুমি ব্যতীত আর কোন ইলাহ (ইবাদতের যােগ্য) নেই। তুমি জ্যোতির্ময় আল্লাহ, তুমি যাকে চাও, স্বীয় জ্যোতি দ্বারা সঠিক পথ দেখিয়ে থাক, মুহাম্মদ (সঃ ) রাসূলগণের ইমাম এবং সর্বশেষ নবী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কালেমা রদ্দেকুফর");
        hashMap.put("message", " اَللَّهُمَّ اِنِّىْ اَعُوْذُبِكَ مِنْ اَنْ اُشْرِكَ بِكَ شَيْئً وَاَنَا اعَلَمُ بِهِ وَاَسْتَغْفِرُكَ لِمَا اعَلَمُ بِهِوَمَا لاَاعَلَمُ بِهِ تُبْتُ عَنْهُ وَتَبَرَّأتُ مِنَ الْكُفْرِ وَالشِّرْكِ وَالْمَعَاصِىْ كُلِّهَا وَاَسْلَمْتُ وَاَمَنْتُ وَاَقُوْلُ اَنْ لاَّاِلَهَ اِلاَّاللهُ مُحَمَّدُ رَّسَوْلُ اللهِ" +
                "\nবাংলা উচ্চারণ : আল্লাহুম্মা ইন্নী আউযুবিকা মিন আন উশরিকা বিকা শাইআও ওয়া আনা আলামু বিহি ওয়া আসতাগ ফিরুকা লিমা আলামু বিহি ওয়ামা লা আলামু বিহি তুবতু আনহু ওয়া তাবাররাতু মিনাল কুফরি ওয়াশ্শির্কি ওয়াল মা আছি কুল্লিহা ওয়া আসলামতু ওয়া আমানতু ওয়া আক্বলু আল্লা ইলাহা ইল্লাল্লাহু মুহাম্মাদু রাসূলুল্লাহ।\n" +
                "অনুবাদ: ওগাে আল্লাহ! আমি তােমার নিকট আশ্রয় প্রার্থনা করি তােমার সাথে অন্য কাউকে শরীক  করা হতে। আমি আমার জানা অজানা সকল কিছুর উপর ঈমান এনেছি। তােমার নিকট আমার জানা আজানা সকল গুণা হতে ক্ষমা প্রার্থনা করছি এবং তওবা করছি। আমি তােমার উপর ঈমান এনেছি ও স্বীকার করছি যে, আল্লাহ ছাড়া আর কোন ইলাহ নেই এবং হযরত মুহাম্মদ (সঃ ) আল্লাহর প্রেরিত রাসূল।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কালিমা আস্তাগফার");
        hashMap.put("message", "اسْتَغْفِرُ اللّهَ رَبِّىْ مِنْ كُلِّ ذَنْبٍ اَذْنَبْتُه عَمَدًا اَوْ خَطَاً سِرًّا اَوْ عَلَانِيَةً وَاَتُوْبُ اِلَيْهِ مِنْ الذَّنْبِ الَّذِىْ اَعْلَمُ وَ مِنْ الذَّنْبِ الَّذِىْ لا اَعْلَمُ اِنَّكَ اَنْتَ عَلَّامُ الغُيُبِ وَ سَتَّارُ الْعُيُوْبِ و َغَفَّارُ الذُّنُوْبِ وَ لا حَوْلَ وَلا قُوَّةَ اِلَّا بِاللّهِ الْعَلِىِّ العَظِيْم\n" +
                "\nবাংলা উচ্চারণ : আস্তাগফেরুল্লাহ রাব্বি মিন কুল্লি ধামবিন আধনাবতুহু 'আমাদান আও খাতা-আন সিররান আও 'আলাআনিয়াতা-ওয়ান ওয়া-আতবু ইলাহি মিন-আধ ধামবি-ইলাধি এ'লামু ওয়ামিনা-ধ ধামবি-ল লাধি লাআ আ'লামু ইন্নাকা আন্তা 'আল্লাআমু-ল ঘুয়ুবি ওয়াস্ততারু-ল 'উইউবি ওয়া ঘাফফারু-ধ ধুনুবি ওয়ালা হাওয়ালা ওয়ালা কুয়াতা ইল্লা বিল্লাহি-ল 'ইলিয়াইল আযিম।\n" +
                "অনুবাদ: আল্লাহ এক আর কোন মাবুদ নেই। হযরত মুহাম্মদ (সাঃ) আল্লাহর প্রেরিত রাসূল। ( অর্থঃ আমি আল্লাহর কাছে ক্ষমা প্রার্থনা করি যে আমার খোদা, সে সব পাপ থেকে যা আমি জেনে অথবা না জেনে , গোপনে কিংবা প্রকাশ্যে করেছি এবং আমি আল্লাহ্ দিকে যাই সেই সমস্ত পাপ থেকে যা আমি জানি কিংবা জানিনা। নিশ্চয়ই তিনি ( আল্লাহ ) , তিনি সব গোপন কিছু জানেন এবং সব গোপন বিষয় সম্পর্কে অবগত আছেন এবং সমস্ত পাপের ক্ষমাকারী। এবং তিনি ( আল্লাহ ) ছাড়া কোন ক্ষমতা বা শক্তি নেই, তিনি সবচেয়ে বড় ও সবচেয়ে মহান।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঈমান-ই মুজমাল");
        hashMap.put("message", "امَنْتُ بِاللهِ كَمَا هُوَ بِاَسْمَائِه وَصِفَاتِه وَقَبِلْتُ جَمِيْعَ اَحْكَامِه وَاَرْكَانِه" +
                "\nবাংলা উচ্চারণ : আ-মানতু বিল্লা-হি কামা-হুয়া বিআসমা-ইহী ওয়া সিফা-তিহী ওয়া ক্বাবিলতু জামী-আ আহকা-মিহী ওয়া আরকা-নিহী।\n" +
                "অনুবাদ: আমি আল্লাহ তা’আলার উপর ঈমান আনলাম। তিনি যেমন, তার নামসমূহ ও তাঁর গুণাবলী সহকারে এবং আমি গ্রহণ করেছি তার সমস্ত বিধান ও আরকানকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঈমান-ই মুফাসসাল");
        hashMap.put("message", "امَنْتُ بِاللهِ وَمَلئِكَتِه وَكُتُبِه وَرَسُوْلِه وَالْيَوْمِ الْاخِرِ وَالْقَدْرِ خَيْرِه وَشَرِّه مِنَ اللهِ تَعَالى وَالْبَعْثِ بَعْدَالْمَوْتِ" +
                "\nবাংলা উচ্চারণ : আ-মানতু বিল্লা-হি ওয়া মালা-ইকাতিহী ওয়া কুতুবিহী ওয়া রুসূলিহী ওয়াল ইয়াউমিল আ-খিরী, ওয়াল ক্বাদরি খায়রিহী-ওয়া শাররিহী মিনাল্লা-হি তাআলা ওয়াল বা’সি বা’দাল মাওত।\n" +
                "অনুবাদ: আমি ঈমান আনলাম আল্লাহর উপর তাঁর ফিরিশতাদের উপর, তাঁর আসমানী কিতাবসমূহ, তাঁর রাসূলগণ এবং শেষ দিবসের উপর আর এর উপর যে, অদৃষ্টের ভাল-মন্দআল্লাহ তা’আলার তরফ হতে এবং মৃত্যুর পর পুনরুত্থানের উপর।");
        arrayList.add(hashMap);


        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}