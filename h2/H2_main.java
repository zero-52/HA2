package h2;

public class H2_main {
	public static void main(String args[]) {
		int i = 123;
		int j = 5;
		int k = 88;
		int min ;
		int max ;
		
		//find the minimum 
		if (i < j && i < k) {
			min = i;
		}
		else if (j < k) {	
			min = j;
		}
		else {
			min = k;
		}
		
		//Maximum 
		if (i > j && i > k) {
			max = i;
		}
		else if (j > k) {	
			max = j;
		}
		else {
			max = k;
		}
		System.out.println (min);
		System.out.println (max);
	}

}
