package variables;

public class Staticvariables {
	int rolnum;
	String name;
	int age;
	static String college="xyz";

	public static void main(String[] args) {
		Staticvariables obj=new Staticvariables();
		obj.rolnum=10;
		obj.name="madhu";
		obj.age=25;
		
		System.out.println(obj.rolnum+" "+obj.name+" "+obj.age+" "+college);
		
		
		// TODO Auto-generated method stub

	}

}
