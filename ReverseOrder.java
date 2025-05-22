class Reverse{
	public static void main(String [] args){
		int [] num= {7,4,9,2,6,2,8};
		int l= num.length;
		int n= Math.floorDiv(l,2);
		int temp;
		for(int i=0;i<n;i++){
			temp=num[i];
			num[i]= num[l-1-i];
			num[l-1-i]= temp;
			
		}
		for(int elements:num)
		System.out.print(elements+ ",");
	}
	
}