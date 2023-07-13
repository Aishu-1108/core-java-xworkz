class ChaiPoint{

   String location = "Kormangala";  //using reference instead of initializing directly
   static String tea = "Masala Tea";
   static String tea1 = "Lemon tea";
   static String tea2 = "Ginger tea";
   static String tea3 = "Kesar Elaichi chai";
   static String tea4 = "Irani chai";
   static String tea5 = "Green tea";
   static String tea6 =  "Ayurveda chai";
   static String tea7 = "Lemongrass chai";
   static String tea8 = "Filter coffee";
   static String tea9 = "Belgian hot chocolate";
   static String chaiAvailable[] = {tea, tea1, tea2, tea3, tea4, tea5, tea6, tea7, tea8, tea9}; //references are 

  //static String chaiAvailable[] = {"Masala Tea","Lemon tea", "Ginger tea"};
   
   //method
   public static void getAllChaiAvailable(){
   System.out.println("Invoking getAllChaiAvailable");
   //for(String individualChai:chaiAvailable){
   //System.out.println(individualChai);
   //}
   for(int chai=0;chai<chaiAvailable.length; chai++){
	   String reference = chaiAvailable[chai];
	   System.out.println(reference);
   }
   System.out.println("End of getAllChaiAvailable");
   }

}