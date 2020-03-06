package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("xcvb");
		hs.add("fghj");
		hs.add("asdddd");
		hs.add("fghj");
		hs.add("fklmn");
		Iterator<String>itr=hs.iterator();
	
			while(itr.hasNext())
			{
				System.out.println(itr.next());
		}
		
		
	
	}

}
