package server;

import java.util.ArrayList;

import org.json.JSONException;

public class CalcsAndStuff {

	public static int calcStack(ArrayList<Integer> stack) { // Indexes: 0 - AllianceCargo  1 - Barrel  2 - Box  3 - Crate  4 - Treasure
		double valueSum = 0;
		double modifierProduct = 1;
		for (int local = 0; local < (stack.size() - 1); local++) {
			switch (stack.get(local)) {
			case 0:
				valueSum += 4;
				modifierProduct *= 1.6;
				if (local == 0)
					modifierProduct /= 1.6;
				break;
			case 1:
				valueSum += 6;
				modifierProduct *= 1.4;
				if (local == 0)
					modifierProduct /= 1.4;
				break;
			case 2:
				valueSum += 8;
				modifierProduct *= 1.8;
				if (local == 0)
					modifierProduct /= 1.8;
				break;
			case 3:
				valueSum += 10;
				modifierProduct *= 2;
				if (local == 0)
					modifierProduct /= 2;
				break;
			case 4:
				System.out.println("Treasure in the middle of the stack?, hell no!!!");
				break;
			}

		}
		if (stack.get(stack.size() - 1) == 4) {
			modifierProduct *= 2.5;
			return (int) (valueSum * modifierProduct) + 20;
		} else {
			switch (stack.get(stack.size() - 1)) {
			case 0:
				valueSum += 4;
				modifierProduct *= 1.6;
				break;
			case 1:
				valueSum += 6;
				modifierProduct *= 1.4;
				break;
			case 2:
				valueSum += 8;
				modifierProduct *= 1.8;
				break;
			case 3:
				valueSum += 10;
				modifierProduct *= 2;
				break;
			}
			return (int) (valueSum * modifierProduct);
		}
	}

	public static int SumScore(AppServer as) throws JSONException  {
		ArrayList<ArrayList<Integer>> allStacks = as.getPiles();
		int sum = 0;
		for(ArrayList<Integer> curStack : allStacks) {
			sum += calcStack(curStack);
		}
		sum += 0;//TODO get anchor state from nxt field brick 
		sum += as.getCannon() * 10;
		sum -= as.getPenalties() * 5;
		sum -= as.getFouls() * 20;
		return sum;
	}
}