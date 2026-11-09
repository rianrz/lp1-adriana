package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EquipamentoController {

    @FXML
    private CheckBox chk_aluguel;

    @FXML
    private TableColumn<?, ?> colAlugado;

    @FXML
    private TableColumn<?, ?> colEstado;

    @FXML
    private TableColumn<?, ?> colNome;

    @FXML
    private Label lbl_result;

    @FXML
    private TableView<?> tblEquipamentos;

    @FXML
    private TextField txt_estado;

    @FXML
    private TextField txt_nome;

    @FXML
    void Voltar(ActionEvent event) {

    }

    @FXML
    void alugar(ActionEvent event) {

    }

    @FXML
    void devolu(ActionEvent event) {

    }

    @FXML
    void inspecionar(ActionEvent event) {

    }

}
