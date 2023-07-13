class Multiplication{

 public static void main(String multiply[]){
 //invoke mul
 
 mul(23,3);
 mul(45,6);
 mul(74,2);
 mul(65,84);
 mul(37,38);
 mul(59,86);
 mul(78,90);
 mul(53,76);
 mul(35,92);
 mul(45,22);
 System.out.println(" ");
 mul(23,3,56);
 mul(45,6,54);
 mul(74,2,45);
 mul(65,84,4);
 mul(37,38,7);
 mul(59,86,3);
 mul(78,90,34);
 mul(53,76,4);
 mul(35,92,45);
 mul(45,22,44);
 
 
 }
  //methods
 public static void mul(int w, int y){
 System.out.println(w*y);
 }
 public static void mul(int w, int y,int z){
 System.out.println(w*y*z);
 }


}