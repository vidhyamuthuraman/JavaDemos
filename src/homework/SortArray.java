package homework;

public class SortArray {
public static void main(String[] args)
{
	int[] arr= {23,8,67,45};
	int smallest=arr[0],largest=arr[0];
	for(int i=0;i<4;i++)
	{
		if(arr[i]<smallest)
			{smallest=arr[i];
		    }
		else if(arr[i]>largest)
		largest=arr[i];		 
			
	}
System.out.println("Smallest number is "+smallest);
System.out.println("Largest number is "+largest);
int temp=0;
for(int i=0;i<4;i++)
{
for(int j=i+1;j<4;j++)
{
	if(arr[i]>arr[j])
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
		
}
System.out.println("Sorted list is: ");
for(int j:arr)
{System.out.print(j+" ");
}
}
}

