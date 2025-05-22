class SameElement{
	public static void main(String [] args){
		int  [] array= {3,4,7,9,0};
		int num= 6;
		boolean isInArray= false;
		for(int element:array)
		{
			if (element==num)
			{
				isInArray= true;
				break;
			}
		}
		if(isInArray)
		{
			System.out.println("The num is present in the array.");
		}
		else
		{
			System.out.println("The num is not present in the array.");

		}
		
	}
	
}