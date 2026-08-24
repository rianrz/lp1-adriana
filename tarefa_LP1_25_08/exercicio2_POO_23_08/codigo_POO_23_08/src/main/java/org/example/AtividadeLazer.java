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

    public void iniciarAtividade() {
        System.out.println("Iniciando: " + nomeAtividade + " (" + duracaoMinutos + " min)");
    }

    public void registrarParada(String ponto) {
        System.out.println("Parada em: " + ponto);
    }

    public void finalizarAtividade() {
        System.out.println("Atividade " + nomeAtividade + " concluída!");
    }
}
