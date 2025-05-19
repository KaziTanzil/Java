class Highest{
public static void main(String [] args)
{
  int [] marks= {79982,69543,85953,70004,75000,85000};
  int max=0;
  for(int e:marks){
	  if(e>max)
		  max=e;
  }
  System.out.print("Highest mark is " + max);
}
}