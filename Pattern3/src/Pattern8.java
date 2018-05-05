
public class Pattern8 {
	public static void main(String[] args) {
		int n=7; int sp=0; int ele=n;
		for (int i=1; i<=n; i++)	
		{
			for (int j=0; j<sp; j++)
			{
				System.out.print(" ");
			} int k=5-i;
			for (int j=0; j<ele;j++) {
				
				System.out.print(k);
				if (j < ele / 2) {
					k--;}
				else 
				{
					k++;}
			}if (i<=n/2)
				{
					sp++;
					ele=ele-2;
				}
				else
				{
			 		sp--;
					ele=ele+2;
				}
			System.out.println();
		}
	}
}
