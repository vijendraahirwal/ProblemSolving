package Practise;
import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {
		String input = "Hello World";
		try (Scanner sc = new Scanner(input)) {
			System.out.println("Enter the String: ");
			String a = sc.nextLine();
			System.out.println(a);
		}
		System.out.println("Char At");
		System.out.println(input.charAt(0));
		System.out.println("Code At");
		System.out.println(input.codePointAt(0));
		//System.out.println((int)'A');
		System.out.println(input.codePointCount(0,5));
		System.out.println("Contains");
		System.out.println(input.contains("H"));
		System.out.println("ends with");
		System.out.println(input.endsWith("d"));
		System.out.println("Length");
		System.out.println(input.length());
		System.out.println("Start With");
		System.out.println(input.startsWith("Hello Werld"));
		System.out.println("Char Array");
		System.out.println(input.toCharArray()[0]);
		System.out.println("Value OF");
		System.out.println(String.valueOf(input));
	}		
}
