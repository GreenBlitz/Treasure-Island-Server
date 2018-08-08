package graphical_user_interface;

public class EventHandler {
	//East is red side, West is bluee side. North is the treasure island, South are alliance bases.
	public static void redAct(RedEvent e) throws InterruptedException {
		switch (e) {
		case EASTERN_ANCHOR_RAISED:
			DurGame.redAnchor1.setImage(IMGs.comAnchor);
			break;
		case WESTERN_ANCHOR_RAISED:
			DurGame.redAnchor2.setImage(IMGs.comAnchor);
			break;
		case SOUTHERN_CANNON_SHOT:
			DurGame.redCannon1.setImage(IMGs.comCannon);
			break;
		case NORTHERN_CANNON_SHOT:
			DurGame.redCannon2.setImage(IMGs.comCannon);
		case BRIDGE_RAISED:
			DurGame.redBridge.setImage(IMGs.comBridge);
		case CRATE_LOADED:
			Maini.redCrateAmount += 1;
			break;
		case BOX_LOADED:
			Maini.redBoxAmount += 1;
			break;
		case BARREL_LOADED:
			Maini.redBarrelAmount += 1;
			break;
		case TREASURE_LOADED:
			Maini.redTreasureAmount += 1;
			break;
		case ALLICARGO_LOADED:
			Maini.redAlliCargoAmount += 1;
			break;
		case CRATE_UNLOADED:
			Maini.redCrateAmount -= 1;
			break;

		case BOX_UNLOADED:
			Maini.redBoxAmount -= 1;
			break;

		case TREASURE_UNLOADED:
			Maini.redTreasureAmount -= 1;
			break;

		case BARREL_UNLOADED:
			Maini.redBarrelAmount -= 1;
			break;
		case ALLICARGO_UNLOADED:
			Maini.redAlliCargoAmount -= 1;
			break;
		default:
			while (true) {
				DurGame.memeBg.setImage(IMGs.bazingaWithText);
				Thread.sleep(1500);
				DurGame.memeBg.setImage(IMGs.bazingaWithoutText);
				Thread.sleep(1500);
			}
		}
	}

	public static void blueeAct(BlueEvent e) throws InterruptedException {
		switch (e) {
		case EASTERN_ANCHOR_RAISED:
			DurGame.blueAnchor1.setImage(IMGs.comAnchor);
			break;
		case WESTERN_ANCHOR_RAISED:
			DurGame.blueAnchor2.setImage(IMGs.comAnchor);
			break;
		case SOUTHERN_CANNON_SHOT:
			DurGame.blueCannon1.setImage(IMGs.comCannon);
			break;
		case NORTHERN_CANNON_SHOT:
			DurGame.blueCannon2.setImage(IMGs.comCannon);
		case BRIDGE_RAISED:
			DurGame.blueBridge.setImage(IMGs.comBridge);
		case CRATE_LOADED:
			Maini.blueCrateAmount += 1;
			break;
		case BOX_LOADED:
			Maini.blueBoxAmount += 1;
			break;
		case BARREL_LOADED:
			Maini.blueBarrelAmount += 1;
			break;
		case TREASURE_LOADED:
			Maini.blueTreasureAmount += 1;
			break;
		case ALLICARGO_LOADED:
			Maini.blueAlliCargoAmount += 1;
			break;
		case CRATE_UNLOADED:
			Maini.blueCrateAmount -= 1;
			break;
		case BOX_UNLOADED:
			Maini.blueBoxAmount -= 1;
			break;
		case TREASURE_UNLOADED:
			Maini.blueTreasureAmount -= 1;
			break;
		case BARREL_UNLOADED:
			Maini.blueBarrelAmount -= 1;
			break;
		case ALLICARGO_UNLOADED:
			Maini.blueAlliCargoAmount -= 1;
			break;
		default:
			while (true) {
				DurGame.memeBg.setImage(IMGs.bazingaWithText);
				Thread.sleep(1500);
				DurGame.memeBg.setImage(IMGs.bazingaWithoutText);
				Thread.sleep(1500);
			}
		}
	}

}
