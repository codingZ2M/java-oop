package com.codingz2m.classes_objects.statics;


import java.util.Scanner;

public class StaticMembersTest {

	public static void main(String arg[]) {

		// StaticMembers.RATE_OF_INTEREST = 15.0;

		System.out.println("Enter amount for alculating interest amounts:");

		//  StaticMembers.RATE_OF_INTEREST  = 100;

		Scanner input = new Scanner(System.in);

		double amountOfDeposit = input.nextDouble();

		for ( int tenure = 1; tenure< 10; tenure ++  ) {

			double interestAmount =   StaticMembers.calculateInterest(amountOfDeposit, StaticMembers.RATE_OF_INTEREST, tenure);

			System.out.println("Principal Amount of " + amountOfDeposit +" at a rate of " + 
					StaticMembers.RATE_OF_INTEREST + " per year for " + tenure + " year(s) is " + interestAmount);

		}
	}


}
