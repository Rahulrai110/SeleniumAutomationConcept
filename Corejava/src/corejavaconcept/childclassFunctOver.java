package corejavaconcept;

public class childclassFunctOver extends ParentClassFunctOver{

	public void engine()
	{
		System.out.println("New Engine");
	}
	public void colour()
	{
		System.out.println("colour");
	}
	public void audiosys()
	{
		System.out.println("new audio system");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ParentClassDemo cd = new childclassDemo();
		childclassFunctOver cd = new childclassFunctOver();
		cd.colour();
		cd.brakes();
		cd.audiosys(); //function overriding = both have same method name , same signature and parameter.
	}

}
