package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SenhaController {

    @FXML
    private Button btn_teste;

    @FXML
    private TextField txt_senha;

    @FXML
    void testar(ActionEvent event) {
    Senha m = new Senha();
    m.verificar(Integer.parseInt(txt_senha.getText()));
    }

}
