package Practise;
import java.io.FileInputStream;
public class JavaInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\vijen\\OneDrive - Concordia University - Canada\\SEM - 2\\PPS\\Practise\\src\\Practise\\text.txt");
			int i = 0;
			while((i = fin.read())!=-1) {
				System.out.println(i);
			}
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
