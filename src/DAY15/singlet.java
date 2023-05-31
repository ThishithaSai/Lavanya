package DAY15;
import java.util.Scanner;
class thishi extends Thread{
	int x=10,y=5;
	public void end() {
		System.out.println("assignment ended");
	}
	public void start() {
		System.out.println("assignment started");
	}
	public void mul(){
		System.out.println("Multiplication started");
		System.out.println(x*y);
		System.out.println("Multiplication ended");
	}
	public void div() {
		System.out.println("Division started");
		System.out.println(x/y);
		System.out.println("Division ended");
	}
	public void add() {
		System.out.println("Addition started");
		System.out.println(x+y);
		System.out.println("Addition ended");
	}
}
public class singlet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		thishi t=new thishi();
		t.start();
		System.out.println("Enter chapter number");
		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			System.out.println("CBIT");
		}
		t.mul();
		t.div();
		t.add();
		t.end();
	}
}
