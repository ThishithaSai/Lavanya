package DAY8;
import java.util.Scanner;
public class rever {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for(int i=c.length-1;i<=0;i--) {
			System.out.print(c[i]);
		}
	}

}
