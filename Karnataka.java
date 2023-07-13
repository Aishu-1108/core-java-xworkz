class Karnataka{

 //array has limitation - size id fixed(drawback)
 static String cityNames[] = {null,null,null,null,null};  
 static int index;
 public static boolean addCity(String city){   //save, create, add 
	 boolean isAdded = false;
	 //validate cityName  //checks city is not null and should not be empty and to 
	 if(cityNames.length>index){  //to avoid exception and code shouldnot brk inbetween, as array has fixed limit size
	 if(city!=null && city.length()>0){    
		 cityNames[index]=city;
		 index++;
		 isAdded=true;
		 System.out.println("City added "+isAdded);
	 }else{
		 System.out.println("City name cannot be null");
	 }
	 }else{
		 System.out.println("Size is full,cannot add the value");
	 }
	 return isAdded;
 }

 public static void getAllCityNames(){ 
	 for(int cities=0;cities<cityNames.length;cities++){
		 String reference = cityNames[cities];
		 System.out.println("Accessing the city " + reference + " is "+cities);
	 }
 }
 
 public static boolean updateCityName(String existingCityName, String updatedCityName){
	 boolean isUpdated = false;
	 for(int cityIndex=0;cityIndex<cityNames.length;cityIndex++){
		 if(cityNames[cityIndex].equals(existingCityName)){    //.equals is used to compare
			 cityNames[cityIndex] = updatedCityName;
			 isUpdated = true;
		 } 
	 }
	 return isUpdated;
 }
 
 public static int deleteCity(String deletedCityName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = cityNames.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<cityNames.length; statIndex++){
		  if(cityNames[statIndex].equals(deletedCityName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  cityNames[newItemIndex] = cityNames[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllCityItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(cityNames[itemIndex]);
	} 
		
  }

} 