package com.bridgelabz.junitprograms;
import java.util.*;

public class dayOfWeek {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to know day of week- ");
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		//using condition to get day of week
		int y0 = year - ( 14 - month )/ 12 ;
		int x = y0 + y0/4 - y0/100 + y0/400 ;
		int m0 = month + 12*(( 14 - month )/ 12 ) - 2 ;
		int d0 = ( day + x + 31*m0/12 ) % 7 ;
		
		String[] arr = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("It is " + arr[d0] + " on " + day + "/"+month+"/"+year +".");
	}
}
