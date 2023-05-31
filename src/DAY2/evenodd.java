package DAY2;
import java.util.Scanner;
public class evenodd {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number:");
			int a=sc.nextInt();
			if (a%2==0) {
				System.out.println(+a+ " is even number");
			}
			else {
				System.out.println(+a+" is odd number");
			}
		}
	}

}
