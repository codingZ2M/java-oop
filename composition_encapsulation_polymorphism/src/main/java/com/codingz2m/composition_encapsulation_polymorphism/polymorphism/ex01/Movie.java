package com.codingz2m.composition_encapsulation_polymorphism.polymorphism.ex01;

class Movie {
	
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
