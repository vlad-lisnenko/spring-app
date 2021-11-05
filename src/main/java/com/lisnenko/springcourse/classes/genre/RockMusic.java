package com.lisnenko.springcourse.classes.genre;

import com.lisnenko.springcourse.interfaces.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Led Zeppelin - Rock And Roll";
    }
}
