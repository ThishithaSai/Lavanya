package DAY13;
import java.util.ArrayList;
import java.util.ListIterator;
public class thi {
	public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("arpita");
	a1.add("tejashwini");
	a1.add("vinod");
	a1.add("kiran");
	a1.add("rajeshwzri");
	ListIterator l=a1.listIterator();
	while(l.hasNext()) {
		if(l.next()=="vinod") {
			l.remove();
		}
	}
	for(String a:a1) {
		System.out.println(a);
	}
}
}
