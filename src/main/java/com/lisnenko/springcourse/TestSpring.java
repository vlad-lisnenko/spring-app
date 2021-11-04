package com.lisnenko.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume() + "%");
        musicPlayer.playMusicList();

        context.close();
    }
}
