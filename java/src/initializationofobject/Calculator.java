package initializationofobject;

public class Calculator {
	int a;
	int b;
	int c;
	int d;
	Calculator()
	{
		System.out.println("default constructor");
	}
	Calculator(int x,int y)
	{
		a=x;
		b=y;
	}
	Calculator(int x,int y,int  z)
	{
		a=x;
		b=y;
		c=z;
	}
	Calculator(int x,int y,int z,int l)
	{
		a=x;
		b=y;
		c=z;
		d=l;
		
	}
	void print()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Calculator c2=new Calculator(10,20);
		Calculator c3=new Calculator(10,20,30);
		Calculator c4=new Calculator(10,20,30,40);
		
		c2.print();
		c3.print();
		c4.print();
		
		// TODO Auto-generated method stub

	}

}
