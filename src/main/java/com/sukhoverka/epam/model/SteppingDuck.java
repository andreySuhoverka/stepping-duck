package com.sukhoverka.epam.model;

public class SteppingDuck extends RealDuck {

    private static int STEPS_REQUIRED_FOR_ONE_STEP_UNIT = 1;

    public void updateAvailableSteps() {
        availableSteps -= STEPS_REQUIRED_FOR_ONE_STEP_UNIT;
    }

}
