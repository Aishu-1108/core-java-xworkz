class Ship{
    
	/*public Ship(){
		System.out.println("Invoked Ship constructor");
	}*/
	
  String name;
  String purpose;
  int noOfCompartments;
  
  public Ship(String nm,String ps,int nc){
	 name=nm;
	 purpose=ps;
	 noOfCompartments=nc;
  }
  public void toSailShips(){
  System.out.println("Ships always sail on water");
  }
}