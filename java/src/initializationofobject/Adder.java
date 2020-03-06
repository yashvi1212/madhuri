package initializationofobject;

public class Adder {
	int a;
	int b;
	int c;
	int output;
	
	Adder(int x,int y)
	{
		a=x;
		b=y;
		output=x+y;
		
	}
	Adder(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		output=x+y+z;
		
	}
	void prnt()
	{
		System.out.println(output);
	}

	public static void main(String[] args) {
		Adder a1=new Adder(10,20);
		Adder a2=new Adder(50,40,30);
		a1.prnt();
		a2.prnt();
		
		
		// TODO Auto-generated method stub

	}

}
