package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class InicioController {

    @FXML
    void aluguel(ActionEvent event) throws IOException {
        App.setRoot("Aluguel");
    }

    @FXML
    void camelo(ActionEvent event) {

    }

    @FXML
    void ddesconto(ActionEvent event) {

    }

    @FXML
    void multiplo(ActionEvent event) throws IOException {
        App.setRoot("Multiplo");
    }

    @FXML
    void senha(ActionEvent event) throws IOException {
        App.setRoot("Senha");
    }

    @FXML
    void temperatura(ActionEvent event) throws IOException {
        App.setRoot("Temperatura");
    }

    @FXML
    void viagem(ActionEvent event) throws IOException {
        App.setRoot("Viagem");
    }

}
