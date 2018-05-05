
public class Pattern9 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 0; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {
				if (n == 10)

					n = 1;
				System.out.print(n+" ");
				n++;
			}
			System.out.println(" ");
		}
	}
}/*
1  
2 3  
4 5 6  
7 8 9 1  
2 3 4 5 6  
7 8 9 1 2 3  
*/
