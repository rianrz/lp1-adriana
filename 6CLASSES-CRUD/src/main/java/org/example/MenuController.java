package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {

    @FXML
    void abrirArtista(ActionEvent event) throws IOException {
        App.setRoot("Artista");
    }

    @FXML
    void abrirCliente(ActionEvent event) throws IOException {
        App.setRoot("Cliente");
    }

    @FXML
    void abrirCurador(ActionEvent event) throws IOException {
        App.setRoot("Curador");
    }

    @FXML
    void abrirEquipamento(ActionEvent event) throws IOException {
        App.setRoot("Equipamento");
    }

    @FXML
    void abrirFuncionario(ActionEvent event) throws IOException {
        App.setRoot("Funcionario");
    }

    @FXML
    void abrirProduto(ActionEvent event) throws IOException {
        App.setRoot("Produto");
    }

    @FXML
    void sair(ActionEvent event) {
        Platform.exit();
    }

}
