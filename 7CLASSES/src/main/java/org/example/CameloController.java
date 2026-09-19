package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CameloController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_camelos;

    @FXML
    void btn_calcular(ActionEvent event) {
        Camelo c = new Camelo();
        lbl_result.setText(c.execute(Integer.parseInt(txt_camelos.getText())));
        txt_camelos.clear();
    }

}
