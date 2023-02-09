package OOP;

public class StringPractice {
	
	public static void main(String args[])
	{
		String o="java";
		String o1="java";
		String o2="Java";
		
		
		//Comparing String Literals
		/*System.out.println(o.equals(o1));
		System.out.println(o1.equals(o2));
		System.out.println(o.equalsIgnoreCase(o2));
		System.out.println(o1==o2);
		System.out.println(o==o1);*/
		
		//Comparing String objects
		String obj=new String("java");
		String obj1=new String("java");
		System.out.println(obj.equals(obj1));
		System.out.println(obj==obj1);
		
		
		
		
	
		
		
	String str="sachin tendulkar";
	String s1=str.concat(" cricket");
	System.out.println(s1);
	System.out.println(str.isEmpty());
	System.out.println(str.length());
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.contains("u"));
	System.out.println(str.indexOf("t"));
	System.out.println(str.charAt(7));
	System.out.println(str.trim());
	System.out.println(str.replace("sachin","Cricket"));
	System.out.println(obj1.compareTo(obj));
	
	
	

}
}
