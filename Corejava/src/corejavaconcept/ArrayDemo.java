package corejavaconcept;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A container which store multiple value of same data type
		ArrayMinMaxValue ab=new ArrayMinMaxValue();
		ab.abc();
		
		int a[] = new int[5]; //declare array and allocate memory for the array
		a[0]=1;
		a[1]=2;
		a[2]=4;
		a[3]=12;
		a[4]=6;
		
	/*	for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//int b[][] = new int[3][3];
		*/
		int b[]= {1,2,3,4,5};
		for(int i=0;i<b.length;i++)
			
		{
			System.out.println(b[i]);
		}
		
		
		// a[rows][column]
		
		int c[][] = new int[2][3];
		c[0][0] = 2;
		c[0][1] = 3;
		c[0][2] = 5;
		c[1][0] = 7;
		c[1][1] = 8;
		c[1][2] = 1;

		System.out.println(c[1][0]);
		
		//int c[][] = {{2,3,5},{7,8,1}};
		
		
	}

}
