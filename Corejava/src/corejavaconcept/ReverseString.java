package corejavaconcept;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="noon";
		String t="";
		//String s= new String("madam");
		for(int i=s.length()-1;i>=0;i--)
		{
			t= t + s.charAt(i);
		}
		System.out.println(t);
		
		if(s.equals(t))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
