class ChairTester{
 public static void main(String args[]){
  Chair chair = new Chair();
  chair.name = "Nirmala";
  chair.color = "Plastic";
  chair.type = "Cream";
  chair.price = 300.00;
 
  chair.toSit();
    System.out.println(chair.name + " " + chair.color + " " + chair.type + " " + chair.price);
    System.out.println("creating firts copy of chair");
	
  Chair chair1 = new Chair();
  chair1.name = "Nirmala";
  chair1.color = "black";
  chair1.type = "steel";
  chair1.price = 680.00;
  chair1.toSit(); //methods are called using referencevariableName in calling instance methods
  
  System.out.println(chair1.name + " " + chair1.color + " " + chair1.type + " " + chair1.price);
  System.out.println("Creating second copy of chair");
  
  Chair chair2 = new Chair();
  chair2.name = "Asha";
  chair2.color ="Red";
  chair2.type = "Wodden";
  chair2.price = 600.00;
  
  chair2.toSit();
  System.out.println(chair2.name + " " + chair2.color + " " + chair2.type + " " + chair2.price);
  System.out.println("Creating third copy of the chair");
 }


}