import java.util.Scanner;

public class Aluguel {
    public static void main(String[] args){

        int dia;
        double dist;
        double diaria;
        //diaria fixa custa 80 reais
        //100km é o limite se não entra taxa de 40 reais

        IO.println("informe a quantidade de dias do aluguel:");
        Scanner sc = new Scanner(System.in);
        dia=sc.nextInt();

        IO.println("informe a distancia total percorrida:");
        dist=sc.nextDouble();


        if((dist/dia) > 100){
            diaria = dia*(80+40);
        }
        else{
            diaria = dia*80;
        }

        IO.println("O preço total do seu alguel é:"+ diaria);
    }
}
