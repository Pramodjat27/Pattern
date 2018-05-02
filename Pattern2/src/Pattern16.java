public class Pattern16 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{ char m='A';
			for (int j = 0; j <= i-1; j++) 
			{
				System.out.print(" ");
			}
				for (int j = 2*n-2*i+1; j >= 1; j--)
				{
					System.out.print(m++);
				}
			System.out.println();
		}
	}
}/*
ABCDEFGHI
  ABCDEFG
   ABCDE
    ABC
     A
*/
