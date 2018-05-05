
public class PatternAs5 {
	public static void main(String[] args) {
		int n = 5; 
		for (int i = 1; i <= n; i++) 
		{ char k='A';
			for (int j = 1; j <= i; j++)
			{
				System.out.print(k++);
	
				if (j != i) 
				{
					System.out.print("*");
				}
			} 
			System.out.println(" ");
		}
	}
}/*
A 
A*B 
A*B*C 
A*B*C*D 
A*B*C*D*E 
*/
