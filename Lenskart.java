class Lenskart{

  String brandName;
  String typeOfLens;
  double price;
  
 
  public Lenskart(){
   System.out.println("Lenskart constructor is invoked-no args");
  }
  
  public Lenskart(String typeOfLens, String brandName){
	  
	  this(5000.00);  
	  System.out.println("Lenskart constructor is invoked-2 args");
	  this.typeOfLens = typeOfLens;
	  this.brandName = brandName;
   System.out.println("Lenskart constructor is invoked");
  }
  public Lenskart(double price){
	  this();
	 System.out.println("Lenskart constructor is invoked-1 args");
	 //this("Convex","Prada");  
	 this.price = price;
  }
}