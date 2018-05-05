
public class Pattern16 {
	public static void main(String[] args) {
		
	int n=4;
	char ch='A';
	char c;
	for(int row=1;row<=n;++row)        // FOR LOOP FOR NUMBER OF ROWS
	{
	c=ch;
	for(int column=row;column<n;++column)        // FOR LOOP FOR PRINTING SPACES
	{
	System.out.print(" ");
	}
	for(int k=1;k<=row;++k)      // FOR LOOP FOR PRINTING ALPHABETS IN DESCENDING ORDER  
	{
	System.out.print(c);
	--c;
	}
	c+=2;
	for(int l=1;l<row;++l)      // FOR LOOP FOR PRINTING ALPHABETS IN ASCENDING ORDER
	{
	System.out.print(c);
	++c;
	}
	System.out.println();    // INTRODUCING NEW LINE
	++ch;                   //  INCREMENTING VALUE OF CH FOR NEXT ITERATION
	}

	} // end of main method
	} // end of main class

