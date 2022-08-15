// Java program to demonstrate working of
// interface

import java.io.*; //we import for built-in packages

// A simple interface
/*Interface are package or public interface 
 * if its not classified as public its package interface
 */
interface In1 {
	
	// all variables must be declared as public, static and final
	//Reason being interface are contracts they cant hold state
	//For state we need to use class
	final int a = 10;

	// public and abstract
	void display();
}

// A class that implements the interface.
class TestClass implements In1 {
	//we use implemnts to simple implement we dont talk about relationships
	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("Geek"); 
	}

	// Driver Code
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}
