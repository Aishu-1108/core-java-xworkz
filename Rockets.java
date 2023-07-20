class Rockets{
	
	/*public Rockets(){
		System.out.println("Invoked Rocketss constructor");
	}*/

 String name;
 String height;
 int launched_year;
 
 public Rockets(String nm,String hg,int ly){
	 name=nm;
	 height=hg;
	 launched_year=ly;
 }
 public void toResearch(){
	 System.out.println("Rockets are used for research purposes");
 }
}