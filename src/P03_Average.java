import java.util.Arrays;

public class P03_Average {

	public static void main(String[] args) {
		int[] arr = {7, 5, 34, 66, 18, 82, 74, 50, 36, 75};
		double ans = 0;
		for(int num : arr) {
			ans += num;
		}
		ans /= arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("Average: " + ans);

	}

}
