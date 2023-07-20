class Beverages{
 
  /*public Beverages(){
		System.out.println("Invoked Beverages constructor");
	}*/
	
 String name;
 String flavour;
 String type;
 String color;
 
 public Beverages(String nm, String fl, String clr, String tp){
	 name=nm;
	 flavour=fl;
	 type=tp;
	 color=clr;
 }
 public void toDrink(){
	 System.out.println("Beverages to drink");
 }
 
}