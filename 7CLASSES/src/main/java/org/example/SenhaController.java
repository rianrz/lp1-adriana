package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SenhaController {

    @FXML
    private Button btn_teste;

    @FXML
    private Label acesso;

    @FXML
    private TextField txt_senha;

    @FXML
    void testar(ActionEvent event) {
    Senha m = new Senha();
    m.verificar(Integer.parseInt(txt_senha.getText()));
    acesso.setText(m.resp(Integer.parseInt(txt_senha.getText())));
    txt_senha.clear();
    }

}
