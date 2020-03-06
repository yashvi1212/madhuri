package Interface;

public interface Intfsexm {
	final int add=10;
	abstract void sub();
}
class birds implements Intfsexm
{
	public void sub()
	{
		System.out.println("hjkl");
	}
	public static void main(String[] args)
	{
		birds obj=new birds();
		obj.sub();
		System.out.println(add);
	}
}





