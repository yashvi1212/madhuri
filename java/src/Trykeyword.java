
public class Trykeyword {

	public static void main(String[] args) {
		try
		{
		  int div=3/0;
		  System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
