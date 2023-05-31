package DAY12;
class stat{
	int rollno;
	String name;
	static String college="CBIT";
	stat(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college );
	}
	public static void main(String[] args) {
		stat s1=new stat(512,"Thishitha");
		stat s2=new stat(518,"Vardhan");
		s1.display();
		s2.display();
	}
}
