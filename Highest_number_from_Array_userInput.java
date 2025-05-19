import java.util.Scanner;
class HighestM{
public static void main(String [] args)
{
  int [] marks= new int [5];
  Scanner input= new Scanner(System.in);
  System.out.println("Mark is= ");
  for (int i=0;i<5;i++)
  {
  marks[i]= input.nextInt();
  
  }
  int max=0;
  for(int e:marks){
	  if(e>max)
		  max=e;
  }
  System.out.print("\n Highest mark is " + max);
}
}