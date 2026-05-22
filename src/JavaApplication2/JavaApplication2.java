package JavaApplication2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JavaApplication2 extends Application{
	
	@Override
	public void start(Stage stage) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("Tela.fxml"));
		
		Scene scene = new Scene(root, 1280, 720);
		
		stage.setTitle("Tela de Login");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
