
public class Pattern13 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 1; j < n+1-i; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=2*i-1; k++)
				{
					if (k%2==0) {
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
			System.out.println();
		}
	}
}/*
    1
   101
  10101
 1010101
101010101
*/
