package Abstraction;

public abstract class Animal {
	abstract void a1();
	
	void a2()
	{
		System.out.println("qwer");
	}
}
	 class dog extends Animal
	{
		void a1()
		{
			System.out.println("zxcvbnm");
		}
		
		
      public static void main(String[] args) {
		dog obj=new dog();
		obj.a1();
		obj.a2();
		// TODO Auto-generated method stub

	}

}
