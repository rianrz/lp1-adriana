package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AtividadeLazerController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_duracao;

    @FXML
    private TextField txt_nivel;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_parada;

    @FXML
    void finalizar(ActionEvent event) {
        AtividadeLazer n = new AtividadeLazer(txt_nome.getText(),Integer.parseInt(txt_duracao.getText()),txt_nivel.getText());
        lbl_result.setText(n.finalizarAtividade());
    }

    @FXML
    void iniciar(ActionEvent event) {
        AtividadeLazer n = new AtividadeLazer(txt_nome.getText(),Integer.parseInt(txt_duracao.getText()),txt_nivel.getText());
        lbl_result.setText(n.iniciarAtividade());
    }

    @FXML
    void registrar(ActionEvent event) {
        AtividadeLazer n = new AtividadeLazer(txt_nome.getText(),Integer.parseInt(txt_duracao.getText()),txt_nivel.getText());
        lbl_result.setText(n.registrarParada(txt_parada.getText()));
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
