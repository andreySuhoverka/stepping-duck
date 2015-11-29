package com.sukhoverka.epam.model;

public class FlyableDuck extends RealDuck {

    private static int STEPS_REQUIRED_FOR_ONE_STEP_UNIT = 2;

    public void updateAvailableSteps() {
        availableSteps -= STEPS_REQUIRED_FOR_ONE_STEP_UNIT;
        if(availableSteps < 0){
            availableSteps = 0;
        }
    }

}
