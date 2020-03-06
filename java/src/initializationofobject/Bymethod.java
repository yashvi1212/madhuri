package initializationofobject;

public class Bymethod {
	int id;
	int sal;
	String name;
	void details(int i,int s,String n)
	{
		id=i;
		sal=s;
		name=n;
	}
	void dts()
	{
		System.out.println(id+" "+sal+" "+name);
	}

	public static void main(String[] args) {
		Bymethod d1=new Bymethod();
		Bymethod d2=new Bymethod();
		d1.details(1, 100, "madhu");
		d2.details(2, 1000, "manu");
		
		d1.dts();
		d2.dts();
		// TODO Auto-generated method stub

	}

}
