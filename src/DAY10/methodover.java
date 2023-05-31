package DAY10;
class X{
   public void add(int i,int j) {
	   System.out.println(i+j);
}
}
class Y extends X{
	public void mul(int a,int b) {
		System.out.println(a*b);
	}
}
	public class methodover extends Y{
		public static void main(String[] args) {
			methodover m=new methodover();
			m.add(10,20);
			m.mul(10,20);
		}

}
