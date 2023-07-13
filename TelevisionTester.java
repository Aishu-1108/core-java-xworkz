class TelevisionTester{

     public static void main(String test[]){
	 System.out.println("Main started");
	 
     boolean connected = Television.onOrOff(); 
	 System.out.println("is TV connected "+ connected);
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 System.out.println("Maximum volume reached");
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 System.out.println(" ");
	 
	 boolean connected1 = Television.onOrOff();  
	 System.out.println("is Tv connected "+ connected1);
	 
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	
     System.out.println("Main ended");
 }





}