// Java Program to Illustrate Working of
// Parameterized Constructor

// Importing required inputoutput class
import java.io.*;

// Class 1
//Geek
class Geek {
	// declaring variables 
	String surname;
	int id;

	// Constructor would initialize data members
	// With the values of passed arguments while
	// Object of that class created
    //parameterized constructors
	Geek(String surname, int id)
	{
		this.surname = surname;
		this.id = id;
	}//end of constructors
}

// Class 2
//GFG
class GFG {
	// main driver method
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		Geek geek1 = new Geek("adam", 1);
		System.out.println("GeekName :" + geek1.name
						+ " and GeekId :" + geek1.id);
	}
}
