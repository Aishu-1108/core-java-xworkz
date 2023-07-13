class SportsComplex1{
		static String sportsItems[] = {"Swimming dress","Cricket bat","Tennis Ball","Foot Ball","Basket Ball"};
		
	public static void main(String sports[]){

		System.out.println("Main started");
		getSportsItems();
		System.out.println("Main started");
	
	}
	public static void getSportsItems(){
	for(String sportsItem:sportsItems){
			System.out.println(sportsItem);
		}
	}
}