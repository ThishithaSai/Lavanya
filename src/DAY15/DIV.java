package DAY15;
import java.util.Scanner;
public class DIV {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=a/b;
		try {
			System.out.println(i);
		}
		catch(java.lang.ArithmeticException ex) {
			System.out.println(ex);
		}
	}
}
