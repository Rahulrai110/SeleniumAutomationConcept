package corejavaconcept;

public class StringclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String: it is one of the pre built class in java
		/* How many ways you can define a string in Java?
				1.String Literal
				2.by creating object of that string  */
		
		String a = " Java/training";
		String b = "8051204709"; // String Literal
		//String ab=new String("Hello"); //with String class
		
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf("k"));
		System.out.println(a.substring(3, 7));
		System.out.println(a.substring(3));
		System.out.println(a.concat("Rahul"));
		System.out.println(b.length());
		System.out.println(a.trim());
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		String arr[] = a.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(a.replace("a", "b"));
		
		String n = "8051204709";
		if(n.length() == 10)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println("not a correct number");
		}
		
	}

}
