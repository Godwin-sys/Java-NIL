// Your First Program

// Class Declaration
/*We are  creating a class naming a Dog */
public class Dog
{
	// Instance Variables to Identify Dog Name, breek type ,age and color
	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of Class

	public Dog(String name, String breed,
				int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// method 1 For getting Name 
	public String getName()
	{
		return name;
	}

	// method 2 For Breed
	public String getBreed()
	{
		return breed;
	}

	// method 3 for Age
	public int getAge()
	{
		return age;
	}

	// method 4 for Color
	public String getColor()
	{
		return color;
	}
//To Display the Output
	@Override
	public String toString()
	{
		return("Hi my name is "+ this.getName()+
			".\nMy breed,age and color are " +
			this.getBreed()+"," + this.getAge()+
			","+ this.getColor());
	}

	public static void main(String[] args)
	{
        //creating  an object Dog
		Dog tuffy = new Dog("tuffy","papillon", 5, "white");
		System.out.println(tuffy.toString());
	}
}
