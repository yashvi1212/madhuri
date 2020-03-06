package initializationofobject;

public class Byrefferencevariable {
	int id;
	String name;
	int sal;
	String designation;
	
	

	public static void main(String[] args) {
		Byrefferencevariable d1=new Byrefferencevariable();
		Byrefferencevariable d2=new Byrefferencevariable();
		Byrefferencevariable d3=new Byrefferencevariable();
		d1.id=1234;
		d1.name="madhu";
		d1.sal=1000;
		d1.designation="mbbs";
		System.out.println(d1.id+" "+d1.name+" "+d1.sal+" "+d1.designation);
	
		d2.id=2345;
		d2.name="manu";
		d2.sal=10000;
		d2.designation="mbbs";
		System.out.println(d2.id+" "+d2.name+" "+d2.sal+" "+d2.designation);
		
		d3.id=3456;
		d3.name="mahi";
		d3.sal=100000;
		d3.designation="mbbs";
		System.out.println(d3.id+" "+d3.name+" "+d3.sal+" "+d3.designation);
		
		//here d1,d2,d3 are the refference variable.
		//By using this refference variable we are initialize the values to the class property(variable)
		
	}

}
