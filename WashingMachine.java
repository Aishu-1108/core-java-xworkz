class WashingMachine{
	
	 static String brandName;
     static int price;
     static String type;
	 static String color;
	 static String model;
	 static String material;
	 static String countryOfOrigin;
	 static boolean batteriesRequired;
	 static String capacity;
	 static String partNo;

  public static void main(String machine[]){
   
     String brandName = "IFB";
     int price = 45000;
     String type = "Top load";
	 String color = "White";
	 String model ="NEO V=DUVA BXS 7020";
	 String material = "stainless steel";
	 String countryOfOrigin = "India";
	 boolean batteriesRequired = false;
	 String capacity = "7 kg";
	 String partNo = "IFBST18";

	 
	  System.out.println("The brandName is "+ brandName);
      System.out.println("The price is "+ price);
      System.out.println("The type is "+ type);
	  System.out.println("The color is "+ color);
	  System.out.println("The model is "+ model);
	  System.out.println("The material is "+ material);
	  System.out.println("The countryOfOrigin is "+ countryOfOrigin);
	  System.out.println("The batteriesRequired is "+ batteriesRequired);
	  System.out.println("The capacity is "+ capacity);
	  System.out.println("The partNo is "+ partNo);
   
  }
}