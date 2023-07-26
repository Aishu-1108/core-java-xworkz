class AeroplaneTester1{


     public static void main(String aero[]){
		 
	//System.out.println("Main started");
	Aeroplane1 aeroplane1 = new Aeroplane1();    //stack overflow occurs
	aeroplane1.name="Airasia";
	aeroplane1.noOfSeats=815;
	System.out.println(aeroplane1.name+" "+aeroplane1.noOfSeats);
	//System.out.println("Main ended");
	}
}	