class ACMethod{

 static String name = "LG";
  static  int minTemperature; 
  static  int currentTemperature;
  static  int maxTemperature = 6;
  static boolean isConnected;
  
  //method
 public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter " + 0);
  if(isConnected == false){
	 isConnected = true; 
	 System.out.println("AC is turned onnn...Enjoy");
  }  
  else if(isConnected == true){
   isConnected = false;
   System.out.println("AC is turned off.....");
  }
  return isConnected;
 }

 //increase teperature and decrease teperature
 
 public static void increaseTemperature(){
	  System.out.println("Invoking increaseTemperature()");
	 System.out.println("list of parameters "+ 2);
  if(isConnected == true)
   {
	 if(currentTemperature < maxTemperature)
	 {
		 currentTemperature = currentTemperature + 1;
		 System.out.println("the currentTemperature is "+ currentTemperature);
	 }
	 else
	 {
		 System.out.println("Maximun temperature reached");
	 }
   }else{
		System.out.println("Connect the AC first");
	}
    System.out.println("End of increaseTemperature()");
    System.out.println(" ");	

 }
 public static void decreaseTemperature(){
	 System.out.println("Invoking decreaseTemperature()");
	 if(isConnected == true)
	 {
		 if(currentTemperature > minTemperature)
		 {
			 currentTemperature = currentTemperature -1;
			 System.out.println("the currentTemperature is "+ currentTemperature);
		 }
		 
		 else{
			System.out.println("Minimum temperature reached");
		 }
	 }else{
		System.out.println("AC is turned off..... can't decrease the temperature");
	    }
     System.out.println("End of decreaseTemperature()");		
	 System.out.println(" ");	
	 } 
	
  
  }
