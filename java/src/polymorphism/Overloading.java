package polymorphism;

public class Overloading {
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		//Overloading obj=new Overloading();
		System.out.println(Overloading.add(10, 20));
		System.out.println(Overloading.add(20, 30, 40));
		// TODO Auto-generated method stub

	}

}
