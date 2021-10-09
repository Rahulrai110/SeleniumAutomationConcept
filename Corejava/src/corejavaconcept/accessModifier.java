package corejavaconcept;

public class accessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Public , Private , Protected , Default - access modifier
		
	}
	
//Default - We can access method anywhere in the current package and we cannot access this method outside this current package
	void abc()
	{
		System.out.println("Hello");
	}
	
//Public - We can access this method anywhere in any package	
	public void abcd()
	{
		//we can make declare value also public by defining it as public i.e. public int i = 0 ;
		System.out.println("Hello");
	}
//Private - we cannot access method or variable outside the class of same package.
	private void abcde()
	{
		System.out.println("Hello");
	}

//Protected - variable or method as protected can be access those in sub class only.(other packages) 
	        //we can access protected in other package but extending the class
	protected void abcdef()
	{
		System.out.println("Hello");
	}
}
