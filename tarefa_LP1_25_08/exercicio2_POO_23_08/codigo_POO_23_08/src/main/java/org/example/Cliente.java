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

    public boolean realizarCompra(double valorTotal) {
        if (this.valorEmCarteira >= valorTotal) {
            this.valorEmCarteira -= valorTotal;
            System.out.println(nome + " realizou a compra de R$ " + valorTotal + ". Saldo restante: R$ " + valorEmCarteira);
            return true;
        }
        System.out.println("Saldo insuficiente para " + nome);
        return false;
    }

    public void solicitarTroca(String nomeProduto) {
        System.out.println("Cliente " + nome + " solicitou a troca do produto: " + nomeProduto);
    }

    public void adicionarSaldo(double valor) {
        this.valorEmCarteira += valor;
        System.out.println("Adicionado R$ " + valor + " à carteira de " + nome);
    }
}