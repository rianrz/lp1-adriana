package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ArteVisualController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_galeria;

    @FXML
    private TextField txt_materialarte;

    @FXML
    private TextField txt_materialproibido;

    @FXML
    private TextField txt_origem;

    @FXML
    private TextField txt_titulo;

    @FXML
    void compatibilidade(ActionEvent event) {
        ArteVisual n = new ArteVisual(txt_titulo.getText(), txt_materialarte.getText(), txt_origem.getText());
        lbl_result.setText(n.compatibilidadeExposicao(txt_materialproibido.getText()));
    }

    @FXML
    void descreve(ActionEvent event) {
        ArteVisual n = new ArteVisual(txt_titulo.getText(), txt_materialarte.getText(), txt_origem.getText());
        lbl_result.setText(n.descreverObra());
    }

    @FXML
    void expor(ActionEvent event) {
        ArteVisual n = new ArteVisual(txt_titulo.getText(), txt_materialarte.getText(), txt_origem.getText());
        lbl_result.setText(n.exporEmGaleria(txt_galeria.getText()));
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
