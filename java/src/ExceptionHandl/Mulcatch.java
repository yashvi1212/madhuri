package ExceptionHandl;

public class Mulcatch {

	public static void main(String[] args) {
		try
		{
			int a=3/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
