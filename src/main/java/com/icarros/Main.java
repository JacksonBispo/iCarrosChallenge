package com.icarros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        var fizzingNBuzzing = new FizzingNBuzzing();

        var angryMarvinBirds = new AngryMarvinBirds();

        var creepyHour = new CreepyHours();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzingNBuzzing.getMessage(i));
        }

        System.out.println(angryMarvinBirds.showStars(1));
        System.out.println(angryMarvinBirds.showStars(2));
        System.out.println(angryMarvinBirds.showStars(3));


        String[] input = {"10:10", "11:00", "10:01", "10:10"};
        System.out.println(creepyHour.countMoments(input));

        int[] wins = {1, 0, 3};
        int[] ties = {2, 2, 0};
        int[] result = returnScorePoint(wins, ties);
        System.out.println("Pontos conquistados: " + result[0]);
        System.out.println("Time campeao: "+result[1]);


    }

    private static int[] returnScorePoint(int[] wins, int[] ties) {
        int n = wins.length;
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = wins[i] * 3 + ties[i];
        }
        int maxPoints = 0;
        int position = 0;
        for (int i = 0; i < n; i++) {
            if (points[i] > maxPoints) {
                maxPoints = points[i];
                position = i;
            }
        }
        return new int[]{maxPoints, position};
    }
}