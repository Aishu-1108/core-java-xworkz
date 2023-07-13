class WashingMachineTester{

     public static void main(String test[]){
	 System.out.println("Main started");
	 
     boolean connected = WashingMachine1.onOrOff(); 
	 System.out.println("is WashingMachine connected "+ connected);
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 System.out.println("Maximum speed reached");
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 System.out.println(" ");
	 
	 boolean connected1 = WashingMachine1.onOrOff();  
	 System.out.println("is WashingMachine connected "+ connected1);
	 
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	
     System.out.println("Main ended");
 }

}