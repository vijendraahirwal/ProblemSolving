package files;
// *******************************************************************
// FileIO14.java By: Aiman Hanna (C) 1993 - 2023
// This program illustrates how objects can be written to
// and read from "binary" files. 
// 
// Key Points:
// 1) Writing to & Reading from Binary Files.
// 2) The Serializable Interface.
// *******************************************************************

import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.Serializable;


class Car implements Serializable {

	// Attributes
	private int numOfDoors;
	private double price;
	private int numOfSeats;
	
	// Constructors
	public Car()	// default constructor 
	{
		numOfDoors = 4;
		price = 10000;
		numOfSeats = 5;
	}
	
	public Car(int nd, double pr, int ns)	
	{
		numOfDoors = nd;
		price = pr;
		numOfSeats = ns;
	}
	
	public Car(Car c)	
	{
		numOfDoors = c.numOfDoors;
		price = c.price;
		numOfSeats = c.numOfSeats;
	}
	
	public int getNumOfDoors()
	{
		return numOfDoors;
	}
	
	public void setNumOfDoors(int nd)
	{
		numOfDoors = nd;
	}
	

	public int getNumOfSeats()
	{
		return numOfSeats;
	}
	
	public void setNumOfSeats(int ns)
	{
		numOfSeats = ns;;
	}
	
	public void setPrice(double pr)
	{
		price = pr;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "This Car has " + getNumOfDoors() + " doors and its price is: " + getPrice() +
		"$. The number of seats of this car is " + numOfSeats + "."; 
	}
}   // end of Car class


//Car Class - This class is a serializable class since it 
// implements the serializable interface
public class ReadObjecte {
  	public static void main(String[] args) 
	{
		
		// This program stores and reads objects to and from binary files
		
		Car c1 = new Car(4, 12000, 5), c2 = new Car(2, 23000, 2), c3 = new Car();
		
		String fileName;
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.print("Please enter the \"binary\" file name to which the objects should be stored: "); 
		fileName = kb.next();
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		
		try
		{
			// Create an ObjectOutputStream to write into the binary file 
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			
			// If this point is reached, then the stream was created successfully. 
			// So, start writing the objects to the file. 
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.writeObject(c3);
			
			oos.close();
			System.out.println("Objects have been written to the file " + fileName + ".");
		}
		catch(IOException e)
		{
			System.out.println("Error: Problem Reading from file: " + fileName + ".");
			System.out.println("Program will terminate.");
			System.exit(0);			
		}
		
		
		// Now the file has been created; try to open it and read the objects
		try
		{
			// Create an ObjectOutputStream to write into the binary file 
			ois = new ObjectInputStream(new FileInputStream(fileName));
			
			// If this point is reached, then the stream was created successfully. 
			// So, start reading the objects from the file. 
			Car cr;
			int i = 1;
			
			System.out.println("\nWill start displaying the objects stored in file: \"" + fileName + "\".");
			System.out.println("================================================================ ");
			try
			{
				while(true)
				{
					cr = (Car)ois.readObject();		// Notice the type cast here; this is the reason 
											// that we need to handle ClassNotFoundException
					System.out.println("\nHere is the information of object # " + i++ + ":");
					System.out.println("====================================== ");
                    if(cr.getPrice() == 12000){
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        continue;
                    }
					System.out.println(cr);
				}
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Error has occurred while reading the file: " + fileName + ".");
			}
			catch(EOFException e)
			{
				System.out.println("\nReading file \"" + fileName + "\" has been completed.");
			}
			ois.close();		// Close the file
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File: " + fileName + " could not been found.");
			System.out.println("Program will terminate.");
			System.exit(0);		
		}
		catch(IOException e)
		{
			System.out.println("Error: Problem Reading from file: " + fileName + ".");
			System.out.println("Program will terminate.");
			System.exit(0);			
		}

	}
}
