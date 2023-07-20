class Books{
	/*public Books(){
		System.out.println("Invoked Books constructor");
	}*/
 
 String name;
 String type;
 String author;
 int price;
 
 public Books(String nm,String tp, String at,int pr){
	name=nm;
    type=tp;
    author=at;
    price=pr;
   
 }
 public void gainKnowledge(){
 System.out.println("Books are used to read");
 }

}