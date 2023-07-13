class MetroStation{

 static String stationNames[]={null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addStation(String station){
	 boolean isCreated = false;
	 if(stationNames.length>index){
	 if(station!=null && station.length()>0){
		 stationNames[index]=station;
		 index++;
		 isCreated = true;
	 }else{
		 System.out.println("Cannot store the value");
	 }
	 }else{
		 System.out.println("Size is full cannot add the value");
	 }
	 
	 return isCreated;
 }
 
 public static void getAllStations(){
	 for(int station=0;station<stationNames.length;station++){
		 String reference = stationNames[station];
		 System.out.println("Accessing the station "+reference+" is "+station);
	 }
 }
 
 public static boolean updateStation(String existingStation, String updatedStation){
	 boolean isUpdated = false;
	 for(int stationIndex=0; stationIndex<stationNames.length;stationIndex++){
		 if(stationNames[stationIndex].equals(existingStation)){
			 stationNames[stationIndex] = updatedStation;
			 isUpdated = true;
		 }
	 }
	 return isUpdated;
 }
 
 public static int deleteStation(String deletedStationName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = stationNames.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<stationNames.length; statIndex++){
		  if(stationNames[statIndex].equals(deletedStationName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  stationNames[newItemIndex] = stationNames[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllStationItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(stationNames[itemIndex]);
	} 
		
  }
 
}