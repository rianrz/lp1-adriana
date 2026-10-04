package org.example;

public class Exposicao {
    private String tituloExposicao;
    private String salaExibicao;
    private int ingressosVendidos;

    public Exposicao(String tituloExposicao, String salaExibicao, int i) {
        this.tituloExposicao = tituloExposicao;
        this.salaExibicao = salaExibicao;
        this.ingressosVendidos = 0;
    }

    public String getTituloExposicao() { return tituloExposicao; }
    public void setTituloExposicao(String tituloExposicao) { this.tituloExposicao = tituloExposicao; }
    public String getSalaExibicao() { return salaExibicao; }
    public void setSalaExibicao(String salaExibicao) { this.salaExibicao = salaExibicao; }
    public int getIngressosVendidos() { return ingressosVendidos; }

    public String abrirExposicao() {
        return ("A exposição '" + tituloExposicao + "' está aberta na " + salaExibicao + ".");
    }

    public String venderIngressos(int quantidade) {
        this.ingressosVendidos += quantidade;
        return (quantidade + " ingresso(s) vendido(s). Total: " + ingressosVendidos);
    }

    public String encerrarVisitacao() {
        return ("Visitação encerrada para a exposição na " + salaExibicao + ".");
    }
}