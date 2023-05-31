package DAY7;

public class stri {
	public static void main(String[] args) {
		String s1=new String("Thishitha");
		String s2=new String("Thishitha");
		if(s1==s2)
			System.out.println("References are equal");
		else
			System.out.println("References are unequal");
		if(s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are unequal");
	}

}
