package com.lisnenko.springcourse.classes.genre;

import java.util.Random;

public enum MusicGenre {
    CLASSICAL,
    ROCK,
    JAZZ;

    public MusicGenre  getRandomGenre(){
        return MusicGenre.values()[new Random().nextInt(3)];
    }
}
