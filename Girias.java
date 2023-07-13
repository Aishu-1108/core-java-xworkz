class Girias{

 public static void main(String girias[]){
 
  System.out.println("MAin started");
  
  String electronicDevices[] = {"refrigerator","Washing machine","television","LED","Grinder","AC","Iron box","microwave"};
  
  double priceOfElectronicDevices[] = {50000.00, 40000.00,75000.50,15000.89,8000.60,45000.70,0.0,6000.45};
 
  System.out.println("List of electronicDevices are");
  // for loop 
  for(int devsIndex=0; devsIndex <= electronicDevices.length-1 ;){
  
  System.out.println(electronicDevices[devsIndex]);
  devsIndex ++;
  }
  System.out.println(" ");
  
  //foreach
  for(String electronicDevice:electronicDevices){
	  System.out.println(electronicDevice);
  }
  System.out.println(" ");
  
  //foreach
  for(double priceOfElectronicDevice : priceOfElectronicDevices){
	 
	  System.out.println(priceOfElectronicDevice);
  }
   System.out.println(" ");
  System.out.println("Main ended");
  
 }


}