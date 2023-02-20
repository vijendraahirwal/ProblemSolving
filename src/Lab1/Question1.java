package Lab1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		String s = sc.nextLine();
		String[] a = s.split(" ");
		int[] array = new int[a.length];
		int[] result = new int[a.length];
		int i;
		for(i=0; i< a.length; i++) {
			//int number = Integer.parseInt(a[i]);
			char c = a[i].charAt(0);
			array[i] = ((int)c)-48;
			//System.out.println(c);
			result[i] = 1;
		}
		
		int[] prefixProduct = new int[a.length];
		int[] suffixProduct = new int[a.length];
		
		prefixProduct[0] = 1;
		for(i = 1; i<a.length;i++) {
			prefixProduct[i] = array[i-1]*prefixProduct[i-1];
		}
		suffixProduct[a.length-1]=1;
		for(i = a.length-2; i>=0; i=i-1) {
			suffixProduct[i] = array[i+1]* suffixProduct[i+1];
		}
		
		for(i = 0; i<a.length; i=i+1) {
			result[i] = prefixProduct[i]*suffixProduct[i];
		}
		
		for(i=0; i< a.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
	}
	

}
