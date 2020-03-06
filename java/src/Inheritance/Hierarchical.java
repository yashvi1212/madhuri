package Inheritance;

public class Hierarchical {
	void A()
	{
		System.out.println("ghjklmnb");
	}
}
class four extends Hierarchical
{
	void B()
	{
		System.out.println("zxcvbnm");
	}
}
class five extends Hierarchical
{
	void C()
	{
		System.out.println("werty");
	}
   
	public static void main(String[] args) {
		five obj=new five();
		obj.C();
		obj.A();
		// TODO Auto-generated method stub

	}

	
}
