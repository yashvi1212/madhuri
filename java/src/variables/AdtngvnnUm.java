package variables;

public class AdtngvnnUm {

	public static void main(String[] args) {
		int Counter=0;
		int n=456;
		while(n>0)
		{
			Counter=Counter+n%10;
			n=n/10;
		}
		System.out.println(Counter);
		}

	}


