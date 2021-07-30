package com.codingz2m.composition_encapsulation_polymorphism.polymorphism.ex03;

public class BurgerOrders 
{
    public static void main( String[] args )
    {
    	Hamburger burger;
    	
      burger = new HealthyBurger( "Beacon", 25);
      
      burger.AddLettuce();
       burger.AddCheese();
       burger.AddTomatoes();
       burger.AddCarrots();
       
      ((HealthyBurger)burger).AddGualcamole();
  
      (( HealthyBurger)burger).AddSalsa();   
  
     
       System.out.println(" The total healthy " + burger.getBreadRollType() + " with "+ burger.getMeat() + " Price is " + burger.calculatePrice());
       System.out.println("====================================");
        
       
        burger = new DeluxeBurger();        
        burger.AddTomatoes();
        
        
        System.out.println("The deluxeHamburger "+ burger.getBreadRollType()+ " with "+ burger.getMeat()+  " Price is " + burger.calculatePrice());


    }

    }

