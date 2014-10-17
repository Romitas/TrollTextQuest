package com.company;

import java.util.Random;
import java.util.Scanner;


/**
 * Created by romitas on 13.09.2014.
 */
public class Game {

    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    static final String[] TIMES_OF_DAY = {"DAWN", "DAY", "DUSK", "NIGHT"};
    static final String[] WEATHERS = {"CLEAR", "CLOUDY", "RAIN", "FOG"};

    // Two main characters of the story
    public Player player;
    public Stranger stranger;

    // The environment
    public String timeOfDay;
    public String weather;

    //The Script
    public Script script;

    public Game() {

        GenerateScript();
        GenerateEnvironment();
        GeneratePlayer();
        GenerateStranger();
    }

    void GenerateScript() {

        script = new Script();
        script.WALKING = shuffleArray(script.WALKING);
    }
    void GenerateEnvironment() {

        timeOfDay = TIMES_OF_DAY[rand.nextInt(TIMES_OF_DAY.length)];
        weather = WEATHERS[rand.nextInt(WEATHERS.length)];
    }
    void GenerateStranger() {

        stranger = new Stranger();
    }
    void GeneratePlayer() {

        player = new Player();
    }

    public void ActI() {

        String input;
        int n;

        print(script.wokeUp);

        switch (timeOfDay) {
            case "DAWN":
                print(script.timeofDay[0]);
                break;
            case "DAY":
                print(script.timeofDay[1]);
                break;
            case "DUSK":
                print(script.timeofDay[2]);
                break;
            case "NIGHT":
                print(script.timeofDay[3]);
                break;
        }

        switch (weather) {
            case "CLEAR":
                print(script.weather[0]);
                break;
            case "CLOUDY":
                print(script.weather[1]);
                break;
            case "RAIN":
                print(script.weather[2]);
                break;
            case "FOG":
                print(script.weather[3]);
                break;
        }

        print(script.checkEquip);
        print(script.checkAmmo, player.ammo);
        print(script.readyToGo);

        n = 3 + rand.nextInt(4);

        for (int i = 0; i < n; i++) {

            input = getResponse(script.establishDirection);

            while (!(input.equals("север") || input.equals("юг") || input.equals("восток") || input.equals("запад"))) {

                print(script.madeAMistake);
                input = getResponse(script.establishDirection);
            }

            print(script.WALKING[i]); //Yep, just like that.

            if (i != n - 1)
                print(script.onAHalt);
        }

        print(script.sawTheFire);

        switch (stranger.age) {
            case "YOUNG":
                print(script.strangerAges[0]);
                break;
            case "ADULT":
                print(script.strangerAges[1]);
                break;
            case "OLD":
                print(script.strangerAges[2]);
                break;
        }

        switch (stranger.mood) {
            case "CALM":
                print(script.strangerMoods[0]);
                break;
            case "SAD":
                print(script.strangerMoods[1]);
                break;
            case "ANGRY":
                print(script.strangerMoods[2]);
                break;
        }

        print(script.branchCracked);

        if (timeOfDay == "NIGHT" || timeOfDay == "DUSK" || weather == "FOG" || weather == "RAIN") {

            stranger.hasNoticed = false;

            if (timeOfDay == "NIGHT")
                print(script.strangerDidNotNotice[0]);
            else if (timeOfDay == "DUSK")
                print(script.strangerDidNotNotice[1]);
            else if (weather == "FOG")
                print(script.strangerDidNotNotice[2]);
            else if (weather == "RAIN")
                print(script.strangerDidNotNotice[3]);
        }
        else {
            stranger.hasNoticed = true;
            print(script.strangerDidNotice);
        }

        if (!stranger.hasNoticed) {

            print(script.stealthApproach);
            print(script.checkAmmo, player.ammo);
            print(script.stealthWays);
            input = getResponse(script.chooseStealthWay);

            while (!(input.equals("заговорить") || input.equals("выстрелить") || input.equals("уйти"))) {

                print(script.stealthHesitated);
                input = getResponse(script.chooseStealthWay);
            }

            switch (input) {
                case "заговорить":
                    print(script.stealthTalk);
                    stranger.hasNoticed = true;
                    break;
                case "выстрелить":
                    print(script.stealthShoot);
                    player.ammo--;
                    stranger.isLost = true;
                    break;
                case "уйти":
                    print(script.stealthLeave);
                    stranger.isLost = true;
                    break;
            }
        }

        if (stranger.isLost) {
            print(script.noHope);
            print(script.checkAmmo, player.ammo);
            input = getResponse(script.noHopeDecide);

            while (!(input.equals("идти") || input.equals("или"))) {

                print(script.noHopeHesitation);
                input = getResponse(script.noHopeDecide);
            }

            switch (input) {
                case "идти":
                    print(script.noHopeMoveOn);
                    break;
                case "или":
                    print(script.noHopeShoot);
                    break;
            }
            print(script.GameOver);
        }

        else if (stranger.hasNoticed) {
            ActII();
        }
    }

