public class Pattern12 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(k++);
				}
			}
			System.out.println(" ");
		}
	}
}
/*
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5 
*/