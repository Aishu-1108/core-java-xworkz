class Garden{

 static String flowerNames[] = {null,null,null,null,null};
 static int index;
 
 public static boolean addFlower(String flower){
	 boolean isCreated = false;
	 if(flowerNames.length>index){
	 if(flower!=null && flower.length()>0){
		 flowerNames[index] = flower;
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
 
 public static void getAllFlowers(){
	 for(int flower = 0; flower < flowerNames.length; flower++){
		 String reference = flowerNames[flower];
		 System.out.println("Accessing the flower "+reference+" is "+flower);
	 }
 }
 
 public static boolean updateFlowers(String existingFlower, String updatedFlower){
	 boolean isUpdated = false;
	 for(int flowerIndex=0; flowerIndex<flowerNames.length; flowerIndex++){
		 if(flowerNames[flowerIndex].equals(existingFlower)){
			 flowerNames[flowerIndex] = updatedFlower;
			 isUpdated=true;
		 }
	 }
	 return isUpdated;
 }
 
 public static int deleteFlower(String deletedFlowerName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = flowerNames.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<flowerNames.length; statIndex++){
		  if(flowerNames[statIndex].equals(deletedFlowerName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  flowerNames[newItemIndex] = flowerNames[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllFlowerItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(flowerNames[itemIndex]);
	} 
		
  }
}