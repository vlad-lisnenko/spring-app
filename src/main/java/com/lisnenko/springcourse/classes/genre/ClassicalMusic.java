package com.lisnenko.springcourse.classes.genre;

import com.lisnenko.springcourse.interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Mozart – Eine kleine Nachtmusik");
        songs.add("Beethoven – Für Elise");
        songs.add("J.S. Bach – Toccata and Fugue in D minor");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
