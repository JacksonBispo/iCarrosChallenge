package com.icarros.challenge1;

public class FizzingNBuzzing {

    public String getMessage( int num) {

        var message = "";
        if (num % 3 == 0 && num % 5 == 0) {
            message = "FizzBuzz " + num;
        } else if (num % 5 == 0) {
            message = "Fizz " + num;
        } else if (num % 3 == 0) {
            message = "Buzz " + num;
        }
        return message;
    }

}