    public void ActII() {
        String input;
        int i, j, n;

        print(script.byTheFireAcquaintance, stranger.name);

        switch (stranger.mood) {
            case "CALM":
                print(script.byTheFireMoodCalm);
                break;
            case "SAD":
                print(script.byTheFireMoodSad);
                break;
            case "ANGRY":
                print(script.byTheFireMoodAngry);
                break;
        }

        print(script.byTheFireConfession, stranger.name);
        print(script.byTheFireOptions);

        i = 0; // The number of the stranger's action
        j = 0; // The number of done repeats
        n = 0; // The number of required repeats

        while (i != 8) {


            input = getResponse(script.byTheFireOptionsChoose);

            while (!(input.equals("разговор") || input.equals("узел") || input.equals("вопль"))) {

                print(script.byTheFireHesitation);
                input = getResponse(script.byTheFireOptionsChoose);
            }

            switch (input) {
                case "разговор":
                    print(script.byTheFireTalkingTopics);
                    input = getResponse(script.byTheFireTopicChoose);

                    while (!(input.equals("хладнокровие") || input.equals("безысходность") || input.equals("злость"))) {

                        print(script.byTheFireWrongTopic);
                        input = getResponse(script.byTheFireTopicChoose);
                    }

                    if ((input.equals("хладнокровие") && stranger.mood == "CALM") ||
                            (input.equals("безысходность") && stranger.mood == "SAD") ||
                            (input.equals("злость") && stranger.mood == "ANGRY")) {
                        print(script.byTheFireTalkingWorked);
                        j-=4;
                    }
                    else {
                        print(script.byTheFireTalkingDidntWork);
                        j-=2;
                    }
                    break;
                case "узел":
                    print(script.byTheFireKnotCutting);
                    player.knotProgress++;
                    break;
                case "вопль":
                    print(script.byTheFireScream, stranger.name);
                    break;
            }

            if ((i == 0 || i == 2 || i == 4) && j == 0) {
                n = 1 + rand.nextInt(2);
            }
            else {
                j = 0;
            }

            print(script.byTheFireStrangerActions[i], stranger.name);
            j++;

            if (player.knotProgress >= 10) {
                break;
            }

            if (j == n) { // Follow to the next action
                j = 0;
                n = 1;
                i++;
            }
        }

        if (i == 8) {
            print(script.GameOver);
        }
        else if (i != 8 && player.knotProgress >= 10) {
            print(script.byTheFireShoot);
            print(script.GameOver);
        }

    }

    void print (String[] output) {
        for (String i : output)
            print(i);
    }

    void print (String output) {
        System.out.print(output);
        scanner.nextLine();
    }

    void print (String output, Object... args) {
        System.out.print(String.format(output, args));
        scanner.nextLine();
    }

    void print (String[] output, Object... args) {
        for (String i : output) {
                print(String.format(i, args));
        }
    }

    String getResponse(String output) {
        String input;

        System.out.print(output);
        input = scanner.nextLine();
        input = input.toLowerCase();

        return input;
    }

    String[] shuffleArray(String[] arr)
    {
        String temp;
        for (int i = arr.length - 1; i > 0; i--)
        {
            int index = rand.nextInt(i + 1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
