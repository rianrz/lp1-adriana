package org.example;

public class Parque {
    private String nomeParque;
    private int capacidade;
    private boolean status;

    public Parque(String nomeParque, int capacidade, boolean b) {
        this.nomeParque = nomeParque;
        this.capacidade = capacidade;
        this.status = false;
    }

    // Getters e Setters
    public String getNomeParque() { return nomeParque; }
    public void setNomeParque(String nomeParque) { this.nomeParque = nomeParque; }
    public int getCapacidadeVisitantes() { return capacidade; }
    public void setCapacidadeVisitantes(int capacidade) { this.capacidade = capacidade; }
    public boolean isEstaAberto() { return status; }

    // --- 3 MÉTODOS ---

    public void abrirParque() {
        this.status = true;
        System.out.println("O " + nomeParque + " está aberto para visitação!");
    }

    public boolean Lotacao(int Atuais) {
        if (Atuais >= capacidade) {
            System.out.println("Alerta: " + nomeParque + " atingiu a capacidade máxima (" + capacidade + " pessoas).");
            return false;
        }
        System.out.println("Entrada liberada. Lotação atual: " + Atuais + "/" + capacidade);
        return true;
    }

    public void manutencaoTrilha(String nomeTrilha) {
        System.out.println("A " + nomeTrilha + " no " + nomeParque + " foi agendada para manutenção preventiva.");
    }
}