class Division{
 
 public static void main(String divide[]){
 
  div(456,76);
  div(836,36);
  div(367,74);
  div(274,23);
  div(578,34);
  div(264,44);
  div(748,36);
  div(254,27);
  div(4994,82);
  div(8903,35);
   System.out.println(" ");
  div(456,7,6);
  div(836,36,23);
  div(367,74,5);
  div(274,23,5);
  div(578,34,3);
  div(264,44,6);
  div(748,36,7);
  div(254,27,2);
  div(4994,82,12);
  div(8903,35,11);
 
 
 }
 //methods
 public static void div(int r, int m){
 
 System.out.println(r/m);
 
 }
 public static void div(int r, int m,int n){
 
 System.out.println(r/m/n);
 
 }
}
