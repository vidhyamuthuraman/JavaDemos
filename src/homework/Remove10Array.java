package homework;
import  java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Remove10Array {

	public  void remove(int n,int[] a)
	{
		System.out.println("Array Elements");
		for(int i:a)
		{System.out.print(i+ " ");}
		
		List<Integer> L1=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(a[i]!=10)
			L1.add(a[i]);
				//System.out.println(a[i]);
		}
		System.out.println("\n"+"After Removal of 10: " +L1);
		
		
		int size=L1.size();
		int temp=n-size;
		
		for(int i=0;i<temp;i++)
			L1.add(0);
		
		System.out.println("Trailed with Zero: "+L1);
	}
	
	public static void main(String args[])
	{
		int n;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=s.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{   
			System.out.println("Enter "+ i +" number");
			a[i]=s.nextInt();
		}
		
		
		Remove10Array r=new Remove10Array();
		r.remove(n,a);
	}
}
