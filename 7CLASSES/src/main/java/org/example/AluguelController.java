package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AluguelController {

    @FXML
    private Label lbl_resultado;

    @FXML
    private TextField txt_dia;

    @FXML
    private TextField txt_dist;

    @FXML
    void btn_aluguel(ActionEvent event) {
        Aluguel a = new Aluguel();
        lbl_resultado.setText(a.Calc(Integer.parseInt(txt_dia.getText()), Double.parseDouble(txt_dist.getText())));
        txt_dia.clear();
        txt_dist.clear();
    }

}
