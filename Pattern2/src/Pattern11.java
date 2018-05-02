
public class Pattern11 {
	public static void main(String[] args) {
		int n = 5, count=1;
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = 1; j < n+1-i; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=i; k++)
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
   23
  456
 7891
23456
*/
