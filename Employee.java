class Employee{
 
  private int employeeId;
  String firstName;
  String lastName;
  private long phoneNo;
  String address;
  private String designation;
  
  public void setEmployeeId(int employeeId){
     this.employeeId=employeeId;
  }
  
  public int getEmployeeId(){
	  return employeeId;
  }
  
  public void setPhoneNo(long phoneNo){
	  this.phoneNo=phoneNo;
  }
  public long getPhoneNo(){
	  return phoneNo;
  }
  
  public void setDesignation(String designation){
	this.designation = designation;
  }
  
  public String getDesignation(){
	  return designation;
  }
}