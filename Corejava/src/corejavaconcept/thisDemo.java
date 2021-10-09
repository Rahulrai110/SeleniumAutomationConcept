package corejavaconcept;

public class thisDemo {
	
	int a = 2;
	
	public void getData()
	{
		int a = 3;
		int b = this.a + a;
		System.out.println(a);		
		//this keyword is used to tie the object of the current class.
		//and this refer to the current Object and object scope lies in class level
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo td = new thisDemo();
		td.getData();
	}

}
