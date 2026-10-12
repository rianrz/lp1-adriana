package org.example;

public class Meio {
    private String tipoMeio;
    private boolean digital;
    private String tipo;

    public Meio(String tipoMeio, String tipo, boolean digital) {
        this.tipoMeio = tipoMeio;
        this.tipo = tipo;
        this.digital = digital;
    }

    public String getTipoMeio() { return tipoMeio; }
    public void setTipoMeio(String tipoMeio) { this.tipoMeio = tipoMeio; }

    public boolean isEhDigital() { return digital; }
    public void setEhDigital(boolean digital) { this.digital = digital; }

    public String getTexturaOuGramatura() { return tipo; }
    public void setTexturaOuGramatura(String tipo) { this.tipo = tipo; }

    public String prepararSuperficie() {
        if (digital) {
            return("Criando nova tela digital no suporte: " + tipoMeio + " (" + tipo + ").");
        } else {
            return("Folha separada no " + tipoMeio + " com gramatura " + tipo + ".");
        }
    }

    public String limparTela() {
        if (digital) {
            return("Camada limpa instantaneamente com CTRL+Z / Borracha Digital.");
        } else {
            return("Usando borracha física para apagar os traços no papel.");
        }
    }

    public String verificarDisponibilidade() {
        return("Verificando se o meio '" + tipoMeio + "' está pronto para uso...");

    }
}