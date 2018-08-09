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
			Main.redCrateAmount += 1;
			break;
		case BOX_LOADED:
			Main.redBoxAmount += 1;
			break;
		case BARREL_LOADED:
			Main.redBarrelAmount += 1;
			break;
		case TREASURE_LOADED:
			Main.redTreasureAmount += 1;
			break;
		case ALLICARGO_LOADED:
			Main.redAlliCargoAmount += 1;
			break;
		case CRATE_UNLOADED:
			Main.redCrateAmount -= 1;
			break;

		case BOX_UNLOADED:
			Main.redBoxAmount -= 1;
			break;

		case TREASURE_UNLOADED:
			Main.redTreasureAmount -= 1;
			break;

		case BARREL_UNLOADED:
			Main.redBarrelAmount -= 1;
			break;
		case ALLICARGO_UNLOADED:
			Main.redAlliCargoAmount -= 1;
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
			Main.blueCrateAmount += 1;
			break;
		case BOX_LOADED:
			Main.blueBoxAmount += 1;
			break;
		case BARREL_LOADED:
			Main.blueBarrelAmount += 1;
			break;
		case TREASURE_LOADED:
			Main.blueTreasureAmount += 1;
			break;
		case ALLICARGO_LOADED:
			Main.blueAlliCargoAmount += 1;
			break;
		case CRATE_UNLOADED:
			Main.blueCrateAmount -= 1;
			break;
		case BOX_UNLOADED:
			Main.blueBoxAmount -= 1;
			break;
		case TREASURE_UNLOADED:
			Main.blueTreasureAmount -= 1;
			break;
		case BARREL_UNLOADED:
			Main.blueBarrelAmount -= 1;
			break;
		case ALLICARGO_UNLOADED:
			Main.blueAlliCargoAmount -= 1;
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
