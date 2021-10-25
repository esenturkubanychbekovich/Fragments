package com.esenkubanychbekov.fragment_lesson.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.esenkubanychbekov.fragment_lesson.OnItemClickListener;
import com.esenkubanychbekov.fragment_lesson.R;
import com.esenkubanychbekov.fragment_lesson.model.MusicModel;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {


    private OnItemClickListener listener;
    private ArrayList<MusicModel> list;
    private LayoutInflater inflater;


    public MusicAdapter(ArrayList<MusicModel> list, LayoutInflater inflater) {
        this.list = list;
        this.inflater = inflater;
    }

    public MusicAdapter(Context context, ArrayList<MusicModel> list, OnItemClickListener listener) {
        this.inflater = LayoutInflater.from(context);
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MusicModel model = list.get(position);
        holder.nameOfSong.setText(model.getNameOfSong());
        holder.singerOfSong.setText(model.getNameOfSinger());
        holder.id.setText(model.getNumber());
        holder.itemView.setOnClickListener(v -> {
                listener.onItemClick(model, position);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

      public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView id, nameOfSong, singerOfSong;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.songNumber);
            nameOfSong = itemView.findViewById(R.id.titleOfSong);
            singerOfSong = itemView.findViewById(R.id.singerOfSong);
        }
    }
}


