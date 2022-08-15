// Java Program to Illustrate Abstract Class
// Can contain Constructors

// Class 1
/* Abstract class
   It can have constructors inside
*/ 

//creating class named Base
abstract class Base {

	// Constructor of class Base
	Base()
	{
		// Print statement
		System.out.println("Base Constructor Called");
	}

	// Abstract method inside class Base
	abstract void fun();
}

// Class called Derived
// It Uses Extends to inherit from Base
class Derived extends Base {

	// Constructor of class Derived
	Derived()
	{
		System.out.println("Derived Constructor Called");
	}

	// Method of Class Derived
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

// Class 3
// Main class
class GFG {

	// Main driver method
	public static void main(String args[])
	{
		// Creating object of Derived
		// inside main() method
        //creating object
		Derived d = new Derived();
		d.fun();
	}
}
