package com.sukhoverka.epam.model;

import com.sukhoverka.epam.utils.Statistics;

import java.util.List;

public abstract class Duck {

    // position in a labyrinth
    private int i;
    private int j;

    private static String RIGHT_DIRECTION = "right";
    private static String LEFT_DIRECTION = "left";
    private static String UP_DIRECTION = "up";
    private static String DOWN_DIRECTION = "down";

    public static final String REAL_DUCK = "0";
    public static final String TOY_DUCK = "1";

    protected int availableSteps;
    protected int DEFAULT_AVAILABLE_STEPS;

    public Duck(){
        i = j = 0;
    }

    // assume labyrinth matrix is square


    private void right(Lab lab) {
        boolean[][] matrix = lab.getMatrix();
        if(j + 1 > matrix.length - 1 || !matrix[i][j + 1]){
            blockLog(RIGHT_DIRECTION);
        } else {
            j++;
            stepLog(RIGHT_DIRECTION);
            updateAvailableSteps();
        }
    }

    private void left(Lab lab) {
        boolean[][] matrix = lab.getMatrix();
        if(j - 1 < 0 || !matrix[i][j - 1]){
            blockLog(LEFT_DIRECTION);
        } else {
            j--;
            stepLog(LEFT_DIRECTION);
            updateAvailableSteps();
        }
    }

    private void up(Lab lab) {
        boolean[][] matrix = lab.getMatrix();
        if(i + 1 > matrix.length - 1 || !matrix[i + 1][j]){
            blockLog(UP_DIRECTION);
        } else {
            i++;
            stepLog(UP_DIRECTION);
            updateAvailableSteps();
        }
    }

    private void down(Lab lab) {
        boolean[][] matrix = lab.getMatrix();
        if(i - 1 < 0 || !matrix[i - 1][j]){
            blockLog(DOWN_DIRECTION);
        } else {
            i--;
            stepLog(DOWN_DIRECTION);
            updateAvailableSteps();
        }
    }

    public abstract void updateAvailableSteps();

    public void makeStep(Lab lab, Direction direction) {
        askStuffIfRequired();
        switch (direction) {
            case DOWN:
                down(lab);
                break;
            case UP:
                up(lab);
                break;
            case LEFT:
                left(lab);
                break;
            case RIGHT:
                right(lab);
                break;
            default:throw new RuntimeException("Unknown direction! Application error");
        }
        checkIfWon(lab);
    }

    private void checkIfWon(Lab lab) {
        List<Integer> winCoordinates = lab.getWinCoordinates();
        if(i == winCoordinates.get(0) && j == winCoordinates.get(1)){
            System.out.println("I won!!!");
            System.out.println("Duck asked for stuff " + Statistics.getRequiredStuffTimes() + " times.");
            System.exit(777);
        }
    }

    private void stepLog(String direction){
        System.out.println("I'm stepping " + direction + ", crya crya");
    }

    private void blockLog(String direction){
        System.out.println("I'm blocked, stepping " + direction + ", crya crya");
    }

    protected void updateAvailableSteps(int newValueOfSteps) {
        availableSteps = newValueOfSteps;
    }
    protected abstract void askStuffIfRequired();



}
