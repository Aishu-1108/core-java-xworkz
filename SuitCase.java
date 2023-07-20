class SuitCase{
	//public SuitCase(){
	//	System.out.println("Invoked SuitCase constructor");
	//}
 
 String brandName;
 String weight;
 int price;
 int noOfCompartments;
 
 public SuitCase(String bn,String wg,int price,int noOfCompartments){
	 brandName=bn;
	 weight=wg;
	 this.price=price;
	 this.noOfCompartments=noOfCompartments;
 }
 public void forLuggage(){
  System.out.println("SuitCase for carrying luggage");

}

}