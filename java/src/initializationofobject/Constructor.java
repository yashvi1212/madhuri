package initializationofobject;

public class Constructor {
 String name;
 int id;
 char grade;
 int fee;
   Constructor(String n,int i,char g)
 {
	 name=n;
	 id=i;
	 grade=g;
 }
   Constructor(String n,int i,char g,int z)
   {
	   id=i;
	   name=n;
	   fee=z;
	   grade=g;
	   
   }
  void name()
  {
	  System.out.println(name+ " "+id+" "+grade+" "+fee);
  }

	public static void main(String[] args) {
		Constructor obj=new Constructor("madhu",10,'a');
		Constructor obj2=new Constructor("manu",11,'a',1000);
		
		obj.name();
		obj2.name();
		// TODO Auto-generated method stub

	}

}
