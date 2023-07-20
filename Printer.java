class Printer{
    //public Printer(){
	//	System.out.println("Invoked Printer constructor");
	//}
 String name;
 String type;
 int price;
 String origin;
 
  public Printer(String name,String type,int price,String origin){
	  this.name=name;
	  this.type=type;
	  this.price=price;
	  this.origin=origin;
  }
 public void toPrint(){
	 System.out.println("Printers to print");
 }
}