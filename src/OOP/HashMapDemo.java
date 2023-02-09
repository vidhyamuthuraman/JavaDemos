package OOP;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String args[])
	{
		HashMap<Integer,String>obj=new HashMap();
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter key and value");
			obj.put(s.nextInt(),s.next());
		}
		
		int count=0;
		System.out.println("Give Key Set: "+obj.keySet());
		for(Integer key:obj.keySet())
		{
		 			
		  if(key%3!=0)
		  {
			count=count+1;
		  }
		}
		System.out.println("No.Of keys not divisible by 3: " +count);
		
		
		
	}
}
