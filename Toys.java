class Toys{
  /* public Toys(){
		System.out.println("Invoked Toys constructor");
	}*/
  String name;
  String type;
  String color;
  int price;
  
   public Toys(String nm,String tp,int pr ,String cl){
	 name=nm;
     type=tp;
     color=cl;
     price=pr;	 
   }
  public void play(){
  System.out.println("Toys are used to play");
  }




}