class SuperMarket1{
 
   //array variable
   static String vegetables[]={"Potato","Carrot","Beans","Brinjal","Onion"};
	
   static String biscuits[] = {"Unibic","Marigold","Monaco","Parle-G","Gooday","MomsMagic","Coconut Biscuit","Dark Fantasy","Jim Jam","Butter Cookies"};

   static String perfumes[] = {"Spinz","Watergirl","Engage","Fogg","Lotus","Eva","Axe","Tommy Girl","Shine","Mysore Sandal"};
   
   static String groceries[] = {"Rice","Ragi","Dhal","Moog Dhal","Green Gram","Horse gram","Salt","Sugar","Rava","Coffee Powder"};
   
  static String cosmetics[] = {"Sun Screen","Primer","Lipstick","Foundation","Eyeliner","Mascara","Moisturizer","Lotion","Kajal","Compact","Nail polish remover","Nail Polish", "Lip liner", "Concealer", "Blush", "Gel","toner","Lotion","Lip Balm","Highlighter","Face Powder","Lip Gloss","Perfume","EyeShadow","Nail extension"};
   public static void main(String markets[]){
		
		System.out.println("Main started");
		System.out.println("-------------------------------");
		System.out.println("List of Perfumes are");//raeding the array
		//System.out.println(perfume[0] + " " + perfume[1] + " " + perfume[2] + " " + perfume[3] + " " + perfume[4] + " " + perfume[5] + " " + perfume[6] + " " + perfume[7] + " " + perfume[8] + " " + perfume[9]);
		//foreach
		//invoking a method
		getPerfumes();
		System.out.println(" ");
		
		System.out.println("List of Vegetables are");
		//System.out.println(vegetable[0] + " " + vegetable[1] + " " + vegetable[2] + " " + vegetable[3] + " " + vegetable[4]);
		//foreach
		getVegetables();
		System.out.println(" ");
		
		System.out.println("List of Biscuits are");
		//System.out.println(biscuits[0] + " " + biscuits[1] + " " + biscuits[2] + " " + biscuits[3] + " " + biscuits[4] + " " + biscuits[5] + " " + biscuits[6] + " " + biscuits[7] + " " + biscuits[8] + " " + biscuits[9]);
		//foreach
		fetchBiscuits();
		System.out.println(" ");
		
		System.out.println("List of grocery are");
		//System.out.println(grocery[0] + " " + grocery[1] + " " + grocery[2] + " " + grocery[3] + " " + grocery[4] + " " + grocery[5] + " " + grocery[6] + " " + grocery[7] + " " + grocery[8] + " " + grocery[9]);
		//foreach
		getGroceries();
		System.out.println(" ");
		
		System.out.println("List of cosmetics are");
	    //System.out.println(cosmetics[0] + " " + cosmetics[1] + " " + cosmetics[2] + " " + cosmetics[3] + " " + cosmetics[4] + " " + cosmetics[5] + " " + cosmetics[6] + " " + cosmetics[7] + " " + cosmetics[8] + " " + cosmetics[9] + " " + cosmetics[10] + " " + cosmetics[11] + " " + cosmetics[12] + " " + cosmetics[13] + " " + cosmetics[14] + " " + cosmetics[15] + " " + cosmetics[16] + " " + cosmetics[17] + " " + cosmetics[18] + " " + cosmetics[19] + " " + cosmetics[20] + " " + cosmetics[21] + " " + cosmetics[22] + " " + cosmetics[23] + " " + cosmetics[24]);
		//foreach
		getCosmetics();
		System.out.println(" ");
		
		System.out.println("Main ended");
		
	}
	//to read - get, fetch, read can be used 
	public static void getPerfumes(){
		for(String perfume:perfumes){
			System.out.println(perfume);
		}
	}
	
	public static void getVegetables(){
		for(String vegetable:vegetables){
			System.out.println(vegetable);
		}
	}
	public static void fetchBiscuits(){
		for(String biscuit:biscuits){
			System.out.println(biscuit);
		}
	}
	public static void getGroceries(){
		for(String grocery:groceries){
			System.out.println(grocery);
		}
	}
	public static void getCosmetics(){
		for(String cosmetic:cosmetics){
			System.out.println(cosmetic);
		}
	}
}




