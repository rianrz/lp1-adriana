package org.example;

public class Camelo {
    public String execute(int camelos){
        int velho = (int) camelos / 2;
        int meio = (int) camelos / 3;
        int novo = (int) camelos / 9;
        double sobraram = camelos - velho - meio - novo;

        return "Segue a lista da Quantidade de camelos para cada Irmão:\n" +
                "irmão mais velho: " + velho + "\n" +
                "irmão do meio: " + meio + "\n" +
                "irmão mais novo: " + novo + "\n" +
                "Sobraram: " + sobraram;
    }
}