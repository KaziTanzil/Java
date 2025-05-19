public class OverloadTest
{
	public static void main(String[]args)
	{
		Overload ob= new Overload();
		ob.add();
		ob.add(2,3);
		ob.add(2.8,3.0);
		ob.add(5,6,7);
		ob.add();
}
}