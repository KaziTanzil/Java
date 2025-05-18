import java.util.*;
class Area{
 private double length, breadth;

  public void setLength(double length)
  {
   this.length=length;
  }
  public double getLength()
  {
   return length;
  }
   
   public void setBreadth(double breadth)
  {
   this.breadth=breadth;
  }
  public double getBreadth()
  {
   return breadth;
  }
  
  Area()
  {}
    

   public void showArea(double length,double breadth)
   {
    this.length=length;
	this.breadth=breadth;
	double area=length*breadth;
	System.out.println("Area is= " +area);
   }   

}