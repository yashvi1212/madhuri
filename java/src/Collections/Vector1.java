package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args)
	{
	Vector<String> v=new Vector<String>();
	v.add("madhu");
	v.add("karnati");
	v.add("manu");
	Iterator<String>itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	

	}

}
