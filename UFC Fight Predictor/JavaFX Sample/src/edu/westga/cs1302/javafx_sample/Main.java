package edu.westga.cs1302.javafx_sample;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Entry point for the program​
 *​
 * @author Kenneth Dearman​
 * @version Fall 2024​
 */
public class Main extends Application {

	private static final String WINDOW_TITLE = "UFC Predictor";
	private static final String GUI_RESOURCE = "view/MainWindow.fxml";
	
	public static final String RESULTS_WINDOW = "view/ResultsWindow.fxml";
	public static final String RESULTS_WINDOW_TITLE = "UFC Predictor Results";
	  
	/** JavaFX entry point.​
	  *​
	  * @precondition none​
	  * @postcondition none​
	  *​
	  * @throws IOException unable to load fxml for MainWindow​
	  */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource(Main.GUI_RESOURCE));
		Scene scene = new Scene(parent);
		primaryStage.setTitle(Main.WINDOW_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/** Primary Java entry point.​
	  *​
	  * @precondition none​
	  * @postcondition none​
	  *​
	  * @param args command line arguments​
	  */
	public static void main(String[] args) {
		Main.launch(args);
	}

}
