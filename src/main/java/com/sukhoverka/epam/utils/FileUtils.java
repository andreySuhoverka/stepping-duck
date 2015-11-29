package com.sukhoverka.epam.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> getLabyrinthFromFile() {

        BufferedReader br = null;

        List<String> labyrinthList = new ArrayList();
        try {

            String sCurrentLine;

            String filePath = FileUtils.class.getClassLoader().getResource("labyrinth.txt").getFile();
            File labFile = new File(filePath);
            /*File homeDir = new File(System.getProperty("user.home"));
            File labFile = new File(homeDir, "/tmp/labyrinth.txt");*/
            br = new BufferedReader(new FileReader(labFile));


            while ((sCurrentLine = br.readLine()) != null) {
                labyrinthList.add(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return labyrinthList;

    }
}
