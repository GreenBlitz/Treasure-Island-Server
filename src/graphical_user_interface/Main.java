package graphical_user_interface;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	// Numbers

	public static int blueBoxAmount;
	public static int blueCrateAmount;
	public static int blueBarrelAmount;
	public static int blueTreasureAmount;
	public static int blueAlliCargoAmount;
	public static int redBoxAmount;
	public static int redCrateAmount;
	public static int redBarrelAmount;
	public static int redTreasureAmount;
	public static int redAlliCargoAmount;
	static int time = 4;
	Stage PS;
	
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
		ImageView[] anchors = {DurGame.blueAnchor1, DurGame.blueAnchor2, DurGame.redAnchor1, DurGame.redAnchor2}; // anchors raised or not by both alliances -- incom - incomplete -- com - completed
		ImageView[] bridges = {DurGame.redBridge, DurGame.blueBridge}; // bridges raised or not by both alliances
		ImageView[] cannons = {DurGame.blueCannon1, DurGame.blueCannon2, DurGame.redCannon1, DurGame.redCannon2}; // cannons shot or not by both alliances
		ImageView[] blueCargos = {DurGame.blueAlliCargoFirstDig, DurGame.blueAlliCargoSecDig, DurGame.blueTreasure, DurGame.blueBarrelFirstDig, DurGame.blueBarrelSecDig, DurGame.blueCrate, DurGame.blueBoxFirstDig, DurGame.blueBoxSecDig};	// cargo count of the blue alliance
		ImageView[] redCargos = {DurGame.redAlliCargoFirstDig, DurGame.redAlliCargoSecDig, DurGame.redTreasure, DurGame.redCrate, DurGame.redBarrelFirstDig, DurGame.redBarrelSecDig, DurGame.redBoxFirstDig, DurGame.redBoxSecDig};	// cargo count of the red alliance
		ImageView[] time = {DurGame.timeColon, DurGame.timeones, DurGame.timeTens, DurGame.timeMins};
		ImageView[] teams = { DurGame.blueTeam1, DurGame.blueTeam2, DurGame.redTeam1, DurGame.redTeam2 };
		ImageView[] scores = {DurGame.blueScoreFirstDig, DurGame.blueScoreSecDig, DurGame.blueScoreThiDig, DurGame.redScoreFirstDig, DurGame.redScoreSecDig, DurGame.redScoreThiDig};
		ImageView[][] durgame = {anchors, bridges, cannons, blueCargos, redCargos, time, teams, scores};
		Pane durGame = new Pane();	//creates the pane(layer in the window itself) which is displayed during the match
			//adding all IVs to durGame
			durGame.getChildren().add(DurGame.durGameBg);
			for(int i = 0; i < durgame.length; i++) {
				durGame.getChildren().addAll(durgame[i]);
			}
			//end of adding all IVs to durGame
		
		Pane endGameFinals = new Pane();	//creates the pane(layer in the window itself) which is displayed at the end of the finals match
			//adding all IVs to endGameFinals
/*win/lose/tie*/endGameFinals.getChildren().addAll(EndGameFinals.endGameBg, EndGameFinals.blueWinLoseTie, EndGameFinals.redWinLoseTie);
/*Teams*/		endGameFinals.getChildren().addAll(EndGameFinals.blueTeam1, EndGameFinals.blueTeam2, EndGameFinals.redTeam1, EndGameFinals.redTeam2);
/*Red points*/	endGameFinals.getChildren().addAll(EndGameFinals.redAnchorPointsFirstDig, EndGameFinals.redAnchorPointsSecDig, EndGameFinals.redCannonPointsFirstDig, EndGameFinals.redCannonPointsSecDig, EndGameFinals.redStackPointsFirstDig, EndGameFinals.redStackPointsSecDig, EndGameFinals.redStackPointsThiDig, EndGameFinals.redPenaltyPointsFirstDig, EndGameFinals.redPenaltyPointsSecDig, EndGameFinals.redTotalPointsFirstDig, EndGameFinals.redTotalPointsSecDig, EndGameFinals.redTotalPointsThiDig, EndGameFinals.redCargoPointsFirstDig, EndGameFinals.redCargoPointsSecDig, EndGameFinals.redCargoPointsThiDig);
/*Blue points*/	endGameFinals.getChildren().addAll(EndGameFinals.blueAnchorPointsFirstDig, EndGameFinals.blueAnchorPointsSecDig, EndGameFinals.blueCannonPointsFirstDig, EndGameFinals.blueCannonPointsSecDig, EndGameFinals.blueStackPointsFirstDig, EndGameFinals.blueStackPointsSecDig, EndGameFinals.blueStackPointsThiDig, EndGameFinals.bluePenaltyPointsFirstDig, EndGameFinals.bluePenaltyPointsSecDig, EndGameFinals.blueTotalPointsFirstDig, EndGameFinals.blueTotalPointsSecDig, EndGameFinals.blueTotalPointsThiDig, EndGameFinals.blueCargoPointsFirstDig, EndGameFinals.blueCargoPointsSecDig, EndGameFinals.blueCargoPointsThiDig);
			//adding all IVs to endGameFinals
									
		Pane endGameQuals = new Pane();		//creates the pane(layer in the window itself) which is displayed at the end of a qualification match
			//Adding all IVs to endGameQuals
