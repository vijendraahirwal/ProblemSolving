package Practise;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		System.out.println("Enter Char: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();
		char c = input.charAt(0);
		int max = (int)c - 65;
		System.out.println(max);
		int i,j,k=0,counter=1;
		for(i = 0; i<2*max-1; i++) {
			if(i<max) {
				for(j = i; j<max; j++) {
					System.out.print((char)(j+65));
				}
				System.out.println();
			}
			else {
				k=i-(2*counter);
				for(j = 0; j<i-2;j++) {
					System.out.print((char)(k+65));
					k++;
				}
				System.out.println();
				counter++;
			}
		}
		
		
	}
}
