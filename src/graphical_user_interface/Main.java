package graphical_user_interface;

import god.gameParams;
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
	
	public static void update() {
		//TODO: (BOM) get: time remained till end of game(in seconds raw), state of cannons, anchors and bridges
		//blue cargo amounts
		int blueCargoScore = 0;	//score from blue cargo
		int blueAnchorScore = 0;	//score from blue anchors raised
		int blueCannonScore = 0;	//score from blue cannons shot
		int blueBridgeScore = 0;	//score from blue bridge raised
		int blueTotal = blueCargoScore + blueAnchorScore + blueCannonScore + blueBridgeScore; //total blue score
		int blueTreasures = 0;	//amount treasures in blue cargo-hold
		int blueAlliCargos = 0;	//amount alliance-cargos in blue cargo-hold
		int blueCrates = 0;	//amount crates in blue cargo-hold
		int blueBoxes = 0;	//amount boxes in blue cargo-hold
		int blueBarrels = 0;	//amount barrels in blue cargo-hold
		int blueCannonsShot = 0;	//amount blue cannons shot
		int blueAnchorsRaised = 0;	//amount blue anchors raised
		boolean blueBridgeRaised = false; //blue bridge raised or not

		int redCargoScore = 0;	//score from red cargo
		int redAnchorScore = 0;	//score from red anchors raised
		int redCannonScore = 0;	//score from red cannons shot
		int redBridgeScore = 0;	//score from red bridge raised
		int redTotal = redCargoScore + redAnchorScore + redCannonScore + redBridgeScore; //total red score
		int redTreasures = 0;	//amount treasures in red cargo-hold
		int redAlliCargos = 0;	//amount alliance-cargos in red cargo-hold
		int redCrates = 0;	//amount crates in red cargo-hold
		int redBoxes = 0;	//amount boxes in red cargo-hold
		int redBarrels = 0;	//amount barrels in red cargo-hold
		int redCannonsShot = 0;	//amount red cannons shot
		int redAnchorsRaised = 0;	//amount red anchors raised
		boolean redBridgeRaised = false; //red bridge raised or not

		int timeTillEnd = 0;
		 DurGame.blueAlliCargoFirstDig.setImage(Main.getNum(blueAlliCargos, 0)); // alliCargo - allianceCargo
		 DurGame.blueAlliCargoSecDig.setImage(Main.getNum(blueAlliCargos, 1));
		
		 DurGame.blueTreasure.setImage(Main.getNum(blueTreasures, 0));
		
		 DurGame.blueCrate.setImage(Main.getNum(blueCrates, 0));
		
		 DurGame.blueBarrelFirstDig.setImage(Main.getNum(blueBarrels, 0));
		 DurGame.blueBarrelSecDig.setImage(Main.getNum(blueBarrels, 1));
		
		 DurGame.blueBoxFirstDig.setImage(Main.getNum(blueBoxes, 0));
		 DurGame.blueBoxSecDig.setImage(Main.getNum(blueBoxes, 1));
		
		 DurGame.blueScoreFirstDig.setImage(Main.getNum(blueTotal, 0));	
		 DurGame.blueScoreSecDig.setImage(Main.getNum(blueTotal, 1));	
		 DurGame.blueScoreThiDig.setImage(Main.getNum(blueTotal, 2));	
		 DurGame.blueScoreFourDig.setImage(Main.getNum(blueTotal, 3));	
		//end of blue cargo amounts
		
		//red cargo amounts
		 DurGame.redAlliCargoFirstDig.setImage(Main.getNum(redAlliCargos, 0)); // alliCargo - allianceCargo
		 DurGame.redAlliCargoSecDig.setImage(Main.getNum(redAlliCargos, 1));
		
		 DurGame.redTreasure.setImage(Main.getNum(redTreasures, 0));
		
		 DurGame.redCrate.setImage(Main.getNum(redCrates, 1));
		
		 DurGame.redBarrelFirstDig.setImage(Main.getNum(redBarrels, 0));
		 DurGame.redBarrelSecDig.setImage(Main.getNum(redBarrels, 1));
		
		 DurGame.redBoxFirstDig.setImage(Main.getNum(redBoxes, 0));
		 DurGame.redBoxSecDig.setImage(Main.getNum(redBoxes, 1));
		
		 DurGame.redScoreFirstDig.setImage(Main.getNum(redTotal, 3));	
		 DurGame.redScoreSecDig.setImage(Main.getNum(redTotal, 2));	
		 DurGame.redScoreThiDig.setImage(Main.getNum(redTotal, 1));
		 DurGame.redScoreFourDig.setImage(Main.getNum(redTotal, 0));	

		//end of red cargo amounts
			
		//time reMainied till and of game
		 DurGame.timeones.setImage(Main.getNum(timeTillEnd, 2));
		 DurGame.timeTens.setImage(Main.getNum(timeTillEnd, 1));
		 DurGame.timeMins.setImage(Main.getNum(timeTillEnd, 0));
		 DurGame.timeColon.setImage(IMGs.colon);
		//end of time reMainied till end of game
				
		//blue completion tasks
		 if(blueBridgeRaised == true) {
			 DurGame.blueBridge.setImage(IMGs.comBridge); 
		 } else {
			 DurGame.blueBridge.setImage(IMGs.incomBridge);
		 }
		 switch(blueAnchorsRaised) {
		 case 1:
			 DurGame.blueAnchor1.setImage(IMGs.comAnchor);
			 DurGame.blueAnchor2.setImage(IMGs.incomAnchor);
			 break;
		 case 2:
			 DurGame.blueAnchor1.setImage(IMGs.comAnchor);
			 DurGame.blueAnchor2.setImage(IMGs.comAnchor);
			 break;
		 default:
			 DurGame.blueAnchor1.setImage(IMGs.incomAnchor);
			 DurGame.blueAnchor2.setImage(IMGs.incomAnchor);		 
		 }
		 
		 switch(blueCannonsShot) {
		 case 1:
			 DurGame.blueCannon1.setImage(IMGs.comCannon);
			 DurGame.blueCannon2.setImage(IMGs.incomCannon);
			 break;
		 case 2:
			 DurGame.blueCannon1.setImage(IMGs.comCannon);
			 DurGame.blueCannon2.setImage(IMGs.comCannon);
			 break;
		 default:
			 DurGame.blueCannon1.setImage(IMGs.incomCannon);
			 DurGame.blueCannon2.setImage(IMGs.incomCannon);		 
		 }
		//end of blue completion tasks
		
		//red completion tasks
		 if(redBridgeRaised == true) {
			 DurGame.redBridge.setImage(IMGs.comBridge); 
		 } else {
			 DurGame.redBridge.setImage(IMGs.incomBridge);
		 }
		 switch(redAnchorsRaised) {
		 case 1:
			 DurGame.redAnchor1.setImage(IMGs.comAnchor);
			 DurGame.redAnchor2.setImage(IMGs.incomAnchor);
			 break;
		 case 2:
			 DurGame.redAnchor1.setImage(IMGs.comAnchor);
			 DurGame.redAnchor2.setImage(IMGs.comAnchor);
			 break;
		 default:
			 DurGame.redAnchor1.setImage(IMGs.incomAnchor);
			 DurGame.redAnchor2.setImage(IMGs.incomAnchor);		 
		 }
		 
		 switch(redCannonsShot) {
		 case 1:
			 DurGame.redCannon1.setImage(IMGs.comCannon);
			 DurGame.redCannon2.setImage(IMGs.incomCannon);
			 break;
		 case 2:
			 DurGame.redCannon1.setImage(IMGs.comCannon);
			 DurGame.redCannon2.setImage(IMGs.comCannon);
			 break;
		 default:
			 DurGame.redCannon1.setImage(IMGs.incomCannon);
			 DurGame.redCannon2.setImage(IMGs.incomCannon);		 
		 }
		//End of red completion tasks
	}
}