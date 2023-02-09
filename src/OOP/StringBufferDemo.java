package OOP;

public class StringBufferDemo {
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("Autamation");
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.append("Testings"));
		str.setCharAt(3,'o');
		System.out.println(str);
		str.deleteCharAt(17);
		System.out.println(str);
	}

}
