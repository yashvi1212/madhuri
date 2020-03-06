package Abstraction;

public abstract class People {
	abstract void men();
	 void women()
	 {
		 System.out.println("so many womens are there");
	 }
}
   class person extends People
   {
	   void men()
	   {
		   System.out.println("so many mens are there");
	   }

	public static void main(String[] args) {
		People obj=new person();
		obj.women();
		obj.men();
		// TODO Auto-generated method stub

	}

}
