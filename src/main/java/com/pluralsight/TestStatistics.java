package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {100,50,78,84,46,76,98,94,83,100};

        //average
        //high score math.max
        //low score math.min
        int lowestScore = testScores[0];
        int highestScore = testScores[0];
        double scoreTotal = 0;



        for (int i = 0; i < testScores.length; i++){

             scoreTotal+=testScores[i];

             if(testScores[i] < lowestScore){

                 lowestScore = testScores[i];

             }

             if(testScores[i] > highestScore){

                 highestScore = testScores[i];
             }


        }
        double scoreAverage = scoreTotal / 10;
        System.out.println("The average score: " + scoreAverage);
        System.out.println("The lowest score: " + lowestScore);
        System.out.println("The highest score: " + highestScore);
    }
}

//