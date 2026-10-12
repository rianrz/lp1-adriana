package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProdutoController {

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_descricao;

    @FXML
    private TextField txt_desejado;

    @FXML
    private TextField txt_porcentagem;

    @FXML
    private TextField txt_preco;

    @FXML
    private TextField txt_tamanho;

    @FXML
    void aplicar(ActionEvent event) {
        Produto n = new Produto(txt_descricao.getText(), txt_tamanho.getText(),Integer.parseInt(txt_preco.getText()));
        lbl_result.setText(n.aplicaDesconto(Double.parseDouble(txt_porcentagem.getText())));
    }

    @FXML
    void exibir(ActionEvent event) {
        Produto n = new Produto(txt_descricao.getText(), txt_tamanho.getText(),Integer.parseInt(txt_preco.getText()));
        lbl_result.setText(n.exibeEtiqueta());
    }

    @FXML
    void verificar(ActionEvent event) {
        Produto n = new Produto(txt_descricao.getText(), txt_tamanho.getText(),Integer.parseInt(txt_preco.getText()));
        lbl_result.setText(n.verificaTamanho(txt_desejado.getText()));
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        App.setRoot("Menu");
    }

}
