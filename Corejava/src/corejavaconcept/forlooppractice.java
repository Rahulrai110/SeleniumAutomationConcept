package corejavaconcept;

public class forlooppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int k = 1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}*/
		
		
	/*for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
				
			}
			System.out.println("");
		}*/
	
		int k = 3;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		}
			
	}

}
