class ProjectorObject{
	/*public ProjectorObject(){
		System.out.println("Invoked ProjectorObject constructor");
	}*/

 String name;
 String type;
 double maxDistance;
 int price;
 
 public ProjectorObject(String name,String type,int price,double maxDistance){
	 this.name=name;
	 this.type=type;
	 this.maxDistance=maxDistance;
	 this.price=price;
 }
 public void projectImage(){
 System.out.println("Projector is to project Image");
 }
}