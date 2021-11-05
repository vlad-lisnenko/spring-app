package com.lisnenko.springcourse.classes;

import com.lisnenko.springcourse.classes.genre.ClassicalMusic;
import com.lisnenko.springcourse.classes.genre.JazzMusic;
import com.lisnenko.springcourse.classes.genre.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
        System.out.println("Playing: " + jazzMusic.getSong());
    }

}
