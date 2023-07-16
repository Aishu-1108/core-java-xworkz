class SoapObjectTester{
 
 public static void main(String args[]){
 
  SoapObject soap = new SoapObject();
  soap.name = "Dove";
  soap.type = "Body wash";
  soap.color = "White";
  soap.price = 45.00;
  soap.toUse();
  System.out.println(soap.name+" "+soap.type+" "+soap.color+" "+soap.price);
  
  SoapObject soap1 = new SoapObject();
  soap1.name = "Santtor";
  soap1.type = "Body wash";
  soap1.color = "Orange";
  soap1.price = 30.00;
  soap1.toUse();
  System.out.println(soap1.name+" "+soap1.type+" "+soap1.color+" "+soap1.price);
 
 }



}