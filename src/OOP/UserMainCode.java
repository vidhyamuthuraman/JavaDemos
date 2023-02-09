package OOP;
import java.util.StringTokenizer;
public class UserMainCode {

	/* public static String getMiddleChars(String s)
	{
		
		/* String str=s;
		 int length=str.length();
		 int mid=length/2;
		 
		 StringBuffer str1=new StringBuffer();
		 
		 System.out.println(str.charAt(mid-1));
		 System.out.println(str.charAt(mid));
		//str1.append(str.substring(mid-1),str.substring(mid));
		 
		 return str1.toString();
		
	}*/
	 
	public static int checkCharacters(String str)
	{    String st=str;
	int output;
		//StringTokenizer str1=new StringTokenizer(st);
		int length=st.length();
		if(st.charAt(0)==st.charAt(length-1))
		{  output=1;
		
		}
		else
			{output=0;}
		
		

		
	
	return output;
	
	}
	
	
	 
}
