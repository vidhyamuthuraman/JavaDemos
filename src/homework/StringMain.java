package homework;
import java.util.Scanner;

public class StringMain {
public static void main(String[] args)
{
System.out.println("Enter string and number");
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int len=s.nextInt();

NewWord n=new NewWord();
System.out.println(n.formNewWord(str,len));
System.out.println("Original number is 1345 ,Reverse Number is : ");
n.reversenumber(1345);
n.encrypt("walking trio");



}
}
