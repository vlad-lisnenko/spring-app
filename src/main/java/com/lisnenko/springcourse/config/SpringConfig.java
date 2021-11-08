package com.lisnenko.springcourse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lisnenko.springcourse.classes")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
