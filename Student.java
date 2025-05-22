class Student{
private int id;
private String name;
private double cgpa;

public Student(int id, String name, double cgpa)
{
	this.id=id;
	this.name=name;
	this.cgpa=cgpa;
}


public void setId(int id)
{
this.id= id;
}
public int getId()
{
return id;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
 }
public void setCgpa(double cgpa)
{
this.cgpa=cgpa;
}
public double getCgpa()
{
return cgpa;
}
public void showInfo()
{
System.out.println(this.id);
System.out.println(this.name);
System.out.println(this.cgpa);
}

public void checkCgpaValidity(double cgpa){
if(cgpa >= 0.0 && cgpa <= 4.0){
	System.out.println("Valid");
   }
else
	System.out.println("Invalid");
}

}
