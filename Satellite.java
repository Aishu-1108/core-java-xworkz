class Satellite{
	
	/*public Satellite(){
		System.out.println("Invoked Satellite constructor");
	}*/
	
  String name;
  String type;
  int communicationCost;
  
  public Satellite(String nm,String tp, int cm){
	  name=nm;
	  type=tp;
	  communicationCost=cm;
  }
  public void launchSatellites(){
  System.out.println("Satellitesa re launched for research purpose");
  }

}