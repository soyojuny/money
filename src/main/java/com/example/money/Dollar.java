package com.example.money;

public class Dollar extends Money {

    private String currency;
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }
}
