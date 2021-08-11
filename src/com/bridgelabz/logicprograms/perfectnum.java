package com.bridgelabz.logicprograms;
import java.util.*;

public class perfectnum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check perfect number or not: ");
		final int perfect = sc.nextInt();
		
		int sumofdivisors = 0;
		for(int i = 1 ; i < perfect ; i++ ) {
			if ( perfect % i == 0 ) {
				sumofdivisors += i ;
			}
		}
		
		if ( sumofdivisors == perfect ) System.out.println(perfect + " is a Perfect number.");
		else System.out.println(perfect + " is not a Perfect number.");
		
	}
}
