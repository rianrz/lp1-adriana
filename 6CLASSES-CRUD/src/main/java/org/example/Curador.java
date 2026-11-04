package org.example;

// --- CLASSE 3: CURADOR ---
public class Curador {
    private String nome;
    private String especialidade;
    private int anosExperiencia;

    public Curador(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }

    public String catalogarObra(String nomeObra) {
        return ("O curador " + nome + " catalogou a obra: " + nomeObra);
    }

    public String aprovarObra() {
        return ("Peça inspecionada e aprovada pelo especialista em " + especialidade + " (" + nome + ").");
    }

    public String guiar(int quantidadePessoas) {
        return (nome + " está guiando uma visita para " + quantidadePessoas + " pessoas.");
    }
}