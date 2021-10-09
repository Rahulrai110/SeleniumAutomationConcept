package corejavaconcept;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		for(int i = 1;i<=4;i++)// this block will executed 4 time
		{
			for(int j=1;j<=4;j++)//inner loop
			{
				System.out.println("first");
			}
			System.out.println("Second");
		}*/
		
	/*	int k = 1;
		for(int a=0;a<4;a++)// this block will executed 4 time
		{
			for(int b=1;b<=4-a;b++)//inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println( "");
		}*/
		
	//	int k = 1;
		for(int i=1;i<5;i++)// this block will executed 4 time
		{
			for(int j=1;j<=i;j++)//inner loop
			{
				System.out.print(j);
				System.out.print("\t");
				//k++;
			}

			System.out.println( "");
			
		}
	}

}

