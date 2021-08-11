package com.bridgelabz.logicprograms;
import java.util.*;

public class reversenum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse it: ");
		int number = sc.nextInt();
		int number1 = number; //for print statement
		
		int reverse = 0;
		int temp; // temporary variable
		while( number != 0 ) {
			temp = number % 10;
			reverse = reverse*10 + temp ;
			number /= 10 ;
		}
		System.out.println("The reverse of number " + number1 + " is " + reverse );
	}
}
