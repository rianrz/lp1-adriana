package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClienteController {

    @FXML
    private TextField txt_cpf;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_produto;

    @FXML
    private Label txt_result;

    @FXML
    private TextField txt_saldo;

    @FXML
    private TextField txt_soma;

    @FXML
    private TextField txt_valor;
    private Cliente n;

    @FXML
    void Voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }


    @FXML
    void adicionaCliente(ActionEvent event) {
        n.adicionarSaldo(Double.parseDouble(txt_soma.getText()));
        txt_soma.clear();
    }

    @FXML
    void cadastraCliente(ActionEvent event) {
     n = new Cliente(txt_nome.getText(), txt_cpf.getText(), Double.parseDouble(txt_saldo.getText()));
     txt_result.setText("CadastroEfetuado");
     txt_cpf.clear();
     txt_nome.clear();
     txt_saldo.clear();
    }

    @FXML
    void comprarCliente(ActionEvent event) {
        txt_result.setText(n.realizarCompra(Double.parseDouble(txt_valor.getText())));
        txt_valor.clear();
    }

    @FXML
    void trocarCliente(ActionEvent event) {
        txt_result.setText(n.solicitarTroca(txt_produto.getText()));
        txt_produto.clear();
    }

}