/*RPs*/			endGameQuals.getChildren().addAll(EndGameQuals.endGameBg, EndGameQuals.blueRPCannons, EndGameQuals.blueRPWinLoseTie, EndGameQuals.blueRPAuto, EndGameQuals.redRPCannons, EndGameQuals.redRPAuto, EndGameQuals.redRPWinLoseTie);
/*Teams&ranks*/ endGameQuals.getChildren().addAll(EndGameQuals.blueTeam1, EndGameQuals.blueTeam2, EndGameQuals.redTeam1, EndGameQuals.redTeam2, EndGameQuals.redRank1, EndGameQuals.redRank2, EndGameQuals.blueRank1, EndGameQuals.blueRank2);
/*Red points*/	endGameQuals.getChildren().addAll(EndGameQuals.redAnchorPointsFirstDig, EndGameQuals.redAnchorPointsSecDig, EndGameQuals.redCannonPointsFirstDig, EndGameQuals.redCannonPointsSecDig, EndGameQuals.redStackPointsFirstDig, EndGameQuals.redStackPointsSecDig, EndGameQuals.redStackPointsThiDig, EndGameQuals.redPenaltyPointsFirstDig, EndGameQuals.redPenaltyPointsSecDig, EndGameQuals.redTotalPointsFirstDig, EndGameQuals.redTotalPointsSecDig, EndGameQuals.redTotalPointsThiDig, EndGameQuals.redCargoPointsFirstDig, EndGameQuals.redCargoPointsSecDig, EndGameQuals.redCargoPointsThiDig);
/*Blue points*/ endGameQuals.getChildren().addAll(EndGameQuals.blueAnchorPointsFirstDig, EndGameQuals.blueAnchorPointsSecDig, EndGameQuals.blueCannonPointsFirstDig, EndGameQuals.blueCannonPointsSecDig, EndGameQuals.blueStackPointsFirstDig, EndGameQuals.blueStackPointsSecDig, EndGameQuals.blueStackPointsThiDig, EndGameQuals.bluePenaltyPointsFirstDig, EndGameQuals.bluePenaltyPointsSecDig, EndGameQuals.blueTotalPointsFirstDig, EndGameQuals.blueTotalPointsSecDig, EndGameQuals.blueTotalPointsThiDig, EndGameQuals.blueCargoPointsFirstDig, EndGameQuals.blueCargoPointsSecDig, EndGameQuals.blueCargoPointsThiDig);
			//End of adding all IVs to endGameQuals	
		
		Scene EndGameQuals = new Scene(endGameQuals, 1360, 768);
		Scene EndGameFinals = new Scene(endGameFinals, 1360, 768);
		Scene DurGame = new Scene(durGame, 1360, 768);	//creates the scene(window itself)
		PS.setScene(EndGameFinals);
		PS.show();
	}

	public static Image getNum(int num, int index) {
		Image dividedImgs[] = new Image[3]; // hundreds' index - 0 tens' index - 1 IMGs.ones' index - 2
		int divided[] = new int[3];
		int counter;

		if (num > 99) {
			counter = 3;
		} else if (num > 9) {
			counter = 2;
		} else
			counter = 1;
		for (int i = 0; i <= counter; i++)
			divided[i] = (int) ((num - (num % (Math.pow(10, i + 1)))) / Math.pow(10, i + 1));

		for (int j = 0; j <= counter; j++) {
			switch (divided[j]) {
			case 1:
				dividedImgs[j] = IMGs.one;
			case 2:
				dividedImgs[j] = IMGs.two;
			case 3:
				dividedImgs[j] = IMGs.three;
			case 4:
				dividedImgs[j] = IMGs.four;
			case 5:
				dividedImgs[j] = IMGs.five;
			case 6:
				dividedImgs[j] = IMGs.six;
			case 7:
				dividedImgs[j] = IMGs.seven;
			case 8:
				dividedImgs[j] = IMGs.eight;
			case 9:
				dividedImgs[j] = IMGs.nine;
			case 0:
				dividedImgs[j] = IMGs.zero;
			}
		}
		return dividedImgs[index];
	}
}