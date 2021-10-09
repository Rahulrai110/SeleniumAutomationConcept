package demopackage;

public class newOne {
	//class keyword is use to declare class in Java
	//public keyword is an access specifier which means the class is access to all.
	//static keyword is user to create static method. if any method is declare as static then
	//               we don't need to create object to access that object
	//void keyword means if any method is define as void it will not have any return type or the method will not return any value.
    //main keyword represent the starting point or the main method of the program.
	
	int b = 20; 
	
	static int c; //Static variable: A variable for which a single copy of the variable is created and share among all the instances of the class.
	
	void add()
	{
		int c = 0; //Local Variable:The variable which is declare inside the body of the method is called Local variable. 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//system.out.println is use to print the statement. Here System is the class , out is the object of PrintStream class and
		//                      println is the method of that PrintStream class.
		
		int a = 10; //Instance variable: the variable which is declare inside the class but outside the method body
		
		System.out.println("Hello World");
		
	}

}; //adding Semicolon at the end of the class is optional.

