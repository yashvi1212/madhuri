package Inheritance;

public class Singleinheritance {
	void madhu()
	{
		System.out.println("madhuri karnati");
	}
}
class two extends Singleinheritance
{
	void manu()
	{
		System.out.println("manu karnati");
	}
	

	public static void main(String[] args) {
		two a1=new two();
		a1.manu();
		a1.madhu();
		
		// TODO Auto-generated method stub

	}

}
