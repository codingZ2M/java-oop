package com.purplewisteria.InterfcesAbstractClasses.abstractclass;
 
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

   
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }

   
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }


	@Override
	public void flyingSpeed() {
		  System.out.println(getName() + " is flying 30 Miles/Hour");
		
	}

	@Override
	public void fly1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly3() {
		// TODO Auto-generated method stub
		
	}


	
}
