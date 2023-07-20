class Wallet{
	//public Wallet(){
	//	System.out.println("Invoked Wallet constructor");
	//}
 String name;
 String walletMaterialType;
 String contryOfOrigin;
 int price;

public Wallet(String nm,String wmt,String contryOfOrigin,int price){
	name=nm;
	walletMaterialType=wmt;
	this.contryOfOrigin=contryOfOrigin;
	this.price=price;
}
public void forSafety(){
System.out.println("wallet is used for carrying amount and cards");


}

}