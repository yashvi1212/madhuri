package Abstraction;

public abstract class Food {
	abstract void eat();
}
class rice extends Food
{
	void eat()
	{
		System.out.println("eatting rice");
	}

	public static void main(String[] args) {
		Food obj=new rice();
		obj.eat();
		// TODO Auto-generated method stub

	}

}
