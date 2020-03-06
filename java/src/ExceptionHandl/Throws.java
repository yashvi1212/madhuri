package ExceptionHandl;

import java.io.IOException;

public class Throws {
	void add()throws IOException
	{
		throw new IOException("device errors");
	}



	public static void main(String[] args) {
		try
		{
		 Throws obj=new Throws();
		 obj.add();
	}
		catch(Exception e)
		{
			System.out.println("exception e");
		}
		System.out.println("succesfully executed");
	}
}


