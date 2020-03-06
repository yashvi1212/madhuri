package Inheritance;

public class Multipleinheritance {
	void one()
	{
		System.out.println("property");
	}
}
	class multiple 
	{
		void two()
		{
			System.out.println("abcde");
		}
	}
	class three extends Multipleinheritance,multiple
	{
		void four()
		{
		System.out.println("sdfghj");
	
	}
	

	public static void main(String[] args) {
		three a1=new three();
		a1.four();
		a1.one();
		a1.two();
		// TODO Auto-generated method stub

	}

}
