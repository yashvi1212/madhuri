package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(10, "madhuri");
		mp.put(11,"manu");
		mp.put(12,"mahi");
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
