package DAY13;
import java.util.ArrayList;
public class ARRAYLIST {
	public static void main(String[] args) {
		ArrayList AL=new ArrayList();
		AL.add(10);
		AL.add(20.2);
		AL.add("Thishitha");
		AL.add(3, 12);
		System.out.println(AL.toString());
		AL.remove(0);
		System.out.println(AL.toString());
		System.out.println(AL.get(2));
		AL.set(2, 12.18);
		System.out.println(AL.toString());
	}
}
