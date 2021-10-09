package corejavaconcept;

public class StaticVar {
	String name;                //Instance Variable
	String address;
	static String city = "Bangalore";   //Class Variable
	static int i=0;
	//int i=0;
	static {
		city="Bangalore";
		i = 0;
		//address="Whitefield";
	}
	
	StaticVar(String name,String address) // local Variable
	{
		this.name = name;     
		this.address = address;
		//this.city = city;
		i++;
		System.out.println(i);
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
		//return address;
	}
	public static void getCity() // using only static variable inside static method
	{
		System.out.println(city);		// to call static method we don't need to create object for it 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar sv = new StaticVar("Bob","Indiranagar");
		StaticVar sv1 = new StaticVar("Ram","Whitefield");
		sv.getAddress();
		sv1.getAddress();
		StaticVar.getCity(); // we can call static method using class name
		StaticVar.i=4;	
	}
}