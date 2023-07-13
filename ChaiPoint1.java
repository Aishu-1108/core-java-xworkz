class ChaiPoint1{

  static String chaiAvailable[] = {null,null,null,null,null,null,null,null,null,null};
  static int index;
   
  //to store the values in the place of null so create the data CREATE OPERATION
   public static boolean addChai(String chai){
	   
     boolean isAdded = false;
	 if(chai!=null){
		 //chaiAvailable[0] = "masala chai"
	   chaiAvailable[index] = chai;
	   index++;
	   isAdded = true;
	 }else{
	 System.out.println("Cannot store the value");
	 }
	 return isAdded;
   }
   
   //method  //get operation
   public static void getAllChaiAvailable(){
   System.out.println("Invoking getAllChaiAvailable");
   
   for(int chai=0;chai<chaiAvailable.length; chai++){
	   
	   String reference = chaiAvailable[chai];
	   System.out.println("Accessig chai with index "+ reference +" is "+chai );
   }
   System.out.println("End of getAllChaiAvailable");
   }
}