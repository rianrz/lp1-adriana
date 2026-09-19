package org.example;

public class Camelo {
    public String execute(int camelos){
        double velho = (double) camelos / 2;
        double meio = (double) camelos / 3;
        double novo = (double) camelos / 9;
        double sobraram = camelos - velho - meio - novo;

        return "Segue a lista da Quantidade de camelos para cada Irmão:\n" +
                "irmão mais velho: " + velho + "\n" +
                "irmão do meio: " + meio + "\n" +
                "irmão mais novo: " + novo + "\n" +
                "Sobraram: " + sobraram;
    }
}