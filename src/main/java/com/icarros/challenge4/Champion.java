package com.icarros.challenge4;

public class Champion {

    public int[] returnScorePoint(int[] wins, int[] ties) {
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
