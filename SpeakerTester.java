class SpeakerTester{
 
 public static void main(String test[]){
	 System.out.println("Main started");
	 //the method is returning boolean type of value so [returntype variable = className.methodName();]
	 
     boolean connected = SpeakerMethod.onOrOff(); // . operator is used to invoke from one method to another
	 System.out.println("is speaker connected "+ connected);
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 System.out.println("Maximum volume reached");
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 System.out.println(" ");
	 
	 boolean connected1 = SpeakerMethod.onOrOff(); //className.methodName(); 
	 System.out.println("is speaker connected "+ connected1);
	 
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 SpeakerMethod.increaseVolume();
	 
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	 SpeakerMethod.decreaseVolume();
	
     System.out.println("Main ended");
 }

}