package com.bridgelabz.junitprograms;
import java.util.*;

public class Binary {
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
		
		String part1substring = binary.substring(0, 4) ;
		String part2substring = binary.substring(4, 8) ;
		
		String updatedbinary = part2substring + part1substring ;
		
		int nibblednumber = 0 ;
		for( int i = 0 ; i < 8 ; i++) {
			nibblednumber += (updatedbinary.charAt(i)-'0')*Math.pow(2, 7-i) ;
		}
		System.out.println(number1 + " after conversion into binary and nibble swapping the number becomes "+ nibblednumber);
	}
}
