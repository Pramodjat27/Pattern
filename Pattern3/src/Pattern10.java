
public class Pattern10 {
	public static void main(String[] args) {
		int n=7; int sp=n/2; int st=1;
		for (int i=1; i<=n; i++)	
		{
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}int k=1;
			for (int j=1; j<=st;j++) {
				if (i%2==0) {
				System.out.print("0");}
				else {
					System.out.print("1");
				}k++;
			}
			if (i<n/2)
				{
					sp--;
					st=st+2;
				}
				else
				{
					sp++;
					st=st-2;
				}
			System.out.println();
		}
	}
}/*
   1
  000
 11111
  000
   1
*/

