class ACTester{

     public static void main(String test[]){
	 System.out.println("Main started");
	 
     boolean connected = ACMethod.onOrOff(); 
	 System.out.println("is AC connected "+ connected);
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 System.out.println("Maximum temperature reached");
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 System.out.println(" ");
	 
	 boolean connected1 = ACMethod.onOrOff();  
	 System.out.println("is AC connected "+ connected1);
	 
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 ACMethod.increaseTemperature();
	 
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	 ACMethod.decreaseTemperature();
	
     System.out.println("Main ended");
 }
}