package com.lisnenko.springcourse.classes;

import com.lisnenko.springcourse.classes.genre.ClassicalMusic;
import com.lisnenko.springcourse.classes.genre.JazzMusic;
import com.lisnenko.springcourse.classes.genre.MusicGenre;
import com.lisnenko.springcourse.classes.genre.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;
    private final JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic(MusicGenre genre){
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if(genre == MusicGenre.JAZZ)
            System.out.println("Playing: " + jazzMusic.getSongs().get(randomNumber));
        else if(genre == MusicGenre.CLASSICAL)
            System.out.println("Playing: " + classicalMusic.getSongs().get(randomNumber));
        else System.out.println("Playing: " + rockMusic.getSongs().get(randomNumber));
    }

}
