package com.sukhoverka.epam.utils;

import com.sukhoverka.epam.model.*;

import java.io.Console;

public class DuckUtils {

    private static Console c;

    static {
        c = System.console();
    }

    private static boolean isInvalidInput(String userInput) {
        return !Duck.TOY_DUCK.equals(userInput) && !Duck.REAL_DUCK.equals(userInput);
    }

    private static String getDuckTypeByNumber(String duckNumber) {
        String duckType = null;
        switch (duckNumber) {
            case Duck.TOY_DUCK:
                duckType = "Toy Duck";
                break;
            case Duck.REAL_DUCK:
                duckType = "Real Duck";
                break;
            default:duckType = "Unknown duck type, application error!";
        }
        return duckType;
    }

    private static Duck getDuckByNumber(String duckNumber) {
        Duck duck = null;
        switch (duckNumber) {
            case Duck.TOY_DUCK:
                duck = new ToyDuck();
                break;
            case Duck.REAL_DUCK:
                duck = randomChoiceOfReadDuck();
                break;
        }
        return duck;
    }
    private static Duck randomChoiceOfReadDuck() {
        Duck resultDuck = null;
        double result = Math.random() * 100;
        if(result < 50) {
            resultDuck =  new SteppingDuck();
            c.format(duckInfoLog("SteppingDuck"));
        } else {
            resultDuck =  new FlyableDuck();
            c.format(duckInfoLog("FlyableDuck"));
        }
        return resultDuck;
    }

    private static String duckInfoLog(String duckType) {
        return "\n Your duck is: " + duckType + "\n";
    }

    public static Duck askUserForDuckType() {
        if (c == null) {
            throw new ExceptionInInitializerError("There is no console available");
        }
        String userInput = null;
        while (isInvalidInput(userInput)) {
            c.format("\nChoose type of duck: 0 - real, 1 - toy\n");
            c.format("Duck type: ");
            userInput = c.readLine();
            if (isInvalidInput(userInput)) {
                c.format("Do your best to type 0 or 1 :)");
            }
        }
        c.format("Congratulations! You chose " + getDuckTypeByNumber(userInput) + "\n");
        Duck duck = getDuckByNumber(userInput);
        c.readLine("Type enter to perform a trip ...");
        return duck;

    }

    public static void performTrip(Lab lab, Duck duck) {
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.LEFT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.DOWN);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.DOWN);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.RIGHT);
        duck.makeStep(lab, Direction.UP);
        duck.makeStep(lab, Direction.RIGHT);
    }
}
