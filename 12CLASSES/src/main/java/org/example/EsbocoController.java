package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EsbocoController {

    @FXML
    private TextField txt_esboco;

    @FXML
    private TextField txt_minuto;

    @FXML
    private TextField txt_picel;

    @FXML
    private Label txt_result;

    @FXML
    void Exportar(ActionEvent event) {
        Esboco n = new Esboco(txt_esboco.getText(), txt_picel.getText(), Integer.parseInt(txt_minuto.getText()));
        txt_result.setText(n.exportarEsboco());
    }

    @FXML
    void ajustarLinha(ActionEvent event) {
        Esboco n = new Esboco(txt_esboco.getText(), txt_picel.getText(), Integer.parseInt(txt_minuto.getText()));
        txt_result.setText(n.ajustarLinha());
    }

    @FXML
    void aplicaSombra(ActionEvent event) {
        Esboco n = new Esboco(txt_esboco.getText(), txt_picel.getText(), Integer.parseInt(txt_minuto.getText()));
        txt_result.setText(n.aplicarSombra());
    }

}
