package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("madhu");
		l.add("manu");
		l.add("mahi");
		l.add("karnati");
		Iterator<String>itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
