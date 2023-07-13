class IceCream{
 static String flavors[] = {null,null,null,null,null,null};
 static int index;
 
 public static boolean addFlavour(String ice){
	 boolean isCreated = false;
	 if(flavors.length>index){
	 if(ice!=null && ice.length()>0){
		flavors[index]=ice;
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
 
 public static void getAllFlavors(){
	 for(int ice=0;ice<flavors.length;ice++){
		 String referenec = flavors[ice];
		 System.out.println("Accessing the ice cream "+referenec+" is "+ice);
	 }
 }

 public static boolean updateFlavours(String existingFlavour, String updatedFlavour){
	 boolean isUpdated = false;
	 for(int flavourIndex=0; flavourIndex<flavors.length;flavourIndex++){
		 if(flavors[flavourIndex].equals(existingFlavour)){
			 flavors[flavourIndex] = updatedFlavour;
			 isUpdated = true;
		 }
	 }
	 return isUpdated;
 }
 
 public static int deleteFlower(String deletedFlavoursName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = flavors.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<flavors.length; statIndex++){
		  if(flavors[statIndex].equals(deletedFlavoursName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  flavors[newItemIndex] = flavors[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllIceCreamItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(flavors[itemIndex]);
	} 
		
  }
}