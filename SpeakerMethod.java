class SpeakerMethod{
  static String name = "JBL";
  static  int minVolume; //default value of int is 0
  static  int currentVolume;
  static  int maxVolume = 6;
  static boolean isConnected;//default value is false
  
  //method
 public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter " + 0);
  //false == false  , false is turned into true then the speaker is on
  //true == false, condition is not satisfied then else statement is executed
  if(isConnected == false){
	 isConnected = true; 
	 System.out.println("Speaker is turned onnn...Enjoy");
	 //return isConnected;
  }  
  else if(isConnected == true){
   isConnected = false;
   System.out.println("Speaker is turned off.....");
   //return isConnected; can also be used to show the results in earlier stage itself
  }
  return isConnected;
 }

 //increase volume and decrease volume
 
 public static void increaseVolume(){
	  System.out.println("Invoking increaseVolume()");
	 System.out.println("list of parameters "+ 2);
  if(isConnected == true)
   {
	 if(currentVolume < maxVolume)
	 {
		 currentVolume= currentVolume + 1;
		 System.out.println("the currentVolume is "+ currentVolume);
	 }
	 else
	 {
		 System.out.println("Maximun volume reached");
	 }
   }else{
		System.out.println("Connect the speaker first");
	}
    System.out.println("End of increaseVolume()");
    System.out.println(" ");	

 }
 public static void decreaseVolume(){
	 System.out.println("Invoking decreaseVolume()");
	 if(isConnected == true)
	 {
		 if(currentVolume > minVolume)
		 {
			 currentVolume = currentVolume -1;
			 System.out.println("the currentVolume is "+ currentVolume);
		 }
		 
		 else{
			System.out.println("Minimum volume reached");
		 }
	 }else{
		System.out.println("Speaker is turned off..... can't decrease the volume");
	    }
      System.out.println("End of decreaseVolume()");		
	 System.out.println(" ");	
	 } 
	

 }
