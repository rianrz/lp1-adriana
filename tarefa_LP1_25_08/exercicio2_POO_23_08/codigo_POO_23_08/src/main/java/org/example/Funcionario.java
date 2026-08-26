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

    public void registrarVenda(double valor) {
        System.out.println("Vendedor(a) " + nome + " registrou uma venda de R$ " + valor + ". Total acumulado: R$ " + anoInicio);
    }

    public void solicitarAumento(double percentual) {
        System.out.println("Funcionário " + nome + " (" + cargo + ") solicitou aumento de " + percentual + "%");
    }

    public void baterPonto() {
        System.out.println("Ponto registrado para o funcionário: " + nome);
    }
}