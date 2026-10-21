package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CuradorController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_anos;

    @FXML
    private TextField txt_especialidade;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_obra;

    @FXML
    private TextField txt_qtd;

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

    @FXML
    void aprova(ActionEvent event) {
        Curador n = new Curador(txt_nome.getText(), txt_especialidade.getText(), Integer.parseInt(txt_anos.getText()));

        lbl_result.setText(n.aprovarObra());
    }

    @FXML
    void cataloga(ActionEvent event) {
        Curador n = new Curador(txt_nome.getText(), txt_especialidade.getText(), Integer.parseInt(txt_anos.getText()));

        n = new Curador(txt_nome.getText(), txt_especialidade.getText(), Integer.parseInt(txt_anos.getText()));

        lbl_result.setText(n.catalogarObra(txt_obra.getText()));
    }

    @FXML
    void guiar(ActionEvent event) {
        Curador n = new Curador(txt_nome.getText(), txt_especialidade.getText(), Integer.parseInt(txt_anos.getText()));

        lbl_result.setText(n.guiar(Integer.parseInt(txt_qtd.getText())));
    }

}
