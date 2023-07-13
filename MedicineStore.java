class MedicineStore{

  static String medicineNames[] = {null,null,null,null,null,null,null,null,null};
  static 	int index;
  
  public static boolean addMedicine(String medicine){
	  boolean isCreated = false;
	  if(medicineNames.length>index){
	  if(medicine!=null && medicine.length()>0){
		  medicineNames[index]=medicine;
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
  
  public static void getAllMedicine(){
	  for(int medicine=0;medicine<medicineNames.length;medicine++){
		  String reference = medicineNames[medicine];
		  System.out.println("Accessing the medicine "+reference+" is "+medicine);
	  }
  }
  
   public static boolean updateMedicine(String existingMedicine, String updatedMedicine){
	 boolean isUpdated = false;
	 for(int medicineIndex=0; medicineIndex<medicineNames.length;medicineIndex++){
		 if(medicineNames[medicineIndex].equals(existingMedicine)){
			 medicineNames[medicineIndex] = updatedMedicine;
			 isUpdated = true;
		 }
	 }
	 return isUpdated;
 }
 
 public static int deleteMedicines(String deletedMedicineName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = medicineNames.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<medicineNames.length; statIndex++){
		  if(medicineNames[statIndex].equals(deletedMedicineName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  
		  medicineNames[newItemIndex] = medicineNames[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllMedicineItemsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(medicineNames[itemIndex]);
	} 
		
  }
}