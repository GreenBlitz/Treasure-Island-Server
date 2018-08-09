package graphical_user_interface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	Stage PS;
	public static int redCrateAmount;
	public static int redBoxAmount;
	public static int redBarrelAmount;
	public static int redTreasureAmount;
	public static int redAlliCargoAmount;
	public static int blueCrateAmount;
	public static int blueBoxAmount;
	public static int blueBarrelAmount;
	public static int blueTreasureAmount;
	public static int blueAlliCargoAmount;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		PS = primaryStage;
		PS.setFullScreen(true);
		PS.fullScreenProperty();
		/*
		 * incom - incomplete com - complete
		 */
		ImageView[] anchors = new ImageView[] { DurGame.blueAnchor1, DurGame.blueAnchor2, DurGame.redAnchor1,
				DurGame.redAnchor2 }; // anchors raised or not by both alliances -- incom - incomplete -- com -
										// completed
		ImageView[] bridges = new ImageView[] { DurGame.redBridge, DurGame.blueBridge }; // bridges raised or not by
																							// both alliances
		ImageView[] cannons = new ImageView[] { DurGame.blueCannon1, DurGame.blueCannon2, DurGame.redCannon1,
				DurGame.redCannon2 }; // cannons shot or not by both alliances
		ImageView[] blueCargos = new ImageView[] { DurGame.blueAlliCargoFirstDig, DurGame.blueAlliCargoSecDig,
				DurGame.blueTreasure, DurGame.blueBarrelFirstDig, DurGame.blueBarrelSecDig, DurGame.blueCrate,
				DurGame.blueBoxFirstDig, DurGame.blueBoxSecDig }; // cargo count of the blue alliance
		ImageView[] redCargos = new ImageView[] { DurGame.redAlliCargoFirstDig, DurGame.redAlliCargoSecDig,
				DurGame.redTreasure, DurGame.redCrate, DurGame.redBarrelFirstDig, DurGame.redBarrelSecDig,
				DurGame.redBoxFirstDig, DurGame.redBoxSecDig }; // cargo count of the red alliance
		ImageView[] time = new ImageView[] { DurGame.timeColon, DurGame.timeones, DurGame.timeTens, DurGame.timeMins };
		ImageView[] teams = new ImageView[] { DurGame.blueTeam1, DurGame.blueTeam2, DurGame.redTeam1,
				DurGame.redTeam2 };
		ImageView[] scores = new ImageView[] { DurGame.blueScoreFirstDig, DurGame.blueScoreSecDig,
				DurGame.blueScoreThiDig, DurGame.blueScoreFourDig, DurGame.redScoreFirstDig, DurGame.redScoreSecDig,
				DurGame.redScoreThiDig, DurGame.redScoreFourDig };
		ImageView[][] durgame = new ImageView[][] { anchors, bridges, cannons, blueCargos, redCargos, time, teams,
				scores };
		Pane durGame = new Pane(); // creates the pane(layer in the window itself) which is displayed during the
									// match
		// adding all IVs to durGame
		durGame.getChildren().add(DurGame.durGameBg);
		for (int i = 0; i < durgame.length; i++) {
			durGame.getChildren().addAll(durgame[i]);
		}
		// end of adding all IVs to durGame

		Pane endGameFinals = new Pane();
		// creates the pane(layer in the window itself) which is displayed at the end of
		// the finals match
		// adding all IVs to endGameFinals
		/* win/lose/tie */endGameFinals.getChildren().addAll(EndGameFinals.endGameBg, EndGameFinals.blueWinLoseTie,
				EndGameFinals.redWinLoseTie);
		/* Teams */ endGameFinals.getChildren().addAll(EndGameFinals.blueTeam1, EndGameFinals.blueTeam2,
				EndGameFinals.redTeam1, EndGameFinals.redTeam2);
		/* Red points */ endGameFinals.getChildren().addAll(EndGameFinals.redAnchorPointsFirstDig,
				EndGameFinals.redAnchorPointsSecDig, EndGameFinals.redCannonPointsFirstDig,
				EndGameFinals.redCannonPointsSecDig, EndGameFinals.redStackPointsFirstDig,
				EndGameFinals.redStackPointsSecDig, EndGameFinals.redStackPointsThiDig,
				EndGameFinals.redStackPointsFourDig, EndGameFinals.redPenaltyPointsFirstDig,
				EndGameFinals.redPenaltyPointsSecDig, EndGameFinals.redTotalPointsFirstDig,
				EndGameFinals.redTotalPointsSecDig, EndGameFinals.redTotalPointsThiDig,
				EndGameFinals.redTotalPointsFourDig, EndGameFinals.redCargoPointsFirstDig,
				EndGameFinals.redCargoPointsSecDig, EndGameFinals.redCargoPointsThiDig);
		/* Blue points */ endGameFinals.getChildren().addAll(EndGameFinals.blueAnchorPointsFirstDig,
				EndGameFinals.blueAnchorPointsSecDig, EndGameFinals.blueCannonPointsFirstDig,
				EndGameFinals.blueCannonPointsSecDig, EndGameFinals.blueStackPointsFirstDig,
				EndGameFinals.blueStackPointsSecDig, EndGameFinals.blueStackPointsThiDig,
				EndGameFinals.blueStackPointsFourDig, EndGameFinals.bluePenaltyPointsFirstDig,
				EndGameFinals.bluePenaltyPointsSecDig, EndGameFinals.blueTotalPointsFirstDig,
				EndGameFinals.blueTotalPointsSecDig, EndGameFinals.blueTotalPointsThiDig,
				EndGameFinals.blueTotalPointsFourDig, EndGameFinals.blueCargoPointsFirstDig,
				EndGameFinals.blueCargoPointsSecDig, EndGameFinals.blueCargoPointsThiDig);
		// adding all IVs to endGameFinals

		Pane endGameQuals = new Pane();
		// creates the pane(layer in the window itself) which is displayed at the end of
		// a qualification match
		// Adding all IVs to endGameQuals
		/* Background */
		endGameQuals.getChildren().add(EndGameQuals.endGameBg);
		/* RPs */ endGameQuals.getChildren().addAll(EndGameQuals.blueRPCannons, EndGameQuals.blueRPWinLoseTie,
				EndGameQuals.blueRPAuto, EndGameQuals.redRPCannons, EndGameQuals.redRPAuto,
				EndGameQuals.redRPWinLoseTie);
		/* Teams&ranks */ endGameQuals.getChildren().addAll(EndGameQuals.blueTeam1, EndGameQuals.blueTeam2,
				EndGameQuals.redTeam1, EndGameQuals.redTeam2, EndGameQuals.redRank1, EndGameQuals.redRank2,
				EndGameQuals.blueRank1, EndGameQuals.blueRank2, EndGameQuals.blueRPTotal, EndGameQuals.redRPTotal);
		/* Red points */ endGameQuals.getChildren().addAll(EndGameQuals.redAnchorPointsFirstDig,
				EndGameQuals.redAnchorPointsSecDig, EndGameQuals.redCannonPointsFirstDig,
				EndGameQuals.redCannonPointsSecDig, EndGameQuals.redStackPointsFirstDig,
				EndGameQuals.redStackPointsSecDig, EndGameQuals.redStackPointsThiDig,
				EndGameQuals.redStackPointsFourDig, EndGameQuals.redPenaltyPointsFirstDig,
				EndGameQuals.redPenaltyPointsSecDig, EndGameQuals.redTotalPointsFirstDig,
				EndGameQuals.redTotalPointsSecDig, EndGameQuals.redTotalPointsThiDig,
				EndGameQuals.redTotalPointsFourDig, EndGameQuals.redCargoPointsFirstDig,
				EndGameQuals.redCargoPointsSecDig, EndGameQuals.redCargoPointsThiDig);
		/* Blue points */ endGameQuals.getChildren().addAll(EndGameQuals.blueAnchorPointsFirstDig,
				EndGameQuals.blueAnchorPointsSecDig, EndGameQuals.blueCannonPointsFirstDig,
				EndGameQuals.blueCannonPointsSecDig, EndGameQuals.blueStackPointsFirstDig,
				EndGameQuals.blueStackPointsSecDig, EndGameQuals.blueStackPointsThiDig,
				EndGameQuals.blueStackPointsFourDig, EndGameQuals.bluePenaltyPointsFirstDig,
				EndGameQuals.bluePenaltyPointsSecDig, EndGameQuals.blueTotalPointsFirstDig,
				EndGameQuals.blueTotalPointsSecDig, EndGameQuals.blueTotalPointsThiDig,
				EndGameQuals.blueTotalPointsFourDig, EndGameQuals.blueCargoPointsFirstDig,
				EndGameQuals.blueCargoPointsSecDig, EndGameQuals.blueCargoPointsThiDig);
		// End of adding all IVs to endGameQuals
		Scene EndGameQuals = new Scene(endGameQuals, 1360, 768);
		Scene EndGameFinals = new Scene(endGameFinals, 1360, 768);
		Scene DurGame = new Scene(durGame, 1360, 768); // creates the scene(window itself)
		PS.setScene(DurGame);
		PS.show();

	}

	public static Image getNum(int num, int index) {
		String string = Integer.toString(num);
		char charArray[] = string.toCharArray();
		Image digit;
		if (index >= charArray.length) {
			index = charArray.length - 1;
		}
		switch (charArray[index]) {
		case '1':
			digit = IMGs.one;
			break;
		case '2':
			digit = IMGs.two;
			break;
		case '3':
			digit = IMGs.three;
			break;
		case '4':
			digit = IMGs.four;
			break;
		case '5':
			digit = IMGs.five;
			break;
		case '6':
			digit = IMGs.six;
			break;
		case '7':
			digit = IMGs.seven;
			break;
		case '8':
			digit = IMGs.eight;
			break;
		case '9':
			digit = IMGs.nine;
			break;
		case '0':
			digit = IMGs.zero;
			break;
		default:
			digit = IMGs.nothing;
			break;
		}
		return digit;
	} 
}