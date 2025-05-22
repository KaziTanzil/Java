class Start{
	public static void main(String[] args){
		Person p = new Person();
		Person p1 = new Person(100, "Clerk", "B+");
		Student s = new Student(90);
		Student s1 = new Student(200, "Bruce", "AB+", 3.12);
		Employee e1 = new Employee(300,"Diana","O+",12000);
		/*Employee e = new Employee();
		
		
		p.setId(100);
		
		s.setId(200);
		s.setCgpa(3.12);
		
		e.setId(300);
		e.setSalary(12000);*/
		//System.out.println(s1.getId());
		//System.out.println(s1.getCgpa());
		System.out.println();
		p1.showInfo();
		System.out.println();
		s1.showInfo();
		e1.showInfo();
	}
}