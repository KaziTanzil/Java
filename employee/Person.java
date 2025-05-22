class Person{
	private int id;
	private String name;
	private String bloodGroup;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getBloodGroup(){
		return this.bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}
	
	Person(){
		System.out.println("P-D");
	}
	
	Person(int y){
		System.out.println("P-ND " + y);
	}
	
	Person(int id, String name, String bloodGroup){
		System.out.println("P-NDO");
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;
	}
	
	void showInfo(){
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("BloodGroup: " + bloodGroup);
	}
	

}

