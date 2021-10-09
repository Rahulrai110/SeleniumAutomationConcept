package corejavaconcept;

public class MinMaxinColArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[][] = {{2,3,0},{7,8,1},{5,9,10}};
		
		//step1:find the min number
		//step2:identify the column of min number
		//step3:find the max number in identify column
		

		int min = c[0][0];
		int mincloumn = 0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(c[i][j]<min)
				{
					min=c[i][j];
					mincloumn = j;
				}

			}
	   }
		int max = c[0][mincloumn]; 
		int k=0;
		while(k<3)
		{
			if(c[k][mincloumn]>max)
			{
				max=c[k][mincloumn];
			}
			k++;
			
		}
		System.out.println(max);		
		
	}
}

