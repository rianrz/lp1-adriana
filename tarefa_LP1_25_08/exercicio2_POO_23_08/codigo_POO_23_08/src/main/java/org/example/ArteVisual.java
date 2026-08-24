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

    public void descreverObra() {
        System.out.println("Obra/Estilo: " + titulo + " | Material: " + material + " | Origem: " + origemCultural);
    }

    public void exporEmGaleria(String galeria) {
        System.out.println("A obra  '" + titulo + "' está em exibição na " + galeria +".");
    }

    public boolean compatibilidadeExposicao(String materialProibido) {
        if (this.material.equalsIgnoreCase(materialProibido)) {
            System.out.println("Alerta: '" + titulo + "' não pode ser exposta por conter " + material);
            return false;
        }
        System.out.println("Ação permitida: Obra '" + titulo + "' aprovada para exibição.");
        return true;
    }
}



