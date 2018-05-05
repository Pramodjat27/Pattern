
public class Pattern3 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i <= n; i++) {
			char k = 'A';

			for (int j = 1; j <= n; j++) {
				System.out.print(k++);
			}
			System.out.println(" ");
		}
	}
}
/*
ABCDE 
ABCDE 
ABCDE 
ABCDE 
ABCDE 
ABCDE 
*/