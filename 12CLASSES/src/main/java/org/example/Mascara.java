package org.example;

public class Mascara {
    private String etniaOrigem;
    private String materialPredominante;
    private String simbolismo;

    public Mascara(String etniaOrigem, String materialPredominante, String simbolismo) {
        this.etniaOrigem = etniaOrigem;
        this.materialPredominante = materialPredominante;
        this.simbolismo = simbolismo;
    }

    public String getEtniaOrigem() { return etniaOrigem; }
    public void setEtniaOrigem(String etniaOrigem) { this.etniaOrigem = etniaOrigem; }
    public String getMaterialPredominante() { return materialPredominante; }
    public void setMaterialPredominante(String materialPredominante) { this.materialPredominante = materialPredominante; }
    public String getSimbolismo() { return simbolismo; }
    public void setSimbolismo(String simbolismo) { this.simbolismo = simbolismo; }

    public String descrevaObra() {
        return("Máscara da etnia " + etniaOrigem + ": representa " + simbolismo + ".");
    }

    public String compatibilidadeExposicao(String materialProibido) {
        if (this.materialPredominante.equalsIgnoreCase(materialProibido)) {
            return("Alerta: Mascara não pode ser exposta por conter " + materialPredominante);
        }
        return("Ação permitida: Mascara aprovada para exibição.");
    }

    public String solicitarRestauracao() {
        return("A peça em " + materialPredominante + " (" + etniaOrigem + ") foi enviada para manutenção.");
    }
}