package org.example;

public class ArteVisual {
    private String titulo;
    private String material;
    private String origemCultural;
    private int progressoConclusao; // De 0 a 100%

    public ArteVisual(String titulo, String material, String origemCultural) {
        this.titulo = titulo;
        this.material = material;
        this.origemCultural = origemCultural;
    }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getOrigem() { return origemCultural; }
    public void setOrigem(String origemCultural) { this.origemCultural = origemCultural; }

    public String descreverObra() {
        return ("Obra/Estilo: " + titulo + " | Material: " + material + " | Origem: " + origemCultural);
    }

    public String exporEmGaleria(String galeria) {
        return ("A obra  '" + titulo + "' está em exibição na " + galeria +".");
    }

    public String compatibilidadeExposicao(String materialProibido) {
        if (this.material.equalsIgnoreCase(materialProibido)) {
            return("Alerta: '" + titulo + "' não pode ser exposta por conter " + material);
        }
        return("Ação permitida: Obra '" + titulo + "' aprovada para exibição.");
    }
}



