package homework;

public class Author 
{
private String name;
private String email;
private char gender;

Author(String name,String email,char gender)
{
this.name=name;
this.email=email;
this.gender=gender;
}


public String getEmail() 
{
return email;
}

public void setEmail(String email) 
{
this.email = email;
}

public String getName() {
return name;
}

public char getGender() {
return gender;
}

public String tostring()
{
  return "Author Name: "+name+ " Email: "+email+" Gender: " +gender;
  
}

}

