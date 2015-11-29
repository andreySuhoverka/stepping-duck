package com.sukhoverka.epam.utils;

public class Statistics {
    private static int requiredStuffTimes = 0;

    public static void incrementRequiredStuffTimes() {
        requiredStuffTimes++;
    }

    public static int getRequiredStuffTimes(){
        return requiredStuffTimes;
    }
}
