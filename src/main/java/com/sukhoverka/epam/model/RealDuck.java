package com.sukhoverka.epam.model;


import com.sukhoverka.epam.utils.Statistics;

public abstract class RealDuck extends Duck {
    
    public static String NAME = "RealDuck";
    public RealDuck() {
        DEFAULT_AVAILABLE_STEPS = 3;
        updateAvailableSteps(DEFAULT_AVAILABLE_STEPS);
    }

    public void askStuffIfRequired() {
        if(availableSteps == 0) {
            System.out.println("Need meals for further searching! Got it, continue searching!");
            updateAvailableSteps(DEFAULT_AVAILABLE_STEPS);
            Statistics.incrementRequiredStuffTimes();
        }
    }
}
