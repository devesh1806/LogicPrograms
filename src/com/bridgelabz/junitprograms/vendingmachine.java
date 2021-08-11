package com.bridgelabz.junitprograms;
import java.util.*;

public class vendingmachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter change you want from vending machine: ");
		int amount = sc.nextInt();
		
		
		int[] arr = new int[]{1000,500,100,50,10,5,2,1};
		int[] change = new int[]{0,0,0,0,0,0,0,0};
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			change[i] = amount/arr[i];
			amount -= change[i]*arr[i];
		}
		
		for (int i = 0 ; i< arr.length ; i++) {
			if ( change[i] != 0 ) {
				System.out.println(change[i] + " notes of " + arr[i]);
			}
		}
	}
}
