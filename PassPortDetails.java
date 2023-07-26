class PassPortDetailsDTO{
 
 private int id;
 private String name;
 private String gender;
 private String fatherName;
 private long adharNumber;
 private int age;
 private String address;
 private String city;
 private String state;
 private String country;
 private String email;

 public PassPortDetails(){
	 
 }
 public void setId(int id){
	 this.id=id;
 }
 public int getId(){
	 return id;
 }
 public void setName(String name){
	 this.name=name;
 }
 public String getName(){
	 return name;
 }
 public void setGender(String gender){
	 this.gender=gender;
 }
 public String getGender(){
	 return gender;
 }
 public void setFatherName(String fatherName){
	 this.fatherName=fatherName;
 }
 public String getFatherName(){
	 return fatherName;
 }
 public void setAdharNumber(long adharNumber){
	 this.adharNumber=adharNumber;
 }
 public long getAdharNumber(){
	 return adharNumber;
 }
 public void setAge(int age){
	 this.age=age;
 }
 public int getAge(){
	 return age;
 }
 public void setAddress(String address){
	 this.address=address;
 }
 public String getAddress(){
	 return address;
 }
 public void setCity(String city){
	 this.city=city;
 }
 public String getCity(){
	 return city;
 }
 public void setState(String state){
	 this.state=state;
 }
 public String getState(){
	 return state;
 }
 public void setCountry(String country){
	 this.country=country;
 }
 public String getCountry(){
	 return country;
 }
 public void setEmail(String email){
	 this.email=email;
 }
 public String getEmail(){
	 return email;
 }
}