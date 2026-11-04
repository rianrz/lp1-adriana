package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ArtistaController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_arte;

    @FXML
    private TextField txt_experiencia;

    @FXML
    private TextField txt_nome;


    @FXML
    void Pedir(ActionEvent event) {
        Artista n = new Artista(txt_nome.getText(),txt_experiencia.getText(),Integer.parseInt(txt_arte.getText()));
        lbl_result.setText(n.pedirFeedback());
    }

    @FXML
    void Praticar(ActionEvent event) {
        Artista n = new Artista(txt_nome.getText(),txt_experiencia.getText(),Integer.parseInt(txt_arte.getText()));
        lbl_result.setText(n.praticar());
    }

    @FXML
    void Salvar(ActionEvent event) {
        Artista n = new Artista(txt_nome.getText(),txt_experiencia.getText(),Integer.parseInt(txt_arte.getText()));
        lbl_result.setText(n.salvarPortifolio());
    }

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
