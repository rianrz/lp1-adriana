package org.example;

public class Cliente {
    private String nome;
    private String cpf;
    private double valorEmCarteira;

    public Cliente(String nome, String cpf, double valorEmCarteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.valorEmCarteira = valorEmCarteira;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public double getValorEmCarteira() { return valorEmCarteira; }
    public void setValorEmCarteira(double valorEmCarteira) { this.valorEmCarteira = valorEmCarteira; }

    public String realizarCompra(double valorTotal) {
        if (this.valorEmCarteira >= valorTotal) {
            this.valorEmCarteira -= valorTotal;
            return nome + " realizou a compra de R$ " + valorTotal + ". Saldo restante: R$ " + valorEmCarteira;
        }

        return "Saldo insuficiente para " + nome;
    }

    public String solicitarTroca(String nomeProduto) {
        return ("Cliente " + nome + " solicitou a troca do produto: " + nomeProduto);
    }

    public String adicionarSaldo(double valor) {
        this.valorEmCarteira += valor;
        return ("Adicionado R$ " + valor + " à carteira de " + nome);
    }
}