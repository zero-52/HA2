package h3;

public class h3_2_VerschacheltesIf {
	public static void main(String args[]) {
		int i = 210;
		int j = 102;
		int k = -10;
		
		if (i > j && i < 200 && j< 100) {
					k = 1;
				}
			else if (i > j && i > 200 && j < 100) {
				k = 2;
			}
			else if (i > j && i > 200 && j > 100) {
				k = 3;		
			}
		
		if (i < j) {
			if (i < 200 && j < 100) {
					k = 4;
				}
			else {
				k = - 10;
			}
			
		}
		
		System.out.println(k);
			
			
	}
	

}

