class PatientTester{

 public static void main(String hosp[]){
 
  Patient1 patient = new Patient1();
  patient.setPatientId(1);
  System.out.println(patient.getPatientId());
 
  patient.setPatientName("Rohan");
  System.out.println(patient.getPatientName()); 
  
  patient.setAge(20);
  System.out.println(patient.getAge());
  
  patient.setGender("Male");
  System.out.println(patient.getGender());
  
  patient.setAttenderName("Manish");
  System.out.println(patient.getAttenderName());
  
  patient.setDiseaseName("Thyroid");
  System.out.println(patient.getDiseaseName());
  
  patient.setAddress("Vijayanagar");
  System.out.println(patient.getAddress());
  
  patient.setBloodGroup("B-ve");
  System.out.println(patient.getBloodGroup());
  
  patient.setPhoneNo(9880461129l);
  System.out.println(patient.getPhoneNo());
  
  patient.setWardNo(101);
  System.out.println(patient.getWardNo());
  
  patient.setConsultant("De.Mohan Kumar");
  System.out.println(patient.getConsultant());
  
  patient.setHospitalName("Apolo Hospital");
  System.out.println(patient.getHospitalName());
  
  patient.setFees(1000.00);
  System.out.println(patient.getFees());
  System.out.println(" ");

  
  Patient1 patient2 = new Patient1();
  patient2.setPatientId(2);
  System.out.println(patient2.getPatientId());
  
  patient2.setPatientName("Gouthami");
  System.out.println(patient2.getPatientName());
  
  patient2.setAge(30);
  System.out.println(patient2.getAge()); 
  
  patient2.setGender("Female");
  System.out.println(patient2.getGender());
  
  patient2.setAttenderName("Mani");
  System.out.println(patient2.getAttenderName());
  
  patient2.setDiseaseName("Viral fever");
  System.out.println(patient2.getDiseaseName());
  
  patient2.setAddress("Girinagar");
  System.out.println(patient2.getAddress());
  
  patient2.setBloodGroup("A+ve");
  System.out.println(patient2.getBloodGroup());
  
  patient2.setPhoneNo(9449550379l);
  System.out.println(patient2.getPhoneNo());
  
  patient2.setWardNo(102);
  System.out.println(patient2.getWardNo());
  
  patient2.setConsultant("Dr. Vishwanath");
  System.out.println(patient2.getConsultant());
  
  patient2.setHospitalName("GM hospital");
  System.out.println(patient2.getHospitalName());
  
  patient2.setFees(250.00);
  System.out.println(patient2.getFees());
  System.out.println(" ");
 
  Patient1 patient3 = new Patient1();
  patient3.setPatientId(3);
  System.out.println(patient3.getPatientId());
  
  patient3.setPatientName("Gouthami");
  System.out.println(patient3.getPatientName());
  
  patient3.setAge(30);
  System.out.println(patient3.getAge()); 
  
  patient3.setGender("Female");
  System.out.println(patient3.getGender());
  
  patient3.setAttenderName("Sunil");
  System.out.println(patient3.getAttenderName());
  
  patient3.setDiseaseName("Cough");
  System.out.println(patient3.getDiseaseName());
  
  patient3.setAddress("Jp Nagar");
  System.out.println(patient3.getAddress());
  
  patient3.setBloodGroup("O+ve");
  System.out.println(patient3.getBloodGroup());
  
  patient3.setPhoneNo(9148429009l);
  System.out.println(patient3.getPhoneNo());
  
  patient3.setWardNo(103);
  System.out.println(patient3.getWardNo());
  
  patient3.setConsultant("Dr. Anjali");
  System.out.println(patient3.getConsultant());
  
  patient3.setHospitalName("Vikram hospital");
  System.out.println(patient3.getHospitalName());
  
  patient3.setFees(2000.00);
  System.out.println(patient3.getFees());
 }

}