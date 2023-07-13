class KarnatakaTester{
     public static void main(String karnataka[]){
	 
     	 
	 Karnataka.addCity("Bangalore");
	 Karnataka.addCity("Mysore");
	 Karnataka.addCity("Hassan");
	 Karnataka.addCity("Kolar");
	 Karnataka.addCity("Ramnagar");
	 Karnataka.addCity("Mandya");
	 Karnataka.getAllCityNames();
	 boolean isUpdated = Karnataka.updateCityName("Bangalore","Bengaluru");  
     System.out.println("Is city name updated "+isUpdated);	 
     Karnataka.getAllCityNames();
	 int newLength = Karnataka.deleteCity("Mandya");
    System.out.println("Calling getAllCityItemsPostDeletion");
    Karnataka.getAllCityItemsPostDeletion(newLength);
	 }
}