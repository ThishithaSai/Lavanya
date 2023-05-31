package DAY10;

public class PARAM{
	private String name;
	private String brand;
	private String color;
	private int a;
	private int b;
	private int c;
	public PARAM(String vehName,String vehBrand,String vehColor) {
		name=vehName;
		brand=vehBrand;
		color=vehColor;
	}
	public PARAM(int A,int B,int C) {
		a=A;
		b=B;
		c=C;
	}
	public String getname() {
		return name;
	}
	public String getbrand() {
		return brand;
	}
	public String getcolor() {
		return color;
	}
	public int geta() {
		return a;
	}
	public int getb() {
		return b;
	}
	public int getc() {
		return c;
	}
	public static void main(String[] args) {
		PARAM c=new PARAM("CAR","AUDI","BLACK");
		PARAM i=new PARAM(10,20,30);
		System.out.println("NAME:"+c.getname());
		System.out.println("BRAND:"+c.getbrand());
		System.out.println("COLOR:"+c.getcolor());
		System.out.println();
		System.out.println("a:"+i.geta());
		System.out.println("b:"+i.getb());
		System.out.println("c:"+i.getc());
	}
}
