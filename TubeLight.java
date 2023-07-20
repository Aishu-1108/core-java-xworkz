class TubeLight{
       /*  public TubeLight(){
		System.out.println("Invoked TubeLight constructor");
	}*/
   String name;
   String type;
   String powerConsumption;
   int price;
   
   public TubeLight(String name,String type,String powerConsumption,int price){
	   this.name=name;
	   this.type=type;
	   this.powerConsumption=powerConsumption;
	   this.price=price;
   }
   public void toSee(){
   System.out.println("Light helps us to see");
   }

}