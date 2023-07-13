class TravelAgency{
 
 static String touristPlaces[] = {null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addPlaces(String place){
	 boolean isCreated = false;
	 if(touristPlaces.length>index){
	 if(place!=null && place.length()>0){
		 touristPlaces[index]=place;
		 index++;
		 isCreated=true;
	 }else{
		 System.out.println("Cannot store the value");
	 }
	 }else{
		  System.out.println("Size is full cannot add the value");
	 }
	 return isCreated;
 }


  public static void getAllPlaces(){
	  for(int place=0;place<touristPlaces.length;place++){
		  String reference = touristPlaces[place];
		  System.out.println("Accessing the place "+reference+" is "+place);
	  }
  }
  
   public static boolean updatePlace(String existingPlace, String updatedPlace){
	 boolean isUpdated = false;
	 for(int placeIndex=0; placeIndex<touristPlaces.length;placeIndex++){
		 if(touristPlaces[placeIndex].equals(existingPlace)){
			 touristPlaces[placeIndex] = updatedPlace;
			 isUpdated = true;
		 }
	 }
	 return isUpdated;
 }
 
 public static int deletePlaces(String deletedPlaceName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = touristPlaces.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<touristPlaces.length; statIndex++){
		  if(touristPlaces[statIndex].equals(deletedPlaceName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  touristPlaces[newItemIndex] = touristPlaces[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllPlacesItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(touristPlaces[itemIndex]);
	} 
		
  }
 
}