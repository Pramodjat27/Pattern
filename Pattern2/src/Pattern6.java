
public class Pattern6 {
	public static void main(String[] args) {
		int n = 5; 
		for (int i = 1; i <= n; i++) 
		{ char m='A';
			for (int j = 1; j < n+1-i; j++) 
			{
				System.out.print(" ");
			}
				for(int k=1; k<=i; k++)
				{
					System.out.print(m++);
					
				}
			System.out.println();
		}
	}
}/*
    A
   AB
  ABC
 ABCD
ABCDE
*/
