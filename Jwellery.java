class Jwellery{
    //public Jwellery(){
	//	System.out.println("Invoked Jwellery constructor");
	//}
 String name;
 String type;
 double price;
 double grams;
 
 public Jwellery(String name,String type,double price,double grams){
	 this.name=name;
	 this.type=type;
	 this.price=price;
	 this.grams=grams;
 }
 public void toWear(){
  System.out.println("Jewells look attractive");
 }

}