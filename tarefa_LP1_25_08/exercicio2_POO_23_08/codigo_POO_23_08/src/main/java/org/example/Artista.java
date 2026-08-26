package org.example;

// --- CLASSE 2: ARTISTA ---
public class Artista {
    private String nome;
    private String nivel;
    private int totalArte;

    public Artista(String nome, String nivel, int totalArte) {
        this.nome = nome;
        this.nivel = nivel;
        this.totalArte = 0;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNivelHabilidade() { return nivel; }
    public void setNivelHabilidade(String nivel) { this.nivel = nivel; }
    public int getTotalEsbocosFeitos() { return totalArte; }

    public void praticar() {
        this.totalArte++;
        System.out.println("O artista " + nome + " concluiu mais um estudo de cabelo! Total de esboços: " + totalArte);
    }

    public void salvarPortifolio() {
        System.out.println("Novo estudo de anime adicionado ao portfólio de " + nome + " (" + nivel + ").");
    }

    public void pedirFeedback() {
        System.out.println(nome + " enviou seus esboços de cabelo para revisão do instrutor.");
    }
}