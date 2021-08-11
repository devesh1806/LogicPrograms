package com.bridgelabz.junitprograms;
import java.util.*;

public class toBinary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be converted to Binary: ");
		int number = sc.nextInt();
		int number1 = number; //for printing purpose
		
		String binary = "";
		while ( number != 0 ) {
			binary = String.valueOf(number%2) + binary;
			number /= 2 ;
		}
		
		if ( binary.length()%8 != 0) {
			int temp = 8 - binary.length() %8 ;
			for(int i = 0 ; i < temp ; i++) {
				binary = "0" + binary;
			}
		}
		
		System.out.print("The 4 Byte binary representation of " + number1 + " is ");
		for(int i = 0 ; i < binary.length(); i += 4) {
			String temp1 = binary.substring(i, i+4) ;
			System.out.print(temp1 + " ");
		}
	}
}
