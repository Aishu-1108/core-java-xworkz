class TeleCommTester{

  public static void main(String sim[]){
	  
	  TeleComm.addSim("BSNL");
	  TeleComm.addSim("Airtel");
	  TeleComm.addSim("Jio");
	  TeleComm.addSim("Vodaphone");
	  TeleComm.addSim("Idea");
	  TeleComm.getAllSimNetworks();
	  boolean isUpdated = TeleComm.updateSimNetwork("Jio","Reliance");
	  System.out.println("Is the sim name updated "+ isUpdated);
	  TeleComm.getAllSimNetworks();
	  int newLength = TeleComm.deleteSim("Idea");
    System.out.println("Calling getAllSimItemsPostDeletion");
    TeleComm.getAllSimItemsPostDeletion(newLength);
  }

}