package org.example;

public class Produto {

    private String descricao;
    private String tamanho;
    private double preco;

    public Produto(String descricao, String tamanho, double preco) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void aplicarDesconto(double porcentagem) {
        this.preco -= (this.preco * (porcentagem / 100));
        System.out.println("Novo preço com desconto: R$ " + this.preco);
    }

    public void exibirEtiqueta() {
        System.out.println("Produto: " + descricao + " | Tam: " + tamanho + " | Preço: R$ " + preco);
    }

    public boolean verificarTamanho(String tamanhoDesejado) {
        boolean disponivel = this.tamanho.equalsIgnoreCase(tamanhoDesejado);
        if (disponivel) {
            System.out.println("O tamanho " + tamanhoDesejado + " está disponível para: " + descricao);
        } else {
            System.out.println("Tamanho " + tamanhoDesejado + " indisponível. Tamanho em estoque: " + this.tamanho);
        }
        return disponivel;
    }
}