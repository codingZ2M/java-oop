package com.codingz2m.composition_encapsulation_polymorphism.polymorphism.ex01;

class StarWars extends Movie {
	
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}
