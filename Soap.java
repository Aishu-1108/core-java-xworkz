class Soap{
//name, typeOfSoap, price, 

 static String soapName = "Santoor"; //static variable
 static String type = "Body wash";
 static int price = 30;
 static String mfgDate = "Jan-25";
 static String expDate = "Dec-21";
 
 public static void main(String soap[]){
	 
   String soapName = "Santoor"; //local variable
   System.out.println("Main started");
   System.out.println("The soap name is "+ soapName);
   System.out.println("The type of the soap is "+ type);
   System.out.println("The price of the soap is "+ price);
   System.out.println("The Manufacturing date is "+ mfgDate);
   System.out.println("The Expiry data is"+ expDate);
   System.out.println("Main ended"); 
 }
}

