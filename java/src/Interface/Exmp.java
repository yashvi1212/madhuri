package Interface;

public interface Exmp {
	final String name="madhu";
	abstract void name();

}
 class rolnm implements Exmp
{
	public void name()
	{
		System.out.println("qwertyu");
	}
	
	public static void main(String[] args)
	{
		rolnm obj=new rolnm();
		obj.name();
		System.out.println(name);
	}
	
}
