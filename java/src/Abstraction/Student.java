package Abstraction;

public abstract class Student {
	abstract void name();


  void rolnm()
  {
	  System.out.println("student rlnm is 10");
  }
}
   class emp1 extends Student
   {
	   void name()
	   {
		   System.out.println("emp id is 11");
	   }
   

   public static void main(String[] args) {
	  emp1 obj=new emp1();
	  obj.name();
	  obj.rolnm();
	   
		// TODO Auto-generated method stub

	}

}
