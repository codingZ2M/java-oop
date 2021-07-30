package com.purplewisteria.InterfcesAbstractClasses.abstractclass;

public class Main {

    public static void main(String[] args) {
    	
    	 Animal animal;
    	 CanFly canFly;
    	 Bird bird;
    	 
    	 animal = new Dog("Yorkie");
       animal.breathe();
        animal.eat();

        canFly = new Parrot("Australian ringneck");
        bird = new Parrot("Australian ringneck");
        animal  = new Parrot("Australian ringneck");
        
        animal.breathe();
        bird.eat();
        canFly.fly();

         canFly = new Penguin("Emperor");
         bird = new Penguin("Emperor");
        animal  = new Penguin("Emperor");
        
       animal.breathe();
       animal.eat();
       canFly.fly();

     /* 
       void getAnimal(Animal animal) {
       }
       void getAnimal1(CanFly canFly) {
       }

       void getAnimal2(Bird bird) {
       }
       */

       

    }
}
