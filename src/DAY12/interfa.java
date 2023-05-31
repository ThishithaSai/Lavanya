package DAY12;
interface hello{
	void print(); 
}
public class interfa implements hello{
	public void print() {
		System.out.println("HELLO");
	}
	public static void main(String[] args) {
		interfa f=new interfa();
		f.print();
	}
}