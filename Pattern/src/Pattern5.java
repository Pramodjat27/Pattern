
public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print(" 1 ");
				} else
					System.out.print(" 0 ");
			}
			System.out.println(" ");
		}
	}
} /* 
12345 
67891 
23456 
78912 
34567 
89123 
*/
