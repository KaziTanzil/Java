import java.util.Scanner;
class PrimeNumber{
public static void main(String [] args)
{
  int [] marks= new int [5];
  Scanner input= new Scanner(System.in);
  System.out.println("Mark is= ");
  for (int i=0;i<5;i++)
  {
  marks[i]= input.nextInt();
  
  }
    for(int e:marks){
        boolean isPrime = true;


        for (int j=2; j<e; j++){

            if(e%j==0){
                isPrime = false;
                break;
            }
        }
     
        if(isPrime)

            System.out.println(e + " ,");
    }
System.out.println("This are prime numbers");
}
}
