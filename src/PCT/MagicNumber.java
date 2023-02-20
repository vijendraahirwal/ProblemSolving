package PCT;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		//String[] input = sc.nextLine().split(" ");
		String[] input = "4 1 2 3 4".split(" ");
		int[] in = new int[input.length];
		for(int i = 0; i<input.length; i++) {
			in[i] = Integer.parseInt(input[i]);
			if(in[i]>max) {
				max = in[i];
			}
		}
		//System.out.println(max);
		int[] sortedArray = new int[max];
		sortedArray[0]=1;
		for(int i=1; i< max; i++) {
			sortedArray[i] = sortedArray[i-1]+1;
		}
		for(int i = 0; i<in.length;i++) {
			sortedArray[(in[i]-1)] = -1;
		}
		int[] missing = new int[2];
		int j=0;
		boolean flag = false;
		for(int i=0; i< max; i++) {
			if(sortedArray[i]!=-1) {
				missing[j] = sortedArray[i];
				flag=true;
				j++;
				if(j>=2) {
					break;
				}
				
			}
		}
		if(!flag) {
			System.out.println("No missing number");
		}
		else {
			if(j==1) {
				System.out.println("Missing Number: "+missing[0]);
			}
			else {
				System.out.println("Missing Number: "+missing[0] +" "+ missing[1]);
			}
		}
	}

}
