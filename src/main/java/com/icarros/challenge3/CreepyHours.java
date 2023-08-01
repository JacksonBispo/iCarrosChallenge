package com.icarros.challenge3;

public class CreepyHours {

    private int countHours;

    public boolean checkingCreepyMoments(String m) {
        String[] moments = m.split(":");
        var hour = moments[0];
        var minute = moments[1];
        return hour.charAt(0) == hour.charAt(1) && minute.charAt(0) == minute.charAt(1) //11:00 AA:BB
                || hour.charAt(0) == minute.charAt(0) && hour.charAt(1) == minute.charAt(1) //11:11 AB:AB
                || hour.charAt(1)== minute.charAt(0) && hour.charAt(0) == minute.charAt(1) //AA : AA
                || hour.charAt(0) == minute.charAt(1) && hour.charAt(1) == minute.charAt(0); //10:01 AB:BA
    }

    public int countMoments(String[] sep) {

        for (String moments : sep){
            if(checkingCreepyMoments(moments)){
                this.countHours++;
            }
        }
        return countHours;
    }
}
