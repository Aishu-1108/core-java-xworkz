class Stationary{
  static String stationaryItems[] = {null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean addStationaryItems(String itemName){
  System.out.println("invoking addStationaryItems");
  System.out.println("No of parameters is : 1, type is String");
  boolean isAdded = false;
  if(stationaryItems.length>index){
  if(itemName!=null && itemName.length()>0 ){
   stationaryItems[index++] = itemName;
   isAdded = true;
  }else{
  System.out.println("Items name cannot be added");
  }
  }else{
  System.out.println("Size is full");
  }
  return isAdded;
  }
  
  public static void getAllStationaryItems(){
	  System.out.println(" ");
	  System.out.println("List of items are: ");
	  for(String stationaryItem:stationaryItems){
		  System.out.println(stationaryItem);
	  }
	  
  }
  
  public static boolean updateStationaryItems(String existingItem, String updatedItem){
	  boolean isUpdated = false;
	  for(int itemIndex=0;itemIndex<stationaryItems.length;itemIndex++){
		  if(stationaryItems[itemIndex].equals(existingItem)){
			  stationaryItems[itemIndex]=updatedItem;    //if this is not mentioned then all the values changes to updated value
		  }
	  }
	  return isUpdated;
  }
  
  public static int deleteStationaryItems(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = stationaryItems.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<stationaryItems.length; statIndex++){
		  if(stationaryItems[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  stationaryItems[newItemIndex] = stationaryItems[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllStationaryItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(stationaryItems[itemIndex]);
	} 
		
  }
  
  //get the specific item by itemName with return type (string)
  public static String searchStationaryItemByName(String itemName){
	  System.out.println("Invoking getStationaryItemByName");
	  System.out.println("No of parameters :1, type of parameters: String");
	  String sName=null;
	  for(String name:stationaryItems){
		  if(name.equals(itemName)){
			 sName = name;
             System.out.println("Item name found");		 
		  }
	  }
	  return sName;
  }
}