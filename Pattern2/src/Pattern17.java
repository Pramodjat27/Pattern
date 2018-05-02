public class Pattern17 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{
			int m = 1;
			int count = 1;
			for (int j = 1; j < n + 1 - i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) 
			{
				if (count % 2 == 0) 
				{
					System.out.print("*");
				} 
				  else 
				{
					System.out.print(m++);
				}
				count++;
			}
			System.out.println();
		}
	}
}/*
	  1 
	 1*2 
	1*2*3 
   1*2*3*4
	 */
