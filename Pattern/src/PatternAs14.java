public class PatternAs14 {
	public static void main(String[] args) {
		int n = 5; 
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}/*
12345 
2345 
345 
45 
5 
*/