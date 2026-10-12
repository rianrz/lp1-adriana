package org.example;

public class AtividadeLazer {
    // 3 Atributos
    private String nomeAtividade;
    private int duracaoMinutos;
    private String nivelDificuldade;

    public AtividadeLazer(String nomeAtividade, int duracaoMinutos, String nivelDificuldade) {
        this.nomeAtividade = nomeAtividade;
        this.duracaoMinutos = duracaoMinutos;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getNomeAtividade() { return nomeAtividade; }
    public void setNomeAtividade(String nomeAtividade) { this.nomeAtividade = nomeAtividade; }

    public int getDuracaoMinutos() { return duracaoMinutos; }
    public void setDuracaoMinutos(int duracaoMinutos) { this.duracaoMinutos = duracaoMinutos; }

    public String getNivelDificuldade() { return nivelDificuldade; }
    public void setNivelDificuldade(String nivelDificuldade) { this.nivelDificuldade = nivelDificuldade; }

    public String iniciarAtividade() {
        return("Iniciando: " + nomeAtividade + " (" + duracaoMinutos + " min)");
    }

    public String registrarParada(String ponto) {
        return("Parada em: " + ponto);
    }

    public String finalizarAtividade() {
        return("Atividade " + nomeAtividade + " concluída!");
    }
}
