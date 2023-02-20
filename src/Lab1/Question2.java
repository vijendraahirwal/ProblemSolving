package Lab1;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter row size:");
			int row = sc.nextInt();
			System.out.println("Enter column size:");
			int col = sc.nextInt();
			int[][] in = new int[row][col];
			int i; String z; String[] arr;
			sc.nextLine();
			for(i = 0; i <row; i++)
			{
					z=sc.nextLine();
					arr=z.split(" ");
					int len=arr.length;
					for(int j=0;j<len;j++)
					{in[i][j] = Integer.parseInt(arr[j]);}
				}
			for(i = row-1; i >=0; i--) {
				for(int j = col-1; j>=0; j--) {
					System.out.print(in[i][j]+ " ");
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
