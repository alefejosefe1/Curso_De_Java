package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {   //implements CRIA A INTERFACE
    
    @FXML  // Criando o evento
    private Label  lblMensagem;  // Adicão dos botoes na interface
    private Button btnclick;         
    
    @FXML  // Criando o codico do evento
    private void clicouBotao(ActionEvent event) { // Evento do clicouBotao
        lblMensagem.setText(" Olá, Mundo!");
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
