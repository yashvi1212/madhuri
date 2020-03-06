package Inheritance;

public class Multilevel {
	void one()
	{
		System.out.println("asdfgh");
	}
}
class two1 extends Multilevel
{
	void two()
	{
		System.out.println("ghjhjk");
	}
}
class three extends two1
{
	void three()
	{
		System.out.println("fghjk");
	}

	public static void main(String[] args) {
		three a=new three();
		a.one();
		a.two();
		a.three();
		// TODO Auto-generated method stub

	}

}
