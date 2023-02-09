package OOP;
import java.util.Scanner;

public class CommonString {
public static void main(String[] args)
{


String str1,str2,str3;
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter string 1");
 str1=s.nextLine();
 System.out.println("enter string 2");
 
 str2=s.nextLine();
 
 for(int i=0;i<str1.length();i++)
 {
	 for(int j=1;j<str1.length();j++)
	 {
		 if(str1.charAt(i)==str1.charAt(j))
		 {
			 
			 
		 }
		 
		 
	 }
 }
		 
 

 
/* for(int i=0;i<str1.length();i++)
 int i=0;
 while(i<str1.length())
 
 {
	 for(int j=0;j<str2.length();j++)
	 {
		 if(str1.charAt(i)==str2.charAt(j))
		 {   
			 count=count+1;
			 i++;
			 break;
		 }
		
		 }
	 i++;
	 
 }
 System.out.println(count);


}*/
}
}

