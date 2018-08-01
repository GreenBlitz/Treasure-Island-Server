

import java.net.ServerSocket;
import java.util.ArrayList;

import org.json.JSONException;

public class CalcsAndStuff {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(0);
		a.add(4);
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(1);
		ArrayList<Integer> c = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(0);
		ArrayList<Integer> d = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(4);
		ArrayList<ArrayList<Integer>> alali = new ArrayList<ArrayList<Integer>>();
		alali.add(a);
		alali.add(b);
		alali.add(c);
		alali.add(d);
		System.out.println(getFinalScore(alali));
	}

	public static int calcStack(ArrayList<Integer> stack) { // Indexes: 0 - AllianceCargo  1 - Barrel  2 - Box  3 - Crate  4 - Treasure
		double valueSum = 0;
		double modifierProduct = 1;
		for (int local = 0; local < (stack.size()); local++) {
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
				modifierProduct *= 2.5;
				return (int) (valueSum * modifierProduct) + 20;
			}
		}
		return (int) (valueSum * modifierProduct);
	}

	public static int getFinalScore(ArrayList<ArrayList<Integer>> alali)  {
		ArrayList<ArrayList<Integer>> allStacks = alali;
		int sum = 0;
		for(int i = 0; i< alali.size(); i++) {
			sum += calcStack(alali.get(0));
		}
		sum += 10/*as.getAnchor() * 5*/;//TODO get anchor state from nxt field brick 
		sum += 20;
		sum -= 20;
		sum -= 40;
		return sum;
	}
}