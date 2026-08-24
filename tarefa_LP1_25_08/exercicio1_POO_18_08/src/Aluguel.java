import java.util.Scanner;

public class Aluguel {

    public int dia;
    public double dist;

    public Aluguel(int dia, int dist) {
        this.dia = dia;
        this.dist = dist;
    }

    //diaria fixa custa 80 reais
    //100km é o limite se não entra taxa de 40 reais

    public String Calc(int dia, int dist) {
        if ((dist / dia) > 100) {
            double diaria = dia * (80 + 40);
            return "O preço do Aluguel é"+ diaria +"";
        } else {
            double diaria = dia * 80;
            return "O preço do Aluguel é"+ diaria +"";
        }
    }

}