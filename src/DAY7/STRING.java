package DAY7;

public class STRING {
	public static void main(String[] args) {
		String s="CBIT";
		String s1="CBIT";
		if(s==s1)
			System.out.println("References are Equal");
		else
			System.out.println("References are Unequal");
		if(s.equals(s1))
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are Unequal");
	}

}
