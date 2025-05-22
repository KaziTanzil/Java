class Sum{
	public static void main(String[]args){
		float [] num={12.4f,67.8f,22.6f};
		float sum=0;
		for(float elements:num){
			sum=sum+elements;
		}
		System.out.print("The sum is= " +sum);
	}
	
}