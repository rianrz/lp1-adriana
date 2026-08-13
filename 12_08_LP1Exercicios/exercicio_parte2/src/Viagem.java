import java.util.Scanner;

public class Viagem {
    //carro faz 12km litro, se a viagem tiver mis de 500km aplica 5% no calculo
    //entrada distancia e preco do combustivel
    public static void main(String[] args) {
        double dist, preco,subresult, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a distancia percorrida:");
        dist = sc.nextDouble();
        System.out.print("Informe o preço do compustivel:");
        preco = sc.nextDouble();
        subresult = (dist / 12) * preco;
        if(dist >= 500) {
            result = subresult - (subresult*0.5);
        }
        else{
            result = subresult;
        }
        IO.println("O preço a pagar na gasolina é:" + result);

    }

}
