package com.codingz2m.composition_encapsulation_polymorphism.polymorphism.ex01;

class Jaws extends Movie {
	
    public Jaws() {
        super("Jaws");
    }
@Override
    public String plot() {
        return "A shark eats lots of people";
    }
}