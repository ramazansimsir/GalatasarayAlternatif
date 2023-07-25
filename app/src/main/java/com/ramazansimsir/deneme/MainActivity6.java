package com.ramazansimsir.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import com.ramazansimsir.deneme.databinding.ActivityMain6Binding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity6 extends AppCompatActivity {

    List<Player> playerList=new ArrayList<>();
    public ActivityMain6Binding design;
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
    Player player14=new Player("Fernando Muslera ",3,R.drawable.muslerakadro);
    Player player15=new Player("Sergio Oliveira",5,R.drawable.oliveirakadro);
    Player player16=new Player("Lucas Torreira",14,R.drawable.toreirakadro);

    int i=0;
    int round=16;
    List<Player>playerListQuarter=new ArrayList<>();
    List<Player> playerListSemi=new ArrayList<>();
    List<Player> playerListFinal=new ArrayList<>();
    int [] array16;
    int [] array8;
    int [] array4;
    int [] array2;
    int j=0;
    int basma=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        design=ActivityMain6Binding.inflate(getLayoutInflater());
        setContentView(design.getRoot());
        playerList.add(player); playerList.add(player2); playerList.add(player3);
        playerList.add(player4); playerList.add(player5); playerList.add(player6);
        playerList.add(player7); playerList.add(player8); playerList.add(player9);
        playerList.add(player10); playerList.add(player11); playerList.add(player12);
        playerList.add(player13); playerList.add(player14); playerList.add(player15);
        playerList.add(player16);

        array16=setRandom(round);
        array8=setRandom(8);
        array4=setRandom(4);
        array2=setRandom(2);

        design.imageView18.setImageResource(playerList.get(array16[i]).getImage());
        design.imageView19.setImageResource(playerList.get(array16[i+1]).getImage());

        design.textView19.setText("Son 16");




        design.imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basma++;

                if(basma<8){
                    playerListQuarter.add(playerList.get(array16[i]));
                     i+=2;
                    design.imageView18.setImageResource(playerList.get(array16[i]).getImage());
                    design.imageView19.setImageResource(playerList.get(array16[i+1]).getImage());
                } else if (basma==8) {
                    playerListQuarter.add(playerList.get(array16[i]));
                    i=0;
                    design.textView19.setText("quarter final");
                    design.imageView18.setImageResource(playerListQuarter.get(array8[i]).getImage());
                    design.imageView19.setImageResource(playerListQuarter.get(array8[i+1]).getImage());

                }
                else if( 9<=basma && basma<12){
                    playerListSemi.add(playerListQuarter.get(array8[i]));
                    i+=2;
                    design.imageView18.setImageResource(playerListQuarter.get(array8[i]).getImage());
                    design.imageView19.setImageResource(playerListQuarter.get(array8[i+1]).getImage());
                } else if (basma==12) {
                    design.textView19.setText("semi final");
                    playerListSemi.add(playerListQuarter.get(array8[i]));
                    i=0;
                    design.imageView18.setImageResource(playerListSemi.get(array4[i]).getImage());
                    design.imageView19.setImageResource(playerListSemi.get(array4[i+1]).getImage());
                } else if (basma==13) {
                    playerListFinal.add(playerListSemi.get(array4[i]));
                    i+=2;
                    design.imageView18.setImageResource(playerListSemi.get(array4[i]).getImage());
                    design.imageView19.setImageResource(playerListSemi.get(array4[i+1]).getImage());
                }
                else if(basma==14){
                    design.textView19.setText("final");
                        playerListFinal.add(playerListSemi.get(array4[i]));
                        i=0;
                        design.imageView18.setImageResource(playerListFinal.get(array2[i]).getImage());
                        design.imageView19.setImageResource(playerListFinal.get(array2[i+1]).getImage());

                }
                else if(basma==15){
                    Intent intent=new Intent(MainActivity6.this,MainActivity7.class);
                    intent.putExtra("player",playerListFinal.get(array2[i]));
                    startActivity(intent);
                }


            }
        });

        design.imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basma++;

                if(basma<8){
                    playerListQuarter.add(playerList.get(array16[i+1]));
                    i+=2;
                    design.imageView18.setImageResource(playerList.get(array16[i]).getImage());
                    design.imageView19.setImageResource(playerList.get(array16[i+1]).getImage());
                } else if (basma==8) {
                    design.textView19.setText("quarter final");
                    playerListQuarter.add(playerList.get(array16[i+1]));
                    i=0;
                    design.imageView18.setImageResource(playerListQuarter.get(array8[i]).getImage());
                    design.imageView19.setImageResource(playerListQuarter.get(array8[i+1]).getImage());

                }
                else if( 9<=basma && basma<12){
                    playerListSemi.add(playerListQuarter.get(array8[i+1]));
                    i+=2;
                    design.imageView18.setImageResource(playerListQuarter.get(array8[i]).getImage());
                    design.imageView19.setImageResource(playerListQuarter.get(array8[i+1]).getImage());
                } else if (basma==12) {
                    design.textView19.setText("semi final");
                    playerListSemi.add(playerListQuarter.get(array8[i+1]));
                    i=0;
                    design.imageView18.setImageResource(playerListSemi.get(array4[i]).getImage());
                    design.imageView19.setImageResource(playerListSemi.get(array4[i+1]).getImage());
                } else if (basma==13) {

                    playerListFinal.add(playerListSemi.get(array4[i+1]));
                    i+=2;
                    design.imageView18.setImageResource(playerListSemi.get(array4[i]).getImage());
                    design.imageView19.setImageResource(playerListSemi.get(array4[i+1]).getImage());
                }
                else if(basma==14){
                    design.textView19.setText("final");
                    playerListFinal.add(playerListSemi.get(array4[i+1]));
                    i=0;
                    design.imageView18.setImageResource(playerListFinal.get(array2[i]).getImage());
                    design.imageView19.setImageResource(playerListFinal.get(array2[i+1]).getImage());

                }
                else if(basma==15){
                    Intent intent=new Intent(MainActivity6.this,MainActivity7.class);
                    intent.putExtra("player",playerListFinal.get(array2[i+1]));
                    startActivity(intent);
                }


            }
        });






    }



    public int[] setRandom(int round){

        int array[]=new int[round];

        // to get 0 for result
        // javada bos dizi olusturunca degerlere sıfır atıyor
        for (int i=0;i<round;i++){
            array[i]=-1;
        }

        int i=0,j=0;
        Random rand=new Random();
        while (i<round){

            int number=rand.nextInt(round);

            for(j=0;j<round;j++){
                 if(array[j]==number)
                     break;
            }
            if(j==round){
                array[i]=number;
                i++;
            }
        }
        return array;
    }



}