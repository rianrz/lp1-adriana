package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EquipamentoController {

    @FXML
    private CheckBox chk_aluguel;

    @FXML
    private Label lbl_result;

    @FXML
    private TextField txt_estado;

    @FXML
    private TextField txt_nome;


    @FXML
    void alugar(ActionEvent event) {
        Equipamento n = new Equipamento(txt_nome.getText(),txt_estado.getText());

        lbl_result.setText(n.realizarAluguel());

        if (!chk_aluguel.isSelected()) {
            chk_aluguel.setSelected(true);
        }
    }

    @FXML
    void devolu(ActionEvent event) {
        Equipamento n = new Equipamento(txt_nome.getText(),txt_estado.getText());
        lbl_result.setText(n.realizarDevolucao());


            chk_aluguel.setSelected(n.isEstaAlugado());

    }

    @FXML
    void inspecionar(ActionEvent event) {
        Equipamento n = new Equipamento(txt_nome.getText(),txt_estado.getText());
        lbl_result.setText(n.inspecionar());
    }

}
