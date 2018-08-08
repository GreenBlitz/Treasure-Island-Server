package graphical_user_interface;
import god.gameParams;
import javafx.scene.image.ImageView;

public class EndGameFinals {
	//Teams
	public static ImageView redTeam1 = ImageFactory.createIV(275, 222, 11, 18, Maini.getNum(gameParams.RED1, 0));
	public static ImageView redTeam2 = ImageFactory.createIV(525, 222, 11, 18, Maini.getNum(gameParams.RED2, 0));
	public static ImageView blueTeam1 = ImageFactory.createIV(855, 222, 11, 18, Maini.getNum(gameParams.BLUE1, 0));
	public static ImageView blueTeam2 = ImageFactory.createIV(1105, 222, 11, 18, Maini.getNum(gameParams.BLUE2, 0));
	//End of teams
	
	//Win/lose/tie
	public static ImageView redWinLoseTie = ImageFactory.createIV(480, 465, 135, 35, IMGs.RPTie);
	public static ImageView blueWinLoseTie = ImageFactory.createIV(1070, 465, 135, 35, IMGs.RPTie);
	//End of win/lose/tie
	
	//bluee points
	public static ImageView blueCargoPointsFirstDig = ImageFactory.createIV(946, 355, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 0));
	public static ImageView blueCargoPointsSecDig = ImageFactory.createIV(933, 355, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 1));
	public static ImageView blueCargoPointsThiDig = ImageFactory.createIV(920, 355, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 2));
	
	public static ImageView blueStackPointsFirstDig = ImageFactory.createIV(955, 405, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 0));
	public static ImageView blueStackPointsSecDig = ImageFactory.createIV(942, 405, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 0));
	public static ImageView blueStackPointsThiDig = ImageFactory.createIV(929, 405, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 0));
	public static ImageView blueStackPointsFourDig = ImageFactory.createIV(916, 405, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS, 0));
	
	public static ImageView blueAnchorPointsFirstDig = ImageFactory.createIV(940, 455, 11, 18, Maini.getNum(gameParams.BLUEANCHORPOINTS, 0));
	public static ImageView blueAnchorPointsSecDig = ImageFactory.createIV(953, 455, 11, 18, Maini.getNum(gameParams.BLUEANCHORPOINTS, 1));
	
	public static ImageView blueCannonPointsFirstDig = ImageFactory.createIV(945, 505, 11, 18, Maini.getNum(gameParams.BLUECANNONPOINTS, 0));
	public static ImageView blueCannonPointsSecDig = ImageFactory.createIV(958, 505, 11, 18, Maini.getNum(gameParams.BLUECANNONPOINTS, 1));
	
	public static ImageView bluePenaltyPointsFirstDig = ImageFactory.createIV(953, 555, 11, 18, Maini.getNum(gameParams.BLUEPENELTY, 0));
	public static ImageView bluePenaltyPointsSecDig = ImageFactory.createIV(940, 555, 11, 18, Maini.getNum(gameParams.BLUEPENELTY, 1));
	
	public static ImageView blueTotalPointsFirstDig = ImageFactory.createIV(949, 605, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));
	public static ImageView blueTotalPointsSecDig = ImageFactory.createIV(936, 605, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));
	public static ImageView blueTotalPointsThiDig = ImageFactory.createIV(923, 605, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));
	public static ImageView blueTotalPointsFourDig = ImageFactory.createIV(910, 605, 11, 18, Maini.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));

	//End of blue points
	
	//Red points
	public static ImageView redCargoPointsFirstDig = ImageFactory.createIV(356, 355, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS, 0));
	public static ImageView redCargoPointsSecDig = ImageFactory.createIV(343, 355, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS, 1));
	public static ImageView redCargoPointsThiDig = ImageFactory.createIV(330, 355, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS, 2));
	
	public static ImageView redStackPointsFirstDig = ImageFactory.createIV(320, 405, 11, 18, Maini.getNum(gameParams.REDSTACKPOINTS, 3));
	public static ImageView redStackPointsSecDig = ImageFactory.createIV(333, 405, 11, 18, Maini.getNum(gameParams.REDSTACKPOINTS, 2));
	public static ImageView redStackPointsThiDig = ImageFactory.createIV(346, 405, 11, 18, Maini.getNum(gameParams.REDSTACKPOINTS, 1));
	public static ImageView redStackPointsFourDig = ImageFactory.createIV(359, 405, 11, 18, Maini.getNum(gameParams.REDSTACKPOINTS, 0));
	
	public static ImageView redAnchorPointsFirstDig = ImageFactory.createIV(350, 455, 11, 18, Maini.getNum(gameParams.REDANCHORPOINTS, 0));
	public static ImageView redAnchorPointsSecDig = ImageFactory.createIV(363, 455, 11, 18, Maini.getNum(gameParams.REDANCHORPOINTS, 1));
	
	public static ImageView redCannonPointsFirstDig = ImageFactory.createIV(355, 505, 11, 18, Maini.getNum(gameParams.REDCANNONPOINTS, 0));
	public static ImageView redCannonPointsSecDig = ImageFactory.createIV(368, 505, 11, 18, Maini.getNum(gameParams.REDCANNONPOINTS, 1));
	
	public static ImageView redPenaltyPointsFirstDig = ImageFactory.createIV(350, 555, 11, 18, Maini.getNum(gameParams.REDPENELTY, 0));
	public static ImageView redPenaltyPointsSecDig = ImageFactory.createIV(363, 555, 11, 18, Maini.getNum(gameParams.REDPENELTY, 1));
	
	public static ImageView redTotalPointsFirstDig = ImageFactory.createIV(361, 605, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 0));
	public static ImageView redTotalPointsSecDig = ImageFactory.createIV(348, 605, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 0));
	public static ImageView redTotalPointsThiDig = ImageFactory.createIV(335, 605, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 0));
	public static ImageView redTotalPointsFourDig = ImageFactory.createIV(322, 605, 11, 18, Maini.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 0));

	//End of red points
	
	public static ImageView endGameBg = ImageFactory.createIV(0, 0, 1360, 768, IMGs.endGameFinalsBG);	//background	
}
