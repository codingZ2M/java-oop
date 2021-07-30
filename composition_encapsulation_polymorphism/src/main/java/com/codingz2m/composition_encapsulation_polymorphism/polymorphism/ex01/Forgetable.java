package com.codingz2m.composition_encapsulation_polymorphism.polymorphism.ex01;

class Forgetable extends Movie {
	
    public Forgetable() {
        super("Forgetable");
    }

    @Override
    public String plot() {
        return "Forgetable Movie Desc";
    }
}