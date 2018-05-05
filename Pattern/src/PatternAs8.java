
public class PatternAs8 {
	public static void main(String[] args) {
		int n = 4;
		int k = 0;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			if (n > 3)
				k = i + 1;
			{
				System.out.print(k);
			}

			System.out.println(" ");
		}
	}
}/*
11112 
22223 
33334 
44445 
55556 
*/
