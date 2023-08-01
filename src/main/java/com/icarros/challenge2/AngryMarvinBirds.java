package com.icarros.challenge2;

public class AngryMarvinBirds {

    private String[] stars;
    public String showStars(int countStars){
        this.stars = new String[]{"_", "_", "_"};
        for (int i=0; i<countStars;i++){
            this.stars[i] = "*";
        }

        return String.join(" ",this.stars);
    }
}
