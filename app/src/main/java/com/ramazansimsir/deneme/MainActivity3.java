package com.ramazansimsir.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.ramazansimsir.deneme.databinding.ActivityMain2Binding;
import com.ramazansimsir.deneme.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    public ActivityMain3Binding style;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        style=ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(style.getRoot());

        style.layout.setBackgroundResource(R.drawable.yesilsaha);
        style.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(style.switch1.isChecked()){
                    style.switch1.setText("Fenerbahçe");
                    style.imageView.setImageResource(R.drawable.valencia);
                    style.imageView2.setImageResource(R.drawable.irfancan);
                    style.imageView11.setImageResource(R.drawable.rossi);
                    style.imageView6.setImageResource(R.drawable.zajc);
                    style.imageView7.setImageResource(R.drawable.ardaguler);
                    style.imageView12.setImageResource(R.drawable.ferdi);
                    style.imageView3.setImageResource(R.drawable.batshuayi);
                    style.imageView4.setImageResource(R.drawable.samet);
                    style.imageView10.setImageResource(R.drawable.atilla);
                    style.imageView5.setImageResource(R.drawable.luanperes);
                    style.imageView9.setImageResource(R.drawable.arao);

                    style.textView8.setText("Peres");
                    style.textView3.setText("Arda");
                    style.textView6.setText("Batshuayi");
                    style.textView7.setText("Valencia");
                    style.textView9.setText("Samet");
                    style.textView10.setText("Szalai");
                    style.textView11.setText("İrfancan");
                    style.textView12.setText("Ferdi");
                    style.textView13.setText("Zajc");
                    style.textView14.setText("Rossi");
                    style.textView15.setText("Arao");

                }
                else {
                    style.switch1.setText("Galatasaray");
                    style.imageView.setImageResource(R.drawable.icardikadro);
                    style.imageView2.setImageResource(R.drawable.muslerakadro);
                    style.imageView11.setImageResource(R.drawable.keremkadro);
                    style.imageView6.setImageResource(R.drawable.oliveirakadro);
                    style.imageView7.setImageResource(R.drawable.mertenskadro);
                    style.imageView12.setImageResource(R.drawable.boeykadro11);
                    style.imageView3.setImageResource(R.drawable.zaniolokadro);
                    style.imageView4.setImageResource(R.drawable.abdulkadro);
                    style.imageView10.setImageResource(R.drawable.nelsonkadro);
                    style.imageView5.setImageResource(R.drawable.kazimkadro);
                    style.imageView9.setImageResource(R.drawable.toreirakadro);

                    style.textView8.setText("Kazımcan");
                    style.textView3.setText("Mertens");
                    style.textView6.setText("Zaniolo");
                    style.textView7.setText("İcardi");
                    style.textView9.setText("Abdulkerim");
                    style.textView10.setText("Nelsson");
                    style.textView11.setText("Muslera");
                    style.textView12.setText("Boey");
                    style.textView13.setText("Oliveira");
                    style.textView14.setText("Kerem");
                    style.textView15.setText("Torreria");



                }

            }
        });

    }
}