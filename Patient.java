class Patient{
  //patient name,age,blood group,gender, phoneNumber, isAlive
    //Patient name is Hari
	
    static String patientName = "Hari";
	static int age = 45;
	static String bloodGroup = "B+ve";
	//static String weight = "45kg"
	static String gender = "Male";
	static long phoneNumber = 9880461129L;
	static boolean isAlive = true;
	
  public static void main(String patient[]){
	  
  	System.out.println("The patient name is "+ patientName);
	System.out.println("The age of patient is "+ age);
	System.out.println("The patient bloodgroup is "+ bloodGroup);
	System.out.println("The gender of patient is "+ gender);
	System.out.println("The patient phone number is "+ phoneNumber);
	System.out.println("Is patient alive? "+ isAlive);
  }
}
