import java.util.*;
class Sortarray{
	public static void main(String[]args)
	{
		int [] array= new int [5];
		Scanner input= new Scanner(System.in);
		System.out.println("Array elements are = ");
		for(int i=0;i<array.length ;i++)
		{
			array[i]= input.nextInt();
		}
		boolean isSorted= true;
		for(int j=0;j<array.length-1;j++)
		{
		if(array[j] > array[j+1])
		 {
		 isSorted=false;
		 break;
		 }
		}
		
		if(isSorted)
		{
			System.out.println("The array is sorted");
		}
		else
		{
			System.out.println("The array is not sorted");
		}
		
		
	}
	
	
	
}