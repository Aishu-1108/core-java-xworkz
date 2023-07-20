class Umbrella{
       //public Umbrella(){
	//	System.out.println("Invoked Umbrella constructor");
	//}
 String brand;
 String frameMaterial;
 String color;
 int price;
 
  public Umbrella(String bd,String fm,String color,int price){
	     brand=bd;
         frameMaterial=fm;
         this.color=color;
         this.price=price;		 
  }
 public void forRain(){
  System.out.println("Protect from rain");	
	
}
 
 
}