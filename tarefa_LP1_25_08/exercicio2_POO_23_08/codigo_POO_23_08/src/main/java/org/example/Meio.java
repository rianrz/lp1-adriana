package org.example;

public class Meio {
    private String tipoMeio;
    private boolean digital;
    private String tipo;

    public Meio(String tipoMeio, boolean digital, String tipo) {
        this.tipoMeio = tipoMeio;
        this.digital = digital;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getTipoMeio() { return tipoMeio; }
    public void setTipoMeio(String tipoMeio) { this.tipoMeio = tipoMeio; }

    public boolean isEhDigital() { return digital; }
    public void setEhDigital(boolean digital) { this.digital = digital; }

    public String getTexturaOuGramatura() { return tipo; }
    public void setTexturaOuGramatura(String tipo) { this.tipo = tipo; }

    // --- 3 MÉTODOS ---

    public void prepararSuperficie() {
        if (digital) {
            System.out.println("Criando nova tela digital no suporte: " + tipoMeio + " (" + tipo + ").");
        } else {
            System.out.println("Folha separada no " + tipoMeio + " com gramatura " + tipo + ".");
        }
    }

    public void limparTela() {
        if (digital) {
            System.out.println("Camada limpa instantaneamente com CTRL+Z / Borracha Digital.");
        } else {
            System.out.println("Usando borracha física para apagar os traços no papel.");
        }
    }

    public boolean verificarDisponibilidade() {
        System.out.println("Verificando se o meio '" + tipoMeio + "' está pronto para uso...");
        return true;
    }
}