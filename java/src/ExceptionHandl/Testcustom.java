package ExceptionHandl;

public class Testcustom extends Exception
{
	static void age(int age)throws Customexception
	{
	if(age<18)
		throw new Customexception("not volid");
	else
		System.out.println("welcome to vote");
}

	

	public static void main(String[] args) {
		try
		{
		age(15);
		}
		catch(Exception e)
		{
			System.out.println("Exception oggured"+e);
		}
		System.out.println("successfully executed");
		// TODO Auto-generated method stub

	}

}
