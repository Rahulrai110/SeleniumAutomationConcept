package corejavaconcept;

public class FinalKeyDemo {

	final void getData()
	{
		//if we make method as final we cannot change the method or override the method
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int i=4; //cannot change the variable value through out the class
		
		//if I change class to final then we cannot use that parent class in child class and we cannot call that object OR we cannot extend that class.

		
	}

}
