package DAY6;
import java.util.Scanner;
public class arrrr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[3][][];
		arr[0]=new int[4][];
		arr[1]=new int[2][];
		arr[2]=new int[3][];
		arr[0][0]=new int[2];
		arr[0][1]=new int[2];
		arr[0][2]=new int[2];
		arr[0][3]=new int[2];
		arr[1][0]=new int[1];
		arr[1][1]=new int[2];
		arr[2][0]=new int[2];
		arr[2][1]=new int[2];
		arr[2][2]=new int[3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=sc.nextInt();
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(+arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}
