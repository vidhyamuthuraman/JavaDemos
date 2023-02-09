package OOP;

public class OddEvenArray {

	public static void main(String args[])
	{
		int[] a= {2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a[i]=a[i]*a[i];
			}
			else
			{
				a[i]=a[i]*a[i]*a[i];
			}
			System.out.println(a[i]);
		}
		
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		
	}
	System.out.println("sum is "+sum);
	}
	
}
