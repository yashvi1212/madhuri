package variables;

public class instancevariable {
	int eng;//Instance variables
	int math;
	int    hindhi;
public static void main(String[] args)
   {
	
instancevariable obj=new instancevariable();
		obj.eng=70;
        obj.math=80;
        obj.hindhi=90;
        
instancevariable obj2=new instancevariable();
obj2.eng=50;
        obj2.math=60;
        obj2.hindhi=70;

//System.out.println(obj.eng+" "+obj.math+" "+obj.hindhi);

System.out.println(obj.eng);

System.out.println(obj2.math);

System.out.println(obj.hindhi);


		// TODO Auto-generated method stub

	}

}
