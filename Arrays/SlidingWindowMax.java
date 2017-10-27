import java.util.ArrayList;
public class SlidingWindowMax {
	public static void main(String args[]) {
		int[] input = { 1, 2, 3, 1, 2, 4, 2, 5, 2, 6, 3, 6 };
		int k = 3;
		System.out.println(getTheSlidingWindowMax(input, k));
	}

	public static ArrayList<Integer> getTheSlidingWindowMax(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		int max = input[0];
		for (int i = 1; i <= input.length - 1; i++) {
			if (input[i] >= max) {
				max = input[i];
			}
			if (i >= k - 1) {
				result.add(max);
			}
		}
		return result;

	}

}