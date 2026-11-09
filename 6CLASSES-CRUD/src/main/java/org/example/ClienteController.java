package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClienteController {

    @FXML
    private TableColumn<?, ?> colCpf;

    @FXML
    private TableColumn<?, ?> colNome;

    @FXML
    private TableColumn<?, ?> colProduto;

    @FXML
    private TableColumn<?, ?> colSaldo;

    @FXML
    private TableView<?> tblClientes;

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

    @FXML
    void Voltar(ActionEvent event) {

    }

    @FXML
    void adicionaCliente(ActionEvent event) {

    }

    @FXML
    void cadastraCliente(ActionEvent event) {

    }

    @FXML
    void comprarCliente(ActionEvent event) {

    }

    @FXML
    void trocarCliente(ActionEvent event) {

    }

}
