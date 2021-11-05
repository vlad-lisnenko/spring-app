package com.lisnenko.springcourse;


import com.lisnenko.springcourse.classes.MusicPlayer;
import com.lisnenko.springcourse.classes.genre.MusicGenre;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic(MusicGenre.ROCK);

        context.close();
    }
}
