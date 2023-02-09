package OOP;
import java.util.Scanner;

public class Commonele {

	public void getsum(int a[],int b[],int m,int n)
	{
		
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if (a[i]==b[j])
					sum=sum+a[i];
				
			}
		}
		
		if(sum!=0)
		
		System.out.println("sum is"+sum);
		else
			
			System.out.println("Not Common");
	}
	
	
	
	
	public static void main(String[] args)
	{
		//int[] a= {1,3,5,6};
		//int[] b= {3,1,4};
		Commonele c=new Commonele();
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of first array");
		int m=s.nextInt();
		System.out.println("enter length of second array");
		int n=s.nextInt();
		int[] a=new int[m];
		int [] b=new int[n];
		for(int i=0;i<m;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int j=0;j<n;j++)
		{
			b[j]=s.nextInt();
		}
		
		
		c.getsum(a, b, m, n);
		
}
}
