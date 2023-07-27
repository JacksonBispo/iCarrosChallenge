package com.icarros;

public class AngryMarvinBirds {


    public String[] showStars(int countStars){
        String stars[] = {"_","_","_"};
        StringBuilder showStars = new StringBuilder();
        for (int i=0; i<countStars;i++){
            stars[i] = "*";
        }

        return stars;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
