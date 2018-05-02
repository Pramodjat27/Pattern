
public class Pattern4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 0; j < i-1; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=n+1-i; k++)
				{
					System.out.print(k);
				}
			System.out.println();
		}
	}
}
/*
12345
 1234
  123
   12
    1
*/