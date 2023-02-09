package homework;

public class TestAuthor {
	
public static void main(String args[])
{
Author A=new Author("Vidhya","clv@gmail.com",'F');
System.out.println(A.tostring());
System.out.println("After setting new email");

System.out.println("Author Name: "+A.getName());
A.setEmail("ahv@yahoo.com");
System.out.println("Author Email "+ A.getEmail());
System.out.println("Author Gender " +A.getGender());
System.out.println(A.tostring());
}


}
