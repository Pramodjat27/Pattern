
public class Pattern9 {
	public static void main(String[] args) {
		int n=5; int sp=n/2; int st=1;
		for (int i=0; i<=n; i++)	
		{
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}int k=1;
			for (int j=1; j<=st;j++) {
				if (k%2==0) {
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
 101
10101
 101
  1
  */
