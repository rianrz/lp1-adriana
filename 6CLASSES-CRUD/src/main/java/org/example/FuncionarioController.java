package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FuncionarioController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_ano;

    @FXML
    private TextField txt_cargo;

    @FXML
    private TextField txt_nome;

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

    @FXML
    void ponto(ActionEvent event) {
        Funcionario n = new Funcionario(txt_nome.getText(), txt_cargo.getText(), Integer.parseInt(txt_ano.getText()));
        lbl_result.setText(n.baterPonto());
    }

    @FXML
    void registra(ActionEvent event) {
        Funcionario n = new Funcionario(txt_nome.getText(), txt_cargo.getText(), Integer.parseInt(txt_ano.getText()));
    }

    @FXML
    void solicitar(ActionEvent event) {
        Funcionario n = new Funcionario(txt_nome.getText(), txt_cargo.getText(), Integer.parseInt(txt_ano.getText()));
        lbl_result.setText(n.solicitarAumento());
    }

}
