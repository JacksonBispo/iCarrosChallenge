package com.icarros;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

          var fizzingNBuzzing = new FizzingNBuzzing();

          var angryMarvinBirds = new  AngryMarvinBirds();

          for (int i=1;i<=100;i++){
              System.out.println(fizzingNBuzzing.getMessage(i));
          }

          System.out.println(Arrays.toString(angryMarvinBirds.showStars(1)));
          System.out.println(Arrays.toString(angryMarvinBirds.showStars(2)));
          System.out.println(Arrays.toString(angryMarvinBirds.showStars(3)));


    }
}