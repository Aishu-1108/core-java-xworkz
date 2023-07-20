class Snacks{
	//public Snacks(){
	//	System.out.println("Invoked Snacks constructor");
    //	}
	
 String name;
 String type;
 int price;
 String quantity;
 
 public Snacks(String nm,String tp,int pr,String qt){
	name=nm;
    type=tp;	
	price=pr;
	quantity=qt;
 } 
 
 public void toEat(){
	 System.out.println("Snacks to enjoy");
 }

}