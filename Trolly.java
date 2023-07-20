class Trolly{
	//public Trolly(){
	//	System.out.println("Invoked Trolly constructor");
	//}
	
 String name;	
 String trollyColor;
 int price;
 String weight;
 
 public Trolly(String nm,String tc,int price, String weight){
	 name=nm;
	 trollyColor=tc;
	 this.price=price;
	 this.weight=weight;
 }
 public void toTravel(){
 System.out.println(" Trolly is used for travel purpose");
 }


}