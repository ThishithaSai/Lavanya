package DAY7;

public class sljfl {
	public static void main(String[] args) {
		String s1="Sai";
		String s2="Thishitha";
		String s3=s1+s2;
		String s4="Sai"+"Thishitha";
		if(s3==s4)
			System.out.println("references are equal");
		else
			System.out.println("references are unequal");
		if(s3.equals(s4))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are unequal");
		}

}
