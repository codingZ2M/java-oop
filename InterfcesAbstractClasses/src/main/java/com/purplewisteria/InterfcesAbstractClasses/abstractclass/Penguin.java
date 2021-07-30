package com.purplewisteria.InterfcesAbstractClasses.abstractclass;


public class Penguin extends Bird {
   
	public Penguin(String name) {
        super(name);
    }

 
    public void fly() {
      //  super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }

	@Override
	public void flyingSpeed() {
		System.out.println(getName() + " is flying 20 Miles/Hour");
		
	}


	@Override
	public void fly1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void fly2() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void fly3() {
		// TODO Auto-generated method stub
		
	}

   
}
