package org.example;

public class Tela {
        private String nome;

        public Tela(String nome) {
            this.nome = nome;
        }

        // É obrigatório ter os métodos Getters para a TableView funcionar
        public String getNome() { return nome; }
}
