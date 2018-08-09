package graphical_user_interface;
import god.gameParams;
import javafx.scene.image.ImageView;

public class EndGameQuals {
	//TODO: get total rp for each team
	//Teams numbers
	public static ImageView redTeam1 = ImageFactory.createIV(235, 225, 11, 18, Main.getNum(gameParams.RED1, 0));
	public static ImageView redTeam2 = ImageFactory.createIV(485, 225, 11, 18, Main.getNum(gameParams.RED2, 0));
	public static ImageView blueTeam1 = ImageFactory.createIV(815, 225, 11, 18, Main.getNum(gameParams.BLUE1, 0));
	public static ImageView blueTeam2 = ImageFactory.createIV(1065, 225, 11, 18, Main.getNum(gameParams.BLUE2, 0));
	//team ranks
	public static ImageView redRank1 = ImageFactory.createIV(337, 225, 11, 18, Main.getNum(gameParams.getRank(gameParams.RED1), 0));
	public static ImageView redRank2= ImageFactory.createIV(587, 225, 11, 18, Main.getNum(gameParams.getRank(gameParams.RED2), 0));
	public static ImageView blueRank1 = ImageFactory.createIV(912, 225, 11, 18, Main.getNum(gameParams.getRank(gameParams.BLUE1), 0));
	public static ImageView blueRank2 = ImageFactory.createIV(1162, 225, 11, 18, Main.getNum(gameParams.getRank(gameParams.BLUE2), 0));
	//End of teams and ranks
	
	//Red RP
	public static ImageView redRPCannons = ImageFactory.createIV(550, 405, 70, 70, IMGs.incomRPCannons);
	public static ImageView redRPAuto = ImageFactory.createIV(475, 405, 70, 70, IMGs.incomRPAuto);
	public static ImageView redRPWinLoseTie = ImageFactory.createIV(480, 360, 135, 35, IMGs.RPTie);
	public static ImageView redRPTotal= ImageFactory.createIV(530, 470, 17, 27, Main.getNum(/*total RP earned needed*/0, 0));
	//End of red RP
	
