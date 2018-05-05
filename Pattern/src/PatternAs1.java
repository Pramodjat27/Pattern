public class PatternAs1 {
	public static void main(String[] args) {
		int n = 5, k=1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				if (k % 2 == 0) {
					System.out.print("0");
		
				} else
					System.out.print("1");
				k++;
			}
			System.out.println(" ");
		}
	}
}/*
1 
01 
010 
1010 
10101 
*/
