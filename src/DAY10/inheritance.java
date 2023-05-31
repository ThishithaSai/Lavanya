package DAY10;
class A{
	void msg() {
		System.out.println("Hello");
	}
}
class B extends A{
	void reply() {
		System.out.println("Hi");
	}
}
class C extends B{
	void forward() {
		System.out.println("Forwaded");
	}
}
public class inheritance extends C {
	public static void main(String[] args) {
		inheritance h=new inheritance();
		h.msg();
		h.reply();
		h.forward();
	}
}
