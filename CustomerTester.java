class CustomerTester{
 
 public static void main(String cos[]){
	 Customer1 customer = new Customer1();
	 
	 customer.setCustomerId(1);
	 int value = customer.getCustomerId();  //get data can be displayed in this way also
     System.out.println(value);  
	 
	 customer.setFirstName("Anusha");
	 customer.setMiddleName("Singh");
	 customer.setLastName("Rathod");
	 System.out.println(customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName());
	 
	 customer.setAddress("Rajajinaagar");
	 System.out.println(customer.getAddress());
	 
	 customer.setEmail("anush11@gmail.com");
	 System.out.println(customer.getEmail()); 
	 
	 customer.setPhoneNo(9880461129l);
	 System.out.println(customer.getPhoneNo());
	 
	 customer.setDob("11-08-2001");
	 System.out.println(customer.getDob());
 }
}