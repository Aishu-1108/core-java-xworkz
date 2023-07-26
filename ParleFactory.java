class ParleFactory{
   static String name = "Parle-G";
   int quantity;
   int noOfBiscuits;
   double price;
   
   public ParleFactory(int quantity,double price,int noOfBiscuits){
	   this.quantity=quantity;
	   this.price=price;
	   this.noOfBiscuits=noOfBiscuits;
   }
   public void produceBiscuits(){
    System.out.println("Producing biscuits in huge amount");
   }

}