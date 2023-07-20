class AgroIndustry{
	
	/*public AgroIndustry(){
		System.out.println("Invoked AgroIndustry constructor");
	}*/
  String name;
  String type;
  int quantityProducedInKg;
  
  public AgroIndustry(String nm,String tp,int qp){
	  name=nm;
	  type=tp;
	  quantityProducedInKg=qp;
  }
  public void toProduceRawMaterials(){
  System.out.println("Agro industries have agriculture products as raw material");
  }

}