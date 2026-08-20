import java.util.Scanner;

public class Viagem {
    //carro faz 12km litro, se a viagem tiver mis de 500km aplica 5% no calculo
    //entrada distancia e preco do combustivel
    double dist, preco,subresult, result;

    public Viagem(double dist, double preco) {
        this.dist = dist;
        this.preco = preco;
    }
    public String outsaida() {

        subresult = (dist / 12) * preco;
        if (dist >= 500) {
            result = subresult - (subresult * 0.5);
            return "O preço a pagar na gasolina é:" + result +"";
        } else {
            result = subresult;
            return "O preço a pagar na gasolina é:" + result +"";
        }


    }

}