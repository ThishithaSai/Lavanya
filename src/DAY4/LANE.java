package DAY4;
import java.util.Scanner;
public class LANE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float[] s=new float[n];
		for(int i=0;i<n;i++)
			s[i]=sc.nextFloat();
		int d=sc.nextInt();
		int t=sc.nextInt();
		int a=d/t;
		int count=0;
		for(int i=0;i<n;i++) {
			if(s[i]>=a) {
				System.out.println(+(i+1));
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("-1");
	}

}
