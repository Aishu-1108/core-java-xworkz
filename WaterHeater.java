class WaterHeater{
	
	/*public WaterHeater(){
		System.out.println("Invoked WaterHeater constructor");
	}*/

 String name;
 String capacity;
 int price;
 String color;
 
 	public WaterHeater(String nm, String cp,int pr,String clr){
        name=nm;
		capacity=cp;
		price=pr;
		color=clr;
	}
 public void toHeatWater(){
	 System.out.println("WaterHeater is used to heat water");
 }
}