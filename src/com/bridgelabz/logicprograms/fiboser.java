package com.bridgelabz.logicprograms;
import java.util.*;

public class fiboser {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Terms: ");
		int terms = sc.nextInt();  //number of terms variable
		terms -= 2;
		
		int a1 = 0;
		int a2 = 1;
		int a3;
		
		System.out.println("The Fibonacci Series for " + terms +" terms is: ");
		System.out.print( a1 + " " + a2 + " ");
		while( terms != 0 ) {
			a3 = a1 + a2 ;
			System.out.print(a3 + " ");
			a1 = a2 ;
			a2 = a3 ;
			terms-- ;
		}
	}
}
