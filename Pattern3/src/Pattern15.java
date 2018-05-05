public class Pattern15 {
	public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            int a=0,b=4;
            for(int column=1;column<=row; column++){
                int s=row+a;
                System .out.print (s+"  ");
                a=a+b;
                b--;
            }
            System .out .println ();
        }
    }
}
