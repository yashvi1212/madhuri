package ExceptionHandl;

public class Throw {
	static void madhu(int age)
	{
		if(age<18)
			throw new ArithmeticException("not valid");
		else 
		{
			System.out.println("welcome to vote");
		}
	}

	public static void main(String[] args) {
		madhu(20);
		System.out.println("valid");
		// TODO Auto-generated method stub

	}

}
