import java.util.Arrays;

public class ArraySort_65 {
	public static void main(String[] args) {
		int[] arr = { 1789, 2035, 1899, 1456, 2013 };
		int sum = 0;
        for (int num : arr) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.print("\n");
        int avg = sum / arr.length;
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + avg);
	}
}
