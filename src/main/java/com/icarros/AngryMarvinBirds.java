package com.icarros;

public class AngryMarvinBirds {


    public String showStars(int countStars){
        String[] stars = {"_","_","_"};
        for (int i=0; i<countStars;i++){
            stars[i] = "*";
        }

        return String.join(" ",stars);
    }
}
