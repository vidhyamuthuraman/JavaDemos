package javaclasses;
import java.util.Scanner;
public class ArrayPractice {
public static void main(String[] args)
{  Scanner s=new Scanner(System.in);
	int[] stdid=new int[5];
	stdid[0]=567;
	stdid[1]=234;
	stdid[2]=250;
	stdid[3]=264;
	stdid[4]=290;
	int[][] arr= {
			{1,2,3},
			{2,3,4}
	};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println(arr[i][j]);
			
		}
	}
/*	int[] age={50,34,35};
	int sum=0,smallest=0;
	for(int o=0;o<3;o++)
	{
		// sum=sum+age[o];
		if(age[0]<age[o])
			smallest=age[0];
		
	}
	System.out.println(smallest);
	//System.out.println(sum);
	
	
	/*String[] name={"Vidhya","Harini","Aravind","Venkat","Meena"};
	
	for(int i=1;i<stdid.length;i=i+2)
	{
		System.out.println(stdid[i]);
	}
	for(int j:age)
	System.out.println(j);
	
	int[] marks=new int[50];
	/*for(int k=0;k<50;k++)
	{
		
		System.out.println("Enter number"+ k+1);
		marks[k]=s.nextInt();
	}
	*/
	
	
	
	
}
}
