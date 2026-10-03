package org.example;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class MenuController {

    @FXML
    private TableColumn<Tela, String> coluna_telas;

    @FXML
    private TableView<Tela> tabela_telas;

    private ObservableList<Tela> listaDeTela = FXCollections.observableArrayList();


    @FXML
    public void initialize() {
        coluna_telas.setCellValueFactory(new PropertyValueFactory<>("nome"));

        tabela_telas.setItems(listaDeTela);

        //telas ja existentes
        listaDeTela.addAll(new Tela("ArteVisual"),
                new Tela("Artista"),
                new Tela("AtividadeLazer"),
                new Tela("Cliente"),
                new Tela("Curador"),
                new Tela("Exposicao"),
                new Tela("Funcionario"),
                new Tela("Equipamento"),
                new Tela("Esboco"),
                new Tela("Mascara"),
                new Tela("Meio"),
                new Tela("Parque"),
                new Tela("Produto")
        );
    }


    @FXML
    void acessaTela(ActionEvent event) {
        Tela telaSelecionada = tabela_telas.getSelectionModel().getSelectedItem();
        if (telaSelecionada == null) {
            Alert erro = new Alert(Alert.AlertType.WARNING);
            erro.setTitle("Aviso");
            erro.setHeaderText("Nenhuma tela selecionada!");
            erro.setContentText("Por favor, clique no nome de uma tela na lista antes de clicar em Acessar.");
            erro.showAndWait();
            return;
        }

        // Se tiver selecionado, guarda na sessão global e muda de tela
        SessaoApp.telaAtual = telaSelecionada;
        try {
            App.setRoot(telaSelecionada.getNome());

            // Carrega o FXML diretamente à força
            //javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(org.example.App.class.getResource(telaSelecionada.getNome()));
            //javafx.scene.Parent root = loader.load();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


