package com.esenkubanychbekov.fragment_lesson.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.esenkubanychbekov.fragment_lesson.MainActivity;
import com.esenkubanychbekov.fragment_lesson.OnItemClickListener;
import com.esenkubanychbekov.fragment_lesson.R;
import com.esenkubanychbekov.fragment_lesson.SecondActivity;
import com.esenkubanychbekov.fragment_lesson.adapter.MusicAdapter;
import com.esenkubanychbekov.fragment_lesson.model.MusicModel;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;
    private MusicAdapter adapter;
    private ArrayList<MusicModel> list;
    private OnItemClickListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();
        recyclerView = view.findViewById(R.id.recyclerView);
        listener = (model, position) -> {
            Intent intent = new Intent(getActivity(), SecondActivity.class);
            intent.putExtra("name",list);
            startActivity(intent);
        };
        adapter = new MusicAdapter(getContext(),list,listener);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

     private void setData() {
        list = new ArrayList<>();
        list.add(new MusicModel("1","Blank Space","Taylor Swift"));
        list.add(new MusicModel("2","Blank Space","Taylor Swift"));
        list.add(new MusicModel("3","Blank Space","Taylor Swift"));
        list.add(new MusicModel("4","Blank Space","Taylor Swift"));
        list.add(new MusicModel("5","Blank Space","Taylor Swift"));
        list.add(new MusicModel("6","Blank Space","Taylor Swift"));
        list.add(new MusicModel("7","Blank Space","Taylor Swift"));

    }

}