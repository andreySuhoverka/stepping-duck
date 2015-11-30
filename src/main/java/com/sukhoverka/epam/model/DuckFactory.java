package com.sukhoverka.epam.model;

public class DuckFactory {
    
    public static Duck getDuckByNumber(String duckNumber) {
        Duck duck;
        switch (duckNumber) {
            case "0":
                duck = new ToyDuck();
                break;
            case "1":
                duck = randomChoiceOfReadDuck();
                break;
            default: throw new ExceptionInInitializerError("Unknown type of duck!");
        }
        return duck;
    }

    public static String getDuckTypeByNumber(String duckNumber) {
        String duckType = null;
        switch (duckNumber) {
            case "0":
                duckType = ToyDuck.NAME;
                break;
            case "1":
                duckType = RealDuck.NAME;
                break;
        }
        return duckType;
    }

    private static Duck randomChoiceOfReadDuck() {
        Duck resultDuck;
        double result = Math.random() * 100;
        if(result < 50) {
            resultDuck =  new SteppingDuck();
        } else {
            resultDuck =  new FlyableDuck();
        }
        return resultDuck;
    }
}
