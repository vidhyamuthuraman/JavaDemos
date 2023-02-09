package homework;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Remove10Arraylist {
	
	public void remove10(int n,List<Integer> l2)
	{   
	/*	
	Iterator i=l2.iterator();
	
	/*while(i.hasNext())
	{
		int value=(Integer)i.next();
		if(value%10==0)
			{i.remove();
		l2.add(n-1, 0);}
		
	}*/
		for(int i=0;i<n;i++) 
		{ int value=l2.get(i);
		  if(value%10==0)
		  {   
			  l2.add(n-1,0);
			  l2.remove(i);
			  
			  
		  }
			
		}
		
		System.out.println(l2);
		
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Remove10Arraylist a=new Remove10Arraylist();
		List<Integer> L1=new ArrayList<>();
		System.out.println("enter number of elements ");
		int n=s.nextInt();
		System.out.println("Enter lements");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter" +i +" element");
		  int j=s.nextInt();
		  L1.add(j);	
		}
		//System.out.println("List :" +L1);
		a.remove10(n, L1);
		
	}
	}

