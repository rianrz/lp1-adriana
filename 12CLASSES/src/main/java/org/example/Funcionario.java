package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private int anoInicio;

    public Funcionario(String nome, String cargo, int anoInicio) {
        this.nome = nome;
        this.cargo = cargo;
        this.anoInicio = anoInicio;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public int getAnoInicio() { return anoInicio; }
    public void setAnoInicio(int anoInicio) { this.anoInicio = anoInicio; }

    public String registrarVenda(double valor) {
        return("Vendedor(a) " + nome + " registrou uma venda de R$ " + valor + ". Total acumulado: R$ " + anoInicio);
    }

    public String solicitarAumento(double percentual) {
        return("Funcionário " + nome + " (" + cargo + ") solicitou aumento de " + percentual + "%");
    }

    public String mudarCargo() {
        return("O funcionário: " + nome + " quer mudar o cargo de " + cargo + "para outro cargo");
    }
}