
public class Pattern13 {
	public static void main(String[] args) {
		int n = 7;
		int sp = n / 2;
		int st = 1;
		int count=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for ( int j= 1; j <= st; j++) 
			{
				System.out.print(count++);
			if (count==10)
				count=1;
			}
			if (i < n / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
	}
}/*
   1
  234
 56789
  123
   4
   */
