class ZomatoTester{

 public static void main(String foodDelivery[]){
 
 //external refernce
 String foodName = "Pizza";         //argument| - external referencing
 double priceOfFoodName = Zomato.search(foodName);
 System.out.println("The price is "+ priceOfFoodName);
 double priceWithGivenQuantity = Zomato.search(foodName, 5);  //double prizeOfFoodName = Zomato.search("Pizza");  is a internal reference
 System.out.println("The food price with Quantity is "+ priceWithGivenQuantity);
 System.out.println(" ");

 String foodName1 = "Burger";
  double priceOfFoodName1 = Zomato.search(foodName1);
 System.out.println("The price is "+ priceOfFoodName1);
 double priceWithGivenQuantity1= Zomato.search(foodName1,3); 
 System.out.println("The food price with Quantity is "+ priceWithGivenQuantity1);
 System.out.println(" ");

 
 String foodName2 = "French fries";
double priceWithGivenQuantity2= Zomato.search(foodName2,2);
 System.out.println("The food price with Quantity is "+ priceWithGivenQuantity2);
 System.out.println(" ");

 
 String foodName3 = "Biryani";
 double priceWithGivenQuantity3= Zomato.search(foodName3,2);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity3);
 System.out.println(" ");

 
 String foodName4 = "Chicken kabab";
 double priceWithGivenQuantity4= Zomato.search(foodName4,2);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity4);
 System.out.println(" ");

 
 String foodName5 = "Noodles";
 double priceWithGivenQuantity5= Zomato.search(foodName5,6);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity5);
 System.out.println(" ");

 
 String foodName6 = "Fried rice";
 double priceWithGivenQuantity6=Zomato.search(foodName6,3);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity6);
 System.out.println(" ");

 
 String foodName7 = "Parcel";
 double priceWithGivenQuantity7= Zomato.search(foodName7,4);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity7);
 System.out.println(" ");

 
 String foodName8 = "Gobi manchurian";
 double priceWithGivenQuantity8= Zomato.search(foodName8,2);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity8);
 System.out.println(" ");

 
 String foodName9 = "Egg biryani";
 double priceWithGivenQuantity9= Zomato.search(foodName9,2);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity9);
 System.out.println(" ");

 
 String foodName10 = "Thandoori";
 double priceWithGivenQuantity10=Zomato.search(foodName10,4);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity10);
 System.out.println(" ");

 
 String foodName11 = "Chilly chicken";
 double priceWithGivenQuantity11=Zomato.search(foodName11,2);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity11);
 System.out.println(" ");

 
 String foodName12 = "Chicken fry";
 double priceWithGivenQuantity12=Zomato.search(foodName12,5);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity12);
 System.out.println(" ");

 
 String foodName13 = "Mutton biryani";
 double priceWithGivenQuantity13=Zomato.search(foodName13,6);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity13);
 System.out.println(" ");

 
 String foodName14 = "Pani puri";
 double priceWithGivenQuantity14=Zomato.search(foodName14,7);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity14);
 System.out.println(" ");

 
 String foodName15 = "VadaPav";
 double priceWithGivenQuantity15=Zomato.search(foodName15,6);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity15);
 System.out.println(" ");

 
 String foodName16 = "Roti";
 double priceWithGivenQuantity16=Zomato.search(foodName16,4);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity16);
 System.out.println(" ");

 
 String foodName17 = "Parota";
 double priceWithGivenQuantity17=Zomato.search(foodName17,6);
  System.out.println("The food price with Quantity is "+ priceWithGivenQuantity17);
 System.out.println(" ");

 
 String foodName18 = "Kulcha";
 double priceWithGivenQuantity18=Zomato.search(foodName18,8);
 System.out.println("The food price with Quantity is "+ priceWithGivenQuantity18);
 System.out.println(" ");

 
 String foodName19 = "Chicken pepper fry";
 double priceWithGivenQuantity19=Zomato.search(foodName19,9);
 System.out.println("The food price with Quantity is "+ priceWithGivenQuantity19);
 System.out.println(" ");
  
 }
}