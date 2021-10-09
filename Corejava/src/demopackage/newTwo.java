package demopackage;

public class newTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3 types of control flow statements in java
		/*1. Decision making statements - if and switch
		 *2. Loop Statements - do while , while , for & for-each
		 *3. Jump Statements - break & Continue
		 */
		
		int a = 10,b=20;
		if(a+b > 20)
		{
			System.out.println("We are inside if-condition");
		}
		
		if(a+b<20)
		{
			System.out.println("We are inside if");
		}
		else
		{
			System.out.println("We are inside else");
		}
		
		String City1 = "Delhi";
		String City2 = "Mumbai";
		String City3 = "Bangalore";
		if(City1=="Bangalore")
		{
			System.out.println("We are in first if");
		}
		else if(City2=="Bangalore")
		{
			System.out.println("We are in second if");
		}
		else
		{
			System.out.println("City3 is Bangalore");
		}
		
		
	}

}
