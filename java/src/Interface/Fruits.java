package Interface;

public interface Fruits {
	abstract void mango();

}
 
   class flowers implements Fruits
   {
	 public void mango()
	   {
		  System.out.println("mangos are in yellow color "); 
	   }
	 
	 public static void main(String[] args)
	 {
		 flowers obj=new flowers();
		 obj.mango();
		 
	 }
   }
