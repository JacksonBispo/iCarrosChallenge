package com.icarros.challenge7;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public String getPosition() {
        return x + " " + y + " " + direction;
    }


    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
        }
    }

    public void move() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "E":
                x++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
        }
    }

    public void processInstructions(MarsRover rover, String[] instructions) {
        for (String instruction : instructions) {
            switch (instruction) {
                case "L":
                    rover.turnLeft();
                    break;
                case "R":
                    rover.turnRight();
                    break;
                case "M":
                    rover.move();
                    break;
            }
        }
    }
}


