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

    public String playMusic() {
        return "Playing: " + rockMusic.getSong();
    }

}
