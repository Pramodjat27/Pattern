
public class PatternAs10 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 5; i++) {
			 
			for (int j = 1; j <= n-i+1; j++) {
				if (j%2!=0)
				{
				System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println(" ");
		}
	}
}/*
10101 
1010 
101 
10 
1 
*/
