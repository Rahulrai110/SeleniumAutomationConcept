package demopackage;

public class secondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(5>2)
		{
			System.out.println("5 is greater then 2");
		}
		else
		{
		    System.out.println("5 is not greater then 2");
		}
		
		for(int i=2;i<=10;i=i+3)
		{
			if(i==8)
			{
				System.out.println("8 is found");
			}
			else
			{
				System.out.println("8 is not found");
			}
		}
		
		String[] names = {"Apple","Banana","Orange","Grapes"};
		for(String name:names)
		{
			System.out.println(name);
			
			if(name =="Banana")
			{
				System.out.println("Eat today");
			}
			else
			{
				System.out.println("Eat tomorrow");
			}
		}
	}

}
