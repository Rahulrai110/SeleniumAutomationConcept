package corejavaconcept;

public class FunctionOverload extends childclassFunctOver{

	//if a class is having more the two same method and the argument type for both the method are different then it is called as function overloading
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

		FunctionOverload fl = new FunctionOverload();
		fl.getData(2);
		fl.getData("Hello");
		fl.getData(5);
	}

}
