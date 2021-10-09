package corejavaconcept;

public class ChildDemo1 extends ParentDemo1{
	
	String name = "QAClickAcademy";
	
	public ChildDemo1()
	{
		super();//this should invoke the Parent Constructor in Child class and write it in first line inside Constructor
		System.out.println("Child class Constructor");
	}
	
	public void getString()
	{
		System.out.println(name);
		System.out.println(super.name); // if you used Super keyword to refer any attribute then it will refer Parent attribute value 
        //and if you don't provide Super keyword then it will consider Child Attribute while printing
	}

	public void getData()
	{
		super.getData(); // Super keyword will give access for getData method from Parent class to Child class and print it
		System.out.println("I am Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo1 cd = new ChildDemo1();
		cd.getString();
		cd.getData();
		
	}

}
