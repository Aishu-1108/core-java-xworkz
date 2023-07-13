class MetroTester{

  public static void main(String station[]){
	  
	  MetroStation.addStation("Vijayanagar");
	  MetroStation.addStation("Rajajinagar");
	  MetroStation.addStation("Rajarajeshwarinagar");
	  MetroStation.addStation("Jayanagar");
	  MetroStation.addStation("Magadi road");
	  MetroStation.addStation("Hosahalli");
	  MetroStation.addStation("Attiguppe");

	  MetroStation.getAllStations();
	  boolean isUpdated = MetroStation.updateStation("Vijayanagar","Vijaynagar");
	  System.out.println("Is station name changed "+isUpdated);
	  MetroStation.getAllStations();
	  int newLength = MetroStation.deleteStation("Attiguppe");
    System.out.println("Calling getAllStationItemsPostDeletion");
    MetroStation.getAllStationItemsPostDeletion(newLength);
  }


}