package god;

import java.util.HashMap;

public class gameParams {

	public static final int RED1 = 0, RED2 = 0, BLUE1 = 0, BLUE2 = 0;

	public static int REDCARGOPOINTS = 0, BLUECARGOPOINTS = 0,

			REDSTACKPOINTS = 0, BLUESTACKPOINTS = 0,

			REDANCHORPOINTS = 0, BLUEANCHORPOINTS = 0,

			REDCANNONPOINTS = 0, BLUECANNONPOINTS = 0,

			REDPENELTY = 0, BLUEPENELTY = 0,

			REDRP = 0, BLUERP = 0;
	public static HashMap<String, Integer> blueCargo = new HashMap<>();
	public static HashMap<String, Integer> redCargo = new HashMap<>();

	static {
		blueCargo.put("Treasure", 0);
		blueCargo.put("Crate", 0);
		blueCargo.put("Barrel", 0);
		blueCargo.put("Box", 0);

		redCargo.put("Treasure", 0);
		redCargo.put("Crate", 0);
		redCargo.put("Barrel", 0);
		redCargo.put("Box", 0);

	}

	public static int getRank(int teamnum) {
		return (compStats.ranks.indexOf(teamnum) + 1);
	}

}
