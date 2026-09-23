package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TemperaturaController {

    @FXML
    private Label lbl_resultado1;

    @FXML
    private TextField txt_temperatura;

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Inicio");
    }

    @FXML
    void executa(ActionEvent event) {
    Temperatura m = new Temperatura();
    lbl_resultado1.setText(m.executa2(Integer.parseInt(txt_temperatura.getText())));
    txt_temperatura.clear();
    }

}
