package homework;

public class NewWord {

	public static String formNewWord(String str,int n)
	{
		String newword;
		int length=str.length();
		newword=str.substring(0,n).concat(str.substring(length-n,length));
		return newword;
		
	}
	
	
	public void reversenumber(int num)
	{
		String orig=String.valueOf(num);
		StringBuffer s=new StringBuffer(orig);
		System.out.println(s.reverse());
		
	}
	
	public void encrypt(String str)
	{   
		StringBuffer str1=new StringBuffer(str);
		for(int i=0;i<str1.length();i=i+2) 
		{
			if(str1.charAt(i)=='a')
				str1.setCharAt(i, 'z');
			else
				{
				char temp=str1.charAt(i);
			    str1.setCharAt(i,++temp);
				}
		}
		System.out.println("Encrypted string is "+str1);
	}
}
