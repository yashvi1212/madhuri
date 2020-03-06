package ExceptionHandl;

public class Custom2 extends Exception
{
	static void name(String name)throws Customexception
	{
		
	
		if(name!="madhu")
			throw new Customexception("not valid");
			else
				System.out.println("valid");
}


	public static void main(String[] args) {
		try
		{
			name("manu");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		
		// TODO Auto-generated method stub

	}
		System.out.println("valid");

}
	}
