class StationaryTester{

 public static void main(String stationary[]){
  
   //create, save, add
   Stationary.addStationaryItems("Books");
   Stationary.addStationaryItems("Pencils");
   Stationary.addStationaryItems("Sharpner");
   Stationary.addStationaryItems("Pens");
   Stationary.addStationaryItems("Color sheets");
   Stationary.addStationaryItems("Eraser");
   Stationary.addStationaryItems("Scale");
   Stationary.addStationaryItems("Cryons");
   Stationary.addStationaryItems("Paint");
   
   //Read, fetch, get
   Stationary.getAllStationaryItems();

    //fetch the specific item name
	String sName = Stationary.searchStationaryItemByName("Cryons");
	System.out.println("The item name is "+ sName);
	
   //update, edit
   Stationary.updateStationaryItems("Pencils","Color Pencils");
   
   //Read, fetch, get
   Stationary.getAllStationaryItems();
  
   //Delete, remove
   int newLength = Stationary.deleteStationaryItems("Scale");
   System.out.println("Calling getAllStationaryItemsPostDeletion");
   Stationary.getAllStationaryItemsPostDeletion(newLength);
   
 }
 


}