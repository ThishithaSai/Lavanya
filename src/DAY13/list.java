package DAY13;
import java.util.LinkedList;
public class list {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		for(int a:l) {
			System.out.println(a);
		}
	}
}