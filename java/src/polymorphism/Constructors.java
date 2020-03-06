package polymorphism;

public class Constructors {

	 
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Constructors(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	  void display()
	  {
		  System.out.println(id+" "+name);
		  }  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Constructors s1 = new Constructors(111,"Karan");  
	    	Constructors s2 = new Constructors(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	}

}
