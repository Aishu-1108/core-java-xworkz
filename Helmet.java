class Helmet{
	//public Helmet(){
	//	System.out.println("Invoked Helmet constructor");
	//}
 
 String name;
 String type;
 int price;
 String color;
 
 public Helmet(String nm,String tp,int price,String color){
	 name=nm;
	 type=tp;
	 this.price=price;
	 this.color=color;
 }
 public void forSafety(){
	 System.out.println("Helmets for safe driving");
 }
 
}
