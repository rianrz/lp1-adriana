package org.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private int anoInicio;
    private double totalVenda;

    public Funcionario(String nome, String cargo, int anoInicio, double totalVenda) {
        this.nome = nome;
        this.cargo = cargo;
        this.anoInicio = anoInicio;
        this.totalVenda = totalVenda;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public int getAnoInicio() { return anoInicio; }
    public void setAnoInicio(int anoInicio) { this.anoInicio = anoInicio; }
    public double getTotalVenda() {return  totalVenda;}
    public void setTotalVenda(double totalVenda){this.totalVenda = totalVenda;}

    public String registrarVenda(double valor) {
        this.totalVenda += valor; // 2. Soma o novo valor ao total acumulado
        return "Vendedor(a) " + nome + " registrou uma venda de R$ " + valor + ". Total acumulado: R$ " + this.totalVenda;
    }

    public String solicitarAumento(double percentual) {
        return("Funcionário " + nome + " (" + cargo + ") solicitou aumento de " + percentual + "%");
    }

    public String mudarCargo() {
        return("O funcionário: " + nome + " quer mudar o cargo de " + cargo + "para outro cargo");
    }
}