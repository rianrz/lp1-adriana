package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DescontoController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_desconto;

    @FXML
    void calculando(ActionEvent event) {
        Desconto c = new Desconto();
        lbl_result.setText(c.execute(Double.parseDouble(txt_desconto.getText())));
        txt_desconto.clear();
    }

}
