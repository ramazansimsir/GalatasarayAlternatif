package com.ramazansimsir.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ramazansimsir.deneme.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity {

    public ActivityMain5Binding design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        design=ActivityMain5Binding.inflate(getLayoutInflater());

        setContentView(design.getRoot());

        Intent intent =getIntent();
        int score=intent.getIntExtra("Score",0);
        design.textView18.setText("Score  " + score);

        design.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,MainActivity.class);
                startActivity(intent);
            }
        });
        design.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity5.this,MainActivity4.class);
               startActivity(intent);

            }
        });



    }
}