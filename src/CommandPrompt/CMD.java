package CommandPrompt;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CMD extends Application{
	static Stage CP;
	private static VBox commands = new VBox();
	private static TextField inputCommand;
	protected static String command;

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception { // DO NOT CALL START...
		CP = primaryStage;
		ScrollBar scrollCommands = new ScrollBar();
		scrollCommands.setMin(0);
		scrollCommands.setMinHeight(572);
		scrollCommands.setValue(0);
		scrollCommands.setOrientation(Orientation.VERTICAL);

		TextField inputCommand = new TextField("Input your command");
		inputCommand.setMinWidth(1080);
		inputCommand.setStyle("-fx-border-color:#00cc00;" + "-fx-border-width:2");

		Button commitCommand = new Button("commit");
		commitCommand.setMinWidth(120);
		commitCommand.setMaxWidth(120);
		commitCommand.setMinHeight(28);
		commitCommand.setMaxHeight(28);
		commitCommand.setStyle("-fx-color:#000000;" + "-fx-border-color:#00cc00;" + "-fx-border-width:2");
		commitCommand.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		       command = inputCommand.getText().toString();
		    }
		});
		
		HBox commandInput = new HBox(inputCommand, commitCommand);
		commandInput.setLayoutY(400);
		
		HBox scrollBarXcommands = new HBox(scrollCommands, commands);

		VBox general = new VBox(scrollBarXcommands, commandInput);
		general.setStyle("-fx-background-color:#000000");
		
		Scene scene = new Scene(general, 1200, 600);
		CP.setScene(scene);
		CP.sizeToScene();
		CP.show();
		commands.getChildren().addAll(serverMessage("this has no primal sign"), commandInput("this has a \">>\" primal sign"), commandOutput("this has a \"-\" primal sign"));
		if (inputCommand.getText() == "Input your command") {
			inputCommand.setText("");
		}
	}
	
	public static Label commandOutput(String commandOutput) {
		Label lb = new Label("- " + commandOutput);
		lb.setStyle("-fx-text-fill:#AAAAAA;" + "-fx-font:16 David");
		return lb;
	}
	
	public static Label commandInput(String command) {
		Label lb = new Label(">> " + command);
		lb.setStyle("-fx-text-fill:#AAAAAA;" + "-fx-font:16 David");
		return lb;
	}
	
	protected static Label serverMessage(String labelText) {
		Label lb = new Label(labelText);
		lb.setStyle("-fx-text-fill:#AAAAAA;" + "-fx-font:16 David");
		return lb;
	}
	
	public void setCommand(String command) {
        command = inputCommand.getText().toString();
	}
	
	public String command() {
		return command;
	}

}