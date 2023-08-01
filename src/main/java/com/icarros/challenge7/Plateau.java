package com.icarros.challenge7;

import com.icarros.challenge7.MarsRover;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private List<MarsRover> rovers;

    public Plateau(int maxPosX, int maxposY) {
        rovers = new ArrayList<>();
    }

    public void addRover(MarsRover rover) {
        rovers.add(rover);
    }
}
