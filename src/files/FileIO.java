package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class FileIO{
    public static void main(String[] args){
        
        PrintWriter pw;
        pw = new PrintWriter(new FileOutputStream("Test.txt"));

        String s;
        
        Scanner kb = new Scanner(System.in);
		System.out.print("We need to store your information; Please enter your First and Last Name: ");
		s = kb.nextLine();		
		pw.println("Name: " + s);	// Write this info to the file
		
		System.out.print("\nPlease enter your Address: ");
		s = kb.nextLine();		
		pw.println("Address: " + s);	// Write this info to the file
		
		System.out.print("\nPlease enter your School Name: ");
		s = kb.nextLine();		
		pw.println("School Name: " + s);	// Write this info to the file
		
		pw.close();		// Close the file
		
		System.out.println("Thank you for filling your information."); 
		System.out.println("Your information has been stored in a file called \"Info.txt\".");	
	}

}