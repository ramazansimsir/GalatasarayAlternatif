package com.ramazansimsir.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ramazansimsir.deneme.databinding.ActivityMain7Binding;

import java.io.Serializable;

public class MainActivity7 extends AppCompatActivity {

    public ActivityMain7Binding design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        design=ActivityMain7Binding.inflate(getLayoutInflater());
        setContentView(design.getRoot());

        Intent intent=getIntent();
        Player player=(Player) intent.getExtras().getSerializable("player");

        design.imageView14.setImageResource(player.getImage());







    }
}