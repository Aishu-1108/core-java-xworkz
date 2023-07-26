class Aeroplane1{
  
  String name;
  int noOfSeats;
  
 // constructor recursion  : there is no output for this code 
  public Aeroplane1(){
	  
	  System.out.println("Aeroplane1 constructor is invoked");
	  Aeroplane1 aeroplane = new Aeroplane1();
	  aeroplane.name = "AirAsia";
	  aeroplane.noOfSeats=454;
	  System.out.println(aeroplane.name+" "+aeroplane.noOfSeats);
	  //this();
	  
	  }
  }
  