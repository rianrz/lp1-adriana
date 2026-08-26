package org.example;

public class Equipamento {
    private String nome;
    private String estado;
    private boolean estaAlugado;

    public Equipamento(String nome, String estado, boolean b) {
        this.nome = nome;
        this.estado = estado;
        this.estaAlugado = false;
    }

    // Getters e Setters
    public String getNomeEquipamento() { return nome; }
    public void setNomeEquipamento(String nome) { this.nome = nome; }
    public String getEstadoConservacao() { return estado; }
    public void setEstadoConservacao(String estado) { this.estado = estado; }
    public boolean isEstaAlugado() { return estaAlugado; }

    // --- 3 MÉTODOS ---

    public boolean realizarAluguel() {
        if (!estaAlugado) {
            this.estaAlugado = true;
            System.out.println("O equipamento '" + nome + "' foi alugado com sucesso.");
            return true;
        }
        System.out.println("O equipamento '" + nome + "' já está em uso.");
        return false;
    }

    public void realizarDevolucao() {
        this.estaAlugado = false;
        System.out.println("O equipamento '" + nome + "' foi devolvido e está disponível.");
    }

    public boolean inspecionar() {
        if (estado.equalsIgnoreCase("Danificado")) {
            System.out.println("Atenção: " + nome + " reprovado na inspeção. Enviar para reparo!");
            return false;
        }
        System.out.println("Inspeção OK: " + nome + " está em estado '" + estado + "' e pronto para uso.");
        return true;
    }
}