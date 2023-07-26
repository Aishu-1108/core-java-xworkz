class ParleFactoryTester{

   public static void main(String machine[]){
   
     ParleFactory factory = new ParleFactory(20,10.00,30);
	 System.out.println(factory.name);
	 System.out.println(factory.quantity+" "+factory.noOfBiscuits+" "+factory.price);
	 ParleFactory factory1 = new ParleFactory(10,5.00,20);
	 System.out.println(factory.name);
	 System.out.println(factory1.quantity+" "+factory1.noOfBiscuits+" "+factory1.price);

   }

}