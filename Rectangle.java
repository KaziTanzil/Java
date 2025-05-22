import java.util.*;
class Rectangle{
   public static void main(String [] args){
   Scanner input= new Scanner(System.in);
   System.out.print("Length is= ");
   double a= input.nextDouble();
   

   System.out.print("Breadth is= ");
   double b= input.nextDouble();
   
   Area a1= new Area();
   a1.setLength(a);
   a1.setBreadth(b);
   a1.showArea(a,b);
   
   }

}