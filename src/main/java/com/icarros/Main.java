package com.icarros;

public class Main {


    public static void main(String[] args) {

          var fizzingNBuzzing = new FizzingNBuzzing();

          for (int i=1;i<=100;i++){
              System.out.println(fizzingNBuzzing.getMessage(i));
          }

    }
}