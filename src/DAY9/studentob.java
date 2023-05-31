package DAY9;

public class studentob {
	private String name;
	private int age;
	private String department;
	public studentob(String StudentName,int StudentAge,String StudentDept) {
		name=StudentName;
		age=StudentAge;
		department=StudentDept;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return department;
	}
	
	public static void main(String[] args) {
		studentob student1=new studentob("Thishitha",20,"CSE");
		studentob student2=new studentob("Sai",15,"ECE");
		System.out.println("Student 1:");
		System.out.println("Name:"+student1.getName());
		System.out.println("Age:"+student1.getAge());
		System.out.println("Department:"+student1.getDept());
		System.out.println();
		System.out.println("Student 2:");
		System.out.println("Name:"+student2.getName());
		System.out.println("Age:"+student2.getAge());
		System.out.println("Department:"+student2.getDept());
	}

}
