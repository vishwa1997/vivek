import java.util.*;
public class Matrix {
	public static void main(String arg[])
	{
		Scanner S=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int res[][]=new int[3][3];
		System.out.println("ENTER 1st ARRAY\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=S.nextInt();
			}
		}
		System.out.println("ENTER 2nd ARRAY\n");
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=S.nextInt();
			}
		}
		  for (int i=0;i<3;i++)
	        {
	            for (int j=0;j<3;j++)
	            {
	                for (int k=0;k<3;k++)
	                {
	                    res[i][j] = res[i][j] + a[i][k] * b[k][j];
	                }
	            }
	        }
		  System.out.println("MULTIPLICATION OF ARRAY IS:\n");
		  for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(res[i][j]+"\t");
				}
				System.out.println("\n");
			}
	
	}

}
