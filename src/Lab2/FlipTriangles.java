package Lab2;
import java.util.Scanner;
public class FlipTriangles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Matrix: ");
		int n = sc.nextInt();
		int[][] matrix= new int[n][n];
		System.out.println("Enter Values of Matrix: ");
		for(int i = 0; i<n; i++) {
			for(int j =0; j<n ;j++) {
				matrix[i][j] = sc.nextInt();			
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j=0; j<i;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j =0; j<n ;j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
