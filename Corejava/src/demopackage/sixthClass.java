package demopackage;

public class sixthClass {

	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a,int b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sixthClass fn = new sixthClass();
		fn.getData("2");
		fn.getData("Hello");
		fn.getData("5");

	}

}
