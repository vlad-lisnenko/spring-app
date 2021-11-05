package com.lisnenko.springcourse.classes.genre;

import com.lisnenko.springcourse.interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("\"Whole Lotta Love\" by Led Zeppelin");
        songs.add("\"Sympathy for the Devil\" by The Rolling Stones");
        songs.add("\"Comfortably Numb\" by Pink Floyd");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }

}
