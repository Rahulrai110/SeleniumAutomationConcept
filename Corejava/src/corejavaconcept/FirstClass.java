package corejavaconcept;

public class FirstClass {

	int a=5;
	public void getData() 
	{
		System.out.println("i am in method");
	}
	
	//Object are the instance or references of a class
	
	public static void main(String[] args)
	{
		FirstClass fc = new FirstClass();
		fc.getData();
		Secondclass sc = new Secondclass();
		sc.setData();
		System.out.println(fc.a);
		System.out.println("Hi");
		System.out.println("Hello world");
		
	}
}
