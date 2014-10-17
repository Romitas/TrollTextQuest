package com.company;
import java.util.Random;

/**
 * Created by romitas on 13.09.2014.
 */
public class Player {
    /**
     * The Protagonist
     */
    public static Random rand = new Random();

    public int ammo;
    public boolean isAlive = true;

    public int knotProgress = 0;

    public Player() {

        ammo = 2 + rand.nextInt(3);
    }

}
