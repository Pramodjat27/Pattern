
public class Pattern2 {
	public static void main(String[] args) {
		int n=7; int sp=0; int st=n;
		for (int i=1; i<=n; i++)	
		{
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}
			for (int j=0; j<st;j++) {
				System.out.print("*");
			}if (i<=n/2)
				{
					sp++;
					st=st-2;
				}
				else
				{
			 		sp--;
					st=st+2;
				}
			System.out.println();
		}
	}
}/*
*******
 *****
  ***
   *
  ***
 *****
*******
*/
