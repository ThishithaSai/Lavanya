import java.util.*;
public class stackk {
	public static void main(String[] args) {
		ArrayDeque<Integer> d= new ArrayDeque<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.offerFirst(30);
		d.offerLast(40);
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
	 }
}
