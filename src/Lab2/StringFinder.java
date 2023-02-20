package Lab2;
import java.util.Scanner;
public class StringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		String first = sc.nextLine().toUpperCase();
		System.out.print("Enter String 2: ");
		String second = sc.nextLine().toUpperCase();
		int counter = 0;
		boolean flag = false;
		//System.out.print(first);
		//System.out.print(second);
		if(first.length() < 1 || second.length()<1){
			flag = false;
		}
		else {
			for(int i=0; i<first.length()-second.length()+1; i++) {
				counter = i;
				flag = false;
				if(first.charAt(i) == second.charAt(0)) {
					//System.out.print("Inside If ");
					for(int j = 0; j<second.length();j++) {
						//counter = i;
						if( first.charAt(counter) == second.charAt(j)){
							counter++;
							//System.out.print("Inside If nested ");
							//System.out.print(counter +" ");
							if(j == second.length()-1) {
								flag = true;
							}
						}
					}
					counter = 0;
				}
				if(flag == true) {
					System.out.print(i +" ");
				}
			}
		}
		
		
		
		
		
		if(flag == false) {
			System.out.println(-1);
		}
	}

}
