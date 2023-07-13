class HardDisk{
 
     static String brandName;
     static int price;
     static String storage;
	 static String hardDiskInterface;
	 static String hardDiskFormFactor;
	 static String compatibility ;
  public static void main(String disk[]){
  
     String brandName = "Western";
     int price = 4449;
     String storage = "1.5 tera bytes";
	 String hardDiskInterface = "USB 1.1";
	 String hardDiskFormFactor = "2.5 inches";
	 String compatibility = "USB 3.0 and 2.0";
	 
	 
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The storage is "+ storage);
	  System.out.println("The hardDiskFormFactor is "+ hardDiskFormFactor);
	  System.out.println("The hardDiskInterface is "+ hardDiskInterface);
	  System.out.println("The compatibility is "+ compatibility);
	  
   
  }
}