package com.esenkubanychbekov.fragment_lesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.esenkubanychbekov.fragment_lesson.adapter.MusicAdapter;
import com.esenkubanychbekov.fragment_lesson.fragments.FirstFragment;
import com.esenkubanychbekov.fragment_lesson.fragments.SecondFragment;
import com.esenkubanychbekov.fragment_lesson.model.MusicModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MusicModel> model;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container_1, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_2, new SecondFragment()).commit();

    }

    public void startActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}