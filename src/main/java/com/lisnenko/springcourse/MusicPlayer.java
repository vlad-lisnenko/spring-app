package com.lisnenko.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getVolume() {return volume;}
    public void setVolume(int volume) {this.volume = volume;}

    public MusicPlayer() { }
    //IoC
    public MusicPlayer(List<Music> musicList) { this.musicList = musicList;}
    public void setMusicList(List<Music> musicList) {this.musicList = musicList;}

    public void playMusicList() {
        System.out.println("Music list: ");
        musicList.forEach(music -> System.out.println(music.getSong()));
    }

}
