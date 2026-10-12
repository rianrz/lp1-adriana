package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MascaraController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_etnia;

    @FXML
    private TextField txt_material;

    @FXML
    private TextField txt_proibido;

    @FXML
    private TextField txt_simbolismo;

    @FXML
    void compatibilidade(ActionEvent event) {
        Mascara n = new Mascara(txt_etnia.getText(), txt_material.getText(), txt_simbolismo.getText());
        lbl_result.setText(n.compatibilidadeExposicao(txt_proibido.getText()));
    }

    @FXML
    void descrever(ActionEvent event) {
        Mascara n = new Mascara(txt_etnia.getText(), txt_material.getText(), txt_simbolismo.getText());
        lbl_result.setText(n.descrevaObra());
    }

    @FXML
    void solicitar(ActionEvent event) {
        Mascara n = new Mascara(txt_etnia.getText(), txt_material.getText(), txt_simbolismo.getText());
        lbl_result.setText(n.solicitarRestauracao());
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
