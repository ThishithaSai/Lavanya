package DAY3;
import java.util.Arrays;
import java.lang.reflect.*;
public class refle {
public static void main(String[] args) {
	int array_size=6;
	int[] int_array=(int[])Array.newInstance(int.class,array_size);
	System.out.println(Arrays.toString(int_array));
	Array.set(int_array,3,4);
	System.out.println(Arrays.toString(int_array));
}
}
