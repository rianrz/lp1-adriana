package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MeioController {

    @FXML
    private CheckBox chk_digital;

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_meio;

    @FXML
    private TextField txt_tipo;

    @FXML
    void limpar(ActionEvent event) {
        boolean digital = chk_digital.isSelected();
        Meio n = new Meio(txt_meio.getText(), txt_tipo.getText(), digital);
        lbl_result.setText(n.limparTela());
    }

    @FXML
    void preparar(ActionEvent event) {
        boolean digital = chk_digital.isSelected();
        Meio n = new Meio(txt_meio.getText(), txt_tipo.getText(), digital);

        lbl_result.setText(n.prepararSuperficie());
    }

    @FXML
    void verificar(ActionEvent event) {
        boolean digital = chk_digital.isSelected();
        Meio n = new Meio(txt_meio.getText(), txt_tipo.getText(), digital);
        lbl_result.setText(n.verificarDisponibilidade());
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
