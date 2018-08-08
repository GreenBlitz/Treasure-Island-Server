package graphical_user_interface;
import god.gameParams;
import javafx.scene.image.ImageView;

public class DurGame {
	//bluee cargo amounts
	public static ImageView blueAlliCargoFirstDig = ImageFactory.createIV(810, 330, 12, 20, Maini.getNum(gameParams.blueCargo.values().stream().mapToInt(x->x).sum(), 0)); // alliCargo - allianceCargo
	public static ImageView blueAlliCargoSecDig = ImageFactory.createIV(825, 330, 12, 20, Maini.getNum(gameParams.blueCargo.values().stream().mapToInt(x->x).sum(), 1));
	
	public static ImageView blueTreasure = ImageFactory.createIV(985, 425, 12, 20, Maini.getNum(gameParams.blueCargo.get("Treasure"), 0));
	
	public static ImageView blueCrate = ImageFactory.createIV(810, 425, 12, 20, Maini.getNum(gameParams.blueCargo.get("Crate"), 1));
	
	public static ImageView blueBarrelFirstDig = ImageFactory.createIV(985, 330, 12, 20, Maini.getNum(gameParams.blueCargo.get("Barrel"), 0));
	public static ImageView blueBarrelSecDig = ImageFactory.createIV(1000, 330, 12, 20, Maini.getNum(gameParams.blueCargo.get("Barrel"), 1));
	
	public static ImageView blueBoxFirstDig = ImageFactory.createIV(1155, 330, 12, 20, Maini.getNum(gameParams.blueCargo.get("Box"), 0));
	public static ImageView blueBoxSecDig = ImageFactory.createIV(1170, 330, 12, 20, Maini.getNum(gameParams.blueCargo.get("Box"), 1));
	
	public static ImageView blueScoreFirstDig = ImageFactory.createIV(970, 110, 38, 63, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));	
	public static ImageView blueScoreSecDig = ImageFactory.createIV(930, 110, 38, 63, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));	
	public static ImageView blueScoreThiDig = ImageFactory.createIV(890, 110, 38, 63, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));	
	public static ImageView blueScoreFourDig = ImageFactory.createIV(850, 110, 38, 63, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));	
	//end of blue cargo amounts
	
	//red cargo amounts
	public static ImageView redAlliCargoFirstDig = ImageFactory.createIV(210, 330, 12, 20, Maini.getNum(gameParams.redCargo.values().stream().mapToInt(x->x).sum(),0)); // alliCargo - allianceCargo
	public static ImageView redAlliCargoSecDig = ImageFactory.createIV(225, 330, 12, 20, Maini.getNum(gameParams.redCargo.values().stream().mapToInt(x->x).sum(), 1));
	
	public static ImageView redTreasure = ImageFactory.createIV(385, 425, 12, 20, Maini.getNum(gameParams.redCargo.get("Treasure"), 0));
	
	public static ImageView redCrate = ImageFactory.createIV(210, 425, 12, 20, Maini.getNum(gameParams.redCargo.get("Crate"), 1));
	
	public static ImageView redBarrelFirstDig = ImageFactory.createIV(385, 330, 12, 20, Maini.getNum(gameParams.redCargo.get("Barrel"), 0));
	public static ImageView redBarrelSecDig = ImageFactory.createIV(400, 330, 12, 20, Maini.getNum(gameParams.redCargo.get("Barrel"), 1));
	
	public static ImageView redBoxFirstDig = ImageFactory.createIV(560, 330, 12, 20, Maini.getNum(gameParams.redCargo.get("Box"), 0));
	public static ImageView redBoxSecDig = ImageFactory.createIV(575, 330, 12, 20, Maini.getNum(gameParams.redCargo.get("Box"), 1));
	
	public static ImageView redScoreFirstDig = ImageFactory.createIV(430, 110, 38, 63, Maini.getNum(gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDPENELTY, 3));	
	public static ImageView redScoreSecDig = ImageFactory.createIV(390, 110, 38, 63, Maini.getNum(gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDPENELTY, 2));	
	public static ImageView redScoreThiDig = ImageFactory.createIV(350, 110, 38, 63, Maini.getNum(gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDPENELTY, 1));
	public static ImageView redScoreFourDig = ImageFactory.createIV(310, 110, 38, 63, Maini.getNum(gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDPENELTY, 0));	

	//end of red cargo amounts
		
	//time reMainied till and of game
	//TODO : 0?????
	public static ImageView timeones = ImageFactory.createIV(695, 201, 11, 18, Maini.getNum(0, 2));
	public static ImageView timeTens = ImageFactory.createIV(681, 201, 11, 18, Maini.getNum(0, 1));
	public static ImageView timeMins = ImageFactory.createIV(656, 201, 11, 18, Maini.getNum(0, 0));
	public static ImageView timeColon = ImageFactory.createIV(670, 203, 8, 14, IMGs.colon);
	//end of time reMainied till end of game
	
	//teams
	public static ImageView blueTeam1 = ImageFactory.createIV(275, 175, 11, 18, Maini.getNum(gameParams.BLUE1, 0));
	public static ImageView blueTeam2 = ImageFactory.createIV(525, 175, 11, 18, Maini.getNum(gameParams.BLUE2, 0));
	public static ImageView redTeam1 = ImageFactory.createIV(855, 175, 11, 18, Maini.getNum(gameParams.RED1, 0));
	public static ImageView redTeam2 = ImageFactory.createIV(1105, 175, 11, 18, Maini.getNum(gameParams.RED2, 0));
	//end of teams
	
	//bluee completion tasks
	public static ImageView blueBridge = ImageFactory.createIV(1125, 525, 125, 125, IMGs.comBridge);
	public static ImageView blueAnchor1 = ImageFactory.createIV(725, 550, 75, 75, IMGs.comAnchor);
	public static ImageView blueAnchor2 = ImageFactory.createIV(800, 550, 75, 75, IMGs.comAnchor);
	public static ImageView blueCannon1 = ImageFactory.createIV(900, 550, 75, 75, IMGs.comCannon);
	public static ImageView blueCannon2 = ImageFactory.createIV(975, 550, 75, 75, IMGs.comCannon);
	//end of blue completion tasks
	
	//red completion tasks
	public static ImageView redBridge = ImageFactory.createIV(525, 525, 125, 125, IMGs.comBridge);
	public static ImageView redAnchor1 = ImageFactory.createIV(125, 550, 75, 75, IMGs.comAnchor);
	public static ImageView redAnchor2 = ImageFactory.createIV(200, 550, 75, 75, IMGs.comAnchor);
	public static ImageView redCannon1 = ImageFactory.createIV(300, 550, 75, 75, IMGs.comCannon);
	public static ImageView redCannon2 = ImageFactory.createIV(375, 550, 75, 75, IMGs.comCannon);
	//End of red completion tasks

	

	//the rest
	public static ImageView durGameBg = ImageFactory.createIV(0, 0, 1360, 768, IMGs.durGameBG);	//background
	public static ImageView memeBg = ImageFactory.createIV(0, 0, 1360, 768, IMGs.nothing);

}
