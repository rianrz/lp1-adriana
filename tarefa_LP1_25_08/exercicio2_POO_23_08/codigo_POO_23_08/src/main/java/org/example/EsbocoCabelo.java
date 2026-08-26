package org.example;

// --- CLASSE 1: ESBOÇO DE CABELO ---
public class EsbocoCabelo {
    private String estiloCabelo;
    private String tipoPincel;
    private int tempoDesenhoMinutos;

    public EsbocoCabelo(String estiloCabelo, String tipoPincel, int tempoDesenhoMinutos) {
        this.estiloCabelo = estiloCabelo;
        this.tipoPincel = tipoPincel;
        this.tempoDesenhoMinutos = tempoDesenhoMinutos;
    }

    public String getEstiloCabelo() { return estiloCabelo; }
    public void setEstiloCabelo(String estiloCabelo) { this.estiloCabelo = estiloCabelo; }
    public String getTipoPincel() { return tipoPincel; }
    public void setTipoPincel(String tipoPincel) { this.tipoPincel = tipoPincel; }
    public int getTempoDesenhoMinutos() { return tempoDesenhoMinutos; }
    public void setTempoDesenhoMinutos(int tempoDesenhoMinutos) { this.tempoDesenhoMinutos = tempoDesenhoMinutos; }

    public void aplicarSombra() {
        System.out.println("Sombreamento aplicado no estilo '" + estiloCabelo + "' usando o pincel " + tipoPincel + ".");
    }

    public void ajustarLinha() {
        System.out.println("Linhas de fluxo do cabelo ajustadas para o estilo " + estiloCabelo + ".");
    }

    public void exportarEsboco() {
        System.out.println("Esboço de " + estiloCabelo + " exportado em PNG após " + tempoDesenhoMinutos + " minutos de trabalho.");
    }
}