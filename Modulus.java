class Modulus{

 public static void main(String modulo[]){
 
 mod(34,2,4);
 mod(7484,55);
 mod(847,47);j
 mod(747,45);
 mod(494,24);
 mod(835,233);
 mod(287,82);
 mod(738,283);
 mod(275,134);
 mod(244,73);
 
  System.out.println(" ");
 mod(34,2,4);
 mod(7484,5,5);
 mod(847,4,7);
 mod(747,4,5);
 mod(494,2,4);
 mod(835,23,3);
 mod(287,82,35);
 mod(738,28,3);
 mod(275,13,4);
 mod(244,7334);
 
 
 
 }
  //methods
 public static void mod(int e, int g){
 
   System.out.println(e%g);
 }
 public static void mod(int e, int g,int h){
 
   System.out.println(e%g%h);
 }
}
