package com.sukhoverka.epam.model;

import com.sukhoverka.epam.utils.Statistics;

public class ToyDuck extends Duck {

    private static int STEPS_REQUIRED_FOR_ONE_STEP_UNIT = 1;
    public static String NAME = "ToyDuck";
    public ToyDuck() {
        DEFAULT_AVAILABLE_STEPS = 4;
        availableSteps = DEFAULT_AVAILABLE_STEPS;
    }

    public void askStuffIfRequired() {
        if(availableSteps == 0) {
            System.out.println("Need charging for further searching! Got it, continue searching!");
            availableSteps = DEFAULT_AVAILABLE_STEPS;
            Statistics.incrementRequiredStuffTimes();
        }
    }

    public int getStepsRequiredForOneStepUnit() {
        return STEPS_REQUIRED_FOR_ONE_STEP_UNIT;
    }


}
