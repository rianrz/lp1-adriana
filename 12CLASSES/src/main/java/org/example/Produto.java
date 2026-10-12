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

    public String aplicaDesconto(double porcentagem) {
        this.preco -= (this.preco * (porcentagem / 100));
        return("Novo preço com desconto: R$ " + this.preco);
    }

    public String exibeEtiqueta() {
        return("Produto: " + descricao + " | Tam: " + tamanho + " | Preço: R$ " + preco);
    }

    public String verificaTamanho(String tamanhoDesejado) {
        boolean disponivel = this.tamanho.equalsIgnoreCase(tamanhoDesejado);
        if (disponivel) {
            return("O tamanho " + tamanhoDesejado + " está disponível para: " + descricao);
        } else {
            return("Tamanho " + tamanhoDesejado + " indisponível. Tamanho em estoque: " + this.tamanho);
        }
    }
}