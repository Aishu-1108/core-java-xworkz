class Doors{
   // public Doors(){
    //		System.out.println("Invoked Doors constructor");
	 //}
 String name;
 String type;
 int price;
 double weight;
 
  public Doors(String name,String type,int price,double weight){
	  this.name=name;
	  this.type=type;
	  this.price=price;
	  this.weight=weight;
  }
 public void forSafetyAndSecurity(){
  System.out.println("Doors are used for safety and security purpose");
 }


}