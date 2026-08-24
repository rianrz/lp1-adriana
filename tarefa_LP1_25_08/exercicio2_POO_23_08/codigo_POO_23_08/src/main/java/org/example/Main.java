package org.example;

public class Main {
    static void main() {

        Produto terno = new Produto("Terno Dorinho's Slim Azul", "G", 650.00);

        System.out.println("Teste - Dorinho's");
        terno.verificarTamanho("M");
        terno.verificarTamanho("G");
        terno.aplicarDesconto(15);
        terno.exibirEtiqueta();
        System.out.println();

        ArteVisual mascara = new ArteVisual("Máscara Ritualística", "Madeira Esculpida", "Tradição Africana");
        System.out.println("Teste - Máscaras Culturais");
        mascara.descreverObra();
        mascara.exporEmGaleria("luvre");
        System.out.println();

        ArteVisual manga = new ArteVisual("Estudo de Cabelos e Penteados", "Nanquim", "Mangá / Quadrinho Japonês");
        System.out.println("Teste - Desenho Mangá");
        manga.descreverObra();
        manga.compatibilidadeExposicao("Nanquim");
        manga.exporEmGaleria("Manga Prototypes Website");
        System.out.println();

        AtividadeLazer ciclismo = new AtividadeLazer("Passeio de Bike na Floresta", 120, "Intermediário");
        System.out.println("Teste - Ciclismo");
        ciclismo.iniciarAtividade();
        ciclismo.registrarParada("Trilha das Araucárias");
        ciclismo.finalizarAtividade();
        System.out.println();
    }
}
