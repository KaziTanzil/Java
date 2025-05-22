public class Set_Get
{
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	

public static void main(String []args)
{
	Set_Get a= new Set_Get();
	a.setName("Mugdha");
	//System.out.print("My name is ");
	System.out.println("My name is "+a.getName());
}	

}
