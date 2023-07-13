class TravelAgencyTester{
 
 public static void main(String place[]){
	 TravelAgency.addPlaces("Gokarna");
	 TravelAgency.addPlaces("Goa");
	 TravelAgency.addPlaces("Udupi");
	 TravelAgency.addPlaces("Chikkamagaluru");
	 TravelAgency.addPlaces("Mysore");
	 TravelAgency.addPlaces("Waynad");
	 TravelAgency.addPlaces("Munnar");
	 TravelAgency.addPlaces("Delhi");
	 TravelAgency.getAllPlaces();
	 boolean isUpdated = TravelAgency.updatePlace("Mysore","Mysuru");
	 System.out.println("Is station name changed "+isUpdated);
	 TravelAgency.getAllPlaces();
	 int newLength = TravelAgency.deletePlaces("Delhi");
    System.out.println("Calling getAllPlacesItemsPostDeletion");
    TravelAgency.getAllPlacesItemsPostDeletion(newLength);
 }

}