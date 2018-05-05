
public class pattern4 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 0; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (n == 10)

					n = 1;
				System.out.print(n);
				n++;
			}
			System.out.println(" ");
		} 
	}
} /*
12345 
67891 
23456 
78912 
34567 
89123 
*/
