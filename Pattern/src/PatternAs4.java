
public class PatternAs4 {
	public static void main(String[] args) {
		int n = 5;
		char k='A';

		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(k);
				
			}
			k++;
			System.out.println(" ");
		}
	}
}/*
A 
BB 
CCC 
DDDD 
EEEEE
 */
