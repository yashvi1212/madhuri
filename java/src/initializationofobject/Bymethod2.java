package initializationofobject;

public class Bymethod2 {
	String name;
	int id;
	float salory;
	
	void details(String n,int i,float s)
	{
		name=n;
		id=i;
		salory=s;
	}
	void display()
	{
		System.out.println(name+" "+id+" "+salory);
	}

	public static void main(String[] args) {
		
		Bymethod2 a1=new Bymethod2();
		Bymethod2 a2=new Bymethod2();
		a1.name="Madhuri";
		a1.id=11;
		a1.salory=1000;
		a2.name="manohar";
		a2.id=12;
		a2.salory=10000;
		a1.display();
		a2.display();
		
	}

}
