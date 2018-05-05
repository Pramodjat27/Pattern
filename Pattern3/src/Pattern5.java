
public class Pattern5 {
	public static void main(String[] args) {
		int n = 9, sp = n / 2, ele = 1;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < sp; j++) 
			{
				System.out.print(" ");
			}
			int k = 1;
			for (int j = 0; j < ele; j++) 
			{
				System.out.print(k);
				if (j < ele / 2) {
					k++;}
				else 
				{
					k--;}
			}
			if (i<n/2)
			{
				sp--;
				ele=ele+2;
			}
			else
			{
				sp++;
				ele=ele-2;
			}
			System.out.println();
		}
	 }
}
/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
    */
