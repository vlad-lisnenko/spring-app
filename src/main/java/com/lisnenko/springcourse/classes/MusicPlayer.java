package com.lisnenko.springcourse.classes;

import com.lisnenko.springcourse.classes.genre.ClassicalMusic;
import com.lisnenko.springcourse.classes.genre.JazzMusic;
import com.lisnenko.springcourse.classes.genre.MusicGenre;
import com.lisnenko.springcourse.classes.genre.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class MusicPlayer {
    private Map<MusicGenre, List<String>> musicGenreListMap = new HashMap<>();

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        musicGenreListMap.put(MusicGenre.JAZZ, jazzMusic.getSongs());
        musicGenreListMap.put(MusicGenre.ROCK, rockMusic.getSongs());
        musicGenreListMap.put(MusicGenre.CLASSICAL, classicalMusic.getSongs());
    }

    public String playMusic(){
        MusicGenre randomGenre = MusicGenre.CLASSICAL.getRandomGenre();
        return "Playing: " + randomGenre + ": " + musicGenreListMap.get(randomGenre)
                .get(new Random().nextInt(3));
    }

}
