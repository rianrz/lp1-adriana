package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ViagemController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_distancia;

    @FXML
    private TextField txt_preco;

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Inicio");
    }
    @FXML
    void calcular(ActionEvent event) {
    Viagem v = new Viagem(Double.parseDouble(txt_distancia.getText()), Double.parseDouble(txt_preco.getText()));
    lbl_result.setText(v.outsaida());
    txt_distancia.clear();
    txt_preco.clear();
    }

}
