class EmployeeTester{
 
  public static void main(String emp[]){
    Employee employee = new Employee();
	
	employee.setEmployeeId(101);  //integeer starts from 1 so if it starts from 0 then it considers as binary
	System.out.println(employee.getEmployeeId());
	
	employee.setPhoneNo(9880461129l);
	System.out.println(employee.getPhoneNo());
	
	employee.setDesignation("Associate software developer");
	System.out.println(employee.getDesignation());
	
  }

}