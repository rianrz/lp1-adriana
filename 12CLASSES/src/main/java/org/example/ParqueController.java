package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ParqueController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_atuais;

    @FXML
    private TextField txt_capacidade;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_trilha;

    @FXML
    void abrir(ActionEvent event) {
        Parque n = new Parque(txt_nome.getText(), Integer.parseInt(txt_capacidade.getText()), false);
        lbl_result.setText(n.abrirParque());
    }

    @FXML
    void lotacao(ActionEvent event) {
        Parque n = new Parque(txt_nome.getText(), Integer.parseInt(txt_capacidade.getText()), false);
        lbl_result.setText(n.Lotacao(Integer.parseInt(txt_atuais.getText())));
    }

    @FXML
    void solicitar(ActionEvent event) {
        Parque n = new Parque(txt_nome.getText(), Integer.parseInt(txt_capacidade.getText()), false);
        lbl_result.setText(n.manutencaoTrilha(txt_trilha.getText()));
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
