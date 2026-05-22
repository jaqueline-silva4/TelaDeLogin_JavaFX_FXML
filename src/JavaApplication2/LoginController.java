package JavaApplication2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField email;
	
	@FXML
	private PasswordField senha;
	
	@FXML
	public void Login(ActionEvent event) {
		String campoemail = email.getText();
		String camposenha = senha.getText();
		
		if(campoemail.isEmpty() || camposenha.isEmpty()) {
		
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("ERRO!");
			alerta.setHeaderText(null);
			alerta.setContentText("Preencha com email e senha!");
			alerta.show();	
		
		} else {
			Alert alerta = new Alert(Alert.AlertType.INFORMATION);
			alerta.setTitle("Login");
			alerta.setHeaderText(null);
			alerta.setContentText("Login efetuado com sucesso!");
			alerta.show();
			
			
		}
		
		
	}

}
