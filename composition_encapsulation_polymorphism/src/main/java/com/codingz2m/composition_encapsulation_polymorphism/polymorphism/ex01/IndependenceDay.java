package com.codingz2m.composition_encapsulation_polymorphism.polymorphism.ex01;

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}