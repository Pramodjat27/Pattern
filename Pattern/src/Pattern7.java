
public class Pattern7 {
	public static void main(String[] args) {
		int n = 5; int count=1;
		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print(count%2 +" ");
				} else
					System.out.print("0 ");
			}
			System.out.println(" ");
		}
	}
}/*
0 1 0 1 0  
0 1 0 1 0  
0 1 0 1 0  
0 1 0 1 0  
0 1 0 1 0  
0 1 0 1 0  
*/


