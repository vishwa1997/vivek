import java.util.Scanner;
public class Prime {
public static void main(String args[])
{
	int num,c; Scanner S=new Scanner(System.in);
	System.out.println("ENTER NUM FOR PRIME NUMBER UPTO IT\n");
	num=S.nextInt();
	for(int i=1;i<num;i++)
	{
		c=0;
		for(int j=2;j<i;i++)
		{
		
			if(i%j==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(i);
			System.out.println("\n");
		}
	}
}
}
