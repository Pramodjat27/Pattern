
public class Pattern12 {
	public static void main(String[] args) {
		int n = 5, count=1;
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 1; j < n+1-i; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=2*i-1; k++)
				{
					System.out.print(count++);
					if (count==10)
						count=1;
				}
			System.out.println();
		}
	}
}/*
    1
   234
  56789
 1234567
891234567
*/
