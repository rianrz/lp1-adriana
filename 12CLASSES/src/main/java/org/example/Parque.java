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

    public String abrirParque() {
        this.status = true;
        return("O " + nomeParque + " está aberto para visitação!");
    }

    public String Lotacao(int Atuais) {
        if (Atuais >= capacidade) {
            return("Alerta: " + nomeParque + " atingiu a capacidade máxima (" + capacidade + " pessoas).");
        }
        return("Entrada liberada. Lotação atual: " + Atuais + "/" + capacidade);
    }

    public String manutencaoTrilha(String nomeTrilha) {
        return("A " + nomeTrilha + " no " + nomeParque + " foi agendada para manutenção preventiva.");
    }
}