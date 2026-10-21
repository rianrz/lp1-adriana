package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ExposicaoController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_exposição;

    @FXML
    private TextField txt_ingresso;


    @FXML
    private TextField txt_sala;

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

    @FXML
    void abrir(ActionEvent event) {
        Exposicao n = new Exposicao(txt_exposição.getText(),txt_sala.getText(), 0);
        lbl_result.setText(n.abrirExposicao());
    }

    @FXML
    void encerra(ActionEvent event) {
        Exposicao n = new Exposicao(txt_exposição.getText(),txt_sala.getText(), 0);
        lbl_result.setText(n.encerrarVisitacao());
    }

    @FXML
    void vender(ActionEvent event) {
        Exposicao n = new Exposicao(txt_exposição.getText(),txt_sala.getText(), 0);
        lbl_result.setText(n.venderIngressos(Integer.parseInt(txt_ingresso.getText())));
    }

}
