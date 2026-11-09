package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CuradorController {

    @FXML
    private TableColumn<?, ?> colAnos;

    @FXML
    private TableColumn<?, ?> colCurador;

    @FXML
    private TableColumn<?, ?> colEspecialidade;

    @FXML
    private TableColumn<?, ?> colObra;

    @FXML
    private TableColumn<?, ?> colQtd;

    @FXML
    private Label lbl_result;

    @FXML
    private TableView<?> tblCuradores;

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
    void Voltar(ActionEvent event) {

    }

    @FXML
    void aprova(ActionEvent event) {

    }

    @FXML
    void cataloga(ActionEvent event) {

    }

    @FXML
    void guiar(ActionEvent event) {

    }

}
