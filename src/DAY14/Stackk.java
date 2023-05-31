package DAY14;
import java.util.*;
public class Stackk {
	public static void main(String[] args) {
		PriorityQueue<Integer> d= new PriorityQueue<Integer>();
		d.add(10);
		d.add(20);
		d.offer(30);
		d.offer(40);
		System.out.println(d);
		d.remove(10);
		System.out.println(d);
	 }
}
