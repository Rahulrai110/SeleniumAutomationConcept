package corejavaconcept;

public class ArrayMinMaxValue {
	
	public void abc()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int c[][] = {{2,3,5},{7,8,1},{5,9,0}};
		int min = c[0][0];
		int max = c[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(c[i][j]<min)
				{
					min=c[i][j];
				}
				if(c[i][j]>max)
				{
					max=c[i][j];					
				}
			}
		}
		System.out.println(min);
		System.out.println(max);		
	}

}
