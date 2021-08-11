package com.bridgelabz.logicprograms;
import java.util.*;

public class stopwatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Stopwatch Program");
		
		long start=0;
		long stop=0;
		
		System.out.println("To Start Stopwatch press 1");
		int press = sc.nextInt();
		if ( press == 1 ) {
			start = System.currentTimeMillis();
		}
		
		System.out.println("To stop Stopwatch press 2");
		press = sc.nextInt();
		if ( press == 2 ) {
			stop = System.currentTimeMillis();
		}
		
		double elapsedtime =(stop - start )/1000.0;
		System.out.println("The elapsed time is " + String.format("%.02f", elapsedtime) + " seconds.");
	}
}
