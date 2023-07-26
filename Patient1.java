class Patient1{
	
	private int patientId;
	private String patientName;
	private int age;
	private String gender;
	private String attenderName;
	private String diseaseName;
	private String address;
	private String bloodGroup;
	private long phoneNo;
	private int wardNo;
	private String consultant;
	private String hospitalName;
	private double fees;
	
	public Patient1(){    //default constructor must be present
		
	}
	
	public void setPatientId(int patientId){
		this.patientId=patientId;
	}
	public int getPatientId(){
		return patientId;
	}
	public void setPatientName(String patientName){
		this.patientName=patientName;
	}
	public String getPatientName(){
		return patientName;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	public void setAttenderName(String attenderName){
		this.attenderName=attenderName;
	}
	public String getAttenderName(){
		return attenderName;
	}
	public void setDiseaseName(String diseaseName){
		this.diseaseName=diseaseName;
	}
	public String getDiseaseName(){
		return diseaseName;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;		
	}
	public void setBloodGroup(String bloodGroup){
		this.bloodGroup=bloodGroup;
	}
	public String getBloodGroup(){
		return bloodGroup;
	}
	public void setPhoneNo(long phoneNo){
		this.phoneNo=phoneNo;
	}
	public long getPhoneNo(){
		return phoneNo;
	}
	public void setWardNo(int wardNo){
		this.wardNo=wardNo;
	}
	public int getWardNo(){
		return wardNo;
	}
	public void setConsultant(String consultant){
		this.consultant=consultant;
	}
	public String getConsultant(){
		return consultant;
	}
	public void setHospitalName(String hospitalName){
		this.hospitalName=hospitalName;
	}
	public String getHospitalName(){
		return hospitalName;
	}
	public void setFees(double fees){
		this.fees=fees;
	}
	public double getFees(){
		return fees;
	}
}
