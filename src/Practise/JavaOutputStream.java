package Practise;
import java.io.FileOutputStream;
public class JavaOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\vijen\\OneDrive - Concordia University - Canada\\SEM - 2\\PPS\\Practise\\src\\Practise\\test.txt");
			String s = "Welcome to Java";
			byte b[] = s.getBytes();
			fout.write(b);
			
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
