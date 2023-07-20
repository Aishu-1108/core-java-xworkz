class Bars{
	//public Bars(){
		//System.out.println("Invoked Bars constructor");
	//}
 
  String name;
  String type;
  String drinksAvailable;
  String address;
  
  public Bars(String nm, String tp,String da,String ad){
      name=nm;
	  type=tp;
	  drinksAvailable=da;
	  address=ad;
  }
  public void toHaveFun(){
	  System.out.println("Bars to have fun");
  }

}