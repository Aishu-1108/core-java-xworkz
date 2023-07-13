class TeleComm{


 static String simNetworks[] = {null,null,null,null,null};
 static int index;

 public static boolean addSim(String sim){
	 boolean isCreated = false;
	 if(simNetworks.length>index){
	 if(sim!=null  && sim.length()>0){
		 simNetworks[index]=sim;
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
 
 public static void getAllSimNetworks(){
	 for(int sim=0;sim<simNetworks.length;sim++){
		 String reference = simNetworks[sim];
		 System.out.println("Accessing the network "+ reference+" is "+sim);
	 }
 }
 
 public static boolean updateSimNetwork(String existingSimNetwork,String updatedSimNetwork){
	 boolean isUpdated = false;
	 for(int simIndex=0;simIndex<simNetworks.length;simIndex++){
		 if(simNetworks[simIndex].equals(existingSimNetwork)){
			 simNetworks[simIndex] = updatedSimNetwork;
			 isUpdated = true;
		 }
	 }
	 return isUpdated;
 }
 
 public static int deleteSim(String deletedSimName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = simNetworks.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<simNetworks.length; statIndex++){
		  if(simNetworks[statIndex].equals(deletedSimName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  simNetworks[newItemIndex] = simNetworks[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllSimItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(simNetworks[itemIndex]);
	} 
		
  }
}