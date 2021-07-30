package com.purplewisteria.InterfcesAbstractClasses.interfaces;

public interface ITelephone {
	
	//public String name;
	
    void powerOn();
    
    void dial(int phoneNumber);
    
    void answer();
    
    boolean callPhone(int phoneNumber);
    
    public abstract boolean isRinging();
    
}
