package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/app/view/bmi.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("BMI by Kamil");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
