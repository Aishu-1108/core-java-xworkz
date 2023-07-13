class Mixer{
 
 //every method in java is represented in form of purpose/ functionality / behaviour
 
 static String name = "Prestige";
  static  int minSpeed; 
  static  int currentSpeed;
  static  int maxSpeed = 6;
  static boolean isConnected;
  
  //method
 public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter " + 0);
  if(isConnected == false){
	 isConnected = true; 
	 System.out.println("Mixer is turned onnn...Enjoy");
  }  
  else if(isConnected == true){
   isConnected = false;
   System.out.println("Mixer is turned off.....");
  }
  return isConnected;
 }

 //increase speed and decrease speed
 
 public static void increaseSpeed(){
	  System.out.println("Invoking increaseSpeed()");
	 System.out.println("list of parameters "+ 2);
  if(isConnected == true)
   {
	 if(currentSpeed < maxSpeed)
	 {
		 currentSpeed = currentSpeed + 1;
		 System.out.println("the currentSpeed is "+ currentSpeed);
	 }
	 else
	 {
		 System.out.println("Maximun speed reached");
	 }
   }else{
		System.out.println("Connect the mixer first");
	}
    System.out.println("End of increaseSpeed()");
    System.out.println(" ");	

 }
 public static void decreaseSpeed(){
	 System.out.println("Invoking decreaseSpeed()");
	 if(isConnected == true)
	 {
		 if(currentSpeed > minSpeed)
		 {
			 currentSpeed = currentSpeed -1;
			 System.out.println("the currentSpeed is "+ currentSpeed);
		 }
		 
		 else{
			System.out.println("Minimum speed reached");
		 }
	 }else{
		System.out.println("Mixer is turned off..... can't decrease the speed");
	    }
      System.out.println("End of decreaseSpeed()");		
	 System.out.println(" ");	
	 } 
	
 
 
 }