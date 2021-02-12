package com.example.demo.stairs;

import java.util.Scanner;

public class Stairs {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Integer");
		int i = sc.nextInt();
		
		if(0 < i && i < 100) {
			
			for (int j = 0; j < i; j++) {
				int spaces = (i-1) - j;
						
				//Print Spaces
				for (int k = 0; k < spaces; k++) {
					System.out.print(" ");
				}
				
				//Print #
				for (int k = 0; k <= j; k++) {
					System.out.print("#");
				}
				
				System.out.print("\n");
			}
			
		}else {
			System.out.println("Put Only Integer between 1 or 100");
		}
	}
}
