class IceCreamTester{

  public static void main(String ice[]){
	  
	  IceCream.addFlavour("Strawberry");
	  IceCream.addFlavour("Rasberry");
	  IceCream.addFlavour("Chocolate");
	  IceCream.addFlavour("Pineapple");
	  IceCream.addFlavour("Blueberry");
	  IceCream.addFlavour("Vanilla");
	  IceCream.getAllFlavors();
	  boolean isUpdated = IceCream.updateFlavours("Chocolate","Dark chocolate");
	  System.out.println("Is flavour name changed "+isUpdated);
	  IceCream.getAllFlavors();
	  int newLength = IceCream.deleteFlower("Vanilla");
    System.out.println("Calling getAllIceCreamItemsPostDeletion");
    IceCream.getAllIceCreamItemsPostDeletion(newLength);
	  
  }

}