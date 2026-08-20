public class Camelo {
    public static void execute(){
        int camelos = 80;
        double velho = camelos/2, meio = (camelos/3),novo = (camelos/9);
        IO. println("Segue a lista da Quantidade de camelos para cada Irmão:");
        IO. println("irmão mais velho: "+ velho);
        IO. println("irmão do meio: "+ meio);
        IO. println("irmão mais novo: "+ novo);
        IO. println("Sobraram:"+ (camelos - velho - meio - novo));
    }
}