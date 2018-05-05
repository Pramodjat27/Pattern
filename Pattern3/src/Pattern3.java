public class Pattern3 {
	public static void main(String[] args) {
		int n=5; int sp=n/2; int st=1;
		for (int i=0; i<=n; i++)	
		{
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}
			for (int j=0; j<st;j++) {
				System.out.print(st/2+1);
			}if (i<n/2)
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
  222
 33333
  222
   1
   */
