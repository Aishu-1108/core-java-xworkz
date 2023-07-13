class Subtraction{

 public static void main(String subtract[]){
 
  sub(72,23);
  sub(46,12);
  sub(176,112);
  sub(45,12);
  sub(123,41);
  sub(364,214);
  sub(897,537);
  sub(737,237);
  sub(947,746);
  sub(57,23);
 	System.out.println(" ");

 
  sub(72,23,43);
  sub(46,12,24);
  sub(176,112,24);
  sub(45,12,24);
  sub(123,41,76);
  sub(364,214,76);
  sub(897,537,24);
  sub(737,237,89);
  sub(947,746,23);
  sub(57,23,31);
 
 }
  //methods
 public static void sub(int c, int d){
 
 System.out.println(c-d);
 
 }
public static void sub(int c, int d,int e){
 
 System.out.println(c-d-e);
 
 }


}