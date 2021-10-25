package com.esenkubanychbekov.fragment_lesson.model;

public class MusicModel {

    private String number;
    private String nameOfSong;
    private String nameOfSinger;
    private int type;

    public MusicModel(String nameOfSong, int type) {
        this.nameOfSong = nameOfSong;
        this.type = type;
    }

    public MusicModel(String number, String nameOfSong, String nameOfSinger) {
        this.number = number;
        this.nameOfSong = nameOfSong;
        this.nameOfSinger = nameOfSinger;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getNameOfSinger() {
        return nameOfSinger;
    }

    public void setNameOfSinger(String nameOfSinger) {
        this.nameOfSinger = nameOfSinger;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
