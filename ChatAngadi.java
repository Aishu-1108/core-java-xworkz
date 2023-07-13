class ChatAngadi{
  
  public static void main(String chats[]){
  String chatNames[] = {"Pani puri","Samosa Masala","Bhel puri"};

  //invoke logic(methods)
  //arguments - the data that is passed during invokation
  System.out.println("List of chat item names are");
  System.out.println(" ");
  //invoking a method, here chatNames is called arguments
  getChatNames(chatNames); // if no parameter s declared inside arguments then error occurs 
  //no of argument parameters must match the parameters in method
  }
  
  public static void getChatNames(String names[])//parameters-type of variable tat wil have datatype and variable array
  {
  System.out.println("inside getChatNames");
  for(String chatName:names){
  System.out.println(chatName);
  }
  
  }


}