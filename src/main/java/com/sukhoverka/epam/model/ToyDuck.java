package com.sukhoverka.epam.model;

import com.sukhoverka.epam.utils.Statistics;

public class ToyDuck extends Duck {

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

    public void updateAvailableSteps(){
        availableSteps--;
    }


}
