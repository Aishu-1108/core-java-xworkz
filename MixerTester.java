class MixerTester{

     public static void main(String test[]){
	 System.out.println("Main started");
	 
     boolean connected = Mixer.onOrOff(); 
	 System.out.println("is AC connected "+ connected);
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 System.out.println("Maximum speed reached");
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 System.out.println(" ");
	 
	 boolean connected1 = Mixer.onOrOff();  
	 System.out.println("is Mixer connected "+ connected1);
	 
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	
     System.out.println("Main ended");
 }



}