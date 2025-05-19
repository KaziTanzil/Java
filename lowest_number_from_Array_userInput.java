import java.util.Scanner;
class Lowest{
public static void main(String [] args)
{
  int [] marks= new int [5];
  Scanner input= new Scanner(System.in);
  System.out.println("Mark is= ");
  for (int i=0;i<5;i++)
  {
  marks[i]= input.nextInt();
  
  }
  int min=Integer.MAX_VALUE;
  for(int e:marks){
	  if(e<min)
		  min=e;
  }
  System.out.print("\n Lowest mark is " + min);
}
}