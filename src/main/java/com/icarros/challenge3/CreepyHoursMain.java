package com.icarros.challenge3;

public class CreepyHoursMain {

    public static void main(String[] args) {
        var creepyHour = new CreepyHours();
        String[] input = {"10:10", "11:00", "10:01", "10:10"};
        System.out.println(creepyHour.countMoments(input));
    }
}
