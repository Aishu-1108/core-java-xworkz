class Clock{
	//public Clock(){
	//	System.out.println("Invoked Clock constructor");
	//}
 String name;
 String type;
 int price;
 String material;
 
 public Clock(String name,String type,int price,String material) {
	 this.name=name;
	 this.type=type;
	 this.price=price;
	 this.material=material;
	 }
 public void toShowTime(){
  System.out.println("Clock shows time");
 }
}