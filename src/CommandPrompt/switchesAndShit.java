package CommandPrompt;

public class switchesAndShit extends CMD {	
	public static String commandInputGetOutput(String commandInputValue) { // TODO: ACTUALLY MAKE THE COMMANDS
		switch (command) {
		case "startGame":
			return "Game started";

		case "finishGame":
			return "Game finished";

		case "getTeamRanks":
			return null /* team ranks needed */;

		case "enterTeam 1":
			return "Team 1 has entered the match";

		case "enterTeam 2":
			return "Team 2 has entered the match";

		case "enterTeam 3":
			return "Team 3 has entered the match";

		case "enterTeam 4":
			return "Team 4 has entered the match";

		case "enterTeam 5":
			return "Team 5 has entered the match";

		case "enterTeam 6":
			return "Team 6 has entered the match";

		case "removeTeam 1":
			return "Team 1 has been removed from the match";

		case "removeTeam 2":
			return "Team 2 has been removed from the match";

		case "removeTeam 3":
			return "Team 3 has been removed from the match";

		case "removeTeam 4":
			return "Team 4 has been removed from the match";

		case "removeTeam 5":
			return "Team 5 has been removed from the match";

		case "removeTeam 6":
			return "Team 6 has been removed from the match";

		case "postGame":
			return "The post-game phase has begun";

		case "preGame":
			return "The pre-game phase has begun";

		case "getRobotStatus 1":
			return null/* robot status needed */;

		case "getRobotStatus 2":

			return null/* robot status needed */;

		case "getRobotStatus 3":
			return null/* robot status needed */;

		case "getRobotStatus 4":
			return null/* robot status needed */;

		case "getRobotStatus 5":
			return null/* robot status needed */;

		case "getRobotStatus 6":
			return null/* robot status needed */;

		case "getRobotBattery 1":
			return null/* robot battery needed */;

		case "getRobotBattery 2":
			return null/* robot battery needed */;

		case "getRobotBattery 3":
			return null/* robot battery needed */;

		case "getRobotBattery 4":
			return null/* robot battery needed */;

		case "getRobotBattery 5":
			return null/* robot battery needed */;

		case "getRobotBattery 6":
			return null/* robot battery needed */;

		case "enable 1":
			return "The team 1 robot has been enabled";

		case "enable 2":
			return "The team 1 robot has been enabled";

		case "enable 3":
			return "The team 1 robot has been enabled";

		case "enable 4":
			return "The team 1 robot has been enabled";

		case "enable 5":
			return "The team 1 robot has been enabled";

		case "enable 6":
			return "The team 1 robot has been enabled";

		case "disable 1":
			return "The team 1 robot has been disabled";

		case "disable 2":
			return "The team 1 robot has been disabled";

		case "disable 3":
			return "The team 1 robot has been disabled";

		case "disable 4":
			return "The team 1 robot has been disabled";

		case "disable 5":
			return "The team 1 robot has been disabled";

		case "disable 6":
			return "The team 1 robot has been disabled";

		case "exit":
			/* exit needed */
			return null;

		case "robotCode 1":
			return null/* robotCode needed */;

		case "robotCode 2":
			return null/* robotCode needed */;

		case "robotCode 3":
			return null/* robotCode needed */;

		case "robotCode 4":
			return null/* robotCode needed */;

		case "robotCode 5":
			return null/* robotCode needed */;

		case "robotCode 6":
			return null/* robotCode needed */;

		case "cls":

		case "help":

			return ("- startGame - Starts the match" + "\\n    Practice" + "\\n    Quals" + "\\n   Finals"
					+ "\\n- finishGame : End match (will disable robots and instantly end the match)"
					+ "\\n- getTeamRanks (will display team ranks for quals, nothing if not quals)"
					+ "\\n- enterTeam+teamid - Enter team (will add a team to the registry, max 8 teams. Gets a team - number)"
					+ "\\n- removeTeam+teamid - Delete team (gets team number, removes from registry)"
					+ "\\n- postGame- Start post game" + "\\n- preGame - Start pre game"
					+ "\\n- getRobotStatus+robotId: Get robot status (from driver station)"
					+ "\\n- getRobotBattery+robotId : would get the current % of the robot battery"
					+ "\\n- enable+robotId - if robotId is null enable all"
					+ "\\n- disable+robotId - if robotId is null disable all" + "\\n- exit : close the command prompt"
					+ "\\n- robotCode+robotId: return true or false if robot have an id" + "\\n- cls: clean screen"
					+ "\\n- help: show all commands"
					+ "\\n- robotConnection+robotId - return true or false if ds have connection with robot"
					+ "\\n- activeAnchor+robotId - active anchor number id");

		case "robotConnection 1":
			return null/* robot connection needed */;

		case "robotConnection 2":
			return null/* robot connection needed */;

		case "robotConnection 3":
			return null/* robot connection needed */;

		case "robotConnection 4":
			return null/* robot connection needed */;

		case "robotConnection 5":
			return null/* robot connection needed */;

		case "robotConnection 6":
			return null/* robot connection needed */;

		case "activeAnchor 1":
			return "anchor1 activated";

		case "activeAnchor 2":
			return "anchor2 activated";

		case "activeAnchor 3":
			return "anchor3 activated";

		case "activeAnchor 4":
			return "anchor4 activated";

		case "":

		default:
			return "The command is not valid";
		}
	}

}
