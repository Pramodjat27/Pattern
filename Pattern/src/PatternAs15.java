
public class PatternAs15 {
	public static void main(String[] args) {
		int n = 5; 
		for (int i = 1; i <= n; i++) {
			char k='e';
			for (int j = i; j <= n; j++) {
				System.out.print(k--);
			}
			System.out.println(" ");
		}
	}
}
/*
edcba 
edcb 
edc 
ed 
e 
*/