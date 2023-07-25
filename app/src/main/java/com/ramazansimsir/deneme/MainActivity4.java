package com.ramazansimsir.deneme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.ramazansimsir.deneme.databinding.ActivityMain2Binding;
import com.ramazansimsir.deneme.databinding.ActivityMain4Binding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity4 extends AppCompatActivity {

    List<Player> playerList=new ArrayList<>();
    Player player=new Player("İcardi",19,R.drawable.icardi);
    Player player2=new Player("Mertens",3,R.drawable.mertens);
    Player player3=new Player("Yusuf Demir",5,R.drawable.yusuf);
    Player player4=new Player("Milot Rashica",9,R.drawable.rashica);
    Player player5=new Player("Barış Alper",4,R.drawable.baris);
    Player player6=new Player("Kerem Aktürkoğlu",15,R.drawable.kerem);
    Player player7=new Player("Juan Mata",1,R.drawable.mata);
    Player player8=new Player("Nicolo Zaniolo",27,R.drawable.zaniolo);
    Player player9=new Player("Sacha Boey",16,R.drawable.boey);
    Player player10=new Player("Kazımcan Karataş",2,R.drawable.kazimkadro);

    Player player11=new Player("Victor Nelsson",18,R.drawable.nelson);
    Player player12=new Player("Abdülkerim Bardakçı",6,R.drawable.bardakci);
    Player player13= new Player("Yunus Akgün",7,R.drawable.yunus);
    int i=0;
    int j=1;
    int score=0;

    public ActivityMain4Binding design;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        design=ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(design.getRoot());
        playerList.add(player);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);
        playerList.add(player7);
        playerList.add(player8);
        playerList.add(player9);
        playerList.add(player10);
        playerList.add(player11);
        playerList.add(player12);
        playerList.add(player13);


        design.textView16.setText(playerList.get(0).getName());
        design.textView5.setText(playerList.get(1).getName());
        design.imageView15.setImageResource(playerList.get(0).getImage());
        design.imageView16.setImageResource(playerList.get(1).getImage());


        design.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerList.get(i).getValue()>playerList.get(j).getValue()){
                    j++;
                    design.imageView16.setImageResource(playerList.get(j).getImage());
                    design.textView5.setText(playerList.get(j).getName());
                    score+=10;
                    design.textView17.setText("Score :: "+score);
                }
                else{
                    Toast.makeText(getApplicationContext(),"yanlış tercih",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
                    intent.putExtra("Score",score);
                    startActivity(intent);
                }
            }
        });
        design.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerList.get(i).getValue()<playerList.get(j).getValue()){
                    if(i+1==j){
                        i+=2;
                    }
                    else {
                        i++;
                    }
                    if(i>=playerList.size()){
                       i=playerList.size()-1;
                        Toast.makeText(getApplicationContext(),"Oyuncular bu kadar",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
                        intent.putExtra("Score",score);
                        startActivity(intent);
                    }

                    design.imageView15.setImageResource(playerList.get(i).getImage());
                    score+=10;
                    design.textView17.setText("Score :: "+score);
                    design.textView16.setText(playerList.get(i).getName());
                }
                else{
                    Toast.makeText(getApplicationContext(),"Yanlış tahmin",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
                    intent.putExtra("Score",score);
                    startActivity(intent);

                }

            }
        });





    }
}