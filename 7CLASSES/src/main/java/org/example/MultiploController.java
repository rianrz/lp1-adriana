package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MultiploController {

    @FXML
    private Button btn_calcular;

    @FXML
    private Label lbl_resultado;

    @FXML
    private TextField txt_num1;

    @FXML
    private TextField txt_num2;

    @FXML
    void mtl_calcular(ActionEvent event) {

    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Inicio");
    }

    public void mlt_calcular(ActionEvent actionEvent) {
        Multiplo m = new Multiplo(Integer.parseInt(txt_num1.getText()), Integer.parseInt(txt_num2.getText()));
        lbl_resultado.setText(m.resposta());
        txt_num1.clear();
        txt_num2.clear();
    }
}
