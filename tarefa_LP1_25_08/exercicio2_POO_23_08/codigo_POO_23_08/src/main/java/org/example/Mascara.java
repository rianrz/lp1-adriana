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

    public void descrevaObra() {
        System.out.println("Máscara da etnia " + etniaOrigem + ": representa " + simbolismo + ".");
    }

    public boolean compatibilidadeExposicao(String materialProcurado) {
        return this.materialPredominante.equalsIgnoreCase(materialProcurado);
    }

    public void solicitarRestauracao() {
        System.out.println("A peça em " + materialPredominante + " (" + etniaOrigem + ") foi enviada para manutenção.");
    }
}