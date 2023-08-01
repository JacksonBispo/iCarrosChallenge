package com.icarros.challenge4;

public class ChampionMain {

    public static void main(String[] args) {
        var champion = new Champion();

        int[] wins = {1, 0, 3};
        int[] ties = {2, 2, 0};
        int[] result = champion.returnScorePoint(wins, ties);

        System.out.println("Pontos conquistados: " + result[0]);
        System.out.println("Time campeao: "+result[1]);
    }
}
