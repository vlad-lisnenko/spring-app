package com.lisnenko.springcourse;


import com.lisnenko.springcourse.classes.MusicPlayer;
import com.lisnenko.springcourse.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic(MusicGenre.ROCK);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("volume: " + musicPlayer.getVolume());

        context.close();
    }
}
