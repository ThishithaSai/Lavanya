package DAY2;
import java.util.Scanner;
public class leap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int y=sc.nextInt();
		if (y%4==0 && y%100!=0 || y%400==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
