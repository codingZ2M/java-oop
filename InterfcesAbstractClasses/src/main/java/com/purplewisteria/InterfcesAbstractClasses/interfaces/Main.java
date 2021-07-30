package com.purplewisteria.InterfcesAbstractClasses.interfaces;

public class Main {

    public static void main(String[] args) {
    	
        ITelephone timsPhone, rickPhone;
        
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        rickPhone = new MobilePhone(24565);
        rickPhone.powerOn();
        rickPhone.callPhone(24565);
        rickPhone.answer();

    }
}
