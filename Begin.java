class Begin{
public static void main(String []args){
System.out.println("OUTPUT");

Student s1= new Student(100,"Tanzil",3.95);
s1.showInfo();

Student s2= new Student(200,"Manzil",3.75);
s2.showInfo();

Student s3= new Student(300,"Tonmoy",-3.60);
s3.showInfo();


		double cg=s3.getCgpa();
s3.checkCgpaValidity(cg);
s1.checkCgpaValidity(s1.getCgpa());
s2.checkCgpaValidity(s2.getCgpa());


}

}