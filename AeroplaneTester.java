class AeroplaneTester{
  
  //static Aeroplane aeroplane = new Aeroplane("Spicejet",180);  //this is not a gud practice
  
  public static void main(String aero[]){
	  
	Aeroplane aeroplane1 = new Aeroplane();  //this will not be accepted as already user defined cosntructor is declared in the class file
	                                         //        with 2 parameters
	aeroplane1.name="Airasia";
	aeroplane1.noOfSeats=815;
	System.out.println(aeroplane1.name+" "+aeroplane1.noOfSeats);
	
    Aeroplane aeroplane = new Aeroplane("Spicejet",180);
    System.out.println(aeroplane.name+" "+aeroplane.noOfSeats);
    Aeroplane.createInstance();
	
	
 }


}