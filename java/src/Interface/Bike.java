package Interface;

public interface Bike {
	abstract void wheels();

}
 class cycle implements Bike
 {
	 public void wheels()
	 {
		 System.out.println("it can have two wheels");
	 }
	 public static void main(String[] args)
	 {
		 cycle obj=new cycle();
		 obj.wheels();
	 }
 }
