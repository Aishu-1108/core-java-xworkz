class OvenTester{

     public static void main(String test[]){
	 System.out.println("Main started");
	 
     boolean connected = Oven.onOrOff(); 
	 System.out.println("is Oven connected "+ connected);
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 System.out.println("Maximum temperature reached");
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 System.out.println(" ");
	 
	 boolean connected1 = Oven.onOrOff();  
	 System.out.println("is Oven connected "+ connected1);
	 
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 Oven.increaseTemperature();
	 
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	 Oven.decreaseTemperature();
	
     System.out.println("Main ended");
 }


}