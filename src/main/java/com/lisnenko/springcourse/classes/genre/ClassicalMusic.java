package com.lisnenko.springcourse.classes.genre;

import com.lisnenko.springcourse.interfaces.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Mozart – Eine kleine Nachtmusik";
    }
}
