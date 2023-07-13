class GardenTester{
 
 public static void main(String flower[]){
	 Garden.addFlower("Rose");
	 Garden.addFlower("Jasmine");
	 Garden.addFlower("Lilly");
	 Garden.addFlower("Lotus");
	 Garden.addFlower("Sunflower");
	 Garden.getAllFlowers();
	 boolean isUpdated = Garden.updateFlowers("Lilly","Lily");
	 System.out.println("Is flower name updated "+ isUpdated);
	 Garden.getAllFlowers();
	 int newLength = Garden.deleteFlower("Lotus");
    System.out.println("Calling getAllFlowerItemsPostDeletion");
    Garden.getAllFlowerItemsPostDeletion(newLength);
 }

 
}