import java.util.ArrayList;

public class stackCalculations {

	public static int getStackValue(ArrayList<ArrayList<Integer>> stack) {
		double valueSum = 0;
		double modifierProduct = 1;
		for (ArrayList<Integer> local : stack) {
			valueSum += local.get(0);
			modifierProduct *= local.get(1);
		}
		modifierProduct /= stack.get(0).get(1);
		return (int) (valueSum * modifierProduct);
	}
}
