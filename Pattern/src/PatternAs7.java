
public class PatternAs7 {
	public static void main(String[] args) {
		int n = 5; int count=1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print( "0 ");
				} else
					System.out.print("1 ");
			}
			System.out.println(" ");
		}
	}
}/*
1  
1 0  
1 0 1  
1 0 1 0  
1 0 1 0 1 
*/
