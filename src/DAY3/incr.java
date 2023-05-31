package DAY3;

public class incr {
public static void main(String[] args) {
	double arr[]={10,20,30,40};
	double arr1[]=new double[4];
	for(int i=0;i<arr.length;i++) {
		arr1[i]=arr[i]*(1.15);
	}
	for(int i=arr1.length-1;i>=0;i--)
		System.out.print(arr1[i]+" ");
}
}
