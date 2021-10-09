package corejavaconcept;

public class exceptionDemo {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a=4;
		//try and catch mechanism
		int b=7;
		int c=0;
		//one try can be followed by multiple catch blocks.catch should be an immediate block after catch
		try 
		{
			//int k=b/c; //IndexOutOfBoundsException
			int arr[]=new int[5]; //ArithmeticException
			//System.out.println(k);
			System.out.println(arr[7]);
		}
		catch(ArithmeticException Ae)
		{
			System.out.println("I catch the Arithmetic/error"); 			
		}
		catch(IndexOutOfBoundsException io)
		{
			System.out.println("I catch the IndexOutOfBounds/error");
		}
		catch(Exception e) //default Exception and it will accept all types of exception
		{
			System.out.println("I catch the exception/error"); 
		}
		
		finally
		{
			System.out.println("Delete cookies");
			//this block is executed irrespective of exception thrown or not 
			//even the step of try block is not executed it will come to finally block and execute the statement present in Finally block
			//is there any way when finally will not get executed ? when we stop JVM forcefully by hitting stop or red button in console
		}
	}

}
