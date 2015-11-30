package com.sukhoverka.epam.utils;

import com.sukhoverka.epam.model.*;
import static com.sukhoverka.epam.model.DuckFactory.*;

import java.io.Console;

public class DuckUtils {

    private static Console c;

    static {
        c = System.console();
    }

    private static boolean isInvalidInput(String userInput) {
        return userInput == null || getDuckTypeByNumber(userInput) == null;
    }
    
    public static Duck askUserForDuckType() {
        if (c == null) {
            throw new ExceptionInInitializerError("There is no console available");
        }
        String userInput = null;
        while (isInvalidInput(userInput)) {
            c.format("\nChoose type of duck: 0 - toy, 1 - real\n");
            c.format("Duck type: ");
            userInput = c.readLine();
            if (isInvalidInput(userInput)) {
                c.format("Do your best to type 0 or 1 :)");
            }
        }
        c.format("Congratulations! You chose " + getDuckTypeByNumber(userInput) + "\n");
        Duck duck = DuckFactory.getDuckByNumber(userInput);
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
