package org.example;

public class Equipamento {
    private String nome;
    private String estado;
    private boolean estaAlugado;

    public Equipamento(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    // Getters e Setters
    public String getNomeEquipamento() { return nome; }
    public void setNomeEquipamento(String nome) { this.nome = nome; }
    public String getEstadoConservacao() { return estado; }
    public void setEstadoConservacao(String estado) { this.estado = estado; }
    public boolean isEstaAlugado() { return estaAlugado; }

    // --- 3 MÉTODOS ---

    public String realizarAluguel() {
        if (!estaAlugado) {
            this.estaAlugado = true;
            return ("O equipamento '" + nome + "' foi alugado com sucesso.");
        }
        return ("O equipamento '" + nome + "' já está em uso.");
    }

    public String realizarDevolucao() {
        if (!estaAlugado) {
            this.estaAlugado = false;
            return "O equipamento '" + nome + "' foi devolvido com sucesso.";
        }
        return "O equipamento '" + nome + "' não está alugado para ser devolvido.";
    }

    public String inspecionar() {
        if (estado.equalsIgnoreCase("Danificado")) {
            return ("Atenção: " + nome + " reprovado na inspeção. Enviar para reparo!");
        }
        return ("Inspeção OK: " + nome + " está em estado '" + estado + "' e pronto para uso.");
    }
}