package com.ramazansimsir.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.ramazansimsir.deneme.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    public ActivityMain2Binding binding;

    int[] imageArray = {R.drawable.muslera,R.drawable.adekugbe,R.drawable.boey
            ,R.drawable.kaan,R.drawable.nelson,R.drawable.bardakci,R.drawable.fredrikk,R.drawable.torreria
            ,R.drawable.sergio,R.drawable.baris,R.drawable.mata,R.drawable.zaniolo,R.drawable.mertens,R.drawable.yunus,R.drawable.kerem,R.drawable.yusuf,R.drawable.rashica,R.drawable.gomis,R.drawable.icardi};
    String [] playerName={"FERNANDO MUSLERA","SAM ADEKUGBE"," SACHA BOEY","KAAN AYHAN",
            "VİCTOR NELSON","ABDULKERİM BARDAKÇI"," FREDRİK MİDTSJÖ","LUCAS TORRERİA","SERGİO OLİVEİRA",
            "BARIŞ ALPER YILMAZ","JUAN MATA","NİCOLO ZANİOLO","DRİES MERTENS","YUNUS AKGÜN","KEREM AKTÜRKOĞLU",
            "YUSUF DEMİR","MİLOT RASHİCA","BAFETİMBİ GOMİS","MAURO İCARDİ"
    };
    String [] playerPosition={"KALECİ","SOL BEK","SAĞ BEK","STOPER","STOPER",
            "STOPER","MERKEZ ORTA SAHA","ÖNLİBERO","MERKEZ ORTA SAHA","SOL KANAT",
            "ON NUMARA","ON NUMARA","FORVET ARKASI","SAĞ KANAT","SOL KANAT",
            "SAĞ KANAT ","SAĞ KANAT ","SANTRAFOR","SANTRAFOR"};

    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageView.setImageResource(R.drawable.galatasaray);

        handler.postDelayed(new Runnable() {
            int i=0;
            @Override
            public void run() {
                binding.imageView.setImageResource(imageArray[i]);
                binding.textView.setText(playerName[i]);
                binding.textView2.setText(playerPosition[i]);
                i++;
                if(i<19){
                    handler.postDelayed(this,1000);
                }
                else{
                    handler.removeCallbacks(this);
                }

            }
        },1000);



    }
}