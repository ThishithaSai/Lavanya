package DAY2;
import java.util.Scanner;
public class ifelse {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Age:");
			int a=sc.nextInt();
			if (a>=18){
				System.out.println("Eligible to vote");
			}
			else{
				System.out.println("Not eligible to vote");
			}
		}
	}
}