	//Red points
	public static ImageView redCargoPointsFirstDig = ImageFactory.createIV(356, 355, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS, 0));
	public static ImageView redCargoPointsSecDig = ImageFactory.createIV(343, 355, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS, 1));
	public static ImageView redCargoPointsThiDig = ImageFactory.createIV(330, 355, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS, 2));
	
	public static ImageView redStackPointsFirstDig = ImageFactory.createIV(320, 405, 11, 18, Main.getNum(gameParams.REDSTACKPOINTS, 3));
	public static ImageView redStackPointsSecDig = ImageFactory.createIV(333, 405, 11, 18, Main.getNum(gameParams.REDSTACKPOINTS, 2));
	public static ImageView redStackPointsThiDig = ImageFactory.createIV(346, 405, 11, 18, Main.getNum(gameParams.REDSTACKPOINTS, 1));
	public static ImageView redStackPointsFourDig = ImageFactory.createIV(359, 405, 11, 18, Main.getNum(gameParams.REDSTACKPOINTS, 0));

	
	public static ImageView redAnchorPointsFirstDig = ImageFactory.createIV(350, 455, 11, 18, Main.getNum(gameParams.REDANCHORPOINTS, 0));
	public static ImageView redAnchorPointsSecDig = ImageFactory.createIV(363, 455, 11, 18, Main.getNum(gameParams.REDANCHORPOINTS, 1));
	
	public static ImageView redCannonPointsFirstDig = ImageFactory.createIV(355, 505, 11, 18, Main.getNum(gameParams.REDCANNONPOINTS, 0));
	public static ImageView redCannonPointsSecDig = ImageFactory.createIV(368, 505, 11, 18, Main.getNum(gameParams.REDCANNONPOINTS, 1));
	
	public static ImageView redPenaltyPointsFirstDig = ImageFactory.createIV(350, 555, 11, 18, Main.getNum(gameParams.REDPENELTY, 0));
	public static ImageView redPenaltyPointsSecDig = ImageFactory.createIV(363, 555, 11, 18, Main.getNum(gameParams.REDPENELTY, 1));
	
	public static ImageView redTotalPointsFirstDig = ImageFactory.createIV(361, 605, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 3));
	public static ImageView redTotalPointsSecDig = ImageFactory.createIV(348, 605, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 2));
	public static ImageView redTotalPointsThiDig = ImageFactory.createIV(335, 605, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 1));
	public static ImageView redTotalPointsFourDig = ImageFactory.createIV(322, 605, 11, 18, Main.getNum(gameParams.REDCARGOPOINTS+gameParams.REDSTACKPOINTS+gameParams.REDANCHORPOINTS+gameParams.REDCANNONPOINTS+gameParams.REDPENELTY, 0));

	//End of red points

	//blue RP
	public static ImageView blueRPCannons = ImageFactory.createIV(1140, 405, 70, 70, IMGs.comRPCannons);
	public static ImageView blueRPAuto = ImageFactory.createIV(1065, 405, 70, 70, IMGs.comRPAuto);
	public static ImageView blueRPWinLoseTie = ImageFactory.createIV(1070, 360, 135, 35, IMGs.RPTie);
	public static ImageView blueRPTotal= ImageFactory.createIV(1120, 470, 17, 27, Main.getNum(0, 0));
	//End of blue RP
	
	//blue points
	public static ImageView blueCargoPointsFirstDig = ImageFactory.createIV(946, 355, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS, 0));
	public static ImageView blueCargoPointsSecDig = ImageFactory.createIV(933, 355, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS, 1));
	public static ImageView blueCargoPointsThiDig = ImageFactory.createIV(920, 355, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS, 2));
	
	public static ImageView blueStackPointsFirstDig = ImageFactory.createIV(955, 405, 11, 18, Main.getNum(gameParams.BLUESTACKPOINTS, 0));
	public static ImageView blueStackPointsSecDig = ImageFactory.createIV(942, 405, 11, 18, Main.getNum(gameParams.BLUESTACKPOINTS, 0));
	public static ImageView blueStackPointsThiDig = ImageFactory.createIV(929, 405, 11, 18, Main.getNum(gameParams.BLUESTACKPOINTS, 0));
	public static ImageView blueStackPointsFourDig = ImageFactory.createIV(916, 405, 11, 18, Main.getNum(gameParams.BLUESTACKPOINTS, 0));
	
	public static ImageView blueAnchorPointsFirstDig = ImageFactory.createIV(940, 455, 11, 18, Main.getNum(gameParams.BLUEANCHORPOINTS, 0));
	public static ImageView blueAnchorPointsSecDig = ImageFactory.createIV(953, 455, 11, 18, Main.getNum(gameParams.BLUEANCHORPOINTS, 1));
	
	public static ImageView blueCannonPointsFirstDig = ImageFactory.createIV(945, 505, 11, 18, Main.getNum(gameParams.BLUECANNONPOINTS, 0));
	public static ImageView blueCannonPointsSecDig = ImageFactory.createIV(958, 505, 11, 18, Main.getNum(gameParams.BLUECANNONPOINTS, 1));
	
	public static ImageView bluePenaltyPointsFirstDig = ImageFactory.createIV(953, 555, 11, 18, Main.getNum(gameParams.BLUEPENELTY, 0));
	public static ImageView bluePenaltyPointsSecDig = ImageFactory.createIV(940, 555, 11, 18, Main.getNum(gameParams.BLUEPENELTY, 1));
	
	public static ImageView blueTotalPointsFirstDig = ImageFactory.createIV(949, 605, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 3));
	public static ImageView blueTotalPointsSecDig = ImageFactory.createIV(936, 605, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 2));
	public static ImageView blueTotalPointsThiDig = ImageFactory.createIV(923, 605, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 1));
	public static ImageView blueTotalPointsFourDig = ImageFactory.createIV(910, 605, 11, 18, Main.getNum(gameParams.BLUECARGOPOINTS+gameParams.BLUESTACKPOINTS+gameParams.BLUEANCHORPOINTS+gameParams.BLUECANNONPOINTS+gameParams.BLUEPENELTY, 0));

	//End of blue points
	
	public static ImageView endGameBg = ImageFactory.createIV(0, 0, 1360, 768, IMGs.endGameQualsBG);	//background	
}
