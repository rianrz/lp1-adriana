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
    private TextField txt_aumento;

    @FXML
    private TextField txt_cargo;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_venda;

    @FXML
    void aumento(ActionEvent event) {
        Funcionario n = new Funcionario(txt_nome.getText(), txt_cargo.getText(), Integer.parseInt(txt_ano.getText()));
        lbl_result.setText(n.solicitarAumento(Double.parseDouble(txt_aumento.getText())));
    }

    @FXML
    void mudar(ActionEvent event) {
        Funcionario n = new Funcionario(txt_nome.getText(), txt_cargo.getText(), Integer.parseInt(txt_ano.getText()));
        lbl_result.setText(n.mudarCargo());
    }

    @FXML
    void venda(ActionEvent event) {
        Funcionario n = new Funcionario(txt_nome.getText(), txt_cargo.getText(), Integer.parseInt(txt_ano.getText()));
        lbl_result.setText(n.registrarVenda(Double.parseDouble(txt_venda.getText())));
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
