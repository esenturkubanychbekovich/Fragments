package com.esenkubanychbekov.fragment_lesson.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.esenkubanychbekov.fragment_lesson.R;
import com.esenkubanychbekov.fragment_lesson.SecondActivity;
import com.esenkubanychbekov.fragment_lesson.adapter.MusicAdapter;
import com.esenkubanychbekov.fragment_lesson.model.MusicModel;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private TextView nameOfSong, singerOfSong;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=  inflater.inflate(R.layout.fragment_blank, container, false);
       nameOfSong = view.findViewById(R.id.nameOfSong);
       singerOfSong = view.findViewById(R.id.singerOfSong);
       return view;
    }


}