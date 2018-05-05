
public class PatternAs9 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			 char k='A';
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(k++);
			}
			System.out.println(" ");
		}
	}
}/*
ABCDE 
ABCD 
ABC 
AB 
A 
*/
