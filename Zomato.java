class Zomato{
 //implementation 
 //Method overloading
 public static double search(String foodName){ //foodName[] is not required as it is mentioned for "for" loop & used for searching one data at a time 
 //public static double search(String foodName)
                                       // |-parameters list ,parameters must be equal to the no of arguments
 // if("Pizza" == foodName){
  // System.out.println("The price of "+ foodName+ "is" + price);
  // }
 
  if("Pizza" == foodName){
   System.out.println("Searched foodName is "+ foodName);
   return 99.00;
  }
  if("Biryani" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 399.90;
  }
  if("Burger" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 69.40;
  }
  if("Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 99.30;
  }
  if("French fries" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 60.10;
  }
  if("Noodles" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 120.40;
  }
  if("Fried rice" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 130.40;
  }
  if("Gobi manchurian" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 99.60;
  }
  if("Chicken kabab" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 80.50;
  }
  if("Egg biryani" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 150.60;
  }
  if("Chilly chicken" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 140.35;
  }
  if("Chicken fry" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 140.46;
  }
  if("Mutton biryani" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 230.58;
  }
  if("Chicken pepper fry" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.50;
  }
  if("Kulcha" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 35.40;
  }
  if("Parota" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 40.30;
  }
  if("Roti" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 39.40;
  }
  if("Thandoori" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 560.74;
  }
  if("VadaPav" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 56.46;
  }
  if("Pani puri" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 50.25;
  }
  //return 99.00;   cant be given ie multiple default values cant be given  and will not return to the last line of the code
return 0.0; //if none of the food matches then this is executed

 }

 public static double search(String foodName, int quantity){
	if("Pizza" == foodName){
   System.out.println("Searched foodName is "+ foodName);
   return 99.00 * quantity;
  }
  if("Biryani" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 399.90 * quantity;
  }
  if("Burger" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 69.40 * quantity;
  }
  if("Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 99.30 * quantity;
  }
  if("French fries" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 60.10 * quantity;
  }
  if("Noodles" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 120.40  * quantity;
  }
  if("Fried rice" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 130.40 * quantity;
  }
  if("Gobi manchurian" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 99.60 * quantity;
  }
  if("Chicken kabab" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 80.50 * quantity;
  }
  if("Egg biryani" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 150.60 * quantity;
  }
  if("Chilly chicken" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 140.35 * quantity;
  }
  if("Chicken fry" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 140.46 * quantity;
  }
  if("Mutton biryani" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 230.58 * quantity;
  }
  if("Chicken pepper fry" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.50 * quantity;
  }
  if("Kulcha" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 35.40 * quantity;
  }
  if("Parota" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 40.30 * quantity;
  }
  if("Roti" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 39.40 * quantity;
  }
  if("Thandoori" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 560.74 * quantity;
  }
  if("VadaPav" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 56.46 * quantity;
  }
  if("Pani puri" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 50.25 * quantity;
  }  
 
 return 0.0;
 }
}
