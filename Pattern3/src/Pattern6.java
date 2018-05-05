
public class Pattern6 {
	public static void main(String[] args) {
		int n=7; int sp=n/2; int st=1; ;
		for (int i=0; i<=n; i++)	
		{char k='A';
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=st;j++) {
				System.out.print(k);
				k++;
			};
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
   A
  ABC
 ABCDE
ABCDEFG
 ABCDE
  ABC
   A
    */
