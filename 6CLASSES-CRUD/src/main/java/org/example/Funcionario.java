package org.example;

// --- CLASSE 3: FUNCIONARIO ---
public class Funcionario {
    private String nome;
    private String cargo;
    private int anoInicio;

    public Funcionario(String nome, String cargo, int anoInicio) {
        this.nome = nome;
        this.cargo = cargo;
        this.anoInicio = 0;
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
        return ("Funcionário " + nome + " (" + cargo + ") solicitou aumento de " + percentual + "%");
    }

    public String baterPonto() {
        return ("Ponto registrado para o funcionário: " + nome);
    }
}