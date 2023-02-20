package Lab2;

import java.util.Scanner;

public class Dealer {
	static Scanner sc = new Scanner(System.in);
	
	int size;
	int[] a;
	Dealer(){
		size = 10;
		a = new int[10];
		initialize();
	}
	
	Dealer(int size) {
		this.size = size;
		a = new int[size];
		initialize();
	}
	
	void initialize() {
		System.out.println("Enter " + size + " values for array: ");
		for(int i = 0; i<size;i++) {
			a[i] = sc.nextInt();
		}
		display();
	}
	void display() {
		System.out.println("The values entered are: ");
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	 int expand(int n) {
		 boolean flag = false;
		 int f = -1;
		 for(int i:a) {
			 if( i == n) {
				 flag = true;
			 }
		 }
		 if(flag == true) {
			 int[] b = a;
			 a = new int[size+n];
			 int counter=0;
			 
			 boolean expanded = false;
			 System.out.println("Array Expanded");
			 //System.out.println("old size"+size+"New size"+ a.length);
			 for(int i=0; i< b.length;i++) {
				 a[counter]=b[i];
				 if(expanded == false) {
					 if(a[counter] == n) {
						 
						 //System.out.println("Inside IF ");
						 for(int j = 0; j<n;j++) {
							counter++;
							a[counter] = n;
							//System.out.println("Inside IF a value "+ a[counter]);
							//counter++;
						 }
						 expanded = true;
						 f = n;
					 }
				 }
				 counter++;
			 }
		 }
		 System.out.println("New array ");
		 display();
		return f;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer d1 = new Dealer();
		Dealer d2 = new Dealer();
		Dealer d3 = new Dealer(5);
		Dealer d4 = new Dealer(6);
		//int d1_exp = d1.expand(5);
		//int d2_exp = d2.expand(2);
		//int d3_exp = d3.expand(3);
		//int d4_exp = d4.expand(6);
		
		
	}

}
