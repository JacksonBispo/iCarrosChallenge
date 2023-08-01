package com.icarros.challenge7;

public class MarsRoverChallengeMain {
    public static void main(String[] args) {

        int plateauX = 5;
        int plateauY = 5;

        MarsRover rover1 = new MarsRover(1, 2, "N");
        MarsRover rover2 = new MarsRover(3, 3, "E");
        Plateau plateau = new Plateau(plateauX, plateauY);

        String[] instructions1 = new String[]{"L","M","L","M","L","M","L","M","M"};
        String[] instructions2 = new String[]{"M","M","R","M","M","R","M","R","R","M"};

        plateau.addRover(rover1);
        plateau.addRover(rover2);
        rover1.processInstructions(rover1, instructions1);
        rover2.processInstructions(rover2, instructions2);

        System.out.println(rover1.getPosition());
        System.out.println(rover2.getPosition());
    }



}
