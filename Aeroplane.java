class Aeroplane{
  
  String name;
  int noOfSeats;
  
  public Aeroplane(){
	  
  }
  
  public Aeroplane(String name,int noOfSeats){   //if this is not declared then the default constructor in tester class will be considered
     this.name=name;
	 this.noOfSeats=noOfSeats;
  }
  
  //object can be created inside a static method and invoked using ClassName but while creating object dont come up with static keyword
  //public static void createInstance(){    
   // Aeroplane aeroplane = new Aeroplane("Spicejet",180);
  //  System.out.println(aeroplane.name+" "+aeroplane.noOfSeats);

  //}

}