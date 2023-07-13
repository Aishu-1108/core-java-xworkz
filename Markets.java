class Markets{

 public static void main(String market[]){
 
 System.out.println("Main started");
 
 String items[] = {"Rice","Soap","ToothPaste","Shampoo","Perfume","Comfort","Brush"};
 
 //for loop
 for(int i=0; i< items.length; i++){
 System.out.println(items[i]);
 }
 
 //foreach
 for(String item:items){
	 System.out.println(item);
 }
 
 System.out.println("Main Ended");
 
 }
}

