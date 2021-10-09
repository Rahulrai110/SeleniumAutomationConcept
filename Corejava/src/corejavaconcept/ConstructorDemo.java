package corejavaconcept;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor Execute a block of code whenever an object is created
		//will not return any value
		//name of constructor will be same as class name
		ConstructorDemo cd=new ConstructorDemo(); // if we don't define parameter here then default constructor will be called
		ConstructorDemo cdd=new ConstructorDemo("Hello");
		ConstructorDemo c=new ConstructorDemo(4,5); // if we define parameter here then Parameterized constructor will be called
		//When ever we create an object of the class a constructor is called.
		//compiler will call implicit constructor if no constructor is define 
	}
	//Default Constructor
	public ConstructorDemo()
	{
		System.out.println("I am a Constructor");
	}

	public void getData()
	{
		System.out.println("I am a method");
	}
	
	
	//Parameterized COnstructor
	public ConstructorDemo(int a,int b)
	{
		System.out.println("I am a Parameterized Constructor");
	}
	
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
}
