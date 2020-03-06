package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("madhu");
		a.add("manu");
		a.add("karnati");
		a.add("manu");
		Iterator itr=a.iterator(); 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
