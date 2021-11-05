package com.lisnenko.springcourse.classes.genre;

import com.lisnenko.springcourse.interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Dave Brubeck - Take Five");
        songs.add("Norah Jones – The Nearness Of You");
        songs.add("Johnny Mathis – Misty");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }

}
