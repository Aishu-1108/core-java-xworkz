class Chocolates{
    /*public Chocolates(){
		System.out.println("Invoked Chocloates constructor");
	}*/
	
  String name;
  String flavour;
  int quantity;
  int price;
  String color;
  
  public Chocolates(String nm,String fl,int qt, int pr,String cl){
	  name=nm;
	  flavour=fl;
	  quantity=qt;
	  price=pr;
	  color=cl;
	  }
  public void toGetCalories(){
  System.out.println("Chocloates helps to gain calories");
  
  }


}