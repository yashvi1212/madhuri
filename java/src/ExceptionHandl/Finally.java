package ExceptionHandl;

public class Finally {

	public static void main(String[] args) {
		
		try
		{
			int a[]=new int[5];
			a[7]=7;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally blockk..");
		}

	}

}
