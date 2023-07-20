class Person{

/* public Person(){
	 System.out.println("Invoked person constructor");
 } */
 
 String name;
 String gender;
 String type;
 int age;
 
 public Person(String nm, String gnd, String tp, int ag){
	 name=nm;
	 gender=gnd;
	 type=tp;
	 age=ag;
	 System.out.println("Invoked person constructor");
 }
 
 public void toWork(){
	 System.out.println("Person works hard");
 }
}