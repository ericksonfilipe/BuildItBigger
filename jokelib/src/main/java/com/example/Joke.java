package com.example;

import java.util.Random;

public class Joke {

    private static final String[] JOKES = new String[] {
            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
            "Anton, do you think I’m a bad mother? My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "I heard women love a man in uniform. Can’t wait to start working at McDonalds.",
            "I got another letter from this lawyer today. It said “Final Notice\". Good that he will not bother me anymore.",
            "Nice pants, baby. What's the drop rate?"
    };

    public static String nextJoke() {
        return "Joke\n" +  JOKES[new Random().nextInt(JOKES.length)];
    }

}
