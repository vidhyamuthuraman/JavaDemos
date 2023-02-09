package OOP;
import java.util.List;
import java.util.ArrayList;

public class customer {
String name;
int balance;
int id;
customer(String name,int balance,int id)
{
	this.name=name;
	this.balance=balance;
	this.id=id;
	
}
public String toString()
{
	return "Customer[name=" +name + ",balance= " +balance + " id "+id + "]";
}

public static void main(String args[])
{
	
	List<customer> l1=new ArrayList<>();
	List<customer> l2=new ArrayList<>();
	customer c1=new customer("vidhya",1000,90);
	customer c2=new customer("venkat",3000,10);
	customer c3=new customer("Aravind",6000,50);
	customer c4=new customer("Harini",9000,80);
	
	l1.add(c1);
	l1.add(c2);
	l1.add(c3);
	l1.add(c4);
	System.out.println(l1);
	l2.addAll(l1);
	System.out.println(l2);
	System.out.println("Does L2 contains all L1 ? "+l2.containsAll(l1));
	System.out.println("After clearing list 2");
	l2.clear();
	System.out.println(l1);
	System.out.println(l2);
	System.out.println("Is c1 in collection L1");
	System.out.println(l1.contains(c1));
	System.out.println("Is l2 empty: "+l2.isEmpty());
	
	
	
}
}
