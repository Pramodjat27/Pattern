
public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 1; j < n+1-i; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=i; k++)
				{
				if (i%2==0)
					{
					System.out.print("0");
					}
				else {
					   System.out.print("1");
					 }
				}
			System.out.println();
		}
	}
}/*
    1
   00
  111
 0000
11111
*/
