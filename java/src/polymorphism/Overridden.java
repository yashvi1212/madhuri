package polymorphism;

public class Overridden {
	void p()
	{
		System.out.println("sdfbn");
	}
}
 class Over extends Overridden
 {
	 
	void p()
	{
		System.out.println("werty");
	}

	public static void main(String[] args)
	{
		Over o=new Over();
		o.p();
		
		

	}

}
