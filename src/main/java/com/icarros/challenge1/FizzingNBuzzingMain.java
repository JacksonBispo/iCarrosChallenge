package com.icarros.challenge1;

public class FizzingNBuzzingMain {

    public static void main(String[] args) {

        var fizzingNBuzzing = new FizzingNBuzzing();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzingNBuzzing.getMessage(i));
        }
    }
}
