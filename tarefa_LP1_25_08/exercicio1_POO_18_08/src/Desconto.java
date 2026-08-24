import java.util.Scanner;

public class Desconto {
    public static void execute() {
        int arroz = 20, feijao = 40, oleo = 7, acucar = 4, cafe = 30, macar = 3, farinha = 6, fuba = 2, molho = 3, sal = 3;
        double desconto;
        double subtotal = arroz+feijao+oleo+acucar+cafe+macar+farinha+fuba+molho+sal;

        if(subtotal > 100){
            desconto = subtotal - (subtotal * 0.1);
            IO.println("Valor Final:"+ desconto);
        }
        else {
            desconto = subtotal;
            IO.println("Valor Final:"+ desconto);
        }

        IO.println("1 Arroz: 20.00");
        IO.println("1 Feijao: 40.00");
        IO.println("1 Oleo: 7.00");
        IO.println("1 Acucar: 4.00");
        IO.println("1 Cafe: 30.00");
        IO.println("1 Macarrao: 3.00");
        IO.println("1 Farinha: 6.00");
        IO.println("1 Fuba: 2.00");
        IO.println("1 Molho: 3.00");
        IO.println("1 Sal: 3.00");
        IO.println("O preço sem desconto:"+ subtotal);

    }

}
