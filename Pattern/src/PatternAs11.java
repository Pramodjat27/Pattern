
public class PatternAs11 {
	public static void main(String[] args) {
		int n = 5, k=0;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}/*
54321 
4321 
321 
21 
1 
*/
