package com.bridgelabz.junitprograms;
import java.util.*;

public class vendingmachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter change you want from vending machine: ");
		int amount = sc.nextInt();
		
//		//Hashmap initialised
//		HashMap<Integer, Integer> change = new HashMap<Integer, Integer>();
//		change.put(1000,0);
//		change.put(500,0);
//		change.put(100,0);
//		change.put(50,0);
//		change.put(10,0);
//		change.put(5,0);
//		change.put(2,0);
//		change.put(1,0);
//		
//		while(amount != 0) {
//			
//		}
		
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
