package com.sukhoverka.epam;

import com.sukhoverka.epam.model.Duck;
import com.sukhoverka.epam.model.Lab;

import static com.sukhoverka.epam.utils.DuckUtils.askUserForDuckType;
import static com.sukhoverka.epam.utils.DuckUtils.performTrip;

public class DuckApp {

    public static void main(String[] args) {
        Duck duck = askUserForDuckType();
        Lab lab = new Lab();
        performTrip(lab, duck);

    }

}
