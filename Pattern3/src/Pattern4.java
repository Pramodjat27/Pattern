public class Pattern4 {
	public static void main(String[] args) {
		int n=7; int sp=n/2; int st=1;
		for (int i=0; i<=n; i++)	
		{
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=st;j++) {
				System.out.print(j);
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
}
/*
   1
  123
 12345
1234567
 12345
  123
   1
*/