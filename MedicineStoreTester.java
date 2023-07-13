class MedicineStoreTester{

    public static void main(String medicine[]){
	 MedicineStore.addMedicine("DOLO 650");
	 MedicineStore.addMedicine("Crosin");
	 MedicineStore.addMedicine("Imol");
	 MedicineStore.addMedicine("Vasograin");
	 MedicineStore.addMedicine("Bandage cloth");
	 MedicineStore.addMedicine("Chestan cold");
	 MedicineStore.addMedicine("Dettol");
	 MedicineStore.addMedicine("Crape Bandage");
	 MedicineStore.addMedicine("Cotton");
	 MedicineStore.getAllMedicine();
	 boolean isUpdated = MedicineStore.updateMedicine("Imol","Imol 500");
	 System.out.println("Is the medicine name updated "+ isUpdated);
	 MedicineStore.getAllMedicine();
	 int newLength = MedicineStore.deleteMedicines("Cotton");
    System.out.println("Calling getAllMedicineItemsPostDeletion");
    MedicineStore.getAllMedicineItemsPostDeletion(newLength);
 }


}