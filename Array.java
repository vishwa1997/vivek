package array;
import java.util.Scanner;
/**
 * @see <a href="https://www.google.com"> click here</a>
 * @param n
 * @author nitj lab
 * @author vivek
 * @param a
 * @return int
 */
public class Array 
{
	public static void main(String args[])
	{
	Scanner sr =new Scanner(System.in);
	
	int a[]=new int[3]; 
	int sum=0;
	for(int i=0;i<3;i++)
	{
		a[i]=sr.nextInt();
	}
	for(int j=0;j<3;j++)
	{
		sum+=a[j];
	}
	System.out.println(sum);
}
}