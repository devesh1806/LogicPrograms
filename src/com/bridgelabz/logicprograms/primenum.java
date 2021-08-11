package com.bridgelabz.logicprograms;
import java.util.*;

public class primenum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to check prime number or not: ");
		final int prime = sc.nextInt();
		
		int flag = 2 ;
		if ( prime == 2 ) {
			System.out.println(prime + " is a Prime number.");
		}
		else {
			for( int i = 2 ; i <= prime/2 ; i++) {
				if ( prime % i == 0 ) flag++ ;
			}
			if ( flag == 2 ) System.out.println(prime + " is a Prime number.");
			else System.out.println(prime + " is not a Prime number.");
		}
	}
}
