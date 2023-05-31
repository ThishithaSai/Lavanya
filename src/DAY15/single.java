package DAY15;
import java.util.Scanner;
class assign extends Thread {
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Student started writing ");
			System.out.println("Enter chapter number");
			int a=sc.nextInt();
			System.out.println("Student wrote assignment "+a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class print extends Thread{
	public void pri() {
		try {
		System.out.println("Printing started");
		for(int i=0;i<=3;i++) {
			System.out.println("CBIT");
			Thread.sleep(5000);
		}
		System.out.println("Printing ended");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class multiplication extends Thread{
	public void mul() {
		System.out.println("Multiplication started");
		int x=12;
		int y=18;
		try {
			System.out.println(x*y);
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Multiplication ended");
	}
}
public class single {
	public static void main(String[] args) {
		assign a=new assign();
		print p=new print();
		multiplication m=new multiplication();
		a.start();
		p.start();
		m.start();
	}
}