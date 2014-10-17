package com.company;
import java.util.Random;

/**
 * Created by romitas on 15/09/14.
 */

public class Stranger {
    /**
     * The... Antagonist?..
     */

    public static Random rand = new Random();

    static final String[] NAMES = {"Эд", "Стив", "Джим", "Билл", "Марк", "Лоренцо"};
    static final String[] AGES = {"YOUNG", "ADULT", "OLD"};
    static final String[] MOODS = {"CALM", "SAD", "ANGRY"};

    public String name;
    public String age;
    public String mood;

    public boolean hasNoticed = false;
    public boolean isLost = false;

    public Stranger() {

        name = NAMES[rand.nextInt(NAMES.length)];
        age = AGES[rand.nextInt(AGES.length)];
        mood = MOODS[rand.nextInt(MOODS.length)];
    }
}
