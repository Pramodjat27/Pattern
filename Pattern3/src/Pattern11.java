
public class Pattern11 {
	public static void main(String[] args) {
		int n = 7,m=1;
		int sp = n / 2;
		int st = 1;
		
		for (int i = 1; i <= n; i++) {char k = 'A';
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for ( m = 1; m <= st; m++) {
				System.out.print(k);
				if ( m <= st / 2) 
					k++;
				 else 
					k--;
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
   A
  ABA
 ABCBA
  ABA
   A
*/
