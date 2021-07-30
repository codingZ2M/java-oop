package com.purplewisteria.InterfcesAbstractClasses.abstractclass;

public abstract class Bird extends Animal implements CanFly
{
	
	  public abstract void flyingSpeed();
	  
    public Bird(String name) {
        super(name);
    }

  
}
