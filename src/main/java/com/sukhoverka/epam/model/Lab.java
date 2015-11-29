package com.sukhoverka.epam.model;

import com.sukhoverka.epam.utils.FileUtils;

import java.util.Arrays;
import java.util.List;

public class Lab {

    private boolean[][] matrix;
    private static int BUSY = 120; // char code of 'x' character

    public Lab() {
        matrix = new boolean[14][14];
        createLabyrinth();
    }

    public List<Integer> getWinCoordinates(){
        return Arrays.asList(12,13);
    }

    public void createLabyrinth() {
        List<String> labList = FileUtils.getLabyrinthFromFile();
        validateLabyrinth(labList);
        for (int k = 0; k < 14; k++) {
            char[] labLine = labList.get(14 - 1 - k).toCharArray();
            for (int j = 0; j < 14; j++) {
                matrix[k][j] = labLine[j] != BUSY;
            }
        }
    }

    public static void validateLabyrinth(List<String> labList) {
        if (labList.size() != 14) {
            // todo: how keep dry here with throwing ExceptionInInitializerError?
            throw new ExceptionInInitializerError("wrong labyrinth row size: " + labList.size());
        }
        for(int k = 0; k < labList.size(); k++){
            if(labList.get(k).length() != 14){
                throw new ExceptionInInitializerError("wrong labyrinth row size: " + labList.size());
            }
        }

    }

    public boolean[][] getMatrix() {
        return matrix;
    }


}
